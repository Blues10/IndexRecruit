package qdu.java.recruit.controller;

import qdu.java.recruit.constant.GlobalConst;
import qdu.java.recruit.entity.User;
import qdu.java.recruit.utils.InfoUtil;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    //返回错误页面
//    public String direct_404(){ return "general/404"; }

    //指向用户表现层
    public String userDirect(String viewName) {
        return GlobalConst.USER_RPATH + "/" + viewName;
    }

    //指向hr路径层
    public String hrDirect(String viewName) {
        return GlobalConst.HR_PATH + "/" + viewName;
    }

    //指向管理员路径层
    public String adminDirect(String viewName) {
        return GlobalConst.ADMIN_PATH + "/" + viewName;
    }

    //获取绑定登录对象
    public User getUser(HttpServletRequest request) {
        return InfoUtil.getLoginUser(request);
    }

    //获取绑定登录对象Id
    public Integer getUserId(HttpServletRequest request) {
        return getUser(request).getUserId();
    }

    //设置页面title
    public BaseController title(HttpServletRequest request,String title){
        request.setAttribute("title",title);
        return this;
    }
}