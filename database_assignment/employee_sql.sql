SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `assignment` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `assignment` ;

-- -----------------------------------------------------
-- Table `assignment`.`employee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `assignment`.`employee` ;

CREATE TABLE IF NOT EXISTS `assignment`.`employee` (
  `employee_id` INT NOT NULL,
  `first_name` VARCHAR(50) NULL,
  `last_name` VARCHAR(50) NULL,
  `job_id` VARCHAR(50) NULL,
  `hire_date` DATE NULL,
  `salary` INT NULL,
  `manager_id` INT NULL,
  `commission_percent` INT NULL,
  `department_id` VARCHAR(10) NULL,
  PRIMARY KEY (`employee_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `assignment`.`tbldate`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `assignment`.`tbldate` ;

CREATE TABLE IF NOT EXISTS `assignment`.`tbldate` (
  `tbldate_id` INT NOT NULL,
  `month` VARCHAR(20) NULL,
  `year` INT NULL,
  PRIMARY KEY (`tbldate_id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
