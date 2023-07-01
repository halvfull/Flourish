package com.halvfull.sourdoughapp.repository
import org.springframework.data.jpa.repository.JpaRepository
import com.halvfull.sourdoughapp.model.Dough
interface DoughRepository : JpaRepository<Dough, Long>