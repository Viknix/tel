package com.itluma.tel.po;

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
@ApiModel(value="AdminInfo对象", description="")
public class AdminInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键，管理员ID")
      @TableId(value = "ADMIN_ID", type = IdType.ID_WORKER_STR)
    private Integer adminId;

    @ApiModelProperty(value = "管理员账号")
    @TableField("ADMIN_CODE")
    private String adminCode;

    @ApiModelProperty(value = "密码")
    @TableField("PASSWORD")
    private String password;

    @ApiModelProperty(value = "姓名")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "电话")
    @TableField("TELPHONE")
    private String telphone;

    @ApiModelProperty(value = "电子邮件")
    @TableField("EMAIL")
    private String email;

    @ApiModelProperty(value = "创建日期")
    @TableField("ENROLLDATE")
    private Date enrolldate;


}
