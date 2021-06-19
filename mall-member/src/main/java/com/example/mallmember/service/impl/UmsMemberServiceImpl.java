package com.example.mallmember.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mallmember.dao.UmsMemberDao;
import com.example.mallcoupon.entity.UmsMemberEntity;
import com.example.mallmember.service.UmsMemberService;


@Service("umsMemberService")
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberDao, UmsMemberEntity> implements UmsMemberService {
}