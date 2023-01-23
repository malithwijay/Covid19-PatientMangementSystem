-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 29, 2022 at 06:40 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_covidpatient`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_patient`
--

DROP TABLE IF EXISTS `tb_patient`;
CREATE TABLE IF NOT EXISTS `tb_patient` (
  `NIC` varchar(12) NOT NULL,
  `Name` text NOT NULL,
  `AdmittedDate` date NOT NULL,
  `QuarantinePeriod` int(2) NOT NULL,
  `DischargeDate` date NOT NULL,
  PRIMARY KEY (`NIC`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_patient`
--

INSERT INTO `tb_patient` (`NIC`, `Name`, `AdmittedDate`, `QuarantinePeriod`, `DischargeDate`) VALUES
('200003201860', 'Q', '2022-05-01', 75, '2022-07-15'),
('200003201814', 'A', '2022-05-29', 100, '2022-09-06'),
('200003201815', 'B', '2022-05-29', 41, '2022-07-09'),
('200003201816', 'C', '2022-05-29', 50, '2022-07-18'),
('200003201817', 'D', '2022-05-29', 10, '2022-06-08'),
('200003201818', 'E', '2022-05-29', 20, '2022-06-18'),
('200003201819', 'F', '2022-05-29', 2, '2022-05-31'),
('200003201820', 'G', '2022-05-29', 12, '2022-06-10'),
('200003201821', 'H', '2022-05-29', 1, '2022-05-30'),
('200003201822', 'I', '2022-05-29', 5, '2022-06-03');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
