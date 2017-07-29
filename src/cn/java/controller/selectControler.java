/**
 * Project Name:SSM
 * File Name:selectControler.java
 * Package Name:cn.java.controller
 * Date:2017年7月29日下午2:10:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.java.entity.Member;
import cn.java.service.impl.SelectService;

/**
 * Description: <br/>
 * Date: 2017年7月29日 下午2:10:44 <br/>
 * 
 * @author YS
 * @version
 * @see
 */
@Controller
public class selectControler {
    @Autowired
    SelectService ss;

    @RequestMapping("selectAll")
    public @ResponseBody
    List<Member> select(HttpServletResponse response) {

        List<Member> lists = ss.selectAll();
        System.out.println(lists);

        return lists;
    }
}
