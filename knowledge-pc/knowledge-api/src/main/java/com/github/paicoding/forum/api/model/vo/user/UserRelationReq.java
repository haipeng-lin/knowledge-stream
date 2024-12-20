package com.github.paicoding.forum.api.model.vo.user;

import lombok.Data;

/**
 * 用户关系入参
 *
 * @author haipeng-lin
 * @date 2024-07-24
 */
@Data
public class UserRelationReq {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 粉丝用户ID
     */
    private Long followUserId;

    /**
     * 是否关注当前用户
     */
    private Boolean followed;
}
