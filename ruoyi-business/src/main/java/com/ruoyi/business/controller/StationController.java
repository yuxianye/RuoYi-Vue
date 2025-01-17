package com.ruoyi.business.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.business.domain.Station;
import com.ruoyi.business.service.IStationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工位Controller
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@RestController
@RequestMapping("/business/station")
public class StationController extends BaseController
{
    @Autowired
    private IStationService stationService;

    /**
     * 查询工位列表
     */
    @PreAuthorize("@ss.hasPermi('business:station:list')")
    @GetMapping("/list")
    public TableDataInfo list(Station station)
    {
        startPage();
        List<Station> list = stationService.selectStationList(station);
        return getDataTable(list);
    }

    /**
     * 导出工位列表
     */
    @PreAuthorize("@ss.hasPermi('business:station:export')")
    @Log(title = "工位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Station station)
    {
        List<Station> list = stationService.selectStationList(station);
        ExcelUtil<Station> util = new ExcelUtil<Station>(Station.class);
        util.exportExcel(response, list, "工位数据");
    }

    /**
     * 获取工位详细信息
     */
    @PreAuthorize("@ss.hasPermi('business:station:query')")
    @GetMapping(value = "/{stationId}")
    public AjaxResult getInfo(@PathVariable("stationId") Long stationId)
    {
        return success(stationService.selectStationByStationId(stationId));
    }

    /**
     * 新增工位
     */
    @PreAuthorize("@ss.hasPermi('business:station:add')")
    @Log(title = "工位", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Station station)
    {
        return toAjax(stationService.insertStation(station));
    }

    /**
     * 修改工位
     */
    @PreAuthorize("@ss.hasPermi('business:station:edit')")
    @Log(title = "工位", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Station station)
    {
        return toAjax(stationService.updateStation(station));
    }

    /**
     * 删除工位
     */
    @PreAuthorize("@ss.hasPermi('business:station:remove')")
    @Log(title = "工位", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stationIds}")
    public AjaxResult remove(@PathVariable Long[] stationIds)
    {
        return toAjax(stationService.deleteStationByStationIds(stationIds));
    }
}
