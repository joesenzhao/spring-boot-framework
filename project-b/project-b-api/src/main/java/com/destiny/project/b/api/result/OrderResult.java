package com.destiny.project.b.api.result;

import lombok.Data;

@Data
public class OrderResult {
    /**
     * PK_ID PK_ID
     */
    private String pkId;

    /**
     * 申请件编号 APPLY_NO
     */
    private String applyNo;

    /**
     *  PROD_NO
     */
    private String prodNo;

    /**
     *  MERCHANT_ID
     */
    private String merchantId;

    /**
     *  APPLY_USER_ID
     */
    private String applyUserId;
}
