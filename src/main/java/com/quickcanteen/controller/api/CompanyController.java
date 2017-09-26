package com.quickcanteen.controller.api;

import com.quickcanteen.annotation.Authentication;
import com.quickcanteen.dto.BaseJson;
import com.quickcanteen.dto.DishesBean;
import com.quickcanteen.dto.TypeBean;
import com.quickcanteen.mapper.CompanyInfoMapper;
import com.quickcanteen.mapper.DishesMapper;
import com.quickcanteen.mapper.TypeMapper;
import com.quickcanteen.mapper.UserCommentMapper;
import com.quickcanteen.model.CompanyInfo;
import com.quickcanteen.model.Dishes;
import com.quickcanteen.model.Type;
import com.quickcanteen.model.UserComment;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by 11022 on 2017/8/20.
 */
@RestController
@RequestMapping("/api/company")
public class CompanyController extends APIBaseController {
    @Autowired
    private CompanyInfoMapper companyInfoMapper;
    @Autowired
    private TypeMapper typeMapper;
    @Autowired
    private DishesMapper dishesMapper;

    @RequestMapping(value = "/getCompanyInfoById")
    @Authentication
    public BaseJson getCompanyInfoById(@RequestParam("companyID") Integer companyID) {
        BaseJson baseJson = new BaseJson();
        CompanyInfo companyInfo = companyInfoMapper.selectByPrimaryKey(companyID);
        if (Objects.isNull(companyInfo)) {
            return getResourceNotFoundResult();
        }
        baseJson.setObj(companyInfo);
        baseJson.setReturnCode("");
        return baseJson;
    }

    @RequestMapping(value = "/getTypesAndDishesByCompanyId")
    @Authentication
    public BaseJson getTypesAndDishesByCompanyId(@RequestParam("companyID") Integer companyID) {
        BaseJson baseJson = new BaseJson();
        List<TypeBean> typeBeans = typeMapper.selectByCompanyId(companyID).stream().map(this::parse).collect(Collectors.toList());
        baseJson.setObj(typeBeans);
        baseJson.setReturnCode("");
        return baseJson;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map login(@RequestParam("account") String account, @RequestParam("password") String password) {
        Map result = new HashMap();
        int login_result = 0;
        List<CompanyInfo> companyInfoList= companyInfoMapper.selectByAccountNumber(account);
        if (companyInfoList.size() == 0) {
            login_result = -1;
        }
        else{
            CompanyInfo companyInfo = companyInfoList.get(0);
            if(companyInfo.getPassword().equals(password)){
                login_result = companyInfo.getCompanyId();
            }
        }
        if(login_result>0){
            HttpSession session = request.getSession();
            session.setAttribute("Account",login_result);
        }
        result.put("returnCode",String.valueOf(login_result));

        return result;
    }

    private TypeBean parse(Type type) {
        TypeBean typeBean = new TypeBean();
        try {
            BeanUtils.copyProperties(typeBean, type);
            typeBean.setDishesBeanList(dishesMapper.selectByTypeId(type.getTypeId()));
        } catch (Exception e) {

        }
        return typeBean;
    }
}
