package com.teamlab.skillup.todoKotlin.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class TodoKotlinController {
  @GetMapping("/")
  fun top(): String {
    return "index"
  }

  @GetMapping("/edit/{id}")
  fun edit(@PathVariable id: Long, model: Model): String {
    model.addAttribute("id", id)
    return "edit"
  }
}