package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.StationMapper;
import com.ruoyi.business.domain.Station;
import com.ruoyi.business.service.IStationService;

/**
 * 工位Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Service
public class StationServiceImpl implements IStationService 
{
    @Autowired
    private StationMapper stationMapper;

    /**
     * 查询工位
     * 
     * @param stationId 工位主键
     * @return 工位
     */
    @Override
    public Station selectStationByStationId(Long stationId)
    {
        return stationMapper.selectStationByStationId(stationId);
    }

    /**
     * 查询工位列表
     * 
     * @param station 工位
     * @return 工位
     */
    @Override
    public List<Station> selectStationList(Station station)
    {
        return stationMapper.selectStationList(station);
    }

    /**
     * 新增工位
     * 
     * @param station 工位
     * @return 结果
     */
    @Override
    public int insertStation(Station station)
    {
        station.setCreateTime(DateUtils.getNowDate());
        return stationMapper.insertStation(station);
    }

    /**
     * 修改工位
     * 
     * @param station 工位
     * @return 结果
     */
    @Override
    public int updateStation(Station station)
    {
        station.setUpdateTime(DateUtils.getNowDate());
        return stationMapper.updateStation(station);
    }

    /**
     * 批量删除工位
     * 
     * @param stationIds 需要删除的工位主键
     * @return 结果
     */
    @Override
    public int deleteStationByStationIds(Long[] stationIds)
    {
        return stationMapper.deleteStationByStationIds(stationIds);
    }

    /**
     * 删除工位信息
     * 
     * @param stationId 工位主键
     * @return 结果
     */
    @Override
    public int deleteStationByStationId(Long stationId)
    {
        return stationMapper.deleteStationByStationId(stationId);
    }
}
