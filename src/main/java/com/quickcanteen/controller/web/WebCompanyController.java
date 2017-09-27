package com.quickcanteen.controller.web;

import com.quickcanteen.annotation.Authentication;
import com.quickcanteen.mapper.CompanyInfoMapper;
import com.quickcanteen.mapper.DishesMapper;
import com.quickcanteen.mapper.TypeMapper;
import com.quickcanteen.model.CompanyInfo;
import com.quickcanteen.model.Dishes;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/company")
public class WebCompanyController extends BaseController{
    @Autowired
    DishesMapper dishesMapper;
    @Autowired
    CompanyInfoMapper companyInfoMapper;

    @RequestMapping(value = "/login")
    public String login(Map<String,Object> model) {
        return "login";
    }

    @RequestMapping(value = "/index")
    public String index(Map<String,Object> model){
        int companyId = getCurrentCompanyId();
        CompanyInfo companyInfo = companyInfoMapper.selectByPrimaryKey(companyId);
        String companyName = companyInfo.getCompanyName();
        model.put("company_name",companyName);
        return "index";
    }

    @RequestMapping(value = "/charts")
    public String charts(Map<String,Object> model) {
        return "charts";
    }

    @RequestMapping(value = "/forms")
    public String forms(Map<String,Object> model) {
        int companyId = getCurrentCompanyId();
        CompanyInfo companyInfo = companyInfoMapper.selectByPrimaryKey(companyId);
        String companyName = companyInfo.getCompanyName();
        model.put("company_name",companyName);
        return "forms";
    }

    @RequestMapping(value = "/detail")
    public String detail(Map<String,Object> model) {
        return "detail";
    }

    @RequestMapping(value = "/tables")
    public String tables(Map<String,Object> model) {
        List<Dishes> dishesList;
        dishesList = dishesMapper.getDishesByCompanyId(getCurrentCompanyId());
        model.put("dishesList",dishesList);
        return "tables";
    }

    @RequestMapping(value = "/panels")
    public String panels(Map<String,Object> model) {
        return "panels";
    }

    @RequestMapping(value = "/widgets")
    public String widgets(Map<String,Object> model) {
        return "widgets";
    }
}
