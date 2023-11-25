package io.ku.dailyrecord.storage.db.core.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "post")
class PostEntity(
    @Column
    val userId: Long,

    @Column
    var isFavorite: Boolean,

    @Column(length = 255)
    var imageUrl: String,

    @Column(length = 50)
    var songName: String,

    @Column(length = 50)
    var singerName: String,

    @Column(length = 50)
    var comment: String? = null,
) : BaseEntity()
