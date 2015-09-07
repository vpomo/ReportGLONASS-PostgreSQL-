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

Date: 2015-09-08 08:41:34
*/


-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS "public"."users";
CREATE TABLE "public"."users" (
"login" varchar(10) COLLATE "default" NOT NULL,
"password" varchar(20) COLLATE "default" NOT NULL,
"name_user" varchar(60) COLLATE "default" NOT NULL,
"date_last_report" timestamp(6),
"group_user" text COLLATE "default" NOT NULL,
"enabled" bool DEFAULT true NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO "public"."users" VALUES ('adminTest', 'testpass', 'namesTestUser', '2015-09-03 10:38:02.188', 'admin', 'f');
INSERT INTO "public"."users" VALUES ('blag', '1', 'г. Благовещенск', '2015-09-08 09:25:58.731', 'iogv', 't');
INSERT INTO "public"."users" VALUES ('sobes', '1', 'Мин соцзащиты', '2015-09-03 00:00:00', 'iogv', 't');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Indexes structure for table users
-- ----------------------------
CREATE UNIQUE INDEX "login" ON "public"."users" USING btree (login);

-- ----------------------------
-- Primary Key structure for table users
-- ----------------------------
ALTER TABLE "public"."users" ADD PRIMARY KEY ("login");
