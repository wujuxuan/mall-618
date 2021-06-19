package com.example.mallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mallcoupon.dao.SmsSeckillSessionDao;
import com.example.mallcoupon.entity.SmsSeckillSessionEntity;
import com.example.mallcoupon.service.SmsSeckillSessionService;


@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl extends ServiceImpl<SmsSeckillSessionDao, SmsSeckillSessionEntity> implements SmsSeckillSessionService {
}