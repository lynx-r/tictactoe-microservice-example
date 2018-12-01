package com.tictactoecorp.gameservice.config;

import com.tictactoecorp.authmodule.config.SpringSecurityWebFluxConfig;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * User: aleksey
 * Date: 2018-11-29
 * Time: 07:04
 */
@Getter
@Configuration
@Import(SpringSecurityWebFluxConfig.class)
public class ApplicationConfig {

  @Value("${userservice-url}")
  private String userServiceUrl;

}
