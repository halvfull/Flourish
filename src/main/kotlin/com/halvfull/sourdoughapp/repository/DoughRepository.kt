package com.halvfull.sourdoughapp.repository
import org.springframework.data.jpa.repository.JpaRepository
import com.halvfull.sourdoughapp.model.Dough

import org.springframework.stereotype.Repository
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
@Repository
interface DoughRepository : JpaRepository<Dough, Long> {
    // Add custom methods for interacting with the database
}
