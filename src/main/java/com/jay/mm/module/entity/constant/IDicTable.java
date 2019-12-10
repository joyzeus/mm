package com.jay.mm.module.entity.constant;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/10 11:05
 */
public interface IDicTable {

    default Integer getCode() {
        DicCodeBean dic = DicCodePool.getDic(this);
        return dic != null ? dic.getCode() : -1;
    }

    default String getText() {
        DicCodeBean dic = DicCodePool.getDic(this);
        return dic != null ? dic.getText() : "";
    }

    static <T extends IDicTable> T getByCode(Class<T> clazz, Integer code) {
        for (T t : clazz.getEnumConstants()) {
            if (t.getCode().intValue() == code) {
                return t;
            }
        }
        return null;
    }

    static <T extends IDicTable> String getTextByCode(Class<T> clazz, Integer code) {
        for (T t : clazz.getEnumConstants()) {
            if (t.getCode().intValue() == code) {
                return t.getText();
            }
        }
        return null;
    }

    default boolean isCode(Integer code) {
        return this.getCode().intValue() == code;
    }

    default boolean isNotEqual(IDicTable dicTable) {
        return this != dicTable;
    }
}
