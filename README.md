### 小米商城(SSM + ~~Thymeleaf~~ + vue.js)

---

### 2023年10月18日 

- [x] 项目的准备工作(配置文件)
- [x] 整体网页的分析
- [x] 注册
  - user表(id、用户名、手机号、密码、个性签名、爱好、收货地址)

### 2023年10月19日

- [x] 登录
- [x] 商品展示
  - 产品表 (ProductId、商品名、简单描述、详细描述、起售价、图片、商品类别、创建时间、修改时间)
  - 产品配置表(ProductConfigId、ProductId、Config、价格) 一对多
  - 产品颜色表(ProductColorId、ProductId、Color)
  - 产品分类表

### 2023年10月20日

- [x] 商品详情展示
- [x] 用户登录状态显示
- [x] 购物车
  - 购物车表 ShoppingCart (id、uid、productid、quantity数量、选中状态)
- [x] 商品页添加购物车


产品展示时原理
```html
<template>
  <div>
    <!-- 遍历 chunkedArr -->
    <div v-for="(chunk, index) in chunkedArr" :key="index">
      <!-- 遍历每个子数组 -->
      <div v-for="item in chunk" :key="item">
        {{ item }}
      </div>
      -----
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      arr: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    };
  },
  computed: {
    // 将 arr 分割成大小为 5 的子数组
    chunkedArr() {
      let result = [];
      for (let i = 0; i < this.arr.length; i += 5) {
        result.push(this.arr.slice(i, i + 5));
      }
      return result;
    }
  }
};
</script>

```

---

1. **用户表 (User)**
  - UserID (主键)
  - Username
  - Password
  - Email
  - PhoneNumber
  - Address
  - ... (其他个人信息)

2. **产品类别表 (ProductCategory)**
  - CategoryID (主键)
  - CategoryName

3. **产品表 (Product)**
  - ProductID (主键)
  - ProductName
  - Description
  - Price
  - ImageURL
  - CategoryID (外键，引用 ProductCategory 的 CategoryID)
  - StockQuantity (库存数量)
  - ... (其他产品相关信息)

4. **订单表 (Order)**
  - OrderID (主键)
  - UserID (外键，引用 User 的 UserID)
  - OrderDate
  - TotalAmount
  - OrderStatus
  - ... (其他订单相关信息)

5. **订单详细信息表 (OrderDetail)**
  - DetailID (主键)
  - OrderID (外键，引用 Order 的 OrderID)
  - ProductID (外键，引用 Product 的 ProductID)
  - Quantity
  - Subtotal

6. **购物车表 (ShoppingCart)**
  - CartID (主键)
  - UserID (外键，引用 User 的 UserID)
  - ProductID (外键，引用 Product 的 ProductID)
  - Quantity

7. **用户反馈表 (UserFeedback)**
  - FeedbackID (主键)
  - UserID (外键，引用 User 的 UserID)
  - FeedbackContent
  - FeedbackDate

8. **用户收藏表 (UserFavorites)**
  - FavoriteID (主键)
  - UserID (外键，引用 User 的 UserID)
  - ProductID (外键，引用 Product 的 ProductID)

9. **产品评论表 (ProductReviews)**
  - ReviewID (主键)
  - ProductID (外键，引用 Product 的 ProductID)
  - UserID (外键，引用 User 的 UserID)
  - ReviewContent
  - ReviewDate
  - Rating

---

数据库表结构与数据：

```sql
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

 Date: 18/10/2023 21:45:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;

```