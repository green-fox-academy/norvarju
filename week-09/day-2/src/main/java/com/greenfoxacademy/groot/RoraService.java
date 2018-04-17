package com.greenfoxacademy.groot;

import com.greenfoxacademy.groot.model.FillResponse;
import org.springframework.stereotype.Service;

@Service
public class RoraService {

  public static int MAXAMOUNT = 12500;

  public FillResponse getResponse(FillResponse response, String caliber, int amount) {
    response.setReceived(caliber);
    if (MAXAMOUNT - response.getAmount() >= amount) {
      if (MAXAMOUNT - response.getAmount() == amount) {
        response.setReady(true);
      }
      response.setAmount(response.getAmount() + amount);
      response.setShipstatus(Integer.toString((int)(((double)response.getAmount()/MAXAMOUNT)*100)
      ) + "%");
    } else {
      response.setAmount(MAXAMOUNT);
      response.setShipstatus("100%");
      response.setReady(true);
    }
    return response;
  }
}
