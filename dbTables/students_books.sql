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
-- Table structure for table `students_books`
--

CREATE TABLE `students_books` (
  `enrollment_no` bigint(20) NOT NULL,
  `book_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students_books`
--

INSERT INTO `students_books` (`enrollment_no`, `book_id`) VALUES
(170220107010, 1),
(170220107010, 2),
(170220107010, 3),
(170220107010, 4),
(170220107010, 5),
(170220107010, 7),
(170220107011, 1),
(170220107011, 3),
(170220107023, 4),
(170220107023, 6),
(170220107035, 1),
(170220107035, 2),
(170220107035, 3),
(170220107035, 4),
(170220107035, 5),
(170220107035, 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students_books`
--
ALTER TABLE `students_books`
  ADD PRIMARY KEY (`enrollment_no`,`book_id`),
  ADD KEY `FKrf5vhfun305tgs5wrkqg5o7g4` (`book_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `students_books`
--
ALTER TABLE `students_books`
  ADD CONSTRAINT `FK8hwcy4dkuarhutt48pji34mf6` FOREIGN KEY (`enrollment_no`) REFERENCES `students_info` (`enrollment_no`),
  ADD CONSTRAINT `FKrf5vhfun305tgs5wrkqg5o7g4` FOREIGN KEY (`book_id`) REFERENCES `books_info` (`book_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
