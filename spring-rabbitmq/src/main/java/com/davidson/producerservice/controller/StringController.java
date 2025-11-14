package com.davidson.producerservice.controller;

import com.davidson.producerservice.services.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produces")
@RequiredArgsConstructor
public class StringController {

  private final StringService stringService;

  @GetMapping
  public ResponseEntity<String> produceString(@RequestParam String message) {
    stringService.sendMessage(message);
    return ResponseEntity.ok("Mensagem enviada com sucesso.");
  }
}
