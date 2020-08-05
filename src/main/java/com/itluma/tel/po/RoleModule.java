package com.itluma.tel.po;

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
@ApiModel(value="RoleModule对象", description="")
public class RoleModule implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "角色ID,关联角色表联合主键")
      @TableId(value = "ROLE_ID", type = IdType.ID_WORKER_STR)
    private Integer roleId;

    @ApiModelProperty(value = "模块ID， 关联模块表联合主键")
    @TableField("MODULE_ID")
    private Integer moduleId;


}
