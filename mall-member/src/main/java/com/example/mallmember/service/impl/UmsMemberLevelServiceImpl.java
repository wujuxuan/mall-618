package com.example.mallmember.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mallmember.dao.UmsMemberLevelDao;
import com.example.mallcoupon.entity.UmsMemberLevelEntity;
import com.example.mallmember.service.UmsMemberLevelService;


@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl extends ServiceImpl<UmsMemberLevelDao, UmsMemberLevelEntity> implements UmsMemberLevelService {
}