package com.zh.sangu;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * MBG
 * Created by zhaohui on 2019/10/30
 */
public class Generator {

    public static void main(String[] args) throws Exception {
        // MBG执行过程中的警告信息
        List<String> warnings = new ArrayList<>();
        // 当生成的代码重复时，覆盖原代码
        boolean overwrite = true;
        // 读取我们的MBG配置文件
        InputStream inputStream = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration configuration = cp.parseConfiguration(inputStream);
        inputStream.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        // 创建MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, callback, warnings);
        // 执行生成代码
        myBatisGenerator.generate(null);
        // 输出警告信息
        for (String waring : warnings) {
            System.out.println(waring);
        }
    }

}
