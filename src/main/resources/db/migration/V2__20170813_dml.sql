-- ----------------------------
-- Records of time_slot
-- ----------------------------
INSERT INTO `time_slot` VALUES ('1', '00:00:00', '00:00:00');
INSERT INTO `time_slot` VALUES ('2', '11:00:00', '11:30:00');
INSERT INTO `time_slot` VALUES ('3', '11:30:00', '11:45:00');
INSERT INTO `time_slot` VALUES ('4', '11:45:00', '12:00:00');
INSERT INTO `time_slot` VALUES ('5', '12:00:00', '12:30:00');
INSERT INTO `time_slot` VALUES ('6', '12:30:00', '13:00:00');
INSERT INTO `time_slot` VALUES ('7', '16:30:00', '17:00:00');
INSERT INTO `time_slot` VALUES ('8', '17:00:00', '18:00:00');
INSERT INTO `time_slot` VALUES ('9', '18:00:00', '19:00:00');
-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('1', '热菜', '1');
INSERT INTO `type` VALUES ('2', '冷菜', '1');
INSERT INTO `type` VALUES ('3', '套餐', '1');
INSERT INTO `type` VALUES ('4', '酒水', '1');
INSERT INTO `type` VALUES ('5', '主食', '1');
-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '10152510261', '123456', '1', 'yrj', '叶润杰', '17701689978', '2015-01-01', '计算机科学与软件工程', '华东师范大学', '0', '0');

INSERT INTO `company_info` VALUES ('1', '河西食堂', 'hexishitang', '12345', '2017-05-01 21:57:26', '2017-06-18 21:57:46');

INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('1', '1');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('2', '1');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('3', '1');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('4', '2');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('5', '2');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('6', '2');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('7', '2');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('8', '5');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('9', '3');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('10', '3');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('11', '4');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('12', '4');
INSERT INTO `quickcanteen`.`dishes_type` (`dishes_id`, `type_id`) VALUES ('13', '3');

