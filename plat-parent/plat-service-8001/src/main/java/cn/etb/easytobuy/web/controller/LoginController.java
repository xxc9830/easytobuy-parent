package cn.etb.easytobuy.web.controller;

import cn.etb.easytobuy.domain.User;
import cn.etb.easytobuy.util.AjaxResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    /*@RequestMapping(value = "/login", method = RequestMethod.POST)
    public AjaxResult loginUser(@RequestBody User user) {
        if ("admin".equals(user.getName()) && "admin".equals(user.getPassword())) {
            return AjaxResult.me().setSuccess(true).setMessage("登录成功");
        }
        return AjaxResult.me().setSuccess(false).setMessage("登录失败,账号或用户名错误");
    }*/
    @ApiOperation(value="登录请求",tags={"登录操作"},notes="要有用户名和密码")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if("admin".equals(user.getUsername())&&"0".equals(user.getPassword())){
            return AjaxResult.me().setMessage("登录成功！").setRetObj(user);
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误!");
    }

}
