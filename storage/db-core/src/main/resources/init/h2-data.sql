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

INSERT INTO post(user_id, is_favorite, image_url, song_name, singer_name, comment, created_at, updated_at)
VALUES (1, true, 'https://image.bugsm.co.kr/album/images/200/40903/4090354.jpg?version=20230822072239.0', 'Love Lee',
        'AKMU(악뮤)', '신난당', '2023-11-26 06:47:36.470216', '2023-11-26 06:47:36.470216')
;

INSERT INTO post(user_id, is_favorite, image_url, song_name, singer_name, created_at, updated_at)
VALUES (1, false, 'https://image.bugsm.co.kr/album/images/500/40780/4078016.jpg', 'Hype Boy', '뉴진스',
        '2023-11-26 07:47:36.470216', '2023-11-26 07:47:36.470216'),
       (1, false, 'https://cf.asiaartistawards.com/news/21/2020/08/2020082713160186478_1.jpg', 'Not Shy', 'Itzy',
        '2023-11-26 10:47:36.470216', '2023-11-26 10:47:36.470216'),
       (1, true, 'https://image.bugsm.co.kr/album/images/500/40824/4082425.jpg', 'Ditto', '뉴진스',
        '2023-11-03 10:47:36.470216', '2023-11-03 10:47:36.470216'),
       (1, true,
        'https://m.izm.co.kr/wp-content/uploads/2022/12/%EB%A5%B4%EC%84%B8%EB%9D%BC%ED%95%8C_%EC%95%A8%EB%B2%94%EC%BB%A4%EB%B2%84.jpg',
        'Antifragile', '르세라핌', '2023-11-07 10:47:36.470216', '2023-11-07 10:47:36.470216'),
       (1, false,
        'https://i0.wp.com/m.izm.co.kr/wp-content/uploads/2023/05/%EB%A5%B4%EC%84%B8%EB%9D%BC%ED%95%8C-1.jpg?fit=553%2C551&ssl=1',
        'Unforgiven', '르세라핌', '2023-11-07 12:47:36.470216', '2023-11-07 12:47:36.470216'),
       (1, true, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/202310161516028.jpg', 'Baddie', 'IVE',
        '2023-11-08 00:00:00.000000', '2023-11-08 00:00:00.000000'),
       (1, true, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/202304111337030.jpg', 'I AM', 'IVE',
        '2023-11-10 00:00:00.000000', '2023-11-10 00:00:00.000000'),
       (1, false, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/202305101047056.jpg', 'Spicy', '에스파',
        '2023-11-10 00:00:00.000000', '2023-11-10 00:00:00.000000'),
       (1, false, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/202311130938027.jpg', 'Drama', '에스파',
        '2023-11-10 00:00:00.000000', '2023-11-10 00:00:00.000000'),
       (1, true, 'https://smtown-cdn.smtown.com/upload/album/3372935621a74e03ba5b731b16600029_2023-09-04-09-03-19.jpg',
        'Get A Guitar', 'RIIZE', '2023-11-14 00:00:00.000000', '2023-11-14 00:00:00.000000'),
       (1, true, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/202206091954023.jpg', 'HOT', '세븐틴',
        '2023-11-16 00:00:00.000000', '2023-11-16 00:00:00.000000'),
       (1, true,
        'https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/e3/76/df/e376df28-c05b-00fd-72de-9d42377a306b/196922628580_Cover.jpg/1200x1200bf-60.jpg',
        '음악의 신', '세븐틴', '2023-11-17 00:00:00.000000', '2023-11-17 00:00:00.000000'),
       (1, false, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/202309061513004.jpg', '뭣 같아',
        'BOYNEXTDOOR', '2023-11-17 00:00:00.000000', '2023-11-17 00:00:00.000000'),
       (1, true, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/20181105073432.JPG', 'Tempo', '엑소',
        '2023-11-18 00:00:00.000000', '2023-11-18 00:00:00.000000'),
       (1, false, 'https://image.bugsm.co.kr/album/images/500/5079/507931.jpg', 'Love Me Right', '엑소',
        '2023-11-18 00:00:00.000000', '2023-11-18 00:00:00.000000'),
       (1, true, 'https://ibighit.com/bts/images/bts/discography/butter-2/butter-2-cover.jpg', 'Butter', 'BTS',
        '2023-11-22 00:00:00.000000', '2023-11-22 00:00:00.000000'),
       (1, true, 'https://ibighit.com/bts/images/bts/discography/wings/album-cover.jpg', '피 땀 눈물', 'BTS',
        '2023-11-24 00:00:00.000000', '2023-11-24 00:00:00.000000'),
       (1, false, 'https://i.pinimg.com/originals/05/ce/15/05ce15f1db61aa91b08f8a7bb3ea6943.jpg', 'Blueming', 'IU',
        '2023-11-24 00:00:00.000000', '2023-11-24 00:00:00.000000'),
       (1, false, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/20170711120450.JPG', '빨간 맛', '레드벨벳',
        '2023-11-24 00:00:00.000000', '2023-11-24 00:00:00.000000'),
       (1, true, 'https://image.bugsm.co.kr/album/images/500/40878/4087880.jpg', 'ISTJ', 'NCT DREAM',
        '2023-11-25 00:00:00.000000', '2023-11-25 00:00:00.000000'),
       (1, false, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/202306081240059.jpg', '특', '스트레이키즈',
        '2023-11-25 00:00:00.000000', '2023-11-25 00:00:00.000000'),
       (1, false, 'https://www.akbobada.com/home/akbobada/archive/akbo/img/202305161018057.jpg', 'Queencard', '(여자)아이들',
        '2023-11-25 00:00:00.000000', '2023-11-25 00:00:00.000000')
;
