package com.ruoyi.business.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工位对象 biz_station
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public class Station extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工位主键 */
    private Long stationId;

    /** 工位名称 */
    @Excel(name = "工位名称")
    private String stationName;

    /** 工位编码 */
    @Excel(name = "工位编码")
    private String stationCode;

    /** 工位类型 */
    @Excel(name = "工位类型")
    private String stationType;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setStationId(Long stationId) 
    {
        this.stationId = stationId;
    }

    public Long getStationId() 
    {
        return stationId;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setStationCode(String stationCode) 
    {
        this.stationCode = stationCode;
    }

    public String getStationCode() 
    {
        return stationCode;
    }
    public void setStationType(String stationType) 
    {
        this.stationType = stationType;
    }

    public String getStationType() 
    {
        return stationType;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stationId", getStationId())
            .append("stationName", getStationName())
            .append("stationCode", getStationCode())
            .append("stationType", getStationType())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
