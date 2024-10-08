package com.github.paicoding.forum.core.util.id.snowflake;

/**
 * @author haipeng-lin
 * @date 2023/10/17
 */
public interface IdGenerator {
    /**
     * 生成分布式id
     *
     * @return
     */
    Long nextId();
}
