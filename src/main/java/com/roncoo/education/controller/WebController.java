package com.roncoo.education.controller;

import com.roncoo.education.util.LoggerUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luzhenxing on 2017/10/9 0009.
 */
@RestController
public class WebController{

@RequestMapping("/testLog")
  public String index(){
          String msg = "Spring Boot -- Log4j2";
          LoggerUtil.t(msg);
          LoggerUtil.d(msg);
          LoggerUtil.i(msg);
          LoggerUtil.w(msg);
          LoggerUtil.e(msg);
          return "Hello Log4j!";
          }
          }
