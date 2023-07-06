package com.halvfull.sourdoughapp.database
import java.sql.Connection
import java.sql.DriverManager

class DatabaseConfig {
    fun getConnection(): Connection {
        return DriverManager.getConnection("jdbc:sqlite:/Users/jakobsterri/IdeaProjects/sourFlourish/sqllite_db/database.db")
    }
}
