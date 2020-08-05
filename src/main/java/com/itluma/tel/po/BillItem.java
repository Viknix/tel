package com.itluma.tel.po;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="BillItem对象", description="")
public class BillItem implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键，账单条目ID")
      @TableId(value = "ITEM_ID", type = IdType.ID_WORKER_STR)
    private Integer itemId;

    @ApiModelProperty(value = "账单ID，关联账单信息表")
    @TableField("BILL_ID")
    private Integer billId;

    @ApiModelProperty(value = "业务账号ID，关联业务信息表")
    @TableField("SERVICE_ID")
    private Integer serviceId;

    @ApiModelProperty(value = "所花费的费用")
    @TableField("COST")
    private BigDecimal cost;


}
