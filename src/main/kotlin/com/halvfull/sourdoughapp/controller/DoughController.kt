package com.halvfull.sourdoughapp.controller

import com.halvfull.sourdoughapp.model.Dough
import com.halvfull.sourdoughapp.service.DoughService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@RestController
class DoughController(@Autowired val doughService: DoughService) {

    @PostMapping("/dough")
    fun addDough(@RequestBody dough: Dough): Dough {
        return doughService.save(dough)
    }

}
@Configuration
class MyConfigurations {
    @Bean
    fun corsConfigurer(): WebMvcConfigurer {
        return object : WebMvcConfigurer {
            override fun addCorsMappings(registry: CorsRegistry) {
                registry.addMapping("/**").allowedMethods("*")
            }
        }
    }}




