package com.ruoyi.business.mapper;

import java.util.List;
import com.ruoyi.business.domain.Station;

/**
 * 工位Mapper接口
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public interface StationMapper 
{
    /**
     * 查询工位
     * 
     * @param stationId 工位主键
     * @return 工位
     */
    public Station selectStationByStationId(Long stationId);

    /**
     * 查询工位列表
     * 
     * @param station 工位
     * @return 工位集合
     */
    public List<Station> selectStationList(Station station);

    /**
     * 新增工位
     * 
     * @param station 工位
     * @return 结果
     */
    public int insertStation(Station station);

    /**
     * 修改工位
     * 
     * @param station 工位
     * @return 结果
     */
    public int updateStation(Station station);

    /**
     * 删除工位
     * 
     * @param stationId 工位主键
     * @return 结果
     */
    public int deleteStationByStationId(Long stationId);

    /**
     * 批量删除工位
     * 
     * @param stationIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStationByStationIds(Long[] stationIds);
}
