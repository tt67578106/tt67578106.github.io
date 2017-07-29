/**
 * Project Name:SSM
 * File Name:SelectService.java
 * Package Name:cn.java.service.impl
 * Date:2017年7月29日下午2:17:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.entity.Member;
import cn.java.mapper.MemberMapper;

/**
 * Description: <br/>
 * Date: 2017年7月29日 下午2:17:04 <br/>
 * 
 * @author YS
 * @version
 * @see
 */
@Service
public class SelectServiceImpl implements SelectService {
    @Autowired
    MemberMapper m;

    /**
     * 简单描述该方法的实现功能 查询所有信息（可选）.
     * 
     * @see cn.java.service.impl.SelectService#selectAll()
     */
    @Override
    public List<Member> selectAll() {

        return m.selectAll();

    }
}
