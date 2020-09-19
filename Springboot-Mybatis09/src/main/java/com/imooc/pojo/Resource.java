package com.imooc.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
  *加载注入properties文件，映射到实体类
 *@Configuration：表示是会引用资源文件的类
 *@ConfigurationProperties：指定资源文件的前缀
 *@PropertySource：指定资源文件的位置
**/
@Configuration
@ConfigurationProperties(prefix="com.imooc.opensource")
@PropertySource(value="classpath:resource.properties")
public class Resource {
	private String name;
	private String website;
	private String language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
