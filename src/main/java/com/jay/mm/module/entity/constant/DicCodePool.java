package com.jay.mm.module.entity.constant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/10 11:15
 */
public class DicCodePool {

    /**
     * 用于存储代码项
     */
    private static final Map<IDicTable, DicCodeBean> codeItemMap = new ConcurrentHashMap<>();

    /**
     * 往 map 中添加代码项
     *
     * @param dicTable 枚举类
     * @param code     值
     * @param text
     */
    public static void putDic(IDicTable dicTable, Integer code, String text) {
        codeItemMap.put(dicTable, new DicCodeBean(code, text));
    }

    public static DicCodeBean getDic(IDicTable dicTable) {
        return codeItemMap.get(dicTable);
    }
}
