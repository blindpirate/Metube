/*
Navicat MySQL Data Transfer

Source Server         : 铁塔业务加载
Source Server Version : 50722
Source Host           : 172.21.96.23:3306
Source Database       : iotcmp_dev_towerlink

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-09-20 22:27:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for acct_credit_limit
-- ----------------------------
DROP TABLE IF EXISTS `acct_credit_limit`;
CREATE TABLE `acct_credit_limit` (
  `CREDIT_LIMIT_ID` decimal(16,0) NOT NULL COMMENT '集团支付限额标识',
  `CUST_ACCOUNT_ID` decimal(16,0) DEFAULT NULL COMMENT '客户账户信息标识',
  `LIMIT_CLASS` varchar(6) DEFAULT NULL COMMENT '1：初始信用度\r\n            7：临时信用度\r\n            ',
  `AMOUNT` decimal(12,2) NOT NULL COMMENT '记录额度上限，-1代表不限制。',
  `COMMENTS` varchar(250) DEFAULT NULL COMMENT '说明',
  `STATUS_CD` decimal(9,0) NOT NULL COMMENT '记录状态。',
  `STATUS_DATE` datetime DEFAULT NULL COMMENT '记录状态时间。',
  `EFF_DATE` datetime NOT NULL COMMENT '生效时间',
  `EXP_DATE` datetime NOT NULL COMMENT '失效时间',
  `CREATE_STAFF` decimal(16,0) DEFAULT NULL COMMENT '记录创建的员工。\r\n            ',
  `CREATE_DATE` datetime DEFAULT NULL COMMENT '记录创建的时间。\r\n            ',
  `UPDATE_STAFF` decimal(16,0) DEFAULT NULL COMMENT '记录修改的员工。\r\n            ',
  `UPDATE_DATE` datetime DEFAULT NULL COMMENT '记录修改的时间。\r\n            ',
  PRIMARY KEY (`CREDIT_LIMIT_ID`) USING BTREE,
  KEY `FK_Relationship_176` (`CUST_ACCOUNT_ID`) USING BTREE,
  CONSTRAINT `acct_credit_limit_ibfk_1` FOREIGN KEY (`CUST_ACCOUNT_ID`) REFERENCES `customer_account` (`CUST_ACCOUNT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='外部支付帐号';