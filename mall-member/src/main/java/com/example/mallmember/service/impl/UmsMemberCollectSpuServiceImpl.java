package com.example.mallmember.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mallmember.dao.UmsMemberCollectSpuDao;
import com.example.mallcoupon.entity.UmsMemberCollectSpuEntity;
import com.example.mallmember.service.UmsMemberCollectSpuService;


@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl extends ServiceImpl<UmsMemberCollectSpuDao, UmsMemberCollectSpuEntity> implements UmsMemberCollectSpuService {
}