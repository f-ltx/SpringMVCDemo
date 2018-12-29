DROP DATABASE IF EXISTS springmvcdemo ;
CREATE DATABASE springmvcdemo DEFAULT CHARSET UTF8;
USE springmvcdemo;
-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` varchar(11)  NOT NULL,
  `username` varchar(40)  NOT NULL,
  `password` varchar(40)  NOT NULL,
  `sex` varchar(4)  NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'user', '123', '男');
