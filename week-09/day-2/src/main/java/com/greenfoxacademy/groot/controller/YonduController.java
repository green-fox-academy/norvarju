package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.model.Yondu;
import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduController {

  @GetMapping("/yondu")
  public ResponseEntity getSpeed(@RequestParam(name = "distance", required =
          false) Double distance, @RequestParam(name = "time", required = false) Double time) {
    Yondu yondu = new Yondu();
    if (time == null || distance == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Oooops"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Yondu(distance, time));
    }
  }
}
