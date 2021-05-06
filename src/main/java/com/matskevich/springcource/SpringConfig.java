package com.matskevich.springcource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.matskevich.springcource")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
