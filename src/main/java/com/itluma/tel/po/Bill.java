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
@ApiModel(value="Bill对象", description="")
public class Bill implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键，账单ID")
      @TableId(value = "BILL_ID", type = IdType.ID_WORKER_STR)
    private Integer billId;

    @ApiModelProperty(value = "账务账号ID，关联账务账号表")
    @TableField("ACCOUNT_ID")
    private Integer accountId;

    @ApiModelProperty(value = "账单月份，格式如：201701")
    @TableField("BILL_MONTH")
    private String billMonth;

    @ApiModelProperty(value = "费用")
    @TableField("COST")
    private BigDecimal cost;

    @ApiModelProperty(value = "0：现金 1：银行转账，2：邮局汇款；3：其他")
    @TableField("PAYMENT_MODE")
    private Integer paymentMode;

    @ApiModelProperty(value = "支付状态,0：未支付；1：已支付，默认为0")
    @TableField("PAY_STATE")
    private Boolean payState;


}
