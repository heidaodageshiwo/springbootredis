/*
Navicat MySQL Data Transfer

Source Server         : 张强本机mysql
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : zqmybatisplus

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-11-17 11:05:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `bir` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO `t_users` VALUES ('1', '1', '1', '2020-11-16 20:36:07');
INSERT INTO `t_users` VALUES ('2', 'ffff反反复复付付付付付付付付', '2', '2020-11-16 13:04:53');
INSERT INTO `t_users` VALUES ('3', 'ffff反反复复付付付付付付付付', '2', '2020-11-16 13:04:53');
INSERT INTO `t_users` VALUES ('4', 'bbbb', '3223', '2020-11-16 13:47:06');
INSERT INTO `t_users` VALUES ('5', 'bbbb', '3223', '2020-11-16 13:47:50');
