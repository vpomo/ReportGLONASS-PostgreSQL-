/*
Navicat PGSQL Data Transfer

Source Server         : ReportGLONASS
Source Server Version : 90404
Source Host           : localhost:5432
Source Database       : reportglonass
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90404
File Encoding         : 65001

Date: 2015-09-08 08:41:12
*/


-- ----------------------------
-- Table structure for log_users
-- ----------------------------
DROP TABLE IF EXISTS "public"."log_users";
CREATE TABLE "public"."log_users" (
"user_login" varchar(10) COLLATE "default" NOT NULL,
"date_login" timestamp(6),
"action_log" varchar(50) COLLATE "default",
"id_log_user" int4 DEFAULT nextval('log_users_id_log_user_seq'::regclass) NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of log_users
-- ----------------------------
INSERT INTO "public"."log_users" VALUES ('sobes', '2015-09-08 09:27:00.273', 'Создан черновик', '3');
INSERT INTO "public"."log_users" VALUES ('sobes', '2015-09-08 09:27:10.31', 'Создан отчет', '4');
INSERT INTO "public"."log_users" VALUES ('sobes', '2015-09-08 09:27:37.681', 'Создан отчет', '5');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Foreign Key structure for table "public"."log_users"
-- ----------------------------
ALTER TABLE "public"."log_users" ADD FOREIGN KEY ("user_login") REFERENCES "public"."users" ("login") ON DELETE CASCADE ON UPDATE CASCADE;
