-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 20, 2023 at 05:33 PM
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
-- Table structure for table `vehicles_info`
--

CREATE TABLE `vehicles_info` (
  `vehicle_id` bigint(20) NOT NULL,
  `number_plate` varchar(255) DEFAULT NULL,
  `vehicle_company` varchar(255) DEFAULT NULL,
  `vehicle_name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicles_info`
--

INSERT INTO `vehicles_info` (`vehicle_id`, `number_plate`, `vehicle_company`, `vehicle_name`, `url`) VALUES
(1, 'GJ5488', 'Honda', 'Activa', NULL),
(2, 'GJ6488', 'Honda', 'Activa', NULL),
(3, 'GJ3212', 'Hero', 'Mastro', NULL),
(4, 'GJ3612', 'Hero', 'Mastro', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `vehicles_info`
--
ALTER TABLE `vehicles_info`
  ADD PRIMARY KEY (`vehicle_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
