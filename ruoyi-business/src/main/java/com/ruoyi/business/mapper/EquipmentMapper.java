package com.ruoyi.business.mapper;

import java.util.List;
import com.ruoyi.business.domain.Equipment;

/**
 * 设备Mapper接口
 * 
 * @author yuxianye
 * @date 2024-03-01
 */
public interface EquipmentMapper 
{
    /**
     * 查询设备
     * 
     * @param equipId 设备主键
     * @return 设备
     */
    public Equipment selectEquipmentByEquipId(Long equipId);

    /**
     * 查询设备列表
     * 
     * @param equipment 设备
     * @return 设备集合
     */
    public List<Equipment> selectEquipmentList(Equipment equipment);

    /**
     * 新增设备
     * 
     * @param equipment 设备
     * @return 结果
     */
    public int insertEquipment(Equipment equipment);

    /**
     * 修改设备
     * 
     * @param equipment 设备
     * @return 结果
     */
    public int updateEquipment(Equipment equipment);

    /**
     * 删除设备
     * 
     * @param equipId 设备主键
     * @return 结果
     */
    public int deleteEquipmentByEquipId(Long equipId);

    /**
     * 批量删除设备
     * 
     * @param equipIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEquipmentByEquipIds(Long[] equipIds);
}
