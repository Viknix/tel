package com.itluma.tel.text;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * @author dongqi
 * @since 2020/08/12
 * 代码生成器
 */
public class CodeGenerator {

    @Test
    public void run() {

        // 1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        //输出路径
        gc.setOutputDir("E:\\Java_documents\\Idea Work\\tel" + "/src/main/java");

        gc.setAuthor("看个锤子，赶紧敲代码！！！");
        gc.setOpen(false); //生成后是否打开资源管理器
        gc.setFileOverride(false); //重新生成时文件是否覆盖

        gc.setServiceName("%sService");	//去掉Service接口的首字母I

        gc.setIdType(IdType.ID_WORKER_STR); //主键策略(看你的主键是Long还是String)
        gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
        gc.setSwagger2(true);//开启Swagger2模式

        mpg.setGlobalConfig(gc);

        // 3、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/tel?serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("333");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4、包配置
        PackageConfig pc = new PackageConfig();

        //包名    com.dongqi.eduservice
        pc.setParent("com.itluma");
        pc.setModuleName("tel"); //模块名

        //包名    com.dongqi.eduservice.controller
        pc.setController("controller");
        //包名    com.dongqi.eduservice.entity
        pc.setEntity("po");
        //包名    com.dongqi.eduservice.service
        pc.setService("service");
        //包名    com.dongqi.eduservice.mapper
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 5、策略配置（类似于Mybatis逆向工程）
        StrategyConfig strategy = new StrategyConfig();

        strategy.setInclude("account","admin_info","admin_role","bill","bill_item","cost","function_info","host","module_info","role_info","role_module","services","service_detail","service_update_bak");
        //strategy.setInclude("edu_teacher","...","...");   可以配多张表

        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        strategy.setTablePrefix("t_");
        strategy.setTablePrefix(pc.getModuleName() + "_"); //生成实体时去掉表前缀

        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
        strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作

        strategy.setRestControllerStyle(true); //restful api风格控制器
        strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符

        mpg.setStrategy(strategy);

        // 6、执行
        mpg.execute();
    }
}
