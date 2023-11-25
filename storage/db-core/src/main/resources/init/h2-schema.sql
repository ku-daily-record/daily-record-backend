CREATE TABLE `user`
(
    `id`                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `email`             VARCHAR(100)                       NOT NULL,
    `password`          VARCHAR(50)                        NOT NULL,
    `nickname`          VARCHAR(20),
    `profile_image_url` VARCHAR(255),
    `created_at`        DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL,
    `updated_at`        DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `email` (`email`)
);

CREATE TABLE `post`
(
    `id`          BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `user_id`     BIGINT UNSIGNED NOT NULL,
    `is_favorite` TINYINT(1) NOT NULL,
    `image_url`   VARCHAR(255)                       NOT NULL,
    `song_name`   VARCHAR(50)                        NOT NULL,
    `singer_name` VARCHAR(50)                        NOT NULL,
    `comment`     VARCHAR(100),
    `created_at`  DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL,
    `updated_at`  DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `friendship`
(
    `id`         BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `user_id`    BIGINT UNSIGNED NOT NULL,
    `friend_id`  BIGINT UNSIGNED NOT NULL,
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `like`
(
    `id`         BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `user_id`    BIGINT UNSIGNED NOT NULL,
    `post_id`    BIGINT UNSIGNED NOT NULL,
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL,
    PRIMARY KEY (`id`)
);
