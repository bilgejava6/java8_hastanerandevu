package com.muhammet.hastanerandevu.controller;

import com.muhammet.hastanerandevu.service.RandevuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.muhammet.hastanerandevu.constants.RestApiList.*;
@RestController
@RequestMapping(RANDEVU)
@RequiredArgsConstructor
public class RandevuController {
    private final RandevuService randevuService;
}
