package com.halvfull.sourdoughapp
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SourdoughApplication

fun main(args: Array<String>) {
    runApplication<SourdoughApplication>(*args)
}
