-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2020 at 05:16 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `name` varchar(30) NOT NULL,
  `username` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL,
  `securityQuestion` varchar(50) NOT NULL,
  `Answer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`name`, `username`, `password`, `securityQuestion`, `Answer`) VALUES
('Bagus Hariyanto', 'kagemaru', 'bagus246', 'siapa hayo ?', 'hayo');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `idAdmin` int(8) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`idAdmin`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `issuebook`
--

CREATE TABLE IF NOT EXISTS `issuebook` (
  `Book_ID` smallint(6) DEFAULT NULL,
  `Name` varchar(21) DEFAULT NULL,
  `Edition` tinyint(4) DEFAULT NULL,
  `Publisher` varchar(12) DEFAULT NULL,
  `Price` smallint(6) DEFAULT NULL,
  `Pages` smallint(6) DEFAULT NULL,
  `Student_ID` smallint(6) DEFAULT NULL,
  `SName` varchar(11) DEFAULT NULL,
  `Father` varchar(10) DEFAULT NULL,
  `Course` varchar(6) DEFAULT NULL,
  `Branch` varchar(5) DEFAULT NULL,
  `Year` tinyint(4) DEFAULT NULL,
  `Semester` tinyint(4) DEFAULT NULL,
  `Date_Of_Issue` varchar(8) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `issuebook`
--

INSERT INTO `issuebook` (`Book_ID`, `Name`, `Edition`, `Publisher`, `Price`, `Pages`, `Student_ID`, `SName`, `Father`, `Course`, `Branch`, `Year`, `Semester`, `Date_Of_Issue`) VALUES
(141, 'Java', 1, 'Oracle Ltd', 999, 1299, 79, 'Pritam', 'P.Pattadar', 'B.Tech', 'Civil', 2, 3, '09/09/16'),
(280, 'OOPs', 5, 'Pranab', 896, 1233, 192, 'Satyajit', 'D.Sharma', 'B.SC', 'Math', 2, 3, '09/09/16'),
(795, 'Data Structure With C', 7, 'Manish Goyal', 899, 598, 919, 'Avijit Mota', 'Pata Nai', 'B.Tech', 'ECE', 2, 3, '10/09/16'),
(284, 'Mathematics 3', 3, 'Goyal Ltd', 499, 868, 665, 'Ram', 'S.Mahato', 'B.Tech', 'CSE', 2, 3, '10/09/16');

-- --------------------------------------------------------

--
-- Table structure for table `newacc`
--

CREATE TABLE IF NOT EXISTS `newacc` (
  `Name` varchar(25) DEFAULT NULL,
  `Username` varchar(25) DEFAULT NULL,
  `Password` varchar(25) DEFAULT NULL,
  `CPassword` varchar(25) DEFAULT NULL,
  `SecurityQ` varchar(35) DEFAULT NULL,
  `Answer` varchar(35) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `newacc`
--

INSERT INTO `newacc` (`Name`, `Username`, `Password`, `CPassword`, `SecurityQ`, `Answer`) VALUES
('Arunabh', 'arun', '12346', '12346', 'What is your Mother Tongue?', 'Hindi'),
('Ram', 'ramji', '12345', '12345', 'What is your Mother Tongue?', 'Hindi'),
('lihin', 'lihin', '12345', '123456', 'What is your NickName?', 'lihin'),
('bambang', 'bambang', '12345678', '12345678', 'What is your Mother Tongue?', 'lah mak gua lah'),
('aku', 'acucamu', 'acucamu', 'acucamu', 'What is your Mother Tongue?', 'makacu'),
('asd', 'asda', 'asda', 'asda', 'What is your Mother Tongue?', 'asda'),
('admin', 'admin', 'admin', 'admin', 'What is your Mother Tongue?', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `newbook`
--

CREATE TABLE IF NOT EXISTS `newbook` (
  `Book_ID` smallint(6) DEFAULT NULL,
  `Name` varchar(21) DEFAULT NULL,
  `Edition` tinyint(4) DEFAULT NULL,
  `Publisher` varchar(13) DEFAULT NULL,
  `Price` smallint(6) DEFAULT NULL,
  `Pages` smallint(6) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `newbook`
--

INSERT INTO `newbook` (`Book_ID`, `Name`, `Edition`, `Publisher`, `Price`, `Pages`) VALUES
(141, 'Java', 1, 'Oracle Ltd', 999, 1299),
(280, 'OOPs', 5, 'Pranab', 896, 1233),
(284, 'Mathematics 3', 3, 'Goyal Ltd', 499, 868),
(386, 'Discrete Mathematics', 5, 'Arnab Rash', 965, 1988),
(537, 'Digital Electronics', 2, 'Prabjat ', 788, 2122),
(745, 'OS', 2, 'Windows', 1299, 1988),
(785, 'CBNST', 3, 'Laxmi Pvt Ltd', 299, 568),
(795, 'Data Structure With C', 7, 'Manish Goyal', 899, 598),
(805, 'HTML', 3, 'W3', 958, 1322);

-- --------------------------------------------------------

--
-- Table structure for table `nwstudent`
--

CREATE TABLE IF NOT EXISTS `nwstudent` (
  `Student_ID` smallint(6) DEFAULT NULL,
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

INSERT INTO `nwstudent` (`Student_ID`, `Name`, `F_Name`, `Course`, `Branch`, `Year`, `Semester`) VALUES
(79, 'Pritam', 'P.Pattadar', 'B.Tech', 'Civil', 2, 3),
(192, 'Satyajit', 'D.Sharma', 'B.SC', 'Math', 2, 3),
(211, 'Hrishik', 'B.Debnath', 'B.SC', 'Physics', 2, 3),
(446, 'Kaustav', 'K.Das', 'B.Tech', 'CSE', 2, 3),
(654, 'Abhijit', 'A.Das', 'B.Tech', 'CSE', 1, 1),
(665, 'Ram', 'S.Mahato', 'B.Tech', 'CSE', 2, 3),
(686, 'Souvik', 'B.Modak', 'B.Tech', 'CSE', 2, 3),
(771, 'Anuj', 'A.K.Ray', 'B.Tech', 'CSE', 2, 3),
(919, 'Avijit Mota', 'Pata Nai', 'B.Tech', 'ECE', 2, 3);

-- --------------------------------------------------------

--
-- Table structure for table `returnbook`
--

CREATE TABLE IF NOT EXISTS `returnbook` (
  `Student_ID` smallint(6) DEFAULT NULL,
  `Name` varchar(7) DEFAULT NULL,
  `FName` varchar(9) DEFAULT NULL,
  `Course` varchar(4) DEFAULT NULL,
  `Branch` varchar(7) DEFAULT NULL,
  `Year` tinyint(4) DEFAULT NULL,
  `Semester` tinyint(4) DEFAULT NULL,
  `Book_ID` smallint(6) DEFAULT NULL,
  `BName` varchar(2) DEFAULT NULL,
  `Edition` tinyint(4) DEFAULT NULL,
  `Publisher` varchar(7) DEFAULT NULL,
  `Price` smallint(6) DEFAULT NULL,
  `Pages` smallint(6) DEFAULT NULL,
  `IssueDate` varchar(8) DEFAULT NULL,
  `ReturnDate` varchar(12) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `returnbook`
--

INSERT INTO `returnbook` (`Student_ID`, `Name`, `FName`, `Course`, `Branch`, `Year`, `Semester`, `Book_ID`, `BName`, `Edition`, `Publisher`, `Price`, `Pages`, `IssueDate`, `ReturnDate`) VALUES
(211, 'Hrishik', 'B.Debnath', 'B.SC', 'Physics', 2, 3, 745, 'OS', 2, 'Windows', 1299, 1988, '10/09/16', 'Sep 10, 2016');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
 ADD PRIMARY KEY (`username`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`idAdmin`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
