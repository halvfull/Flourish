package com.halvfull.sourdoughapp.controller

import com.halvfull.sourdoughapp.model.Dough
import com.halvfull.sourdoughapp.service.DoughService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DoughController(@Autowired val doughService: DoughService) {

    @PostMapping("/dough")
    fun addDough(@RequestBody dough: Dough): Dough {
        return doughService.save(dough)
    }
}




