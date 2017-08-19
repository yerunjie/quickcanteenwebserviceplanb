package com.quickcanteen.controller.api;

import com.quickcanteen.annotation.Authentication;
import com.quickcanteen.dto.BaseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 11022 on 2017/8/20.
 */
@RestController
@RequestMapping("/api/order")
public class OrderController extends APIBaseController {
    @Autowired
    private OrdersMapper ordersMapper;

    @RequestMapping(value = "/login")
    @Authentication
    public BaseJson login(@RequestParam("ordersId")Integer ordersId ) {
        BaseJson baseJson = new BaseJson();
        //Orders
        return baseJson;
    }
}
