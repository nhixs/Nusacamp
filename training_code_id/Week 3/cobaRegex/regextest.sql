-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 24, 2020 at 03:27 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `regextest`
--

-- --------------------------------------------------------

--
-- Table structure for table `nwstudent`
--

CREATE TABLE IF NOT EXISTS `nwstudent` (
  `Student_ID` int(8) DEFAULT NULL,
  `emailStudent` varchar(35) NOT NULL,
  `Name` varchar(11) DEFAULT NULL,
  `F_Name` varchar(10) DEFAULT NULL,
  `Course` varchar(6) DEFAULT NULL,
  `Branch` varchar(7) DEFAULT NULL,
  `Year` tinyint(4) DEFAULT NULL,
  `Semester` tinyint(4) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `nwstudent`
--

INSERT INTO `nwstudent` (`Student_ID`, `emailStudent`, `Name`, `F_Name`, `Course`, `Branch`, `Year`, `Semester`) VALUES
(58, '', 'Wiki', 'Permana', 'PHD', 'Physics', 2, 4),
(58, '', 'Wiki', 'Permana', 'PHD', 'Physics', 2, 4),
(32767, 'hariyanto.oabagus@gmail.com', 'Bagus', 'Hariyanto', 'PHD', 'Com', 2, 4),
(32767, 'IndahLestari@gmail.com', 'Indah', 'Lestari', 'PHD', 'Law', 4, 8),
(12164651, 'LiaArniati@gmail.com', 'Lia', 'Arniati', 'PHD', 'Com', 4, 8),
(12164652, 'Yuliana@gmail.com', 'Yuli', 'Ana', 'PHD', 'Com', 4, 8);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
