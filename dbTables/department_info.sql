-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 20, 2023 at 05:34 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schoolinfo`
--

-- --------------------------------------------------------

--
-- Table structure for table `department_info`
--

CREATE TABLE `department_info` (
  `class_id` int(11) NOT NULL,
  `class_name` varchar(255) DEFAULT NULL,
  `class_teacher` varchar(255) DEFAULT NULL,
  `number_of_students` varchar(255) DEFAULT NULL,
  `cp_fk` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department_info`
--

INSERT INTO `department_info` (`class_id`, `class_name`, `class_teacher`, `number_of_students`, `cp_fk`) VALUES
(1, 'class 6a', 'Nareshbhai', '30', 170220107011),
(3, 'class 11', 'Mahesh Bhai', '11', 170220107023);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department_info`
--
ALTER TABLE `department_info`
  ADD PRIMARY KEY (`class_id`),
  ADD KEY `FKx6sgjj54yafnlqn3nc6qf3e9` (`cp_fk`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `department_info`
--
ALTER TABLE `department_info`
  ADD CONSTRAINT `FKx6sgjj54yafnlqn3nc6qf3e9` FOREIGN KEY (`cp_fk`) REFERENCES `students_info` (`enrollment_no`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
