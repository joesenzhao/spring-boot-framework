package com.destiny.project.a.dao.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2024/03/22
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
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

    /**
     * APPLY_ORDER
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkId=").append(pkId);
        sb.append(", applyNo=").append(applyNo);
        sb.append(", prodNo=").append(prodNo);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", applyUserId=").append(applyUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getApplyNo() == null ? other.getApplyNo() == null : this.getApplyNo().equals(other.getApplyNo()))
            && (this.getProdNo() == null ? other.getProdNo() == null : this.getProdNo().equals(other.getProdNo()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getApplyUserId() == null ? other.getApplyUserId() == null : this.getApplyUserId().equals(other.getApplyUserId()));
    }

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkId() == null) ? 0 : getPkId().hashCode());
        result = prime * result + ((getApplyNo() == null) ? 0 : getApplyNo().hashCode());
        result = prime * result + ((getProdNo() == null) ? 0 : getProdNo().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getApplyUserId() == null) ? 0 : getApplyUserId().hashCode());
        return result;
    }
}