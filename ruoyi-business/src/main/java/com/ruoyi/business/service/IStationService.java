package com.ruoyi.business.service;

import java.util.List;
import com.ruoyi.business.domain.Station;

/**
 * 工位Service接口
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public interface IStationService 
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
     * 批量删除工位
     * 
     * @param stationIds 需要删除的工位主键集合
     * @return 结果
     */
    public int deleteStationByStationIds(Long[] stationIds);

    /**
     * 删除工位信息
     * 
     * @param stationId 工位主键
     * @return 结果
     */
    public int deleteStationByStationId(Long stationId);
}
