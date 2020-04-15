-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2020 at 02:01 PM
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`idAdmin`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
`id` int(6) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Edition` varchar(255) DEFAULT NULL,
  `Publisher` varchar(255) DEFAULT NULL,
  `Price` float DEFAULT NULL,
  `Pages` varchar(255) DEFAULT NULL,
  `Bookshelf` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=230 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`id`, `Name`, `Edition`, `Publisher`, `Price`, `Pages`, `Bookshelf`) VALUES
(227, 'Star of You', '1', 'Shan A Fitria', 86000, '150', 'Novel'),
(229, 'Hak Angket Kawal Demokrasi', 'Soft Cover', 'MERDEKA BOOK', 50000, '200', 'Ilmu Sosial ');

-- --------------------------------------------------------

--
-- Table structure for table `issuebook`
--

CREATE TABLE IF NOT EXISTS `issuebook` (
  `Book_ID` smallint(6) DEFAULT NULL,
  `Name` varchar(21) DEFAULT NULL,
  `Edition` tinyint(4) DEFAULT NULL,
  `Publisher` varchar(35) DEFAULT NULL,
  `Price` int(20) DEFAULT NULL,
  `Pages` smallint(6) DEFAULT NULL,
  `Student_ID` smallint(6) DEFAULT NULL,
  `SName` varchar(11) DEFAULT NULL,
  `Email` varchar(35) DEFAULT NULL,
  `Course` varchar(6) DEFAULT NULL,
  `Branch` varchar(10) DEFAULT NULL,
  `Year` tinyint(4) DEFAULT NULL,
  `Semester` tinyint(4) DEFAULT NULL,
  `Date_Of_Issue` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issuebook`
--

INSERT INTO `issuebook` (`Book_ID`, `Name`, `Edition`, `Publisher`, `Price`, `Pages`, `Student_ID`, `SName`, `Email`, `Course`, `Branch`, `Year`, `Semester`, `Date_Of_Issue`) VALUES
(227, 'Star of You', 1, 'Shan A Fitria', 85000, 150, 686, 'Souvik', 'B.Modak', 'B.Tech', 'CSE', 2, 3, '2020-03-02');

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
('admin', 'admin', 'admin', 'admin', 'What is your Mother Tongue?', 'admin'),
('Mentari Rama', 'mentarirama', 'skuy', 'skuy', 'What is your NickName?', 'mamen'),
('Sholihin', 'sholihin123', 'lihin123', 'lihin123', 'What is your NickName?', 'lihin lah');

-- --------------------------------------------------------

--
-- Table structure for table `newbookshelf`
--

CREATE TABLE IF NOT EXISTS `newbookshelf` (
  `BookShelf_ID` int(11) NOT NULL,
  `Name` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `newbookshelf`
--

INSERT INTO `newbookshelf` (`BookShelf_ID`, `Name`) VALUES
(351, 'Math'),
(807, 'Science'),
(26, 'Art'),
(99, 'Novel');

-- --------------------------------------------------------

--
-- Table structure for table `nwstudent`
--

CREATE TABLE IF NOT EXISTS `nwstudent` (
`id` int(6) NOT NULL,
  `name` varchar(40) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `course` varchar(6) DEFAULT NULL
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `nwstudent`
--

INSERT INTO `nwstudent` (`id`, `name`, `email`, `course`) VALUES
(2, 'Indah Lestari', 'ss.taeng@gmail.com', 'FHUI'),
(3, 'Bagus Hariyanto', 'hariyanto.aobagus@gmail.com', 'FTBSI');

-- --------------------------------------------------------

--
-- Table structure for table `returnbook`
--

CREATE TABLE IF NOT EXISTS `returnbook` (
  `ID` int(50) NOT NULL,
  `Student_ID` smallint(6) DEFAULT NULL,
  `Name` varchar(7) DEFAULT NULL,
  `Email` varchar(9) DEFAULT NULL,
  `Course` varchar(4) DEFAULT NULL,
  `Branch` varchar(10) DEFAULT NULL,
  `Year` tinyint(4) DEFAULT NULL,
  `Semester` tinyint(4) DEFAULT NULL,
  `Book_ID` smallint(6) DEFAULT NULL,
  `BName` varchar(20) DEFAULT NULL,
  `Edition` tinyint(4) DEFAULT NULL,
  `Publisher` varchar(20) DEFAULT NULL,
  `Price` smallint(6) DEFAULT NULL,
  `Pages` smallint(6) DEFAULT NULL,
  `IssueDate` varchar(12) DEFAULT NULL,
  `ReturnDate` varchar(12) DEFAULT NULL,
  `Charge` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `skripsi`
--

CREATE TABLE IF NOT EXISTS `skripsi` (
  `idSkripsi` int(8) NOT NULL,
  `SkripsiTittle` varchar(35) NOT NULL,
  `SkripsiMajor` varchar(20) NOT NULL,
  `ContributorName` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `skripsi`
--

INSERT INTO `skripsi` (`idSkripsi`, `SkripsiTittle`, `SkripsiMajor`, `ContributorName`) VALUES
(32020201, 'Membangun jaringan PC clonning', 'Teknik Informatika', 'Silvia Gita'),
(32020202, 'Merancang Sistem Gateway Radio', 'Teknik Informatika', 'Haryanto'),
(32020203, 'Aplikasi Logika Matematika Jaringan', 'Pendidikan Matematik', 'Ardi Setiawan'),
(32020204, 'Perbandingan hasil Belajar Pankat ', 'Pendidikan Matematik', 'Aryadi'),
(32020205, 'Bagi Hasil Bank Syariah', 'Ekonomi', 'Syamsul Farid'),
(32020206, 'Faktor Pembelian di CoffeShop', 'Ekonomi', 'Chandra Maulana'),
(32020207, 'Sistem Radar Pasif', 'Teknik Informatika', 'Nada Ayu');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
 ADD PRIMARY KEY (`username`) USING BTREE;

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`idAdmin`) USING BTREE;

--
-- Indexes for table `book`
--
ALTER TABLE `book`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `nwstudent`
--
ALTER TABLE `nwstudent`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `skripsi`
--
ALTER TABLE `skripsi`
 ADD PRIMARY KEY (`idSkripsi`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
MODIFY `id` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=230;
--
-- AUTO_INCREMENT for table `nwstudent`
--
ALTER TABLE `nwstudent`
MODIFY `id` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
