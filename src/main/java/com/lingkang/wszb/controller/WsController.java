package com.lingkang.wszb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WsController {

  /**
   * 用户可以看到画面
   */
  @GetMapping("")
  public String index() {
    return "index";
  }

  /**
   * 主播直播的画面
   */
  @GetMapping("video")
  public String video() {
    return "video";
  }
}
