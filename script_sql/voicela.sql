-- phpMyAdmin SQL Dump
-- version 4.2.5
-- http://www.phpmyadmin.net
--
-- Client :  localhost:8889
-- Généré le :  Lun 20 Octobre 2014 à 14:56
-- Version du serveur :  5.5.38
-- Version de PHP :  5.5.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `voicela`
--

-- --------------------------------------------------------

--
-- Structure de la table `films`
--

CREATE TABLE `films` (
  `id_film` int(10) NOT NULL,
  `titre_film` varchar(255) DEFAULT NULL,
  `date_sortie` date DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `num_visa` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `mariage`
--

CREATE TABLE `mariage` (
  `id_mariage` int(10) NOT NULL DEFAULT '0',
  `num_vip1` int(10) DEFAULT NULL,
  `num_vip2` int(10) DEFAULT NULL,
  `lieu_mariage` varchar(255) DEFAULT NULL,
  `date_mariage` date DEFAULT NULL,
  `divorce` tinyint(1) DEFAULT NULL,
  `date_divorce` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `photos`
--

CREATE TABLE `photos` (
  `id_photo` int(10) NOT NULL,
  `num_vip` int(10) DEFAULT NULL,
  `url_photo` varchar(255) DEFAULT NULL,
  `date_ajout_photo` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `vip`
--

CREATE TABLE `vip` (
  `num_vip` int(10) NOT NULL DEFAULT '0',
  `nom_vip` varchar(255) DEFAULT NULL,
  `prenom_usuel_vip` varchar(255) DEFAULT NULL,
  `prenoms_vip` varchar(255) DEFAULT NULL,
  `nationalite_vip` varchar(255) DEFAULT NULL,
  `civilite_vip` varchar(255) DEFAULT NULL,
  `date_naissance_vip` date DEFAULT NULL,
  `lieu_naissance_vip` varchar(255) DEFAULT NULL,
  `statut_vip` varchar(255) DEFAULT NULL,
  `age_vip` int(10) DEFAULT NULL,
  `nb_enfants` int(10) DEFAULT NULL,
  `sexe_vip` varchar(255) DEFAULT NULL,
  `chemin_phto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `films`
--
ALTER TABLE `films`
 ADD PRIMARY KEY (`id_film`);

--
-- Index pour la table `mariage`
--
ALTER TABLE `mariage`
 ADD PRIMARY KEY (`id_mariage`);

--
-- Index pour la table `photos`
--
ALTER TABLE `photos`
 ADD PRIMARY KEY (`id_photo`);

--
-- Index pour la table `vip`
--
ALTER TABLE `vip`
 ADD PRIMARY KEY (`num_vip`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
