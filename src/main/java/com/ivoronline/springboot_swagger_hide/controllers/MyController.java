package com.ivoronline.springboot_swagger_hide.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class MyController {

  //=========================================================================
  // VISIBLE
  //=========================================================================
  @GetMapping("Visible")
    String visible() {
    return "Hello from visible Endpoint";
  }

  //=========================================================================
  // HIDDEN
  //=========================================================================
  @ApiIgnore
  @GetMapping("Hidden")
    String hidden() {
    return "Hello from hidden Endpoint";
  }

}
