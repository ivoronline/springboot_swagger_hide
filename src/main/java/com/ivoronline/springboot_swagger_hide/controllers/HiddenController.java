package com.ivoronline.springboot_swagger_hide.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class HiddenController {

  //=========================================================================
  // HIDDEN 1
  //=========================================================================
  @GetMapping("Hidden1")
    String hidden1() {
    return "Hello from hidden Controller";
  }

  //=========================================================================
  // HIDDEN 2
  //=========================================================================
  @GetMapping("Hidden2")
    String hidden2() {
    return "Hello from hidden Controller";
  }

}
