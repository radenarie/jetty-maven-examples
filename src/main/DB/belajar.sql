-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 10. Agustus 2018 jam 01:05
-- Versi Server: 5.5.16
-- Versi PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `belajar`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `table_students`
--

CREATE TABLE IF NOT EXISTS `table_students` (
  `id` int(6) NOT NULL,
  `name` varchar(35) NOT NULL,
  `address` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `table_students`
--

INSERT INTO `table_students` (`id`, `name`, `address`) VALUES
(1, 'joko', 'Lempuyangan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tprofile`
--

CREATE TABLE IF NOT EXISTS `tprofile` (
  `namaLengkap` varchar(30) NOT NULL,
  `alamat` varchar(45) NOT NULL,
  `umur` int(4) NOT NULL,
  `jenisKelamin` varchar(15) NOT NULL,
  `id` int(4) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data untuk tabel `tprofile`
--

INSERT INTO `tprofile` (`namaLengkap`, `alamat`, `umur`, `jenisKelamin`, `id`) VALUES
('Adi Purnomo', 'Jl. Babarsari ', 18, 'Pria', 1),
('Cipto Purnomo', 'Jl. Babarsari 2', 21, 'Pria', 2),
('Ratna Puspita', 'Jl. Babarsari 3', 23, 'Wanita', 3),
('Udin', 'Jl. Kauman 3', 18, 'Pria', 5);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'admin 2', 'admin 2'),
(3, 'admin 3', 'admin 3'),
(4, 'admin 4', 'admin 4'),
(5, 'admin 5', 'admin 5'),
(6, 'admin 6', 'admin 6'),
(8, 'admin 7', 'admin 7'),
(9, 'admin 8', 'admin 8');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
