package com.github.paicoding.forum.web.front.article.vo;

import com.github.paicoding.forum.api.model.vo.PageListVo;
import com.github.paicoding.forum.api.model.vo.article.dto.ColumnDTO;
import com.github.paicoding.forum.api.model.vo.recommend.SideBarDTO;
import lombok.Data;

import java.util.List;

/**
 * @author haipeng-lin
 * @date 2024/9/26
 */
@Data
public class ColumnVo {
    /**
     * 专栏列表
     */
    private PageListVo<ColumnDTO> columns;

    /**
     * 侧边栏信息
     */
    private List<SideBarDTO> sideBarItems;

}
