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
@ApiModel(value="ServiceDetail对象", description="")
public class ServiceDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键，业务详单_ID")
      @TableId(value = "DETAIL_ID", type = IdType.ID_WORKER_STR)
    private Integer detailId;

    @ApiModelProperty(value = "业务账号ID，关联业务账号表")
    @TableField("SERVICE_ID")
    private Integer serviceId;

    @ApiModelProperty(value = "OS账号从该IP地址登录Unix服务器")
    @TableField("CLIENT_HOST")
    private String clientHost;

    @ApiModelProperty(value = "登录UNIX服务器的OS账号")
    @TableField("OS_USERNAME")
    private String osUsername;

    @ApiModelProperty(value = "进程号")
    @TableField("PID")
    private Integer pid;

    @ApiModelProperty(value = "开始登录时间")
    @TableField("LOGIN_TIME")
    private Date loginTime;

    @ApiModelProperty(value = "退出登录时间")
    @TableField("LOGOUT_TIME")
    private Date logoutTime;

    @ApiModelProperty(value = "时长（秒）")
    @TableField("DURATION")
    private BigDecimal duration;

    @ApiModelProperty(value = "费用")
    @TableField("COST")
    private BigDecimal cost;


}
