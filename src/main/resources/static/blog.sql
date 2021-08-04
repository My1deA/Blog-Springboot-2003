/*
 Navicat Premium Data Transfer

 Source Server         : Mylink
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : test7788

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 04/08/2021 18:40:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '作者id',
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文章题目title',
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文章类别category/type',
  `resume` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '文章简介resume',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '文章内容content',
  `state` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文章状态：draft recycle release',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '文章发布时间',
  `praise` int(11) NULL DEFAULT NULL COMMENT '点赞数',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_a_user_id`(`user_id`) USING BTREE,
  CONSTRAINT `fk_a_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (1, 2, '第一篇博客测试', 'Test', '简短的helloWorld', 'Article后端测试', 'release', '2020-04-11 00:00:00', 1);
INSERT INTO `article` VALUES (2, 1, '前端Web传博客数据', 'Test', '尝试前后端写入博客数据', 'hello world', 'release', '2020-04-11 21:24:19', 0);
INSERT INTO `article` VALUES (3, 1, 'Postman获取后端数据', 'Test', '使用PostmanGet后端数据', 'Article succes', 'release', '2020-04-16 23:06:49', 0);
INSERT INTO `article` VALUES (4, 1, '整合PageHelper', 'Test', '第一次使用PageHelper记录', 'Springboot+PageHelper', 'release', '2020-04-16 23:08:01', 0);
INSERT INTO `article` VALUES (5, 1, 'List<T>以及PageInfo<T>', 'Test', '加深理解Json', '区分返回不同Json数据的内容', 'release', '2020-04-16 23:11:55', 0);
INSERT INTO `article` VALUES (6, 1, '整理Springboot文件', 'Test', '将项目文件重新整理', '整理了blogdemo1的测试目录', 'release', '2020-04-16 23:14:42', 0);
INSERT INTO `article` VALUES (7, 2, '睡眠不足的小随笔', 'Life', '最近睡眠不足', '睡眠不足 状态不佳', 'release', '2020-04-16 23:17:44', 0);
INSERT INTO `article` VALUES (8, 2, '头晕脑胀的一天', 'Life', '继续休学一下', '准时睡眠 养精蓄锐', 'release', '2020-04-16 23:19:23', 0);
INSERT INTO `article` VALUES (9, 1, '课程学习的3天', 'Life', '上课+写作业', '在Linux+数计中迷失', 'release', '2020-04-16 23:21:11', 0);
INSERT INTO `article` VALUES (10, 1, '状态回暖', 'Test', '重新捡起之前的项目', '认真复习之前的项目代码和笔记', 'release', '2020-04-16 23:25:36', 0);
INSERT INTO `article` VALUES (11, 1, '前端博客获取后端数据测试', 'Test', '异步加载前端表格', '还没完成具体功能', 'release', '2020-04-16 23:27:08', 0);
INSERT INTO `article` VALUES (12, 1, 'Mysql存储varchar转text', 'Test', '更新Github的项目的Readme', ' 基于Nathaniel Rich在《纽约时报》上发表的文章《The Lawyer Who Became DuPont’s Worst Nightmare》，围绕罗伯特·比洛特展开，他担任辩护律师长达8年之久，他对化工巨头杜邦公司提起了环境诉讼，这场官司揭露了几十年来杜邦公司化学污染的历史 拥有财富、名声、权力，这世界上的一切的男人 “海贼王”哥尔·D·罗杰，在被行刑受死之前说了一句话，让全世界的人都涌向了大海。“想要我的宝藏吗？ 如果想要的话，那就到海上去找吧，我全部都放在那里。”，世界开始迎接“大海贼时代”的来临 [10] 时值“大海贼时代”，为了寻找传说中海贼王罗杰所留下的大秘宝“ONE PIECE”，无数海贼扬起旗帜，互相争斗。有一个梦想成为海贼王的少年叫路飞， 他因误食“恶魔果实”而成为了橡皮人，在获得超人能力的同时付出了一辈子无法游泳的代价。十年后，路飞为实现与因救他而断臂的香克斯的约定而出海， 他在旅途中不断寻找志同道合的伙伴，开始了以成为海贼王为目标的冒险旅程 [11]', 'release', '2020-04-24 13:32:58', 0);

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `article_id` int(11) NULL DEFAULT NULL COMMENT '文章id',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '评论用户id',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '评论内容content',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '评论时间time',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_c_user_id`(`user_id`) USING BTREE,
  INDEX `fk_c_article_id`(`article_id`) USING BTREE,
  CONSTRAINT `fk_c_article_id` FOREIGN KEY (`article_id`) REFERENCES `article` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_c_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, 12, NULL, '挺好的', '2020-04-24 18:34:03');
INSERT INTO `comment` VALUES (2, 12, NULL, '测试comment 新增List 是否影响增删查改', '2020-04-25 18:34:03');
INSERT INTO `comment` VALUES (3, 12, NULL, 'JetBrains may use cookies and my IP address to\r\n                                        collect individual statistics and to provide me with\r\n                                        personalized offers and ads subject to the Privacy\r\n                                        Policy and the Terms of Use. JetBrains may use\r\n                                        third-party services for this purpose. I can revoke\r\n                                        my consent at any time by visiting the Opt-Out page.', '2020-04-25 21:12:00');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限name',
  `description` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限具体描述description',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for praise
-- ----------------------------
DROP TABLE IF EXISTS `praise`;
CREATE TABLE `praise`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '点赞id (null)',
  `article_id` int(11) NULL DEFAULT NULL COMMENT '文章id',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '点赞用户id',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '点赞时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '回复id',
  `comment_id` int(11) NULL DEFAULT NULL COMMENT '上一条评论id',
  `from_id` int(11) NULL DEFAULT NULL COMMENT '此回复用户id',
  `to_id` int(11) NULL DEFAULT NULL COMMENT '被回复用户id',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '回复时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_r_comment_id`(`comment_id`) USING BTREE,
  INDEX `fk_r_from_id`(`from_id`) USING BTREE,
  INDEX `fk_r_to_id`(`to_id`) USING BTREE,
  CONSTRAINT `fk_r_comment_id` FOREIGN KEY (`comment_id`) REFERENCES `comment` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_r_from_id` FOREIGN KEY (`from_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_r_to_id` FOREIGN KEY (`to_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES (1, 1, NULL, 1, '+1', '2020-04-24 20:25:32');
INSERT INTO `reply` VALUES (2, 1, NULL, 1, '666', '2020-04-27 10:02:51');
INSERT INTO `reply` VALUES (3, 1, NULL, 1, 'LPLNB', '2020-04-28 21:25:20');
INSERT INTO `reply` VALUES (4, 1, NULL, 1, 'LBWNB', '2020-04-28 21:25:30');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色name',
  `description` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色description',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '管理员', '管理系统所有权限');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'role_permission',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  `permission_id` int(11) NULL DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_rp_role_id`(`role_id`) USING BTREE,
  INDEX `fk_rp_permission_id`(`permission_id`) USING BTREE,
  CONSTRAINT `fk_rp_permission_id` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_rp_role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for subscription
-- ----------------------------
DROP TABLE IF EXISTS `subscription`;
CREATE TABLE `subscription`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订阅id (null)',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `subscribed_id` int(11) NULL DEFAULT NULL COMMENT '被订阅用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户密码',
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '盐',
  `info` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户信息（姓名等等）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123', NULL, NULL);
INSERT INTO `user` VALUES (2, 'xiaomi', 'ff01a59738ebb91d22f7540f5a5b135d', 'ZCBU9McNZ9jV70gYHKm0uQ==', NULL);

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'user_role id',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_ur_user_id`(`user_id`) USING BTREE,
  INDEX `fk_ur_role_id`(`role_id`) USING BTREE,
  CONSTRAINT `fk_ur_role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_ur_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
