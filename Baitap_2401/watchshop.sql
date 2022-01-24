-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Generation Time: Jan 24, 2022 at 09:39 AM
-- Server version: 8.0.27
-- PHP Version: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `watchshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `brands`
--

CREATE TABLE `brands` (
  `id` varchar(5) NOT NULL,
  `brand_name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `brands`
--

INSERT INTO `brands` (`id`, `brand_name`) VALUES
('H8888', 'HUBLOT'),
('P9999', 'PATEK PHILIPPE'),
('R6789', 'ROLEX');

-- --------------------------------------------------------

--
-- Table structure for table `brands_watch`
--

CREATE TABLE `brands_watch` (
  `id_brands` varchar(5) NOT NULL,
  `id_watchs` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `brands_watch`
--

INSERT INTO `brands_watch` (`id_brands`, `id_watchs`) VALUES
('H8888', 'H2001'),
('H8888', 'H2002'),
('H8888', 'H2003'),
('H8888', 'H2004'),
('H8888', 'H2005'),
('P9999', 'P3001'),
('P9999', 'P3002'),
('P9999', 'P3003'),
('P9999', 'P3004'),
('P9999', 'P3005'),
('R6789', 'R1001'),
('R6789', 'R1002'),
('R6789', 'R1003'),
('R6789', 'R1004'),
('R6789', 'R1005');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(5) NOT NULL,
  `name` text NOT NULL,
  `birth` date NOT NULL,
  `email` text NOT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `address` text NOT NULL,
  `gender` enum('Male','Female') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `birth`, `email`, `mobile`, `address`, `gender`) VALUES
('user1', 'Thái', '1990-01-10', 'thai@gmail.com', '0987079947', 'số 55 Bà Triệu - Hoàn Kiếm - Hà Nội', 'Male'),
('user2', 'Trang', '1995-05-05', 'trang@gmail.com', '0389749299', 'số 255 Nguyễn Thái Học - Ba Đình - Hà Nội', 'Female'),
('user3', 'Dung', '1992-08-06', 'dung@gmail.com', '0983614442', 'số 300 Nguyễn Trãi - Thanh Xuân - Hà Nội', 'Female'),
('user4', 'Toàn', '1983-10-10', 'toan123@gmail.com', '0987298888', 'số 157 Láng Hạ - Đống Đa - Hà Nội', 'Male'),
('user5', 'Hoàng', '1985-07-30', 'hoang.nguyen@gmail.com', '0989996666', 'số 123 Xuân Thủy - Cầu Giấy - Hà Nội', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `delivery_ticket`
--

CREATE TABLE `delivery_ticket` (
  `id` varchar(5) NOT NULL,
  `id_shop_bill` varchar(5) NOT NULL,
  `id_shipper` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `discount`
--

CREATE TABLE `discount` (
  `id` int NOT NULL,
  `discount_rate` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `discount`
--

INSERT INTO `discount` (`id`, `discount_rate`) VALUES
(1, 0.1),
(2, 0.2),
(3, 0.3);

-- --------------------------------------------------------

--
-- Table structure for table `insert_ticket`
--

CREATE TABLE `insert_ticket` (
  `id` varchar(5) NOT NULL,
  `id_watchs` varchar(5) NOT NULL,
  `amount` int NOT NULL,
  `insert_date` date NOT NULL,
  `insert_time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `insert_ticket`
--

INSERT INTO `insert_ticket` (`id`, `id_watchs`, `amount`, `insert_date`, `insert_time`) VALUES
('IST01', 'H2001', 6, '2021-12-31', '10:00:00'),
('IST02', 'H2002', 9, '2021-12-31', '10:00:00'),
('IST03', 'H2003', 12, '2021-12-31', '10:00:00'),
('IST04', 'H2004', 7, '2021-12-31', '10:00:00'),
('IST05', 'H2005', 5, '2021-12-31', '10:00:00'),
('IST06', 'P3001', 3, '2022-01-03', '15:30:00'),
('IST07', 'P3002', 4, '2022-01-03', '15:30:00'),
('IST08', 'P3003', 2, '2022-01-03', '15:30:00'),
('IST09', 'P3004', 5, '2022-01-03', '15:30:00'),
('IST10', 'P3005', 5, '2022-01-03', '15:30:00'),
('IST11', 'R1001', 8, '2022-01-10', '13:21:00'),
('IST12', 'R1002', 7, '2022-01-10', '13:21:00'),
('IST13', 'R1003', 10, '2022-01-10', '13:21:00'),
('IST14', 'R1004', 10, '2022-01-10', '13:21:00'),
('IST15', 'R1005', 6, '2022-01-10', '13:21:00');

-- --------------------------------------------------------

--
-- Table structure for table `shipper`
--

CREATE TABLE `shipper` (
  `id` varchar(5) NOT NULL,
  `name` text NOT NULL,
  `email` text NOT NULL,
  `mobile` text NOT NULL,
  `address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `shipper`
--

INSERT INTO `shipper` (`id`, `name`, `email`, `mobile`, `address`) VALUES
('S1234', 'Trọng', 'trong333@gmail.com', '0345089439', 'Bắc Ninh'),
('S1357', 'Huy', 'huy.nguyen@gmail.com', '0377270380', 'Hà Nam'),
('S2468', 'Hiếu', 'hieu.hoang@gmail.com', '0382658879', 'Hà Nội'),
('S3233', 'Quân', 'quan.quan@gmail.com', '0352063989', 'Thái Nguyên'),
('S6789', 'Tùng', 'tung.vu@gmail.com', '0378984039', 'Hưng Yên');

-- --------------------------------------------------------

--
-- Table structure for table `ship_bill`
--

CREATE TABLE `ship_bill` (
  `id` varchar(5) NOT NULL,
  `id_customer` varchar(5) NOT NULL,
  `id_shop_bill` varchar(5) NOT NULL,
  `type_ship` enum('COD','PAID') DEFAULT NULL,
  `bill_money($)` bigint DEFAULT NULL,
  `date_ship` date NOT NULL,
  `id_shipper` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `ship_bill`
--

INSERT INTO `ship_bill` (`id`, `id_customer`, `id_shop_bill`, `type_ship`, `bill_money($)`, `date_ship`, `id_shipper`) VALUES
('SHI01', 'user1', 'SHO01', 'PAID', 0, '2022-01-22', 'S1357'),
('SHI02', 'user2', 'SHO02', 'PAID', 0, '2022-01-22', 'S3233'),
('SHI03', 'user3', 'SHO03', 'COD', 4410, '2022-01-25', 'S6789');

-- --------------------------------------------------------

--
-- Table structure for table `shop_bill`
--

CREATE TABLE `shop_bill` (
  `id` varchar(5) NOT NULL,
  `id_customer` varchar(5) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `id_discount` int NOT NULL,
  `total_price($)` bigint NOT NULL,
  `payment` enum('payment on delivery','paid via card') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `shop_bill`
--

INSERT INTO `shop_bill` (`id`, `id_customer`, `date`, `time`, `id_discount`, `total_price($)`, `payment`) VALUES
('SHO01', 'user1', '2022-01-20', '09:40:00', 2, 44388, 'paid via card'),
('SHO02', 'user2', '2022-01-19', '19:33:00', 3, 91098, 'paid via card'),
('SHO03', 'user3', '2022-01-22', '14:25:30', 1, 4410, 'payment on delivery');

-- --------------------------------------------------------

--
-- Table structure for table `shop_cart`
--

CREATE TABLE `shop_cart` (
  `id_customer` varchar(5) NOT NULL,
  `id_warehouse` varchar(5) NOT NULL,
  `amount` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `shop_cart`
--

INSERT INTO `shop_cart` (`id_customer`, `id_warehouse`, `amount`) VALUES
('user1', 'WH001', 1),
('user1', 'WH009', 1),
('user2', 'WH003', 1),
('user2', 'WH010', 2),
('user3', 'WH013', 2);

-- --------------------------------------------------------

--
-- Table structure for table `status_ship`
--

CREATE TABLE `status_ship` (
  `id` varchar(5) NOT NULL,
  `id_ship_bill` varchar(5) NOT NULL,
  `status` enum('complete','uncomplete') DEFAULT NULL,
  `date_reship` date DEFAULT NULL,
  `note` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `status_ship`
--

INSERT INTO `status_ship` (`id`, `id_ship_bill`, `status`, `date_reship`, `note`) VALUES
('STT01', 'SHI01', 'complete', NULL, 'NULL'),
('STT02', 'SHI02', 'uncomplete', '2022-01-24', 'customer busy'),
('STT03', 'SHI03', 'complete', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `warehouse`
--

CREATE TABLE `warehouse` (
  `id` varchar(5) NOT NULL,
  `id_watchs` varchar(5) NOT NULL,
  `amount` int NOT NULL,
  `id_insert_ticket` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `warehouse`
--

INSERT INTO `warehouse` (`id`, `id_watchs`, `amount`, `id_insert_ticket`) VALUES
('WH001', 'H2001', 15, 'IST01'),
('WH002', 'H2002', 15, 'IST02'),
('WH003', 'H2003', 15, 'IST03'),
('WH004', 'H2004', 15, 'IST04'),
('WH005', 'H2005', 15, 'IST05'),
('WH006', 'P3001', 15, 'IST06'),
('WH007', 'P3002', 15, 'IST07'),
('WH008', 'P3003', 15, 'IST08'),
('WH009', 'P3004', 15, 'IST09'),
('WH010', 'P3005', 15, 'IST10'),
('WH011', 'R1001', 15, 'IST11'),
('WH012', 'R1002', 15, 'IST12'),
('WH013', 'R1003', 15, 'IST13'),
('WH014', 'R1004', 15, 'IST14'),
('WH015', 'R1005', 15, 'IST15');

-- --------------------------------------------------------

--
-- Table structure for table `warranty_bill`
--

CREATE TABLE `warranty_bill` (
  `id` varchar(5) NOT NULL,
  `id_shop_bill` varchar(5) NOT NULL,
  `exp_day` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `warranty_bill`
--

INSERT INTO `warranty_bill` (`id`, `id_shop_bill`, `exp_day`) VALUES
('WARB1', 'SHO01', '2027-01-20'),
('WARB2', 'SHO02', '2027-01-19'),
('WARB3', 'SHO03', '2027-01-22');

-- --------------------------------------------------------

--
-- Table structure for table `warranty_service`
--

CREATE TABLE `warranty_service` (
  `id` varchar(5) NOT NULL,
  `id_customer` varchar(5) NOT NULL,
  `receive_date` date NOT NULL,
  `complete_date` date NOT NULL,
  `content` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `watchs`
--

CREATE TABLE `watchs` (
  `id` varchar(5) NOT NULL,
  `name` text NOT NULL,
  `serial` text NOT NULL,
  `description` text NOT NULL,
  `id_brands` varchar(5) NOT NULL,
  `gender` enum('men','women') DEFAULT NULL,
  `movement` enum('automatic','chronograph') DEFAULT NULL,
  `case_size` text NOT NULL,
  `band_type` enum('leather','stainless steel') DEFAULT NULL,
  `release_year` year NOT NULL,
  `status` enum('new','likenew') DEFAULT NULL,
  `warranty` int NOT NULL,
  `price($)` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `watchs`
--

INSERT INTO `watchs` (`id`, `name`, `serial`, `description`, `id_brands`, `gender`, `movement`, `case_size`, `band_type`, `release_year`, `status`, `warranty`, `price($)`) VALUES
('H2001', 'Fusion Automatic Titanium', '511.NX.7071.LR', 'Grey titanium case with a grey rubber strap with a stiched grey (alligator) leather top. Fixed grey titanium bezel. Grey sunray dial with silver-tone hands and index hour markers.', 'H8888', 'men', 'automatic', '45 mm', 'leather', 2021, 'new', 5, 5875),
('H2002', 'Big Bang Integral Chronograph', '451.CX.1170.CX', 'Black ceramic case with a black ceramic bracelet. Fixed black ceramic bezel. Skeleton dial with luminous silver-tone hands and index hour markers.', 'H8888', 'men', 'chronograph', '42 mm', 'stainless steel', 2021, 'likenew', 2, 10200),
('H2003', 'Big Bang Portocervo 18kt Rose Gold Diamond', '341.PE.230.RW.114', '18kt rose gold case with a white rubber strap. Fixed 18kt rose gold bezel set with 114 diamonds (1.22ct). White dial with luminous rose gold hands and alternating Arabic numeral and index hour markers.', 'H8888', 'women', 'automatic', '41 mm', 'leather', 2020, 'new', 5, 37690),
('H2004', 'Hublot Masterpiece MP 01 Chronograph Automatic Black Dial', '901.NX.0129.RX', 'Grey titanium case with a black rubber strap. Fixed grey titanium bezel. Black dial with silver-tone hands and index hour markers. Dial Type: Analog.', 'H8888', 'men', 'chronograph', '48 mm', 'leather', 2021, 'likenew', 2, 33400),
('H2005', 'Hublot Classic Quartz Diamond Black Dial', '139105BVG', 'Yellow gold-tone 18kt yellow gold case and bracelet. Fixed yellow gold-tone bezel with diamond set 18kt yellow gold. Black dial with yellow gold-tone hands.', 'H8888', 'women', 'chronograph', '27 mm', 'stainless steel', 2021, 'new', 5, 4886),
('P3001', 'Grand Complications In-Line Perpetual Calendar Hand Wind Blue Dial', '5236P-001', 'Platinum case with a blue (alligator) lesather band. Fixed platinum bezel. Blue dial with rose hands and index hour markers. Minute markers around the outer rim.', 'P9999', 'men', 'automatic', '41.3 mm', 'leather', 2021, 'likenew', 2, 115500),
('P3002', '18kt Rose Gold Diamond', '7010/1R-011', '18kt rose gold case with a rose gold-tone 18kt rose gold bracelet. Fixed 18kt rose gold 46 diamond set (~0.73 ct) bezel. White dial with luminous hands and index hour markers.', 'P9999', 'women', 'chronograph', '32 mm', 'stainless steel', 2021, 'new', 5, 103000),
('P3003', 'Calatrava Rare Handcrafts Automatic Blue Dial', '5089G-030', '18kt white gold case with a blue alligator band. Fixed 18kt white gold bezel. Blue dial with white dauphine-style shape hands. Dial Type: Analog. Patek Philippe Calibre 240 Automatic movement, containing 27 Jewels, composed of 161 parts, bitting at 21600 vph, and has a power reserve of approximately 48 hours. Scratch resistant sapphire crystal.', 'P9999', 'men', 'automatic', '38.60 mm', 'leather', 2021, 'new', 5, 163000),
('P3004', 'Gondolo Quartz Diamond', '4972-1G-001', '18kt white gold case with a silver-tone 18kt white gold bracelet. Fixed bezel with diamond set 18kt white gold. Silver-tone dial with black hands and Arabic numeral hour markers.', 'P9999', 'women', 'chronograph', '27.4 mm', 'stainless steel', 2020, 'new', 5, 49610),
('P3005', 'Complications Men\'s Perpetual Calendar', '5140P-017', 'Platinum case with a black leather strap. Fixed platinum bezel. Charcoal gray dial with silver-tone hands and index hour markers. Minute markers around the outer rim. ', 'P9999', 'men', 'automatic', '37.2 mm', 'stainless steel', 2021, 'new', 5, 92450),
('R1001', 'Datejust 41 Blue Dial', '126300BLSO', 'Sstainless steel case with a stainless steel bracelet. Fixed stainless steel bezel. Blue dial with luminous silver-tone hands and index hour markers. Minute markers around the outer rim', 'R6789', 'men', 'automatic', '41 mm', 'stainless steel', 2021, 'new', 5, 12000),
('R1002', 'Datejust 41 Blue Dial', '126300BLSO', 'Sstainless steel case with a stainless steel bracelet. Fixed stainless steel bezel. Blue dial with luminous silver-tone hands and index hour markers. Minute markers around the outer rim', 'R6789', 'men', 'automatic', '41 mm', 'stainless steel', 2021, 'likenew', 2, 7200),
('R1003', 'Rolex Datejust Chronometer Black Dial', '79173CSJ', 'Silver-tone stainless steel case with a two-tone (silver-tone and gold-tone) 18kt yellow gold and stainless steel oyster bracelet. Fluted fixed gold-tone 18kt yellow gold bezel', 'R6789', 'women', 'chronograph', '26 mm', 'stainless steel', 2020, 'new', 5, 4900),
('R1004', 'Cellini Automatic Rhodium Dial', '50709SSBKL', '18kt white gold case with a black leather strap. Fixed 18kt white gold bezel set with diamonds. Rhodium dial with silver-tone alpha-style hands and index hour markers.', 'R6789', 'men', 'automatic', '39 mm', 'leather', 2019, 'new', 5, 18400),
('R1005', 'Cellini Quartz Pink Dial', '6622SSBKL', '18kt white gold case with a black leather strap. Fixed 18kt white gold bezel. Pink dial with silver-tone hands and Roman numeral hour markers', 'R6789', 'women', 'chronograph', '33 mm', 'leather', 2020, 'likenew', 2, 2390);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brands`
--
ALTER TABLE `brands`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `brands_watch`
--
ALTER TABLE `brands_watch`
  ADD PRIMARY KEY (`id_brands`,`id_watchs`),
  ADD KEY `id_watchs` (`id_watchs`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `delivery_ticket`
--
ALTER TABLE `delivery_ticket`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_shop_bill` (`id_shop_bill`),
  ADD KEY `id_shipper` (`id_shipper`);

--
-- Indexes for table `discount`
--
ALTER TABLE `discount`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `insert_ticket`
--
ALTER TABLE `insert_ticket`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_watchs` (`id_watchs`);

--
-- Indexes for table `shipper`
--
ALTER TABLE `shipper`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ship_bill`
--
ALTER TABLE `ship_bill`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_customer` (`id_customer`),
  ADD KEY `id_shop_bill` (`id_shop_bill`),
  ADD KEY `id_shipper` (`id_shipper`);

--
-- Indexes for table `shop_bill`
--
ALTER TABLE `shop_bill`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_customer` (`id_customer`),
  ADD KEY `id_discount` (`id_discount`);

--
-- Indexes for table `shop_cart`
--
ALTER TABLE `shop_cart`
  ADD PRIMARY KEY (`id_customer`,`id_warehouse`),
  ADD KEY `id_warehouse` (`id_warehouse`);

--
-- Indexes for table `status_ship`
--
ALTER TABLE `status_ship`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_ship_bill` (`id_ship_bill`);

--
-- Indexes for table `warehouse`
--
ALTER TABLE `warehouse`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_watchs` (`id_watchs`),
  ADD KEY `id_insert_ticket` (`id_insert_ticket`);

--
-- Indexes for table `warranty_bill`
--
ALTER TABLE `warranty_bill`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_shop_bill` (`id_shop_bill`);

--
-- Indexes for table `warranty_service`
--
ALTER TABLE `warranty_service`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_customer` (`id_customer`);

--
-- Indexes for table `watchs`
--
ALTER TABLE `watchs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_brands` (`id_brands`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `brands_watch`
--
ALTER TABLE `brands_watch`
  ADD CONSTRAINT `brands_watch_ibfk_1` FOREIGN KEY (`id_brands`) REFERENCES `brands` (`id`),
  ADD CONSTRAINT `brands_watch_ibfk_2` FOREIGN KEY (`id_watchs`) REFERENCES `watchs` (`id`);

--
-- Constraints for table `delivery_ticket`
--
ALTER TABLE `delivery_ticket`
  ADD CONSTRAINT `delivery_ticket_ibfk_1` FOREIGN KEY (`id_shop_bill`) REFERENCES `shop_bill` (`id`),
  ADD CONSTRAINT `delivery_ticket_ibfk_2` FOREIGN KEY (`id_shipper`) REFERENCES `shipper` (`id`);

--
-- Constraints for table `insert_ticket`
--
ALTER TABLE `insert_ticket`
  ADD CONSTRAINT `insert_ticket_ibfk_1` FOREIGN KEY (`id_watchs`) REFERENCES `watchs` (`id`);

--
-- Constraints for table `ship_bill`
--
ALTER TABLE `ship_bill`
  ADD CONSTRAINT `ship_bill_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `ship_bill_ibfk_2` FOREIGN KEY (`id_shop_bill`) REFERENCES `shop_bill` (`id`),
  ADD CONSTRAINT `ship_bill_ibfk_3` FOREIGN KEY (`id_shipper`) REFERENCES `shipper` (`id`);

--
-- Constraints for table `shop_bill`
--
ALTER TABLE `shop_bill`
  ADD CONSTRAINT `shop_bill_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `shop_bill_ibfk_3` FOREIGN KEY (`id_discount`) REFERENCES `discount` (`id`);

--
-- Constraints for table `shop_cart`
--
ALTER TABLE `shop_cart`
  ADD CONSTRAINT `shop_cart_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `shop_cart_ibfk_2` FOREIGN KEY (`id_warehouse`) REFERENCES `warehouse` (`id`);

--
-- Constraints for table `status_ship`
--
ALTER TABLE `status_ship`
  ADD CONSTRAINT `status_ship_ibfk_1` FOREIGN KEY (`id_ship_bill`) REFERENCES `ship_bill` (`id`);

--
-- Constraints for table `warehouse`
--
ALTER TABLE `warehouse`
  ADD CONSTRAINT `warehouse_ibfk_1` FOREIGN KEY (`id_watchs`) REFERENCES `watchs` (`id`),
  ADD CONSTRAINT `warehouse_ibfk_2` FOREIGN KEY (`id_insert_ticket`) REFERENCES `insert_ticket` (`id`);

--
-- Constraints for table `warranty_bill`
--
ALTER TABLE `warranty_bill`
  ADD CONSTRAINT `warranty_bill_ibfk_1` FOREIGN KEY (`id_shop_bill`) REFERENCES `shop_bill` (`id`);

--
-- Constraints for table `warranty_service`
--
ALTER TABLE `warranty_service`
  ADD CONSTRAINT `warranty_service_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id`);

--
-- Constraints for table `watchs`
--
ALTER TABLE `watchs`
  ADD CONSTRAINT `watchs_ibfk_1` FOREIGN KEY (`id_brands`) REFERENCES `brands` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
