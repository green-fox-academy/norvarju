package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.RoraService;
import com.greenfoxacademy.groot.model.Cargo;
import com.greenfoxacademy.groot.model.FillResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class RoraController {

  @Autowired
  RoraService roraService;

  @GetMapping("/rocket")
  public Cargo cargoState() {
    return new Cargo();
  }

  @GetMapping("/rocket/fill")
  public ResponseEntity cargoFill(@RequestParam(name = "caliber", required = false) String caliber,
                                  @RequestParam(name = "amount", required = false) Integer amount) {
    FillResponse fillResponse = new FillResponse();
    if (caliber == null || amount == null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Error("Oooops"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(roraService.getResponse(fillResponse,
              caliber, amount));
    }

  }
}
