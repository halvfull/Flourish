package com.halvfull.sourdoughapp.service
import com.halvfull.sourdoughapp.repository.DoughRepository
import com.halvfull.sourdoughapp.model.Dough
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DoughService(@Autowired val doughRepository: DoughRepository) {
    fun save(dough: Dough): Dough {
        return doughRepository.save(dough)
    }


}

