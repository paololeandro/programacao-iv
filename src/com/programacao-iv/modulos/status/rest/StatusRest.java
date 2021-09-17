package com.programacao-iv.modulos.status.rest;

import com.programacao-iv.modulos.status.dto.StatusDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusRest implements StatusAPI {

  @GetMapping(value = "/status")
  @Override
  public ResponseEntity<StatusDTO> getStatus() {
    StatusDTO statusDTO = new StatusDTO();
    return ResponseEntity.ok().body(statusDTO);
  }
}
