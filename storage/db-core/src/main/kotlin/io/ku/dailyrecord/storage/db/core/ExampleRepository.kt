package io.ku.dailyrecord.storage.db.core

import org.springframework.data.jpa.repository.JpaRepository

interface ExampleRepository : JpaRepository<ExampleEntity, Long>
