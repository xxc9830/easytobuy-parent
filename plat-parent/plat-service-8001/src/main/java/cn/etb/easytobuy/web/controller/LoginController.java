package cn.etb.easytobuy.web.controller;

import cn.etb.easytobuy.domain.User;
import cn.etb.easytobuy.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AjaxResult loginUser(@RequestBody User user) {
        if ("admin".equals(user.getName()) && "admin".equals(user.getPassword())) {
            return AjaxResult.getAjaxResult().setSuccess(true).setMessage("登录成功");
        }
        return AjaxResult.getAjaxResult().setSuccess(false).setMessage("登录失败,账号或用户名错误");
    }

}
