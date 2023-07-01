package com.halvfull.sourdoughapp.service
import com.halvfull.sourdoughapp.repository.DoughRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DoughService(@Autowired val doughRepository: DoughRepository) {

}

