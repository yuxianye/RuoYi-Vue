package com.ruoyi.business.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备对象 biz_equipment
 * 
 * @author yuxianye
 * @date 2024-03-01
 */
public class Equipment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备主键 */
    private Long equipId;

    /** 设备编码 */
    @Excel(name = "设备编码")
    private String equipCode;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String equipName;

    /** 设备品牌 */
    @Excel(name = "设备品牌")
    private String equipBrand;

    /** 设备分类 */
    @Excel(name = "设备分类")
    private String equipClassif;

    /** 设备状态（0正常 1停用） */
    @Excel(name = "设备状态", readConverterExp = "0=正常,1=停用")
    private String equipStatus;

    public void setEquipId(Long equipId) 
    {
        this.equipId = equipId;
    }

    public Long getEquipId() 
    {
        return equipId;
    }
    public void setEquipCode(String equipCode) 
    {
        this.equipCode = equipCode;
    }

    public String getEquipCode() 
    {
        return equipCode;
    }
    public void setEquipName(String equipName) 
    {
        this.equipName = equipName;
    }

    public String getEquipName() 
    {
        return equipName;
    }
    public void setEquipBrand(String equipBrand) 
    {
        this.equipBrand = equipBrand;
    }

    public String getEquipBrand() 
    {
        return equipBrand;
    }
    public void setEquipClassif(String equipClassif) 
    {
        this.equipClassif = equipClassif;
    }

    public String getEquipClassif() 
    {
        return equipClassif;
    }
    public void setEquipStatus(String equipStatus) 
    {
        this.equipStatus = equipStatus;
    }

    public String getEquipStatus() 
    {
        return equipStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("equipId", getEquipId())
            .append("equipCode", getEquipCode())
            .append("equipName", getEquipName())
            .append("equipBrand", getEquipBrand())
            .append("equipClassif", getEquipClassif())
            .append("equipStatus", getEquipStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
