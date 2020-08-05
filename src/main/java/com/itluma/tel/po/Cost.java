package com.itluma.tel.po;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 看个锤子，赶紧敲代码！！！
 * @since 2020-08-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Cost对象", description="")
public class Cost implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键，资费ID")
      @TableId(value = "COST_ID", type = IdType.ID_WORKER_STR)
    private Integer costId;

    @ApiModelProperty(value = "资费名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "包在线时长")
    @TableField("BASE_DURATION")
    private Integer baseDuration;

    @ApiModelProperty(value = "月固定费，可能有小数")
    @TableField("BASE_COST")
    private BigDecimal baseCost;

    @ApiModelProperty(value = "单位费用(元/小时)")
    @TableField("UNIT_COST")
    private BigDecimal unitCost;

    @ApiModelProperty(value = "0:开通，1：暂停；")
    @TableField("STATUS")
    private Boolean status;

    @ApiModelProperty(value = "对资费信息的说明")
    @TableField("DESR")
    private String desr;

    @ApiModelProperty(value = "创建日期")
    @TableField("CREATIME")
    private Date creatime;

    @ApiModelProperty(value = "启用日期")
    @TableField("STARTIME")
    private Date startime;

    @ApiModelProperty(value = "1-包月，2-套餐，3-计时")
    @TableField("COST_TYPE")
    private String costType;


}
