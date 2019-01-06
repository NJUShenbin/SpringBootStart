/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : book

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2019-01-06 23:57:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `price` int(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'Effective C++', 'Scott Meyers', 'English', '40');
INSERT INTO `book` VALUES ('2', '机器学习', '周志华', 'Chinese', '50');
INSERT INTO `book` VALUES ('3', '人月神话', 'Brooks', 'English', '30');
