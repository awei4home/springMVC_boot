/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.6.14-log : Database - awei
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`awei` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `awei`;

/*Table structure for table `tbug` */

DROP TABLE IF EXISTS `tbug`;

CREATE TABLE `tbug` (
  `ID` varchar(36) NOT NULL,
  `CHEATEDATETIME` date DEFAULT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `NOTE` longtext,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbug` */

/*Table structure for table `tmenu` */

DROP TABLE IF EXISTS `tmenu`;

CREATE TABLE `tmenu` (
  `ID` varchar(36) NOT NULL,
  `ICONCLS` varchar(100) DEFAULT NULL,
  `SEQ` decimal(22,0) DEFAULT NULL,
  `TEXT` varchar(100) DEFAULT NULL,
  `URL` varchar(200) DEFAULT NULL,
  `PID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tmenu` */

/*Table structure for table `tonline` */

DROP TABLE IF EXISTS `tonline`;

CREATE TABLE `tonline` (
  `ID` varchar(36) NOT NULL,
  `IP` varchar(50) DEFAULT NULL,
  `LOGINDATETIME` date DEFAULT NULL,
  `LOGINNAME` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tonline` */

/*Table structure for table `tresource` */

DROP TABLE IF EXISTS `tresource`;

CREATE TABLE `tresource` (
  `ID` varchar(36) NOT NULL,
  `SEQ` decimal(22,0) DEFAULT NULL,
  `TEXT` varchar(100) DEFAULT NULL,
  `URL` varchar(200) DEFAULT NULL,
  `PID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tresource` */

/*Table structure for table `trole` */

DROP TABLE IF EXISTS `trole`;

CREATE TABLE `trole` (
  `ID` varchar(36) NOT NULL,
  `TEXT` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `trole` */

insert  into `trole`(`ID`,`TEXT`) values ('0','ss'),('1','2222');

/*Table structure for table `trole_tresource` */

DROP TABLE IF EXISTS `trole_tresource`;

CREATE TABLE `trole_tresource` (
  `ID` varchar(36) NOT NULL,
  `RESOURCE_ID` varchar(36) DEFAULT NULL,
  `ROLE_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `TROLE_TRESOURCE_TRESOURCE` (`RESOURCE_ID`),
  KEY `TROLE_TRESOURCE_TROLE` (`ROLE_ID`),
  CONSTRAINT `TROLE_TRESOURCE_TRESOURCE` FOREIGN KEY (`RESOURCE_ID`) REFERENCES `tresource` (`ID`),
  CONSTRAINT `TROLE_TRESOURCE_TROLE` FOREIGN KEY (`ROLE_ID`) REFERENCES `trole` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `trole_tresource` */

/*Table structure for table `tuser` */

DROP TABLE IF EXISTS `tuser`;

CREATE TABLE `tuser` (
  `ID` varchar(36) NOT NULL,
  `CHEATEDATETIME` date DEFAULT NULL,
  `MODIFYDATETIME` date DEFAULT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `PWD` varchar(50) DEFAULT NULL,
  `CREATE_TIME` date DEFAULT NULL,
  `UPDATE_TIME` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tuser` */

insert  into `tuser`(`ID`,`CHEATEDATETIME`,`MODIFYDATETIME`,`NAME`,`PWD`,`CREATE_TIME`,`UPDATE_TIME`) values ('0','2015-08-11','2015-08-11','awei','awie','2015-08-11','2015-08-11'),('1','2015-08-11','2015-08-11','awei_awei','awei_awei','2015-08-11','2015-08-11');

/*Table structure for table `tuser_trole` */

DROP TABLE IF EXISTS `tuser_trole`;

CREATE TABLE `tuser_trole` (
  `ID` varchar(36) NOT NULL,
  `ROLE_ID` varchar(36) DEFAULT NULL,
  `USER_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `TUSER_TROLE_TROLE` (`ROLE_ID`),
  KEY `TUSER_TROLE_TUSER` (`USER_ID`),
  CONSTRAINT `TUSER_TROLE_TROLE` FOREIGN KEY (`ROLE_ID`) REFERENCES `trole` (`ID`),
  CONSTRAINT `TUSER_TROLE_TUSER` FOREIGN KEY (`USER_ID`) REFERENCES `tuser` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tuser_trole` */

insert  into `tuser_trole`(`ID`,`ROLE_ID`,`USER_ID`) values ('0','0','0'),('1','1','0');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
