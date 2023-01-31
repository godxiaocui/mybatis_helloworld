package com.czh.mybatis.test;

import com.czh.mybatis.mapper.Usermapper;
import com.czh.mybatis.pojo.User;
import com.czh.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {

    public void testInsert() throws IOException {
        // 获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // SqlSessionFactoryBuilder,工厂模式
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 利用工厂模式获取对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sql的会话对象Sqlsession，是mybatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //Usermapper是一个接口，接口不能直接创建对象，所以要获取Usermapper的代理实现类对象
        Usermapper mapper = sqlSession.getMapper(Usermapper.class);
        //调用mapper接口中的方法，实现添加用户的功能
        int result = mapper.insertUser();
        System.out.println("result"+result);
        // 开启事务
//        sqlSession.commit();
        //默认关闭是没有提交事务的
        sqlSession.close();
    }
    @Test
    public void  testUpdate(){
        //获取sqlsession
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        Usermapper mapper = sqlSession.getMapper(Usermapper.class);
        int result = mapper.updateUser();
        System.out.println("result"+ result);
        // 开启事务
//        sqlSession.commit();
        //默认关闭是没有提交事务的
        sqlSession.close();

    }
}
