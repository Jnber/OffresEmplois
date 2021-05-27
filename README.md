# OffresEmplois
an application where admin can post job offers and users apply and contact the admin


Data base structure
--
-- Table structure for table `condidats`
--

DROP TABLE IF EXISTS `condidats`;
CREATE TABLE IF NOT EXISTS `condidats` (
  `id_condidat` int(11) NOT NULL AUTO_INCREMENT,
  `tel` varchar(8) NOT NULL,
  `dateNaissence` varchar(20) NOT NULL,
  `ville` varchar(30) NOT NULL,
  `niveauEtude` varchar(70) NOT NULL,
  `niveauExp` varchar(80) NOT NULL,
  `cv` varchar(1000) NOT NULL,
  `id_offre` int(11) NOT NULL,
  `id_utili` int(11) NOT NULL,
  PRIMARY KEY (`id_condidat`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

--
-- Table structure for table `msg`
--

DROP TABLE IF EXISTS `msg`;
CREATE TABLE IF NOT EXISTS `msg` (
  `id_msg` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(200) NOT NULL,
  `sujet` varchar(300) NOT NULL,
  `msg` varchar(1000) NOT NULL,
  `id_utilisateur` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_msg`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Table structure for table `offres`
--

DROP TABLE IF EXISTS `offres`;
CREATE TABLE IF NOT EXISTS `offres` (
  `id_offre` int(11) NOT NULL AUTO_INCREMENT,
  `metier` varchar(60) NOT NULL,
  `titre` varchar(70) NOT NULL,
  `societe` varchar(80) NOT NULL,
  `dateFin` varchar(25) NOT NULL,
  `description` varchar(1000) NOT NULL,
  PRIMARY KEY (`id_offre`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Table structure for table `utili`
--

DROP TABLE IF EXISTS `utili`;
CREATE TABLE IF NOT EXISTS `utili` (
  `id_utili` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(200) NOT NULL,
  `prenom` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `Role` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_utili`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
