package com.destiny.project.framework.base.bean;

import com.destiny.project.framework.base.utils.ToStringUtil;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    public BaseResponse() {
    }

    public String toString() {
        return (new ToStringUtil(this, ToStringStyle.SHORT_PREFIX_STYLE)).toString();
    }

}
