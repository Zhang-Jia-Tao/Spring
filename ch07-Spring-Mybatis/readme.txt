ch07-Spring-Mybatis:Spring和Mybatis的集成

步骤：
    1.新建maven项目
    2.加入maven依赖
        1）spring依赖
        2）mybatis依赖
        3）mysql驱动
        4）spring事务依赖
        5）spring和mybatis集成的依赖：mybatis官方提供的，用来在spring项目中创建mybatis
           中的SqlSessionFactory、dao对象等
    3.创建实体类
    4.创建dao接口和mappper文件
    5.创建mybatis的主配置文件
    6.创建Service接口和实现类，属性是dao
    7.创建spring的配置文件：声明mybatis的对象交由spring创建
        1）数据源（DataSource）
        2）SqlSessionFactory
        3）dao对象
        4）自定义的Service
    8.创建测试类，获取Service对象，通过Service调用dao完成数据库的访问

