CREATE TABLE `girl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `cup_size` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;


INSERT INTO `girl` VALUES (1, '凤姐', 18, 'B');
INSERT INTO `girl` VALUES (2, '芙蓉姐姐', 24, 'C');
INSERT INTO `girl` VALUES (4, '苍老师', 12, 'B');
INSERT INTO `girl` VALUES (5, '网王二麻子', 25, 'C');
INSERT INTO `girl` VALUES (7, '凤姐', 28, 'A');
INSERT INTO `girl` VALUES (8, '波多老师', 25, 'G');
