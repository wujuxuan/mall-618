package com.example.mallmember.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mallmember.dao.UmsGrowthChangeHistoryDao;
import com.example.mallcoupon.entity.UmsGrowthChangeHistoryEntity;
import com.example.mallmember.service.UmsGrowthChangeHistoryService;


@Service("umsGrowthChangeHistoryService")
public class UmsGrowthChangeHistoryServiceImpl extends ServiceImpl<UmsGrowthChangeHistoryDao, UmsGrowthChangeHistoryEntity> implements UmsGrowthChangeHistoryService {
}