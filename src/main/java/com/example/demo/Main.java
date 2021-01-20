package com.example.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;

/*
此函数实现自动的生成相应的控制包，和相关的逻辑架构代码，使用
使用datasourceconfig访问数据库，然后对表结构进行自动的填充和生成。
同时使用packageconfig生成相应的模块包
使用autogenerate.excute(),代码模块进行模块的代码自动填充，简化代码的编写和开发。
 */
public class Main {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.SQL_SERVER);
        dataSourceConfig.setUrl("jdbc:sqlserver://localhost:1435;DataBase=shiyanshi_detail");
        dataSourceConfig.setDriverName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSourceConfig.setUsername("sa");
        dataSourceConfig.setPassword("123456");
        autoGenerator.setDataSource(dataSourceConfig);
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOpen(true);
        globalConfig.setAuthor("long");
        globalConfig.setServiceName("%sService");
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        autoGenerator.setGlobalConfig(globalConfig);
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.example.demo");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        autoGenerator.setPackageInfo(packageConfig);
        autoGenerator.execute();


    }
}
