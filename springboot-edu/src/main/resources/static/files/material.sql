/*
 Navicat Premium Data Transfer

 Source Server         : jczd-vm-d
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 192.168.162.130:3306
 Source Schema         : material

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 24/09/2020 18:36:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for allbook
-- ----------------------------
DROP TABLE IF EXISTS `allbook`;
CREATE TABLE `allbook`  (
  `bid` int NULL DEFAULT NULL,
  `uid` int NULL DEFAULT NULL,
  `shuliang` int NULL DEFAULT NULL,
  `start` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `end` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of allbook
-- ----------------------------
INSERT INTO `allbook` VALUES (110000001, 410000004, 1, '2020/09/06 15:12:07', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000002, 410000004, 1, '2020/09/06 15:12:07', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000001, 410000004, 1, '2020/09/06 16:58:58', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000003, 410000004, 1, '2020/09/06 16:58:58', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000004, 410000004, 1, '2020/09/06 16:58:59', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000001, 410000004, 1, '2020/09/06 16:58:59', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000004, 410000004, 2, '2020/09/06 16:58:59', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000002, 410000004, 1, '2020/09/06 17:02:50', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000003, 410000004, 1, '2020/09/06 17:02:50', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000004, 410000004, 1, '2020/09/06 17:02:50', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000001, 410000004, 14, '2020/09/07 10:55:06', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000002, 410000004, 8, '2020/09/07 10:55:06', NULL, '未完成');
INSERT INTO `allbook` VALUES (110000001, 410000004, 3, '2020/09/21 13:35:01', NULL, '未完成');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `chubanshe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zuozhe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bid` int NULL DEFAULT NULL,
  `uid` int NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('水浒传', '56', '铁路', '施耐庵', 110000001, 410000004);
INSERT INTO `book` VALUES ('昆虫记', '84', '法国', '法布尔', 110000002, 410000004);
INSERT INTO `book` VALUES ('巴黎圣母院', '34', '西方', '雨果', 110000003, 410000004);
INSERT INTO `book` VALUES ('朝花夕拾', '67', '光明出版社', '鲁迅', 110000004, 410000004);
INSERT INTO `book` VALUES ('繁星春水', '23', '东方红', '冰心', 110000005, 410000004);

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu`  (
  `uid` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `shenfen` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bumen` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uemail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE,
  UNIQUE INDEX `number`(`number`) USING BTREE,
  UNIQUE INDEX `uemail`(`uemail`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES (410000001, 'qh', 'test', '管理员', '222', '艺术', NULL);
INSERT INTO `yonghu` VALUES (410000002, '测试', '666666', '教师', '123456789', '计科', NULL);
INSERT INTO `yonghu` VALUES (410000003, 'test', 'test', '教师', '111', '计科', NULL);
INSERT INTO `yonghu` VALUES (410000004, 'zfj', 'test', '书店', '333', '计科', NULL);

SET FOREIGN_KEY_CHECKS = 1;
