-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2021 at 03:24 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.4.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sunbook`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_buku`
--

CREATE TABLE `tabel_buku` (
  `idBuku` int(11) NOT NULL,
  `KodeBuku` varchar(5) DEFAULT NULL,
  `JenisBuku` varchar(30) DEFAULT NULL,
  `JudulBuku` varchar(30) DEFAULT NULL,
  `PenerbitBuku` varchar(30) DEFAULT NULL,
  `HargaBuku` int(11) DEFAULT NULL,
  `Stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabel_buku`
--

INSERT INTO `tabel_buku` (`idBuku`, `KodeBuku`, `JenisBuku`, `JudulBuku`, `PenerbitBuku`, `HargaBuku`, `Stok`) VALUES
(1, 'KB001', 'Novel', 'Bumi dan Manusia', 'Gramedia', 50000, 10),
(6, 'KB002', 'Novel', 'Dilan 1991', 'Gramedia', 79000, 21),
(9, 'KB003', 'Biografi', 'Habibie', 'Tb Agung', 65000, 22);

-- --------------------------------------------------------

--
-- Table structure for table `tabel_login`
--

CREATE TABLE `tabel_login` (
  `id` int(11) NOT NULL,
  `username` varchar(35) DEFAULT NULL,
  `password` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabel_login`
--

INSERT INTO `tabel_login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_nota`
--

CREATE TABLE `tabel_nota` (
  `noNota` int(11) NOT NULL,
  `KodePembeli` varchar(30) NOT NULL,
  `NamaPembeli` varchar(30) NOT NULL,
  `TanggalPembeli` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_nota`
--

INSERT INTO `tabel_nota` (`noNota`, `KodePembeli`, `NamaPembeli`, `TanggalPembeli`) VALUES
(1, 'KP001', 'Hanif', '1 Desember 2021'),
(2, 'KP002', 'Hanif', '1 Des 2021');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pembeli`
--

CREATE TABLE `tabel_pembeli` (
  `idPembeli` int(11) NOT NULL,
  `KodePembeli` varchar(5) DEFAULT NULL,
  `NamaPembeli` varchar(50) DEFAULT NULL,
  `NomorTeleponPembeli` varchar(15) DEFAULT NULL,
  `AlamatPembeli` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabel_pembeli`
--

INSERT INTO `tabel_pembeli` (`idPembeli`, `KodePembeli`, `NamaPembeli`, `NomorTeleponPembeli`, `AlamatPembeli`) VALUES
(7, 'KP001', 'Hanif', '0219239198', 'cibinong'),
(8, 'KP002', 'Naufal', '08128832764', 'Sawangan'),
(9, 'KP003', 'Abby', '0898718273', 'Jakarta'),
(10, 'KP004', 'Abby', '081267362', 'Jakarta'),
(11, 'KP004', 'Ilham', '081267362', 'Jakarta'),
(12, 'KP007', 'Randy', '0812772863', 'Gandul');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pembelian`
--

CREATE TABLE `tabel_pembelian` (
  `NoNota` int(11) DEFAULT NULL,
  `KodeBuku` varchar(5) DEFAULT NULL,
  `JenisBuku` varchar(30) DEFAULT NULL,
  `JudulBuku` varchar(30) DEFAULT NULL,
  `PenerbitBuku` varchar(30) DEFAULT NULL,
  `HargaBuku` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_pembelian`
--

INSERT INTO `tabel_pembelian` (`NoNota`, `KodeBuku`, `JenisBuku`, `JudulBuku`, `PenerbitBuku`, `HargaBuku`) VALUES
(1, 'KB001', 'Novel', 'Bumi dan Manusia', 'Gramedia', 50000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabel_buku`
--
ALTER TABLE `tabel_buku`
  ADD PRIMARY KEY (`idBuku`);

--
-- Indexes for table `tabel_login`
--
ALTER TABLE `tabel_login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_nota`
--
ALTER TABLE `tabel_nota`
  ADD PRIMARY KEY (`noNota`);

--
-- Indexes for table `tabel_pembeli`
--
ALTER TABLE `tabel_pembeli`
  ADD PRIMARY KEY (`idPembeli`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tabel_buku`
--
ALTER TABLE `tabel_buku`
  MODIFY `idBuku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tabel_login`
--
ALTER TABLE `tabel_login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tabel_pembeli`
--
ALTER TABLE `tabel_pembeli`
  MODIFY `idPembeli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
