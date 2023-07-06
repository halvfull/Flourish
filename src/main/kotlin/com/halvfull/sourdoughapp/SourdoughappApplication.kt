package com.halvfull.sourdoughapp
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin

@SpringBootApplication
@CrossOrigin(origins = ["http://localhost:3001"])
class SourdoughApplication

fun main(args: Array<String>) {
    runApplication<SourdoughApplication>(*args)
}
