package com.quickcanteen.controller.api;

import com.quickcanteen.controller.AuthenticationRequiredController;
import com.quickcanteen.dto.BaseJson;

/**
 * Created by 11022 on 2017/8/20.
 */
public class APIBaseController extends AuthenticationRequiredController {
    private static final String RESOURCE_NOT_FOUND = "没有找到资源";
    private static final String NOT_AUTHORIZED = "没有权限";

    private BaseJson getUnauthorizedResult() {
        BaseJson baseJson = new BaseJson();
        baseJson.setReturnCode("E.1");
        baseJson.setErrorMessage(NOT_AUTHORIZED);
        return baseJson;
    }

    private BaseJson getResourceNotFoundResult() {
        BaseJson baseJson = new BaseJson();
        baseJson.setReturnCode("E.2");
        baseJson.setErrorMessage(RESOURCE_NOT_FOUND);
        return baseJson;
    }
}
