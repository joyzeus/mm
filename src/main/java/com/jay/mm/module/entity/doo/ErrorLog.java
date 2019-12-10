package com.jay.mm.module.entity.doo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhouxu
 * @date 2019/12/10
 */
@Data
public class ErrorLog implements Serializable {
    private Integer id;

    private Date createTime;

    private Integer type;

    private String url;

    private String message;

    public static final class Builder {
        private Integer id;
        private Date createTime;
        private Integer type;
        private String url;
        private String message;

        private Builder() {
        }

        public static Builder anErrorLog() {
            return new Builder();
        }

        public Builder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder withCreateTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder withType(Integer type) {
            this.type = type;
            return this;
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public ErrorLog build() {
            ErrorLog errorLog = new ErrorLog();
            errorLog.setId(id);
            errorLog.setCreateTime(createTime);
            errorLog.setType(type);
            errorLog.setUrl(url);
            errorLog.setMessage(message);
            return errorLog;
        }
    }
}