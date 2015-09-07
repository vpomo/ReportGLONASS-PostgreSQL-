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

Date: 2015-09-08 08:41:24
*/


-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS "public"."report";
CREATE TABLE "public"."report" (
"date_report" timestamp(6),
"catm1stateall" int4 DEFAULT 0,
"catm1municall" int4 DEFAULT 0,
"catm1commercall" int4 DEFAULT 0,
"catm1itogall" int4 DEFAULT 0,
"catm2m3stateall" int4 DEFAULT 0,
"catm2m3municall" int4 DEFAULT 0,
"catm2m3commercall" int4 DEFAULT 0,
"catm2m3itogall" int4 DEFAULT 0,
"catlargestateall" int4 DEFAULT 0,
"catlargemunicall" int4 DEFAULT 0,
"catlargecommercall" int4 DEFAULT 0,
"catlargeitogall" int4 DEFAULT 0,
"catdangerstateall" int4 DEFAULT 0,
"catdangermunicall" int4 DEFAULT 0,
"catdangeritogall" int4 DEFAULT 0,
"catschoolstateall" int4 DEFAULT 0,
"catschoolmunicall" int4 DEFAULT 0,
"catschoolcommercall" int4 DEFAULT 0,
"catschoolitogall" int4 DEFAULT 0,
"catgkhstateall" int4 DEFAULT 0,
"catgkhmunicall" int4 DEFAULT 0,
"catgkhcommercall" int4 DEFAULT 0,
"catgkhitogall" int4 DEFAULT 0,
"catdepartstateall" int4 DEFAULT 0,
"catdepartmunicall" int4 DEFAULT 0,
"catdepartcommercall" int4 DEFAULT 0,
"catdepartitogall" int4 DEFAULT 0,
"catm1stateequip" int4 DEFAULT 0,
"catm1municequip" int4 DEFAULT 0,
"catm1commercequip" int4 DEFAULT 0,
"catm1itogequip" int4 DEFAULT 0,
"catm2m3stateequip" int4 DEFAULT 0,
"catm2m3municequip" int4 DEFAULT 0,
"catm2m3commercequip" int4 DEFAULT 0,
"catm2m3itogequip" int4 DEFAULT 0,
"catlargestateequip" int4 DEFAULT 0,
"catlargemunicequip" int4 DEFAULT 0,
"catlargecommercequip" int4 DEFAULT 0,
"catlargeitogequip" int4 DEFAULT 0,
"catdangerstateequip" int4 DEFAULT 0,
"catdangermunicequip" int4 DEFAULT 0,
"catdangercommercequip" int4 DEFAULT 0,
"catdangeritogequip" int4 DEFAULT 0,
"catschoolstateequip" int4 DEFAULT 0,
"catschoolmunicequip" int4 DEFAULT 0,
"catschoolitogequip" int4 DEFAULT 0,
"catgkhstateequip" int4 DEFAULT 0,
"catgkhmunicequip" int4 DEFAULT 0,
"catgkhcommercequip" int4 DEFAULT 0,
"catgkhitogequip" int4 DEFAULT 0,
"catdepartstateequip" int4 DEFAULT 0,
"catdepartmunicequip" int4 DEFAULT 0,
"catdepartcommercequip" int4 DEFAULT 0,
"catdepartitogequip" int4 DEFAULT 0,
"catm1staternis" int4 DEFAULT 0,
"catm1municrnis" int4 DEFAULT 0,
"catm1commercrnis" int4 DEFAULT 0,
"catm1itogrnis" int4 DEFAULT 0,
"catm2m3staternis" int4 DEFAULT 0,
"catm2m3municrnis" int4 DEFAULT 0,
"catm2m3commercrnis" int4 DEFAULT 0,
"catm2m3itogrnis" int4 DEFAULT 0,
"catlargestaternis" int4 DEFAULT 0,
"catlargemunicrnis" int4 DEFAULT 0,
"catlargecommercrnis" int4 DEFAULT 0,
"catlargeitogrnis" int4 DEFAULT 0,
"catdangerstaternis" int4 DEFAULT 0,
"catdangermunicrnis" int4 DEFAULT 0,
"catdangercommercrnis" int4 DEFAULT 0,
"catdangeritogrnis" int4 DEFAULT 0,
"catschoolstaternis" int4 DEFAULT 0,
"catschoolmunicrnis" int4 DEFAULT 0,
"catschoolcommercrnis" int4 DEFAULT 0,
"catschoolitogrnis" int4 DEFAULT 0,
"catgkhstaternis" int4 DEFAULT 0,
"catgkhmunicrnis" int4 DEFAULT 0,
"catgkhcommercrnis" int4 DEFAULT 0,
"catgkhitogrnis" int4 DEFAULT 0,
"catdepartstaternis" int4 DEFAULT 0,
"catdepartmunicrnis" int4 DEFAULT 0,
"catdepartcommercrnis" int4 DEFAULT 0,
"catdepartitogrnis" int4 DEFAULT 0,
"catm1stateother" int4 DEFAULT 0,
"catm1municother" int4 DEFAULT 0,
"catm1commercother" int4 DEFAULT 0,
"catm1itogother" int4 DEFAULT 0,
"catm2m3stateother" int4 DEFAULT 0,
"catm2m3municother" int4 DEFAULT 0,
"catm2m3commercother" int4 DEFAULT 0,
"catm2m3itogother" int4 DEFAULT 0,
"catlargestateother" int4 DEFAULT 0,
"catlargemunicother" int4 DEFAULT 0,
"catlargecommercother" int4 DEFAULT 0,
"catlargeitogother" int4 DEFAULT 0,
"catdangerstateother" int4 DEFAULT 0,
"catdangermunicother" int4 DEFAULT 0,
"catdangercommercother" int4 DEFAULT 0,
"catdangeritogother" int4 DEFAULT 0,
"catschoolstateother" int4 DEFAULT 0,
"catschoolmunicother" int4 DEFAULT 0,
"catschoolcommercother" int4 DEFAULT 0,
"catschoolitogother" int4 DEFAULT 0,
"catgkhstateother" int4 DEFAULT 0,
"catgkhmunicother" int4 DEFAULT 0,
"catgkhcommercother" int8 DEFAULT 0,
"catgkhitogother" int4 DEFAULT 0,
"catdepartstateother" int4 DEFAULT 0,
"catdepartmunicother" int4 DEFAULT 0,
"catdepartcommercother" int4 DEFAULT 0,
"catdepartitogother" int4 DEFAULT 0,
"user_report" varchar(10) COLLATE "default" NOT NULL,
"catdangercommercall" int4 DEFAULT 0,
"id_report" int4 DEFAULT nextval('report_id_report_seq'::regclass) NOT NULL,
"catschoolcommercequip" int4 DEFAULT 0
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of report
-- ----------------------------
INSERT INTO "public"."report" VALUES ('2015-09-02 00:00:00', '1', '0', '0', '1', '2', '0', '0', '2', '3', '0', '0', '3', '4', '0', '4', '5', '0', '0', '5', '6', '0', '0', '6', '7', '0', '0', '7', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'sobes', '0', '22', '0');
INSERT INTO "public"."report" VALUES ('2015-09-03 00:00:00', '1', '0', '0', '1', '2', '0', '0', '2', '3', '0', '0', '3', '4', '0', '4', '5', '0', '0', '5', '6', '0', '0', '6', '7', '0', '0', '7', '1', '0', '0', '1', '2', '0', '0', '2', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'sobes', '0', '23', '0');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Foreign Key structure for table "public"."report"
-- ----------------------------
ALTER TABLE "public"."report" ADD FOREIGN KEY ("user_report") REFERENCES "public"."users" ("login") ON DELETE CASCADE ON UPDATE CASCADE;
