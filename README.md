##应用层读写分离
+   驱动实现
    +   com.mysql.jdbc.ReplicationDriver
    +   Sharding-jdbc
+   Mybatis plugin(sqlType:select,update,insert )
+   Spring AOP + mybatis plugin + 注解
+   Spring动态数据源+mybatis plugin
##中间件层读写分离
+   优点
    +   源程序不需要任何修改就可以做到读写分离
    +   动态添加数据源不需要重启程序
+   缺点
    +   程序依赖于中间件，会导致切换数据库变得困难
    +   由中间件做了中转代理，性能有所下降
