-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: invoicedb
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE = @@TIME_ZONE */;
/*!40103 SET TIME_ZONE = '+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;

--
-- Table structure for table `invoice_list`
--

DROP TABLE IF EXISTS `invoice_list`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice_list`
(
    `id`                            int  NOT NULL,
    `boarding_date`                 date NOT NULL COMMENT '乘车日期',
    `boarding_time`                 datetime(6)    DEFAULT NULL,
    `disembarking_time`             datetime(6)    DEFAULT NULL,
    `passenger`                     varchar(255)   DEFAULT NULL,
    `starting_points`               varchar(255)   DEFAULT NULL,
    `ending_points`                 varchar(255)   DEFAULT NULL,
    `reimbursemen_amount`           decimal(38, 2) DEFAULT NULL,
    `electronic_invoice_flg`        varchar(255)   DEFAULT NULL,
    `electronic_invoice_tax_amount` decimal(38, 2) DEFAULT NULL,
    `project_no`                    varchar(255)   DEFAULT NULL,
    `task_name`                     varchar(255)   DEFAULT NULL,
    `situation_description`         varchar(255)   DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice_list`
--

LOCK TABLES `invoice_list` WRITE;
/*!40000 ALTER TABLE `invoice_list`
    DISABLE KEYS */;
INSERT INTO `invoice_list`
VALUES (1, '2022-04-26', '2023-11-26 16:21:20.000000', '2023-11-26 15:25:40.000000', 'UsxfeFQ7ra', 'mqTIbRUooR',
        'OwPrnfvLCr', 980.00, 'y', 274.00, 'oJSHxd4qTW', 'Feng Yuning', 'MmSFNMsyuc'),
       (2, '2017-08-28', '2023-11-26 15:13:26.000000', '2023-11-26 15:27:32.000000', 'a9nh6sJtJP', 'tor0f4AdQv',
        'ynmhIAETSJ', 252.00, 'N', 24.00, 'TbhcB5GdpU', 'Lin Zitao', 'Dg91pQZHil'),
       (3, '2013-03-03', '2023-11-26 10:52:08.000000', '2023-11-26 17:17:42.000000', 'fkdWiPa0SQ', 'MJzw48jwuB',
        'IJRQVmZgip', 322.00, 't', 41.00, 'xL3dOHB9Ol', 'Fang Zitao', 'FPPSi3qTXd'),
       (4, '2010-10-05', '2023-11-26 15:07:00.000000', '2023-11-26 15:54:38.000000', 'tVkold28pz', 'lMsgiUCH7l',
        '3R3yxNMAPY', 78.00, 'j', 405.00, 'WAqdKe668N', 'Annie West', 'Kh4XRonSo2'),
       (5, '2008-11-24', '2023-11-26 16:49:50.000000', '2023-11-26 10:02:19.000000', 'C5aUEVSgCu', 'sm960ht5Fe',
        'B48btRK5rJ', 216.00, 'g', 25.00, '1ggNP66svV', 'Miu Kwok Kuen', 'i198NtNwx4'),
       (6, '2003-07-18', '2023-11-26 11:15:39.000000', '2023-11-26 13:53:19.000000', 'RiFVeNV1Sj', 'qVRYp4PbHq',
        'ghw6KChO3K', 132.00, 'M', 303.00, 'yzFjuRpOy3', 'Siu Yu Ling', 'TDreRqptv0'),
       (7, '2015-09-02', '2023-11-26 14:19:43.000000', '2023-11-26 13:35:00.000000', 'R0TDJI1R1s', 'OVQrrPhvHA',
        'syKQVtiPJI', 671.00, 'z', 184.00, 'bqcdOJ1Q8d', 'Hou Shihan', '7PQA5ig0rw'),
       (8, '2022-08-12', '2023-11-26 12:01:21.000000', '2023-11-26 16:53:14.000000', '9dHiKhrKf4', 'Me4qOm5S9I',
        'W1pFau2bBo', 978.00, 't', 998.00, 'WpYbR8so2F', 'Linda Baker', '0fjTScwVi7'),
       (9, '2002-01-17', '2023-11-26 16:32:09.000000', '2023-11-26 16:44:52.000000', 'ZJKoxUSsAX', 'UIkhfUjrtg',
        'sGAVlAXFiH', 991.00, 'c', 873.00, 'vXDdOr8PEP', 'Cai Xiaoming', '5JcLvYXCvI'),
       (10, '2001-02-11', '2023-11-26 09:47:24.000000', '2023-11-26 14:41:41.000000', 'lNHxAtPQgr', 'iqDGXfSmVe',
        '1GPeeO55tz', 569.00, 'h', 581.00, 'yxz8M81rIK', 'Jia Shihan', 'S6qPCKnRro');
/*!40000 ALTER TABLE `invoice_list`
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_user`
(
    `id`          bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
    `user_name`   varchar(255) DEFAULT NULL,
    `nick_name`   varchar(255) DEFAULT NULL,
    `password`    varchar(255) DEFAULT NULL,
    `status`      varchar(255) DEFAULT NULL,
    `email`       varchar(255) DEFAULT NULL,
    `phonenumber` varchar(255) DEFAULT NULL,
    `sex`         varchar(255) DEFAULT NULL,
    `avatar`      varchar(255) DEFAULT NULL,
    `user_type`   varchar(255) DEFAULT NULL,
    `create_by`   bigint       DEFAULT NULL COMMENT '创建人的用户id',
    `create_time` datetime(6)  DEFAULT NULL,
    `update_by`   bigint       DEFAULT NULL COMMENT '更新人',
    `update_time` datetime(6)  DEFAULT NULL,
    `del_flag`    int          DEFAULT '0' COMMENT '删除标志（0代表未删除，1代表已删除）',
    PRIMARY KEY (`id`),
    UNIQUE KEY `sys_user_pk` (`user_name`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user`
    DISABLE KEYS */;
INSERT INTO `sys_user`
VALUES (1, 'root', 'root', '$2a$10$77j6vedhxv3mF3UdesOceO2A6Y/5..n89MwbczFsFrUBn35SGYEea', '0', NULL, NULL, NULL, NULL,
        '1', NULL, NULL, NULL, NULL, 0);
/*!40000 ALTER TABLE `sys_user`
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user`
(
    `id`   int         NOT NULL AUTO_INCREMENT,
    `name` varchar(20) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user`
    DISABLE KEYS */;
INSERT INTO `user`
VALUES (1, '123123');
/*!40000 ALTER TABLE `user`
    ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE = @OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

-- Dump completed on 2024-01-06 19:34:52
