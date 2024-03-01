package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.EquipmentMapper;
import com.ruoyi.business.domain.Equipment;
import com.ruoyi.business.service.IEquipmentService;

/**
 * 设备Service业务层处理
 * 
 * @author yuxianye
 * @date 2024-03-01
 */
@Service
public class EquipmentServiceImpl implements IEquipmentService 
{
    @Autowired
    private EquipmentMapper equipmentMapper;

    /**
     * 查询设备
     * 
     * @param equipId 设备主键
     * @return 设备
     */
    @Override
    public Equipment selectEquipmentByEquipId(Long equipId)
    {
        return equipmentMapper.selectEquipmentByEquipId(equipId);
    }

    /**
     * 查询设备列表
     * 
     * @param equipment 设备
     * @return 设备
     */
    @Override
    public List<Equipment> selectEquipmentList(Equipment equipment)
    {
        return equipmentMapper.selectEquipmentList(equipment);
    }

    /**
     * 新增设备
     * 
     * @param equipment 设备
     * @return 结果
     */
    @Override
    public int insertEquipment(Equipment equipment)
    {
        equipment.setCreateTime(DateUtils.getNowDate());
        return equipmentMapper.insertEquipment(equipment);
    }

    /**
     * 修改设备
     * 
     * @param equipment 设备
     * @return 结果
     */
    @Override
    public int updateEquipment(Equipment equipment)
    {
        equipment.setUpdateTime(DateUtils.getNowDate());
        return equipmentMapper.updateEquipment(equipment);
    }

    /**
     * 批量删除设备
     * 
     * @param equipIds 需要删除的设备主键
     * @return 结果
     */
    @Override
    public int deleteEquipmentByEquipIds(Long[] equipIds)
    {
        return equipmentMapper.deleteEquipmentByEquipIds(equipIds);
    }

    /**
     * 删除设备信息
     * 
     * @param equipId 设备主键
     * @return 结果
     */
    @Override
    public int deleteEquipmentByEquipId(Long equipId)
    {
        return equipmentMapper.deleteEquipmentByEquipId(equipId);
    }
}
