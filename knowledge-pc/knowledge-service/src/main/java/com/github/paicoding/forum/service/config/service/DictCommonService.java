package com.github.paicoding.forum.service.config.service;

import java.util.Map;

/**
 * 字典Service
 *
 * @author haipeng-lin
 * @date 2024-07-20
 */
public interface DictCommonService {

    /**
     * 获取字典值
     * @return
     */
    Map<String, Object> getDict();
}
