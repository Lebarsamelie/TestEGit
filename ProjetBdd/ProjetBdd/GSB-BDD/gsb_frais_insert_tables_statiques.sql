--
-- Contenu de la table `FraisForfait`
--

INSERT INTO `FraisForfait` (`id`, `libelle`, `montant`) VALUES
('ETP', 'Forfait Etape', 110.00),
('KM', 'Frais Kilométrique', 0.62),
('NUI', 'Nuitée Hôtel', 80.00),
('REP', 'Repas Restaurant', 25.00);
--
-- Contenu de la table `LigneFraisForfait`
--

--
-- Contenu de la table `Etat`
--

INSERT INTO `Etat` (`id`, `libelle`) VALUES
('RB', 'Remboursée'),
('CL', 'Saisie clôturée'),
('CR', 'Fiche créée, saisie en cours'),
('VA', 'Validée et mise en paiement');

-- --------------------------------------------------------

--
-- Contenu de la table `Visiteur`
--

INSERT INTO `visiteur` (`id`, `nom`, `prenom`, `login`, `mdp`, `adresse`, `cp`, `ville`, `dateEmbauche`,`statut`) VALUES
('a131', 'Villechalane', 'Louis', 'lvillachane', md5('jux7g'), '8 rue des Charmes', '46000', 'Cahors', '2005-12-21', 'visiteur'),
('a17', 'Andre', 'David', 'dandre',  md5('oppg5'), '1 rue Petit', '46200', 'Lalbenque', '1998-11-23', 'visiteur'),
('a55', 'Bedos', 'Christian', 'cbedos',  md5('gmhxd'), '1 rue Peranud', '46250', 'Montcuq', '1995-01-12', 'visiteur'),
('a93', 'Tusseau', 'Louis', 'ltusseau',  md5('ktp3s'), '22 rue des Ternes', '46123', 'Gramat', '2000-05-01', 'visiteur'),
('b13', 'Bentot', 'Pascal', 'pbentot',  md5('doyw1'), '11 allée des Cerises', '46512', 'Bessines', '1992-07-09', 'visiteur'),
('b16', 'Bioret', 'Luc', 'lbioret',  md5('hrjfs'), '1 Avenue gambetta', '46000', 'Cahors', '1998-05-11', 'visiteur'),
('b19', 'Bunisset', 'Francis', 'fbunisset', md5( '4vbnd'), '10 rue des Perles', '93100', 'Montreuil', '1987-10-21', 'visiteur'),
('b25', 'Bunisset', 'Denise', 'dbunisset',  md5('s1y1r'), '23 rue Manin', '75019', 'paris', '2010-12-05', 'visiteur'),
('b28', 'Cacheux', 'Bernard', 'bcacheux',  md5('uf7r3'), '114 rue Blanche', '75017', 'Paris', '2009-11-12', 'visiteur'),
('b34', 'Cadic', 'Eric', 'ecadic',  md5('6u8dc'), '123 avenue de la République', '75011', 'Paris', '2008-09-23', 'visiteur'),
('b4', 'Charoze', 'Catherine', 'ccharoze',  md5('u817o'), '100 rue Petit', '75019', 'Paris', '2005-11-12', 'visiteur'),
('b50', 'Clepkens', 'Christophe', 'cclepkens',  md5('bw1us'), '12 allée des Anges', '93230', 'Romainville', '2003-08-11', 'visiteur'),
('b59', 'Cottin', 'Vincenne', 'vcottin',  md5('2hoh9'), '36 rue Des Roches', '93100', 'Monteuil', '2001-11-18', 'visiteur'),
('c14', 'Daburon', 'François', 'fdaburon',  md5('7oqpv'), '13 rue de Chanzy', '94000', 'Créteil', '2002-02-11', 'visiteur'),
('c3', 'De', 'Philippe', 'pde',  md5('gk9kx'), '13 rue Barthes', '94000', 'Créteil', '2010-12-14', 'visiteur'),
('c54', 'Debelle', 'Michel', 'mdebelle',  md5('od5rt'), '181 avenue Barbusse', '93210', 'Rosny', '2006-11-23', 'visiteur'),
('d13', 'Debelle', 'Jeanne', 'jdebelle',  md5('nvwqq'), '134 allée des Joncs', '44000', 'Nantes', '2000-05-11', 'visiteur'),
('d51', 'Debroise', 'Michel', 'mdebroise',  md5('sghkb'), '2 Bld Jourdain', '44000', 'Nantes', '2001-04-17', 'visiteur'),
('e22', 'Desmarquest', 'Nathalie', 'ndesmarquest',  md5('f1fob'), '14 Place d Arc', '45000', 'Orléans', '2005-11-12', 'visiteur'),
('e24', 'Desnost', 'Pierre', 'pdesnost',  md5('4k2o5'), '16 avenue des Cèdres', '23200', 'Guéret', '2001-02-05', 'visiteur'),
('e39', 'Dudouit', 'Frédéric', 'fdudouit',  md5('44im8'), '18 rue de l église', '23120', 'GrandBourg', '2000-08-01', 'visiteur'),
('e49', 'Duncombe', 'Claude', 'cduncombe',  md5('qf77j'), '19 rue de la tour', '23100', 'La souteraine', '1987-10-10', 'visiteur'),
('e5', 'Enault-Pascreau', 'Céline', 'cenault',  md5('y2qdu'), '25 place de la gare', '23200', 'Gueret', '1995-09-01', 'visiteur'),
('e52', 'Eynde', 'Valérie', 'veynde',  md5('i7sn3'), '3 Grand Place', '13015', 'Marseille', '1999-11-01', 'visiteur'),
('f21', 'Finck', 'Jacques', 'jfinck',  md5('mpb3t'), '10 avenue du Prado', '13002', 'Marseille', '2001-11-10', 'visiteur'),
('f39', 'Frémont', 'Fernande', 'ffremont',  md5('xs5tq'), '4 route de la mer', '13012', 'Allauh', '1998-10-01', 'visiteur'),
('f4', 'Gest', 'Alain', 'agest',  md5('dywvt'), '30 avenue de la mer', '13025', 'Berre', '1985-11-01', 'visiteur'),
('cpt1', 'Martinez', 'Manon', 'mmartinez', md5('1234'), '48 rue des ronces', '46050', 'Perpignant', '1985-11-01', 'Comptable'),
('cpt2', 'Park', 'Jimin', 'jpark', md5('13245'), '95 rue des anges', '195200', 'Séoul', '1985-11-01', 'Comptable');