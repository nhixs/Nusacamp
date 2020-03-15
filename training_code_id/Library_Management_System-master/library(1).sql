/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50141
 Source Host           : localhost:3306
 Source Schema         : library

 Target Server Type    : MySQL
 Target Server Version : 50141
 File Encoding         : 65001

 Date: 15/03/2020 23:45:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `name` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `username` varchar(12) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `password` varchar(12) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `securityQuestion` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Answer` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('Bagus Hariyanto', 'kagemaru', 'bagus246', 'siapa hayo ?', 'hayo');

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `idAdmin` int(8) NOT NULL,
  `username` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `password` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`idAdmin`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', 'admin');

-- ----------------------------
-- Table structure for issuebook
-- ----------------------------
DROP TABLE IF EXISTS `issuebook`;
CREATE TABLE `issuebook`  (
  `Book_ID` smallint(6) NULL DEFAULT NULL,
  `Name` varchar(21) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Edition` tinyint(4) NULL DEFAULT NULL,
  `Publisher` varchar(12) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Price` smallint(6) NULL DEFAULT NULL,
  `Pages` smallint(6) NULL DEFAULT NULL,
  `Student_ID` smallint(6) NULL DEFAULT NULL,
  `SName` varchar(11) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Father` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Course` varchar(6) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Branch` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Year` tinyint(4) NULL DEFAULT NULL,
  `Semester` tinyint(4) NULL DEFAULT NULL,
  `Date_Of_Issue` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL
) ENGINE = MyISAM CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of issuebook
-- ----------------------------
INSERT INTO `issuebook` VALUES (141, 'Java', 1, 'Oracle Ltd', 999, 1299, 79, 'Pritam', 'P.Pattadar', 'B.Tech', 'Civil', 2, 3, '09/09/16');
INSERT INTO `issuebook` VALUES (280, 'OOPs', 5, 'Pranab', 896, 1233, 192, 'Satyajit', 'D.Sharma', 'B.SC', 'Math', 2, 3, '09/09/16');
INSERT INTO `issuebook` VALUES (795, 'Data Structure With C', 7, 'Manish Goyal', 899, 598, 919, 'Avijit Mota', 'Pata Nai', 'B.Tech', 'ECE', 2, 3, '10/09/16');
INSERT INTO `issuebook` VALUES (284, 'Mathematics 3', 3, 'Goyal Ltd', 499, 868, 665, 'Ram', 'S.Mahato', 'B.Tech', 'CSE', 2, 3, '10/09/16');

-- ----------------------------
-- Table structure for newacc
-- ----------------------------
DROP TABLE IF EXISTS `newacc`;
CREATE TABLE `newacc`  (
  `Name` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Username` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Password` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `CPassword` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `SecurityQ` varchar(35) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Answer` varchar(35) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL
) ENGINE = MyISAM CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of newacc
-- ----------------------------
INSERT INTO `newacc` VALUES ('Arunabh', 'arun', '12346', '12346', 'What is your Mother Tongue?', 'Hindi');
INSERT INTO `newacc` VALUES ('Ram', 'ramji', '12345', '12345', 'What is your Mother Tongue?', 'Hindi');
INSERT INTO `newacc` VALUES ('lihin', 'lihin', '12345', '123456', 'What is your NickName?', 'lihin');
INSERT INTO `newacc` VALUES ('bambang', 'bambang', '12345678', '12345678', 'What is your Mother Tongue?', 'lah mak gua lah');
INSERT INTO `newacc` VALUES ('aku', 'acucamu', 'acucamu', 'acucamu', 'What is your Mother Tongue?', 'makacu');
INSERT INTO `newacc` VALUES ('asd', 'asda', 'asda', 'asda', 'What is your Mother Tongue?', 'asda');
INSERT INTO `newacc` VALUES ('admin', 'admin', 'admin', 'admin', 'What is your Mother Tongue?', 'admin');

-- ----------------------------
-- Table structure for newbook
-- ----------------------------
DROP TABLE IF EXISTS `newbook`;
CREATE TABLE `newbook`  (
  `Book_ID` smallint(6) NULL DEFAULT NULL,
  `Name` varchar(21) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Edition` tinyint(4) NULL DEFAULT NULL,
  `Publisher` varchar(13) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Price` smallint(6) NULL DEFAULT NULL,
  `Pages` smallint(6) NULL DEFAULT NULL,
  `Bookshelf` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL
) ENGINE = MyISAM CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of newbook
-- ----------------------------
INSERT INTO `newbook` VALUES (141, 'Java', 1, 'Oracle Ltd', 999, 1299, NULL);
INSERT INTO `newbook` VALUES (280, 'OOPs', 5, 'Pranab', 896, 1233, NULL);
INSERT INTO `newbook` VALUES (284, 'Mathematics 3', 3, 'Goyal Ltd', 499, 868, NULL);
INSERT INTO `newbook` VALUES (386, 'Discrete Mathematics', 5, 'Arnab Rash', 965, 1988, NULL);
INSERT INTO `newbook` VALUES (537, 'Digital Electronics', 2, 'Prabjat ', 788, 2122, NULL);
INSERT INTO `newbook` VALUES (745, 'OS', 2, 'Windows', 1299, 1988, NULL);
INSERT INTO `newbook` VALUES (785, 'CBNST', 3, 'Laxmi Pvt Ltd', 299, 568, NULL);
INSERT INTO `newbook` VALUES (795, 'Data Structure With C', 7, 'Manish Goyal', 899, 598, NULL);
INSERT INTO `newbook` VALUES (805, 'HTML', 3, 'W3', 958, 1322, NULL);
INSERT INTO `newbook` VALUES (494, 'Drawing', 1, 'Art Inc', 999, 100, 'Art');

-- ----------------------------
-- Table structure for newbookshelf
-- ----------------------------
DROP TABLE IF EXISTS `newbookshelf`;
CREATE TABLE `newbookshelf`  (
  `BookShelf_ID` int(11) NOT NULL,
  `Name` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`BookShelf_ID`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of newbookshelf
-- ----------------------------
INSERT INTO `newbookshelf` VALUES (351, 'Math');
INSERT INTO `newbookshelf` VALUES (807, 'Science');
INSERT INTO `newbookshelf` VALUES (26, 'Art');

-- ----------------------------
-- Table structure for nwstudent
-- ----------------------------
DROP TABLE IF EXISTS `nwstudent`;
CREATE TABLE `nwstudent`  (
  `Student_ID` smallint(6) NULL DEFAULT NULL,
  `Name` varchar(11) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `F_Name` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Course` varchar(6) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Branch` varchar(7) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Year` tinyint(4) NULL DEFAULT NULL,
  `Semester` tinyint(4) NULL DEFAULT NULL
) ENGINE = MyISAM CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nwstudent
-- ----------------------------
INSERT INTO `nwstudent` VALUES (79, 'Pritam', 'P.Pattadar', 'B.Tech', 'Civil', 2, 3);
INSERT INTO `nwstudent` VALUES (192, 'Satyajit', 'D.Sharma', 'B.SC', 'Math', 2, 3);
INSERT INTO `nwstudent` VALUES (211, 'Hrishik', 'B.Debnath', 'B.SC', 'Physics', 2, 3);
INSERT INTO `nwstudent` VALUES (446, 'Kaustav', 'K.Das', 'B.Tech', 'CSE', 2, 3);
INSERT INTO `nwstudent` VALUES (654, 'Abhijit', 'A.Das', 'B.Tech', 'CSE', 1, 1);
INSERT INTO `nwstudent` VALUES (665, 'Ram', 'S.Mahato', 'B.Tech', 'CSE', 2, 3);
INSERT INTO `nwstudent` VALUES (686, 'Souvik', 'B.Modak', 'B.Tech', 'CSE', 2, 3);
INSERT INTO `nwstudent` VALUES (771, 'Anuj', 'A.K.Ray', 'B.Tech', 'CSE', 2, 3);
INSERT INTO `nwstudent` VALUES (919, 'Avijit Mota', 'Pata Nai', 'B.Tech', 'ECE', 2, 3);

-- ----------------------------
-- Table structure for returnbook
-- ----------------------------
DROP TABLE IF EXISTS `returnbook`;
CREATE TABLE `returnbook`  (
  `Student_ID` smallint(6) NULL DEFAULT NULL,
  `Name` varchar(7) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `FName` varchar(9) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Course` varchar(4) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Branch` varchar(7) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Year` tinyint(4) NULL DEFAULT NULL,
  `Semester` tinyint(4) NULL DEFAULT NULL,
  `Book_ID` smallint(6) NULL DEFAULT NULL,
  `BName` varchar(2) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Edition` tinyint(4) NULL DEFAULT NULL,
  `Publisher` varchar(7) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Price` smallint(6) NULL DEFAULT NULL,
  `Pages` smallint(6) NULL DEFAULT NULL,
  `IssueDate` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ReturnDate` varchar(12) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL
) ENGINE = MyISAM CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of returnbook
-- ----------------------------
INSERT INTO `returnbook` VALUES (211, 'Hrishik', 'B.Debnath', 'B.SC', 'Physics', 2, 3, 745, 'OS', 2, 'Windows', 1299, 1988, '10/09/16', 'Sep 10, 2016');

SET FOREIGN_KEY_CHECKS = 1;
