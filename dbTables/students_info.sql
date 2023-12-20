-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 20, 2023 at 05:32 PM
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
-- Table structure for table `students_info`
--

CREATE TABLE `students_info` (
  `enrollment_no` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `birth_date` datetime DEFAULT NULL,
  `parent_number` varchar(255) DEFAULT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `vehicle_id` bigint(20) DEFAULT NULL,
  `marks` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students_info`
--

INSERT INTO `students_info` (`enrollment_no`, `address`, `birth_date`, `parent_number`, `student_name`, `vehicle_id`, `marks`, `url`) VALUES
(170220107010, 'Kheda', '0000-00-00 00:00:00', '8737845453', 'Ravi', 4, NULL, NULL),
(170220107011, 'Bhuj', '0000-00-00 00:00:00', '8737875433', 'Yash', 3, NULL, NULL),
(170220107023, 'Bhuj', '0000-00-00 00:00:00', '8737875433', 'Devanshi', 2, NULL, NULL),
(170220107035, 'Patan', '0000-00-00 00:00:00', '7016273584', 'Vishal', 1, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students_info`
--
ALTER TABLE `students_info`
  ADD PRIMARY KEY (`enrollment_no`),
  ADD KEY `FKyytn117qsdamre8qh578ppah` (`vehicle_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `students_info`
--
ALTER TABLE `students_info`
  ADD CONSTRAINT `FKyytn117qsdamre8qh578ppah` FOREIGN KEY (`vehicle_id`) REFERENCES `vehicles_info` (`vehicle_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
