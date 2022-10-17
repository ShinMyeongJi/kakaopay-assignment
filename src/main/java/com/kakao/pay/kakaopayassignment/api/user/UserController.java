package com.kakao.pay.kakaopayassignment.api.user;

import com.kakao.pay.kakaopayassignment.api.ControllerBase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName :  com.kakao.pay.kakopayassignment.api
 * fileName : UserController
 * author :  home
 * date : 22. 10. 17.
 * description :
 */
@RequestMapping(UserController.URL_PREFIX)
public class UserController extends ControllerBase {

    public static final String URL_PREFIX = API_PREFIX + "/user";



}
