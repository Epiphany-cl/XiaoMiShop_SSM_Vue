/*
 Navicat Premium Data Transfer

 Source Server         : chen
 Source Server Type    : MySQL
 Source Server Version : 50737 (5.7.37-log)
 Source Host           : localhost:3306
 Source Schema         : xiaomi_shop

 Target Server Type    : MySQL
 Target Server Version : 50737 (5.7.37-log)
 File Encoding         : 65001

 Date: 22/10/2023 18:21:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `order_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `product_id` int(11) NULL DEFAULT NULL,
  `product_config_id` int(11) NULL DEFAULT NULL,
  `product_color_id` int(11) NULL DEFAULT NULL,
  `total_price` decimal(10, 2) NULL DEFAULT NULL,
  `order_create_time` datetime NULL DEFAULT NULL,
  `order_status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('2310211712105431', 3, 1, 1, 1, 2499.00, '2023-10-21 17:12:10', '未支付');
INSERT INTO `t_order` VALUES ('2310211957423665', 3, 1, 1, 1, 2499.00, '2023-10-21 19:57:43', '未支付');
INSERT INTO `t_order` VALUES ('2310211958367485', 3, 1, 2, 2, 2899.00, '2023-10-21 19:58:37', '未支付');
INSERT INTO `t_order` VALUES ('2310221028192113', 3, 1, 1, 1, 2499.00, '2023-10-22 10:28:19', '未支付');
INSERT INTO `t_order` VALUES ('2310221028229932', 3, 1, 1, 1, 2499.00, '2023-10-22 10:28:22', '未支付');
INSERT INTO `t_order` VALUES ('2310221028238959', 3, 1, 1, 1, 2499.00, '2023-10-22 10:28:23', '未支付');
INSERT INTO `t_order` VALUES ('2310221031167642', 3, 1, 1, 2, 2499.00, '2023-10-22 10:31:16', '未支付');
INSERT INTO `t_order` VALUES ('2310221032140708', 3, 1, 2, 1, 2899.00, '2023-10-22 10:32:14', '未支付');
INSERT INTO `t_order` VALUES ('2310221131459061', 3, 1, 1, 2, 2499.00, '2023-10-22 11:31:46', '未支付');
INSERT INTO `t_order` VALUES ('2310221131487709', 3, 1, 1, 1, 2499.00, '2023-10-22 11:31:49', '未支付');
INSERT INTO `t_order` VALUES ('2310221652409822', 3, 1, 1, 1, 2499.00, '2023-10-22 16:52:41', '未支付');
INSERT INTO `t_order` VALUES ('2310221654150184', 3, 1, 1, 1, 2499.00, '2023-10-22 16:54:15', '未支付');
INSERT INTO `t_order` VALUES ('2310221655115617', 3, 1, 1, 1, 2499.00, '2023-10-22 16:55:11', '未支付');
INSERT INTO `t_order` VALUES ('2310221655128106', 3, 1, 1, 1, 2499.00, '2023-10-22 16:55:13', '未支付');
INSERT INTO `t_order` VALUES ('2310221655148007', 3, 1, 1, 1, 2499.00, '2023-10-22 16:55:14', '未支付');

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product`  (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `product_sketch` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品简述 外面展示用的',
  `product_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `product_strating_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '起售价格',
  `product_img_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `product_category_id` int(11) NULL DEFAULT NULL COMMENT '商品种类',
  `product_creation_time` datetime NULL DEFAULT NULL,
  `product_update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`product_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 51 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES (1, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (2, '小米7', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (3, '小米8', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (4, '小米9', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (5, '小米10', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (6, '小米11', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (7, '小米12', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (8, '小米13', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (9, '小米14', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (10, '小米15', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (11, '小米16', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (12, '小米17', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (13, '小米19', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (14, '小米18', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (15, '小米131', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (16, '小米3131', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (17, '小米3131', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (18, '小米3131', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (19, '小米31', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (20, '小米1313', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (21, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (22, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (23, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (24, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (25, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (26, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (27, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (28, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (29, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (30, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (31, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (32, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (33, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (34, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (35, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (36, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (37, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (38, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (39, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (40, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (41, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (42, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (43, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (44, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (45, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (46, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (47, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (48, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');
INSERT INTO `t_product` VALUES (49, '小米6', '5.16早10点开售', '变焦双摄，4 轴防抖 / 骁龙835 旗舰处理器，6GB 大内存，最大可选128GB 闪存 / 5.15\" 护眼屏 / 四曲面玻璃/陶瓷机身', 2499.00, './image/liebiao_xiaomi6.jpg', 1, '2023-10-19 13:31:36', '2023-10-19 13:31:39');

-- ----------------------------
-- Table structure for t_product_category
-- ----------------------------
DROP TABLE IF EXISTS `t_product_category`;
CREATE TABLE `t_product_category`  (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_product_category
-- ----------------------------
INSERT INTO `t_product_category` VALUES (1, '小米手机');
INSERT INTO `t_product_category` VALUES (2, '红米');
INSERT INTO `t_product_category` VALUES (3, '平板·笔记本');
INSERT INTO `t_product_category` VALUES (4, '电视');
INSERT INTO `t_product_category` VALUES (5, '盒子·影音');
INSERT INTO `t_product_category` VALUES (6, '路由器');

-- ----------------------------
-- Table structure for t_product_color
-- ----------------------------
DROP TABLE IF EXISTS `t_product_color`;
CREATE TABLE `t_product_color`  (
  `product_color_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NULL DEFAULT NULL,
  `product_color` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `color_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`product_color_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_product_color
-- ----------------------------
INSERT INTO `t_product_color` VALUES (1, 1, '亮黑色', '#000');
INSERT INTO `t_product_color` VALUES (2, 1, '汝窑白', '#fff');

-- ----------------------------
-- Table structure for t_product_config
-- ----------------------------
DROP TABLE IF EXISTS `t_product_config`;
CREATE TABLE `t_product_config`  (
  `product_config_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NULL DEFAULT NULL,
  `product_config` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `product_price` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`product_config_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_product_config
-- ----------------------------
INSERT INTO `t_product_config` VALUES (1, 1, '6GB+64GB', 2499.00);
INSERT INTO `t_product_config` VALUES (2, 1, '6GB+128GB', 2899.00);

-- ----------------------------
-- Table structure for t_shopping_cart
-- ----------------------------
DROP TABLE IF EXISTS `t_shopping_cart`;
CREATE TABLE `t_shopping_cart`  (
  `cart_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL,
  `product_id` int(11) NULL DEFAULT NULL,
  `product_config_id` int(11) NULL DEFAULT NULL,
  `product_color_id` int(11) NULL DEFAULT NULL,
  `product_quantity` int(11) NULL DEFAULT NULL COMMENT '数量',
  `cart_status` int(11) NULL DEFAULT NULL COMMENT '0:未选择 1:选择',
  PRIMARY KEY (`cart_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_shopping_cart
-- ----------------------------
INSERT INTO `t_shopping_cart` VALUES (20, 3, 1, 1, 2, 1, 1);
INSERT INTO `t_shopping_cart` VALUES (21, 3, 1, 1, 1, 1, 0);
INSERT INTO `t_shopping_cart` VALUES (22, 3, 1, 2, 1, 1, 0);
INSERT INTO `t_shopping_cart` VALUES (23, 3, 1, 1, 1, 1, 1);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_signature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '个性签名',
  `user_hobby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, '11', '11', '1111', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (2, '111', '11', '1111', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (3, '1111', '11', '1111', '1111', '唱跳 rap', '火星');
INSERT INTO `t_user` VALUES (4, '111111', '11', '1111', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (5, '11111111', '111', '1111', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (6, '1111111111111', '111', '1111', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (7, '1111111', '11111111111', '1111', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (8, '2222', '11111111111', '2222', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
