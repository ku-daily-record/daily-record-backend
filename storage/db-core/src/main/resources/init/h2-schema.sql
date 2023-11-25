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
