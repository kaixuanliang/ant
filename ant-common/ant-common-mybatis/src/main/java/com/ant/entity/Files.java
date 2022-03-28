package com.ant.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiangKaiXuan
 * @since 2022-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Files implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("FILE_ID")
    private Long fileId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
