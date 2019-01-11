package com.food.service.impl.user;

import com.food.domain.user.User;
import com.food.dao.user.UserMapper;
import com.food.service.user.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Value(value = "${house}")
    private String house;

    public String getUserName() {
        return house;
    }
}
