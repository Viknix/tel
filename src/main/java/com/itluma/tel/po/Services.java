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
@ApiModel(value="Services对象", description="")
public class Services implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "业务账号_ID")
      @TableId(value = "SERIVCE_ID", type = IdType.ID_WORKER_STR)
    private Integer serivceId;

    @ApiModelProperty(value = "账务账号ID， 关联账务账号表")
    @TableField("ACCOUNT_ID")
    private Integer accountId;

    @ApiModelProperty(value = "和OS_USERNAME做联合唯一键NOT NULL  UNIX服务器IP地址")
    @TableField("UNIX_HOST")
    private String unixHost;

    @ApiModelProperty(value = "和UNIX_HOST做联合唯一键 NOT NULL	登录UNIX服务器的OS账号")
    @TableField("OS_USERNAME")
    private String osUsername;

    @ApiModelProperty(value = "0：开通，1：暂停，2：删除")
    @TableField("STATUS")
    private Integer status;

    @ApiModelProperty(value = "创建日期，创建即开通")
    @TableField("CREATE_DATE")
    private Date createDate;

    @ApiModelProperty(value = "暂停日期")
    @TableField("PAUSE_DATE")
    private Date pauseDate;

    @ApiModelProperty(value = "删除日期")
    @TableField("CLOSE_DATE")
    private Date closeDate;

    @ApiModelProperty(value = "资费编码，关联资费信息表")
    @TableField("COST_ID")
    private Integer costId;

    @ApiModelProperty(value = "登录UNIX服务器的口令")
    @TableField("LOGIN_PASSWD")
    private String loginPasswd;


}
