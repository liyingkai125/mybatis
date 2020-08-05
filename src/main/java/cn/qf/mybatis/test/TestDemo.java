package cn.qf.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        // 1. 获取工厂
        String resource = "mybatis-config.xml";
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(TestDemo.class.getClassLoader().getResourceAsStream(resource));
        //2. 通过工厂获取到sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 查询员工信息
        List<Emp> emp = sqlSession.selectList("emp.findUserList");

        System.out.println(emp);

    }
}
