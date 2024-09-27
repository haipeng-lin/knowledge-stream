package com.github.paicoding.forum.api.model.vo.article.dto;

import lombok.Data;
import lombok.ToString;

/**
 * 创作历程
 *
 * @author haipeng-lin
 * @since 2024/7/19
 */
@Data
@ToString(callSuper = true)
public class YearArticleDTO {

    /**
     * 年份
     */
    private String year;

    /**
     * 文章数量
     */
    private Integer articleCount;
}
