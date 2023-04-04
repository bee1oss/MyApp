-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2023 at 11:35 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_info`
--

-- --------------------------------------------------------

--
-- Table structure for table `student_basic_info`
--

CREATE TABLE `student_basic_info` (
  `id` int(11) NOT NULL,
  `name` varchar(75) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `surname` varchar(75) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_basic_info`
--

INSERT INTO `student_basic_info` (`id`, `name`, `surname`, `email`, `create_time`) VALUES
(1, 'Chupa', 'Kabra', 'chupa@gmail.com', '2023-04-04'),
(2, 'Chrupa', 'Kraba', 'cherapa@gmail.com', '2023-04-04'),
(3, 'sadad', 'asdad', 'Kabra', '2023-04-05'),
(4, 'sadad', 'asdad', 'Kabra', '2023-04-05'),
(5, 'sadad', 'asdad', 'Kabra', '2023-04-05'),
(6, 'sadad', 'asdad', 'Kabra', '2023-04-05'),
(7, 'Students@2dfdc6a1', 'dialog0', 'Kraba', '2023-04-05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student_basic_info`
--
ALTER TABLE `student_basic_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student_basic_info`
--
ALTER TABLE `student_basic_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
