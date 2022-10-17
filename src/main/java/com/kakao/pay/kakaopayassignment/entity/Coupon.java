package com.kakao.pay.kakaopayassignment.entity;

import java.util.Date;
import java.util.UUID;

/**
 * packageName :  com.kakao.pay.kakopayassignment.domain
 * fileName : Coupon
 * author :  home
 * date : 22. 10. 17.
 * description :
 */
public class Coupon {
    // 쿠폰 아이디
    private UUID couponId;

    // 쿠폰 이름
    private String couponName;

    private Date createdDate;

    // 쿠폰 만료일자
    private Date expiredDate;

    // 쿠폰 소유자
    private User had;

    // 쿠폰 상태
    private CouponEnum used;


}
