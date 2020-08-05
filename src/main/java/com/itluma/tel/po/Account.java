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
@ApiModel(value="Account对象", description="")
public class Account implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "账务账号ID")
      @TableId(value = "ACCOUNT_ID", type = IdType.ID_WORKER_STR)
    private Integer accountId;

    @ApiModelProperty(value = "推荐人账务账号ID")
    @TableField("RECOMMENDRE_ID")
    private Integer recommendreId;

    @ApiModelProperty(value = "登录系统的名称，用于“用户自服务”系统")
    @TableField("LOGIN_NAME")
    private String loginName;

    @ApiModelProperty(value = "登录系统的口令")
    @TableField("LOGIN_PASSWD")
    private String loginPasswd;

    @ApiModelProperty(value = "0：开通,1：暂停,2：删除")
    @TableField("STATUS")
    private Integer status;

    @ApiModelProperty(value = "创建日期")
    @TableField("CREATE_DATE")
    private Date createDate;

    @ApiModelProperty(value = "暂停日期（开通状态时为空）")
    @TableField("PAUSE_DATE")
    private Date pauseDate;

    @ApiModelProperty(value = "删除日期")
    @TableField("CLOSE_DATE")
    private Date closeDate;

    @ApiModelProperty(value = "客户姓名")
    @TableField("REAL_NAME")
    private String realName;

    @ApiModelProperty(value = "身份证号码")
    @TableField("IDCARD_NO")
    private String idcardNo;

    @ApiModelProperty(value = "出生日期")
    @TableField("BIRTHDATE")
    private Date birthdate;

    @ApiModelProperty(value = "性别 0：男 1：女")
    @TableField("GENDER")
    private Boolean gender;

    @ApiModelProperty(value = "职业")
    @TableField("OCCUPATION")
    private String occupation;

    @ApiModelProperty(value = "联系电话（座机或手机）")
    @TableField("TELEPHONE")
    private String telephone;

    @ApiModelProperty(value = "电子邮件")
    @TableField("EMAIL")
    private String email;

    @ApiModelProperty(value = "通信地址")
    @TableField("MAILADDRESS")
    private String mailaddress;

    @ApiModelProperty(value = "邮编")
    @TableField("ZIPCODE")
    private String zipcode;

    @ApiModelProperty(value = "QQ")
    @TableField("QQ")
    private String qq;

    @ApiModelProperty(value = "最后一次登录时间")
    @TableField("LAST_LOGIN_TIME")
    private Date lastLoginTime;

    @ApiModelProperty(value = "最后一次登录IP地址")
    @TableField("LAST_LOGIN_IP")
    private String lastLoginIp;


}
