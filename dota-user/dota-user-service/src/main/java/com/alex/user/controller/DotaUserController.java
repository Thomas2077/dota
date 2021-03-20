package com.alex.user.controller;

import com.alex.common.util.RJson;
import com.alex.user.feign.interfaces.IFeignDotaUser;
import com.alex.user.feign.qo.UserQO;
import com.alex.user.feign.vo.UserVo;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@RestController
public class DotaUserController implements IFeignDotaUser {

    @Override
    public RJson<UserVo> loginByWechatToken(String token) {
        System.out.println(1/0);
        return RJson.ok(new UserVo()).setMsg("true");
    }

    @Override
    public RJson<UserVo> loginBySteamToken(String token) {
        return null;
    }

    @Override
    public RJson<UserVo> updateById(UserQO qo) {
       return RJson.ok(new UserVo());
    }

    @Override
    public RJson<String> deleteById(Long id) {
        return null;
    }

    @Override
    public RJson<UserVo> getByUserNo(Long userNo) {
        return RJson.ok(new UserVo());
    }

    @Override
    public RJson<UserVo> getByMobile(String mobile) {
        return null;
    }
}