/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : case_school

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 09/09/2020 19:52:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ca_school
-- ----------------------------
DROP TABLE IF EXISTS `ca_school`;
CREATE TABLE `ca_school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `school_name` varchar(50) NOT NULL COMMENT '学校名称',
  `school_desc` varchar(255) DEFAULT NULL COMMENT '学校描述',
  `school_logo_path` varchar(255) DEFAULT NULL COMMENT '学校logo存储地址',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ca_school
-- ----------------------------
BEGIN;
INSERT INTO `ca_school` VALUES (1, 'xxxxxxxx', '我为山东山东山东山东山东山东山东山东山东买了苏门答腊省的魅力', 'https://img.yzcdn.cn/vant/cat.jpeg', '2020-09-09 17:27:09', '2020-09-09 17:27:21');
INSERT INTO `ca_school` VALUES (2, 'test', 'sdasnjkdasdjashlfdkjhaslkdnas', 'https://img.yzcdn.cn/vant/cat.jpeg', '2020-09-09 17:42:16', '2020-09-09 17:42:16');
INSERT INTO `ca_school` VALUES (3, '河北大', '我阿森纳短发十分那考虑是否那苏里科夫尼玛蓝山咖啡', 'https://imgm.gmw.cn/attachement/jpg/site215/20200909/3158783819706090599.jpg', '2020-09-09 17:50:02', '2020-09-09 17:50:02');
INSERT INTO `ca_school` VALUES (4, '北京大', '阿斯顿拉萨麻烦；克里斯蒂娜每个时代风格卡德罗夫可能更多福利机构呢；多福利给你', 'https://imgm.gmw.cn/attachement/jpg/site215/20200909/7094701587232111908.jpg', '2020-09-09 17:50:54', '2020-09-09 17:50:54');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
