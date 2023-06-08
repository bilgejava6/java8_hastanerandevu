package com.muhammet.hastanerandevu.controller;
import com.muhammet.hastanerandevu.service.HastaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.muhammet.hastanerandevu.constants.RestApiList.*;

@RestController
@RequestMapping(HASTA)
@RequiredArgsConstructor
public class HastaController {
    private final HastaService hastaService;
}
