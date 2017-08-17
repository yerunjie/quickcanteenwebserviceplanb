-- ----------------------------
-- Table structure for collect_dishes
-- ----------------------------
DROP TABLE IF EXISTS `collect_dishes`;
CREATE TABLE `collect_dishes` (
  `dishes_id` int(11) NOT NULL,
  `collector_id` int(11) NOT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`dishes_id`,`collector_id`),
  KEY `collector_id` (`collector_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for comment_company
-- ----------------------------
DROP TABLE IF EXISTS `comment_company`;
CREATE TABLE `comment_company` (
  `company_id` int(255) NOT NULL,
  `comment_id` int(11) NOT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`company_id`,`comment_id`),
  KEY `comment_company_ibfk_2` (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for comment_dishes
-- ----------------------------
DROP TABLE IF EXISTS `comment_dishes`;
CREATE TABLE `comment_dishes` (
  `dishes_id` int(11) NOT NULL,
  `comment_id` int(11) NOT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`dishes_id`,`comment_id`),
  KEY `comment_dishes_ibfk_1` (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for company_info
-- ----------------------------
DROP TABLE IF EXISTS `company_info`;
CREATE TABLE `company_info` (
  `company_id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(20) NOT NULL,
  `account_number` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `start_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `end_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for company_time_slot
-- ----------------------------
DROP TABLE IF EXISTS `company_time_slot`;
CREATE TABLE `company_time_slot` (
  `company_id` int(11) NOT NULL,
  `time_slot_id` int(11) NOT NULL,
  `people_number` int(11) NOT NULL,
  `max_people_number` int(11) NOT NULL,
  `busy_state` int(11) NOT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`company_id`,`time_slot_id`),
  KEY `timeslot_id` (`time_slot_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dishes
-- ----------------------------
DROP TABLE IF EXISTS `dishes`;
CREATE TABLE `dishes` (
  `dishes_id` int(11) NOT NULL,
  `company_id` int(11) NOT NULL,
  `price` double NOT NULL,
  `diagrammatic_sketch_address` varchar(100) DEFAULT '',
  `dishes_name` varchar(100) DEFAULT '',
  `dishes_introduce` text,
  `praise_num` int(11) DEFAULT 0,
  `comment_num` int(11) DEFAULT 0,
  `collect_num` int(11) DEFAULT 0,
  `publish_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `rating` double DEFAULT 0,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`dishes_id`),
  KEY `company_id` (`company_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dishes_type
-- ----------------------------
DROP TABLE IF EXISTS `dishes_type`;
CREATE TABLE `dishes_type` (
  `dishes_id` int(11) NOT NULL,
  `type_id` int(11) NOT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`dishes_id`,`type_id`),
  KEY `type_id` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orders_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `company_id` int(11) NOT NULL,
  `orders_state` int(11) NOT NULL,
  `publish_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `complete_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `total_price` double NOT NULL,
  `timeslot_id` int(11) DEFAULT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`orders_id`),
  KEY `company_id` (`company_id`),
  KEY `user_id` (`user_id`),
  KEY `timeslot_id` (`timeslot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for orders_dishes
-- ----------------------------
DROP TABLE IF EXISTS `orders_dishes`;
CREATE TABLE `orders_dishes` (
  `orders_id` int(11) NOT NULL,
  `dishes_id` int(11) NOT NULL,
  `count` int(11) NOT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`orders_id`,`dishes_id`),
  KEY `dishes_id` (`dishes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for praise_dishes
-- ----------------------------
DROP TABLE IF EXISTS `praise_dishes`;
CREATE TABLE `praise_dishes` (
  `praise_from_user_id` int(11) NOT NULL DEFAULT '0',
  `praise_dishes_id` int(11) NOT NULL DEFAULT '0',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`praise_from_user_id`,`praise_dishes_id`),
  KEY `praise_dishes_id` (`praise_dishes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for time_slot
-- ----------------------------
DROP TABLE IF EXISTS `time_slot`;
CREATE TABLE `time_slot` (
  `time_slot_id` int(11) NOT NULL AUTO_INCREMENT,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`time_slot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(20) NOT NULL,
  `company_id` int(11) NOT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`type_id`),
  KEY `company_id` (`company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_comment
-- ----------------------------
DROP TABLE IF EXISTS `user_comment`;
CREATE TABLE `user_comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `commenter_id` int(11) NOT NULL,
  `comment_content` text,
  `rating` double DEFAULT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`comment_id`),
  KEY `commenter_id` (`commenter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `account_number` varchar(30) NOT NULL,
  `user_password` varchar(40) NOT NULL,
  `head_portrait` varchar(1000) DEFAULT '',
  `nick_name` varchar(100) DEFAULT '',
  `real_name` varchar(30) DEFAULT '',
  `telephone` varchar(20) DEFAULT '',
  `entrance_year` date DEFAULT NULL,
  `college_name` varchar(100) DEFAULT '',
  `university_name` varchar(30) DEFAULT '',
  `is_admin` int(11) DEFAULT 0,
  `points` int(11) DEFAULT 0,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;