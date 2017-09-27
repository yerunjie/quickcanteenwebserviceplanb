package com.quickcanteen.controller.web;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class BaseController {
    @Autowired
    protected HttpServletRequest request;

    public int getCurrentCompanyId(){
        HttpSession session = request.getSession();
        int companyId = (int)session.getAttribute("companyId");
        return companyId;
    }
}
