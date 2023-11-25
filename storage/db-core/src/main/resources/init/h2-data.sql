INSERT INTO users(email, password, nickname, profile_image_url)
VALUES ('hcy1722@korea.ac.kr', '1234', 'hcy',
        'https://www.fitpetmall.com/wp-content/uploads/2023/10/shutterstock_1275055966-1.png'),
       ('kimjaheun@korea.ac.kr', '5678', 'kjh',
        'https://img1.daumcdn.net/thumb/R1280x0.fjpg/?fname=http://t1.daumcdn.net/brunch/service/user/32E9/image/BA2Qyx3O2oTyEOsXe2ZtE8cRqGk.JPG'),
       ('imannamj@gmail.com', '99910', 'kmj', 'https://img.hankyung.com/photo/202308/PYH2023082410230006100_P4.jpg'),
       ('subin6985@korea.ac.kr', '13579', 'psb',
        'https://images.mypetlife.co.kr/content/uploads/2019/09/09152804/ricky-kharawala-adK3Vu70DEQ-unsplash.jpg')
;

INSERT INTO friendship(user_id, friend_id)
VALUES (1, 2),
       (2, 1),
       (1, 3),
       (3, 1),
       (1, 4),
       (4, 1)
;
