package com.example.mallmember.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mallmember.dao.UmsMemberReceiveAddressDao;
import com.example.mallcoupon.entity.UmsMemberReceiveAddressEntity;
import com.example.mallmember.service.UmsMemberReceiveAddressService;


@Service("umsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl extends ServiceImpl<UmsMemberReceiveAddressDao, UmsMemberReceiveAddressEntity> implements UmsMemberReceiveAddressService {
}