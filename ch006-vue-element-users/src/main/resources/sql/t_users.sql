/*
 Navicat Premium Data Transfer

 Source Server         : mysql.sunyun
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : elementusers

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 31/10/2020 15:32:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(80) DEFAULT NULL,
  `bir` timestamp NULL DEFAULT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `address` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
