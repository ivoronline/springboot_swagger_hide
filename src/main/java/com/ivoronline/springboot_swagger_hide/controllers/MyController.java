package com.ivoronline.springboot_swagger_hide.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class MyController {

  //=========================================================================
  // VISIBLE
  //=========================================================================
  @RequestMapping("Visible")
    String visible() {
    return "Visible from Swagger";
  }


}
