-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-04-2019 a las 06:34:48
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `salescompany`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seller`
--

CREATE TABLE `seller` (
  `IDSELLER` int(11) NOT NULL,
  `USERNAME` char(32) COLLATE utf8_bin NOT NULL,
  `PASSWORD` char(32) COLLATE utf8_bin NOT NULL,
  `NAME` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `LASTNAME` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `ADDRESS` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `TELEPHONE` char(10) COLLATE utf8_bin DEFAULT NULL,
  `EMAIL` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `PENDINGVALUES` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `seller`
--

INSERT INTO `seller` (`IDSELLER`, `USERNAME`, `PASSWORD`, `NAME`, `LASTNAME`, `ADDRESS`, `TELEPHONE`, `EMAIL`, `PENDINGVALUES`) VALUES
(1, 'kbapty0', 'r4WNzbxLIXH', 'Kailey', 'Bapty', '6 Butternut Park', '0925136692', 'kbapty0@homestead.com', 0),
(2, 'jhuxley1', 'FNEyiXk4', 'Judith', 'Huxley', '750 Carberry Parkway', '0933598915', 'jhuxley1@chronoengine.com', 0),
(3, 'sgowan2', 'aZG9iu1tf', 'Sharyl', 'Gowan', '50 Bonner Plaza', '0959987213', 'sgowan2@themeforest.net', 0),
(4, 'kcousens3', 'lzy0A3OkprWZ', 'Katharina', 'Cousens', '57 Forest Dale Place', '0945825149', 'kcousens3@cocolog-nifty.com', 0),
(5, 'mryall4', 'laPraW', 'Micheline', 'Ryall', '87949 Bunker Hill Circle', '0975864757', 'mryall4@technorati.com', 0),
(6, 'ejellman5', 'NJ8MEc9v7tw', 'Erastus', 'Jellman', '954 Milwaukee Crossing', '0916491721', 'ejellman5@networksolutions.com', 0),
(7, 'nskinner6', 'mz6W120Pu', 'Nada', 'Skinner', '23 Karstens Plaza', '0979899997', 'nskinner6@bigcartel.com', 0),
(8, 'larrandale7', 'ijHkLz', 'Lyndsay', 'Arrandale', '3 Crownhardt Drive', '0949349463', 'larrandale7@twitter.com', 0),
(9, 'bbrewer8', 'UQ3LWofasA4n', 'Beilul', 'Brewer', '34 Sachtjen Place', '0900120956', 'bbrewer8@tripod.com', 0),
(10, 'pruit9', 'ZHHYsMeN', 'Packston', 'Ruit', '5872 Cascade Way', '0932195544', 'pruit9@furl.net', 0),
(11, 'gpiddletowna', 'qvQBBT8bY2D4', 'Gerome', 'Piddletown', '3110 8th Way', '0975803679', 'gpiddletowna@sitemeter.com', 0),
(12, 'vloransb', 'nrvW9SbOB1', 'Venus', 'Lorans', '824 Bartelt Point', '0901460661', 'vloransb@intel.com', 0),
(13, 'emunnc', 'MF48T9NWSxA8', 'Evangelin', 'Munn', '88098 Jenna Pass', '0910094206', 'emunnc@census.gov', 0),
(14, 'jstabled', '6Ld9CCml0C71', 'Jennine', 'Stable', '53872 Oakridge Court', '0959005985', 'jstabled@paginegialle.it', 0),
(15, 'btremellane', 'nzCBlJW', 'Blaine', 'Tremellan', '24520 Darwin Place', '0920738750', 'btremellane@cbslocal.com', 0),
(16, 'sspawellf', 'SGu7LCxMd2RN', 'Sarena', 'Spawell', '06 3rd Point', '0944504009', 'sspawellf@clickbank.net', 0),
(17, 'abarensg', 'nHjMK7TsJncI', 'Aryn', 'Barens', '0 Pine View Way', '0967405129', 'abarensg@youtube.com', 0),
(18, 'bblamireh', '7apXWbmUYKT', 'Barton', 'Blamire', '272 Loeprich Lane', '0905079712', 'bblamireh@soup.io', 0),
(19, 'ebartoli', 'aAYxkw', 'Emlyn', 'Bartol', '1 Ramsey Street', '0950195787', 'ebartoli@cbsnews.com', 0),
(20, 'iphalipj', 'LBoHHtlnFD', 'Ingeberg', 'Phalip', '88564 Menomonie Junction', '0923685594', 'iphalipj@shareasale.com', 0),
(21, 'mmaureenk', 'R5C9qK2Ne', 'Maynard', 'Maureen', '7 Stuart Street', '0959128359', 'mmaureenk@dailymotion.com', 0),
(22, 'yjunkisonl', 'UagAk9', 'Yoshiko', 'Junkison', '5 Summer Ridge Junction', '0917493251', 'yjunkisonl@fotki.com', 0),
(23, 'sgowanlockm', 'bhP7sEQRHP', 'Silvana', 'Gowanlock', '5909 Towne Parkway', '0937628613', 'sgowanlockm@vistaprint.com', 0),
(24, 'lgoningn', 'BmIGJXSY', 'Lucille', 'Goning', '651 Coleman Pass', '0952718549', 'lgoningn@hubpages.com', 0),
(25, 'avoelkero', 'fQynEs', 'Amble', 'Voelker', '0070 Northfield Point', '0959036213', 'avoelkero@reddit.com', 0),
(26, 'radamiecp', 'xj9qf5YGKYI9', 'Reginauld', 'Adamiec', '81 Bluejay Terrace', '0957214012', 'radamiecp@shinystat.com', 0),
(27, 'jjessenq', 'zWUQD2IHTXMp', 'Juli', 'Jessen', '1112 Mandrake Plaza', '0912038267', 'jjessenq@imgur.com', 0),
(28, 'cbrowner', 'ovqoYQU', 'Carson', 'Browne', '38 Granby Pass', '0920338747', 'cbrowner@boston.com', 0),
(29, 'vskeggs', 'ZtieXxIMiGd', 'Virgie', 'Skegg', '2 Vermont Circle', '0982629094', 'vskeggs@pen.io', 0),
(30, 'rgollopt', 'upvYTSe', 'Romeo', 'Gollop', '120 Tomscot Avenue', '0992816115', 'rgollopt@xrea.com', 0),
(31, 'gfaradayu', 'T6UmvIRYxc6R', 'Garrik', 'Faraday', '7 Lake View Hill', '0929120680', 'gfaradayu@hubpages.com', 0),
(32, 'tlewinsv', 'sVJ9odlkSlha', 'Tisha', 'Lewins', '06622 Colorado Parkway', '0919760297', 'tlewinsv@google.com.au', 0),
(33, 'rricardetw', 'q89PMn', 'Reg', 'Ricardet', '7093 Clarendon Court', '0968402444', 'rricardetw@a8.net', 0),
(34, 'rcoskerryx', 'tYIpSqHRLHGf', 'Rosalyn', 'Coskerry', '248 Northview Hill', '0985119366', 'rcoskerryx@umich.edu', 0),
(35, 'adrayny', '9v7mDVm', 'Ade', 'Drayn', '39024 Jenifer Pass', '0932415664', 'adrayny@engadget.com', 0),
(36, 'kgrishinovz', '5NucBZJe', 'Keefe', 'Grishinov', '7699 Meadow Vale Way', '0932711952', 'kgrishinovz@abc.net.au', 0),
(37, 'jbowie10', 'ph0oRMHGV', 'Jacquetta', 'Bowie', '8885 Rieder Point', '0983280301', 'jbowie10@npr.org', 0),
(38, 'hbonar11', 'XQrtzL9Zry', 'Hieronymus', 'Bonar', '564 Oxford Point', '0983220157', 'hbonar11@wikimedia.org', 0),
(39, 'bstallwood12', 'OhUp42RDFz', 'Butch', 'Stallwood', '626 Bowman Pass', '0970683522', 'bstallwood12@wired.com', 0),
(40, 'walecock13', 'FzXwU91E', 'Whitney', 'Alecock', '442 Kings Plaza', '0907563553', 'walecock13@umn.edu', 0),
(41, 'lfines14', 'Qm9CDrNxn', 'Lita', 'Fines', '48846 Evergreen Plaza', '0944239266', 'lfines14@ucla.edu', 0),
(42, 'asineath15', 'vkUWja', 'Aundrea', 'Sineath', '7 Bobwhite Hill', '0957160241', 'asineath15@bizjournals.com', 0),
(43, 'aconstance16', 'g3vUVpTCDA', 'Andi', 'Constance', '3 Oak Place', '0979561679', 'aconstance16@bing.com', 0),
(44, 'kperegrine17', 'Z0oE7HIWT', 'Kelvin', 'Peregrine', '4 Arkansas Park', '0926513160', 'kperegrine17@ifeng.com', 0),
(45, 'tmactimpany18', 'nHzPWgHOH', 'Teirtza', 'MacTimpany', '859 Continental Alley', '0977353820', 'tmactimpany18@dyndns.org', 0),
(46, 'ebalasini19', 'uWx3tCR5V9Rc', 'Esther', 'Balasini', '2753 Summerview Trail', '0933524594', 'ebalasini19@japanpost.jp', 0),
(47, 'jbrookzie1a', 'Z5Y0U4lf', 'Joshia', 'Brookzie', '1412 Hermina Terrace', '0962923047', 'jbrookzie1a@skype.com', 0),
(48, 'hcazalet1b', '4cn5tQy4', 'Halsy', 'Cazalet', '428 Esker Plaza', '0951424716', 'hcazalet1b@mit.edu', 0),
(49, 'bneames1c', 'kTzUGQdaZn', 'Billy', 'Neames', '33945 Pearson Lane', '0986944526', 'bneames1c@mysql.com', 0),
(50, 'khartin1d', 'fHaCb6v', 'Kial', 'Hartin', '3 Kedzie Point', '0970387246', 'khartin1d@sogou.com', 0),
(51, 'mminister1e', 'dRHRU8xG', 'Myrlene', 'Minister', '43 Grayhawk Pass', '0978244178', 'mminister1e@si.edu', 0),
(52, 'fthexton1f', 'QrJ4eclLlNa', 'Free', 'Thexton', '68502 Di Loreto Lane', '0977322920', 'fthexton1f@mac.com', 0),
(53, 'rsoppit1g', 'R7IC4UccMR', 'Reginauld', 'Soppit', '24016 East Crossing', '0985153667', 'rsoppit1g@gov.uk', 0),
(54, 'dperon1h', 'oEPhT49', 'Dunn', 'Peron', '70640 Onsgard Terrace', '0970319816', 'dperon1h@weibo.com', 0),
(55, 'schotty1i', 'dU8kDMkbQ', 'Sidney', 'Chotty', '6 Graedel Hill', '0906003865', 'schotty1i@weather.com', 0),
(56, 'mtriggel1j', 'ZVp0TLc4y', 'Micki', 'Triggel', '3 Quincy Terrace', '0965366015', 'mtriggel1j@dailymotion.com', 0),
(57, 'mthripp1k', 'nPPaqVDjC', 'Madelyn', 'Thripp', '34 Schmedeman Terrace', '0949334972', 'mthripp1k@illinois.edu', 0),
(58, 'wcorradino1l', 'PeJLUc', 'Walker', 'Corradino', '85 Crownhardt Place', '0927266457', 'wcorradino1l@4shared.com', 0),
(59, 'hglen1m', 'Jxa1OQImKMpN', 'Hollyanne', 'Glen', '865 Shelley Road', '0903763583', 'hglen1m@foxnews.com', 0),
(60, 'abenyan1n', 'tNORbzVb', 'Addie', 'Benyan', '7 Lighthouse Bay Crossing', '0957043390', 'abenyan1n@booking.com', 0),
(61, 'nhubery1o', 'E1qWhhSA', 'Natka', 'Hubery', '5 Monica Junction', '0945432166', 'nhubery1o@hhs.gov', 0),
(62, 'cfrankema1p', 'BlvVy724M', 'Carolin', 'Frankema', '1854 Moulton Place', '0921505608', 'cfrankema1p@springer.com', 0),
(63, 'cantoniewicz1q', '3KHinP', 'Candice', 'Antoniewicz', '77 Roxbury Junction', '0901636787', 'cantoniewicz1q@hao123.com', 0),
(64, 'nstrike1r', 'T3w3ZlslI', 'Nadia', 'Strike', '279 Mendota Trail', '0963117230', 'nstrike1r@imageshack.us', 0),
(65, 'mpearcey1s', 'Ak0W5aP3TKtk', 'Mirilla', 'Pearcey', '58 Farragut Lane', '0998895100', 'mpearcey1s@salon.com', 0),
(66, 'aclarkson1t', 'OhhyVsb8fF', 'Andee', 'Clarkson', '904 Melvin Park', '0934982697', 'aclarkson1t@usa.gov', 0),
(67, 'aganforthe1u', '9lGlkhGP', 'Ashton', 'Ganforthe', '679 Basil Pass', '0933904826', 'aganforthe1u@bing.com', 0),
(68, 'xeasson1v', '6yxxBvl', 'Xavier', 'Easson', '9807 Helena Park', '0955567378', 'xeasson1v@wikipedia.org', 0),
(69, 'ccoxon1w', 'QXxPTyIuo', 'Colly', 'Coxon', '4793 Upham Place', '0925683781', 'ccoxon1w@addthis.com', 0),
(70, 'cdevorill1x', 'mjWKYFi', 'Cully', 'Devorill', '8 Portage Avenue', '0954376156', 'cdevorill1x@163.com', 0),
(71, 'jblaze1y', 'jaxNIyxWcARB', 'Justino', 'Blaze', '37163 Mosinee Avenue', '0963513970', 'jblaze1y@cornell.edu', 0),
(72, 'wwestfield1z', 'jNIrIq2SL1m', 'Winny', 'Westfield', '58 Bashford Alley', '0935879807', 'wwestfield1z@kickstarter.com', 0),
(73, 'baffuso20', 'aPzo14q', 'Blinni', 'Affuso', '9201 Linden Parkway', '0930104842', 'baffuso20@prlog.org', 0),
(74, 'adantesia21', 'QYQ1BQvuJ7', 'Alana', 'Dantesia', '52926 Pepper Wood Point', '0982905043', 'adantesia21@ycombinator.com', 0),
(75, 'yfirebrace22', '3S1XIis', 'Yankee', 'Firebrace', '879 Farmco Alley', '0976822015', 'yfirebrace22@infoseek.co.jp', 0),
(76, 'ynisco23', 'cRMy0YuQjZ3J', 'Yolanthe', 'Nisco', '760 Mccormick Parkway', '0985757728', 'ynisco23@oakley.com', 0),
(77, 'dworts24', 'qpXo8MS', 'Dacy', 'Worts', '8514 Center Center', '0972145891', 'dworts24@reuters.com', 0),
(78, 'cdurnan25', 'PGBlw5DuSb', 'Chicky', 'Durnan', '9750 Towne Court', '0978298421', 'cdurnan25@deviantart.com', 0),
(79, 'obastable26', 'mRbHR8y', 'Osborn', 'Bastable', '24066 Warbler Court', '0977036822', 'obastable26@cdc.gov', 0),
(80, 'ahains27', 'hlUI26nY', 'Ammamaria', 'Hains', '3 Badeau Street', '0918917136', 'ahains27@weibo.com', 0),
(81, 'mrosthorn28', 'S8g5rk', 'Mata', 'Rosthorn', '9 Dixon Way', '0909941322', 'mrosthorn28@cnbc.com', 0),
(82, 'gorpyne29', '7qYllU', 'Gerrard', 'Orpyne', '46158 Melrose Avenue', '0975547257', 'gorpyne29@nhs.uk', 0),
(83, 'agaydon2a', 'j2mruZxC5T', 'Angelo', 'Gaydon', '8 Russell Alley', '0984493706', 'agaydon2a@constantcontact.com', 0),
(84, 'nfelstead2b', 'YJm2zItX', 'Neille', 'Felstead', '3 Talisman Road', '0974029292', 'nfelstead2b@tiny.cc', 0),
(85, 'mdorn2c', 'rjHexDKr', 'Merill', 'Dorn', '372 Blaine Drive', '0977359533', 'mdorn2c@hhs.gov', 0),
(86, 'scabral2d', '194mfepAR', 'Sholom', 'Cabral', '1012 Sugar Court', '0977332155', 'scabral2d@soundcloud.com', 0),
(87, 'vhamlet2e', 'fQPfPLZt', 'Veriee', 'Hamlet', '933 Blaine Lane', '0988657315', 'vhamlet2e@flickr.com', 0),
(88, 'aryton2f', 'k1MdkqNdt3b', 'Agata', 'Ryton', '98617 Ramsey Circle', '0946806519', 'aryton2f@tinypic.com', 0),
(89, 'btommasetti2g', '1IIPETm0', 'Barret', 'Tommasetti', '8266 Shoshone Park', '0956128135', 'btommasetti2g@psu.edu', 0),
(90, 'gamps2h', 'NyY5liqg9t', 'Germayne', 'Amps', '454 Armistice Park', '0972065883', 'gamps2h@ftc.gov', 0),
(91, 'mventon2i', 'KpB1QsN', 'Malchy', 'Venton', '018 Oneill Circle', '0955338960', 'mventon2i@state.gov', 0),
(92, 'dkuhle2j', '0f2Wlzvo5lf', 'Dominica', 'Kuhle', '313 Grayhawk Street', '0924230586', 'dkuhle2j@dailymail.co.uk', 0),
(93, 'ochataignier2k', 'b2hgQnjF', 'Orson', 'Chataignier', '7241 Victoria Crossing', '0972579035', 'ochataignier2k@youtu.be', 0),
(94, 'dtraut2l', 'K3rDAN', 'Dedie', 'Traut', '6122 Eagle Crest Court', '0918568145', 'dtraut2l@ehow.com', 0),
(95, 'yblackborough2m', 'UM0E43mIiGr', 'Yulma', 'Blackborough', '5 Prairie Rose Alley', '0933145108', 'yblackborough2m@360.cn', 0),
(96, 'tbyrth2n', 'LHp5Z4R5qG', 'Trixie', 'Byrth', '83 Hauk Lane', '0918355243', 'tbyrth2n@earthlink.net', 0),
(97, 'thailston2o', 'XORiWhBl02j', 'Tedi', 'Hailston', '80 School Terrace', '0989169176', 'thailston2o@freewebs.com', 0),
(98, 'lcohrs2p', 'EVjn0Cbhhla', 'Lila', 'Cohrs', '0 Kropf Alley', '0998401726', 'lcohrs2p@yellowpages.com', 0),
(99, 'jchsteney2q', 'Ics449V43eq', 'Justino', 'Chsteney', '26271 Linden Terrace', '0924795921', 'jchsteney2q@hao123.com', 0),
(100, 'bspight2r', 'tGimgD', 'Betta', 'Spight', '142 Brentwood Way', '0900183156', 'bspight2r@intel.com', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE `ticket` (
  `IDTICKET` int(11) NOT NULL,
  `IDSELLER` int(11) NOT NULL,
  `PRICE` double DEFAULT NULL,
  `DEPARTURE` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `ARRIVAL` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `CLASS` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `HOUR` time DEFAULT NULL,
  `AIRLINE` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `GATE` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `FLIGHTNUMBER` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `SEAT` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `STOCK` int(11) DEFAULT NULL,
  `DISCOUNT` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`IDTICKET`, `IDSELLER`, `PRICE`, `DEPARTURE`, `ARRIVAL`, `CLASS`, `DATE`, `HOUR`, `AIRLINE`, `GATE`, `FLIGHTNUMBER`, `SEAT`, `STOCK`, `DISCOUNT`) VALUES
(1, 97, 385, 'Quito', 'Żabnica', 'Turista', '2019-12-31', '16:08:00', 'Tame', 'G33', 'V51', 'A44', 19, 28),
(2, 81, 328, 'Quito', 'Liqiao', 'Turista', '2019-06-28', '21:51:00', 'Tame', 'G42', 'V31', 'A90', 15, 17),
(3, 99, 493, 'Quito', 'Nova Russas', 'Turista', '2019-06-07', '16:11:00', 'Tame', 'G73', 'V10', 'A99', 17, 20),
(4, 76, 162, 'Quito', 'Radenković', 'Turista', '2019-07-23', '12:05:00', 'Tame', 'G57', 'V76', 'A96', 29, 23),
(5, 64, 111, 'Quito', 'Maswa', 'Turista', '2019-06-19', '23:52:00', 'Tame', 'G87', 'V55', 'A99', 3, 11),
(6, 61, 152, 'Quito', 'Nagbacalan', 'Turista', '2019-06-28', '12:30:00', 'Tame', 'G16', 'V36', 'A43', 16, 16),
(7, 20, 456, 'Quito', 'Shigu', 'Turista', '2019-12-08', '19:55:00', 'Tame', 'G44', 'V69', 'A02', 29, 29),
(8, 63, 493, 'Quito', 'Concepción del Uruguay', 'Turista', '2019-12-30', '20:16:00', 'Tame', 'G19', 'V43', 'A33', 11, 29),
(9, 45, 350, 'Quito', 'Terentang', 'Turista', '2019-11-24', '22:21:00', 'Tame', 'G89', 'V50', 'A80', 23, 44),
(10, 39, 296, 'Quito', 'Wādī as Salqā', 'Turista', '2019-11-18', '18:12:00', 'Tame', 'G10', 'V18', 'A42', 4, 13),
(11, 24, 440, 'Quito', 'Puncakmanis', 'Turista', '2019-07-02', '22:26:00', 'Tame', 'G10', 'V75', 'A36', 8, 50),
(12, 85, 173, 'Quito', 'Dodu Dua', 'Turista', '2019-11-12', '15:19:00', 'Tame', 'G27', 'V02', 'A88', 28, 27),
(13, 69, 82, 'Quito', 'Donnycarney', 'Turista', '2019-09-17', '20:33:00', 'Tame', 'G01', 'V46', 'A29', 6, 33),
(14, 28, 270, 'Quito', 'Vostochnyy', 'Turista', '2019-12-27', '15:45:00', 'Tame', 'G56', 'V53', 'A25', 20, 26),
(15, 32, 175, 'Quito', 'Chhātak', 'Turista', '2019-11-07', '16:29:00', 'Tame', 'G06', 'V02', 'A69', 13, 33),
(16, 2, 188, 'Quito', 'Chaloem Phra Kiat', 'Turista', '2019-09-11', '16:26:00', 'Tame', 'G45', 'V58', 'A28', 4, 26),
(17, 91, 144, 'Quito', 'Ar Rujum', 'Turista', '2019-08-15', '12:59:00', 'Tame', 'G33', 'V04', 'A01', 3, 21),
(18, 95, 181, 'Quito', 'Hengpi', 'Turista', '2019-09-28', '14:19:00', 'Tame', 'G36', 'V81', 'A29', 23, 16),
(19, 83, 172, 'Quito', 'Yolöten', 'Turista', '2019-06-03', '23:21:00', 'Tame', 'G32', 'V79', 'A16', 16, 44),
(20, 66, 415, 'Quito', 'Gif-sur-Yvette', 'Turista', '2019-08-05', '13:30:00', 'Tame', 'G83', 'V48', 'A29', 25, 48),
(21, 61, 115, 'Quito', 'Tamaulipas', 'Turista', '2019-05-21', '17:58:00', 'Tame', 'G11', 'V95', 'A98', 17, 18),
(22, 94, 113, 'Quito', 'Kabare', 'Turista', '2019-09-25', '14:31:00', 'Tame', 'G55', 'V06', 'A49', 28, 15),
(23, 59, 444, 'Quito', 'Wentang', 'Turista', '2019-07-08', '16:15:00', 'Tame', 'G91', 'V02', 'A11', 3, 29),
(24, 47, 235, 'Quito', 'Teresa', 'Turista', '2019-08-08', '19:49:00', 'Tame', 'G85', 'V74', 'A71', 28, 16),
(25, 60, 451, 'Quito', 'Guadalupe', 'Turista', '2019-08-01', '12:30:00', 'Tame', 'G69', 'V07', 'A35', 6, 16),
(26, 62, 198, 'Quito', 'Thị Trấn Mường Khương', 'Turista', '2019-12-30', '12:42:00', 'Tame', 'G92', 'V87', 'A94', 14, 17),
(27, 52, 114, 'Quito', 'Mengzhai', 'Turista', '2019-11-08', '12:46:00', 'Tame', 'G69', 'V25', 'A56', 18, 22),
(28, 58, 266, 'Quito', 'Boksitogorsk', 'Turista', '2019-08-09', '13:03:00', 'Tame', 'G57', 'V64', 'A11', 5, 36),
(29, 47, 344, 'Quito', 'Banī Walīd', 'Turista', '2019-09-03', '17:53:00', 'Tame', 'G74', 'V17', 'A43', 7, 48),
(30, 2, 80, 'Quito', 'San Isidro', 'Turista', '2019-08-09', '21:20:00', 'Tame', 'G99', 'V33', 'A67', 15, 16),
(31, 51, 474, 'Quito', 'Oeleu', 'Turista', '2019-05-15', '17:31:00', 'Tame', 'G62', 'V29', 'A68', 12, 43),
(32, 37, 96, 'Quito', 'Somanda', 'Turista', '2019-12-23', '22:35:00', 'Tame', 'G99', 'V59', 'A71', 30, 12),
(33, 92, 56, 'Quito', 'Bābol', 'Turista', '2019-10-16', '15:29:00', 'Tame', 'G99', 'V74', 'A57', 8, 28),
(34, 60, 429, 'Quito', 'Bernal', 'Turista', '2019-09-19', '13:03:00', 'Tame', 'G05', 'V52', 'A97', 25, 33),
(35, 49, 51, 'Quito', 'Pil’na', 'Turista', '2019-09-16', '19:02:00', 'Tame', 'G98', 'V97', 'A10', 21, 50),
(36, 64, 291, 'Quito', 'Villanueva', 'Turista', '2019-06-27', '22:47:00', 'Tame', 'G83', 'V93', 'A13', 16, 10),
(37, 13, 267, 'Quito', 'Kagoro', 'Turista', '2019-08-10', '13:54:00', 'Tame', 'G86', 'V22', 'A88', 25, 25),
(38, 4, 374, 'Quito', 'Hậu Nghĩa', 'Turista', '2019-11-17', '18:34:00', 'Tame', 'G09', 'V98', 'A70', 4, 29),
(39, 91, 395, 'Quito', 'Belozërskoye', 'Turista', '2019-06-07', '23:55:00', 'Tame', 'G14', 'V58', 'A76', 28, 20),
(40, 24, 116, 'Quito', 'Az Ziyārah', 'Turista', '2019-09-06', '12:42:00', 'Tame', 'G96', 'V27', 'A46', 6, 47),
(41, 51, 56, 'Quito', 'Rennes', 'Turista', '2019-09-02', '22:39:00', 'Tame', 'G87', 'V35', 'A94', 15, 43),
(42, 89, 184, 'Quito', 'Telnice', 'Turista', '2019-06-19', '12:09:00', 'Tame', 'G22', 'V99', 'A52', 23, 40),
(43, 15, 457, 'Quito', 'Ust’-Kalmanka', 'Turista', '2019-11-05', '15:27:00', 'Tame', 'G36', 'V04', 'A98', 22, 21),
(44, 32, 114, 'Quito', 'Puncaksari', 'Turista', '2019-07-30', '16:00:00', 'Tame', 'G58', 'V67', 'A61', 9, 38),
(45, 2, 164, 'Quito', 'Kyzylorda', 'Turista', '2019-06-13', '16:55:00', 'Tame', 'G78', 'V22', 'A55', 16, 24),
(46, 37, 177, 'Quito', 'Vila Chã de Ourique', 'Turista', '2019-11-21', '17:21:00', 'Tame', 'G04', 'V75', 'A66', 29, 15),
(47, 35, 256, 'Quito', 'Atescatempa', 'Turista', '2019-12-15', '22:16:00', 'Tame', 'G86', 'V53', 'A01', 16, 12),
(48, 14, 182, 'Quito', 'Bergamo', 'Turista', '2019-05-22', '17:25:00', 'Tame', 'G28', 'V86', 'A97', 13, 24),
(49, 62, 313, 'Quito', 'Avelinha', 'Turista', '2019-05-30', '17:09:00', 'Tame', 'G92', 'V08', 'A91', 22, 14),
(50, 1, 483, 'Quito', 'Parumasan', 'Turista', '2019-07-19', '15:43:00', 'Tame', 'G29', 'V36', 'A19', 13, 16),
(51, 5, 377, 'Quito', 'Chahār Burj', 'Turista', '2019-06-10', '19:40:00', 'Tame', 'G73', 'V38', 'A35', 30, 49),
(52, 98, 220, 'Quito', 'Shouyan', 'Turista', '2019-11-27', '18:41:00', 'Tame', 'G43', 'V14', 'A64', 10, 37),
(53, 47, 379, 'Quito', 'El Dividive', 'Turista', '2019-05-27', '14:48:00', 'Tame', 'G63', 'V03', 'A44', 24, 43),
(54, 88, 365, 'Quito', 'Terek', 'Turista', '2019-06-07', '12:57:00', 'Tame', 'G65', 'V27', 'A79', 28, 26),
(55, 56, 147, 'Quito', 'Lucaya', 'Turista', '2019-11-26', '12:33:00', 'Tame', 'G60', 'V28', 'A59', 29, 45),
(56, 89, 343, 'Quito', 'San Sebastián', 'Turista', '2019-12-31', '20:17:00', 'Tame', 'G42', 'V01', 'A44', 2, 39),
(57, 28, 321, 'Quito', 'Lojigawaran', 'Turista', '2019-06-09', '14:20:00', 'Tame', 'G67', 'V50', 'A87', 23, 27),
(58, 45, 315, 'Quito', 'Rosetta', 'Turista', '2019-11-08', '22:36:00', 'Tame', 'G31', 'V28', 'A21', 20, 22),
(59, 29, 136, 'Quito', 'Pyšely', 'Turista', '2019-06-26', '21:50:00', 'Tame', 'G18', 'V42', 'A11', 25, 34),
(60, 99, 110, 'Quito', 'Beaconsfield', 'Turista', '2019-09-20', '20:08:00', 'Tame', 'G69', 'V41', 'A70', 20, 12),
(61, 90, 188, 'Quito', 'Harbin', 'Turista', '2019-09-12', '12:36:00', 'Tame', 'G79', 'V37', 'A69', 18, 47),
(62, 59, 82, 'Quito', 'Passo Fundo', 'Turista', '2019-07-04', '15:00:00', 'Tame', 'G76', 'V36', 'A18', 9, 43),
(63, 83, 143, 'Quito', 'Borås', 'Turista', '2019-11-11', '21:15:00', 'Tame', 'G74', 'V36', 'A41', 9, 39),
(64, 87, 472, 'Quito', 'Muang Sing', 'Turista', '2019-11-27', '21:45:00', 'Tame', 'G69', 'V31', 'A20', 22, 50),
(65, 20, 197, 'Quito', 'Panaytayon', 'Turista', '2019-11-16', '23:38:00', 'Tame', 'G00', 'V29', 'A96', 6, 25),
(66, 34, 81, 'Quito', 'Muliang', 'Turista', '2019-08-22', '13:15:00', 'Tame', 'G91', 'V07', 'A32', 12, 43),
(67, 80, 297, 'Quito', 'New York City', 'Turista', '2019-11-09', '21:21:00', 'Tame', 'G46', 'V13', 'A58', 28, 30),
(68, 37, 448, 'Quito', 'Fkih Ben Salah', 'Turista', '2019-10-20', '19:36:00', 'Tame', 'G69', 'V69', 'A76', 2, 34),
(69, 2, 163, 'Quito', 'Nouâdhibou', 'Turista', '2019-10-13', '17:25:00', 'Tame', 'G24', 'V38', 'A98', 13, 31),
(70, 84, 400, 'Quito', 'Santa Catarina Barahona', 'Turista', '2019-05-09', '12:50:00', 'Tame', 'G63', 'V63', 'A07', 4, 32),
(71, 22, 268, 'Quito', 'Shizuoka-shi', 'Turista', '2019-11-08', '14:34:00', 'Tame', 'G28', 'V38', 'A30', 14, 15),
(72, 40, 414, 'Quito', 'Takeo', 'Turista', '2019-10-20', '12:18:00', 'Tame', 'G95', 'V64', 'A87', 5, 18),
(73, 55, 262, 'Quito', 'Yiqi', 'Turista', '2019-09-20', '22:58:00', 'Tame', 'G93', 'V41', 'A42', 13, 16),
(74, 35, 463, 'Quito', 'Kalijeruk', 'Turista', '2019-08-03', '18:25:00', 'Tame', 'G47', 'V40', 'A60', 30, 21),
(75, 70, 335, 'Quito', 'Bridgewater', 'Turista', '2019-09-18', '16:07:00', 'Tame', 'G91', 'V80', 'A18', 28, 36),
(76, 25, 220, 'Quito', 'Ḩablah', 'Turista', '2019-12-11', '16:35:00', 'Tame', 'G38', 'V31', 'A62', 11, 50),
(77, 21, 141, 'Quito', 'Hadayang', 'Turista', '2019-10-30', '20:57:00', 'Tame', 'G75', 'V10', 'A10', 23, 33),
(78, 64, 378, 'Quito', 'Liulimiao', 'Turista', '2019-11-07', '18:24:00', 'Tame', 'G98', 'V64', 'A80', 16, 33),
(79, 60, 169, 'Quito', 'Shijing', 'Turista', '2019-11-17', '19:21:00', 'Tame', 'G86', 'V14', 'A66', 18, 36),
(80, 78, 347, 'Quito', 'Liushun', 'Turista', '2019-12-07', '23:00:00', 'Tame', 'G92', 'V36', 'A29', 17, 29),
(81, 33, 103, 'Quito', 'Qiaotou', 'Turista', '2019-09-02', '16:05:00', 'Tame', 'G91', 'V24', 'A94', 19, 24),
(82, 26, 318, 'Quito', 'Julun', 'Turista', '2019-07-25', '14:40:00', 'Tame', 'G62', 'V31', 'A34', 25, 28),
(83, 86, 225, 'Quito', 'Bakersfield', 'Turista', '2019-12-10', '22:02:00', 'Tame', 'G83', 'V16', 'A24', 29, 47),
(84, 43, 356, 'Quito', 'Marseille', 'Turista', '2019-08-31', '16:18:00', 'Tame', 'G66', 'V15', 'A75', 25, 37),
(85, 24, 405, 'Quito', 'Vaasa', 'Turista', '2019-12-28', '17:03:00', 'Tame', 'G69', 'V08', 'A33', 24, 46),
(86, 57, 51, 'Quito', 'Zhuanqiang', 'Turista', '2019-11-26', '21:09:00', 'Tame', 'G50', 'V04', 'A78', 18, 48),
(87, 13, 100, 'Quito', 'Xiaojing', 'Turista', '2019-06-04', '23:12:00', 'Tame', 'G11', 'V16', 'A21', 18, 15),
(88, 95, 278, 'Quito', 'Hendījān', 'Turista', '2019-05-30', '19:00:00', 'Tame', 'G95', 'V49', 'A70', 26, 32),
(89, 25, 117, 'Quito', 'Huaqiao', 'Turista', '2019-06-28', '12:45:00', 'Tame', 'G47', 'V26', 'A15', 28, 39),
(90, 91, 427, 'Quito', 'Zhangduangu', 'Turista', '2019-12-29', '20:37:00', 'Tame', 'G84', 'V92', 'A61', 18, 30),
(91, 47, 109, 'Quito', 'Aguasay', 'Turista', '2019-10-18', '22:49:00', 'Tame', 'G19', 'V58', 'A74', 12, 48),
(92, 49, 69, 'Quito', 'Paris 18', 'Turista', '2019-09-06', '23:10:00', 'Tame', 'G24', 'V35', 'A82', 23, 37),
(93, 6, 495, 'Quito', 'Bagnères-de-Bigorre', 'Turista', '2019-11-21', '18:15:00', 'Tame', 'G10', 'V08', 'A23', 1, 36),
(94, 64, 381, 'Quito', 'Oslo', 'Turista', '2019-05-13', '13:56:00', 'Tame', 'G31', 'V78', 'A78', 30, 37),
(95, 82, 432, 'Quito', 'Malasiqui', 'Turista', '2019-06-03', '18:13:00', 'Tame', 'G34', 'V19', 'A57', 9, 44),
(96, 70, 111, 'Quito', 'Jiufeng', 'Turista', '2019-10-30', '18:03:00', 'Tame', 'G50', 'V49', 'A33', 2, 36),
(97, 27, 131, 'Quito', 'Canhas', 'Turista', '2019-08-05', '16:19:00', 'Tame', 'G29', 'V38', 'A49', 3, 32),
(98, 22, 417, 'Quito', 'Jiebu', 'Turista', '2019-11-16', '13:11:00', 'Tame', 'G93', 'V53', 'A56', 20, 46),
(99, 45, 471, 'Quito', 'Urcos', 'Turista', '2019-06-09', '14:45:00', 'Tame', 'G80', 'V62', 'A49', 1, 11),
(100, 39, 223, 'Quito', 'Jiangnan', 'Turista', '2019-09-06', '15:55:00', 'Tame', 'G54', 'V70', 'A08', 27, 13);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `seller`
--
ALTER TABLE `seller`
  ADD PRIMARY KEY (`IDSELLER`);

--
-- Indices de la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`IDTICKET`),
  ADD KEY `FK_USERTICKET` (`IDSELLER`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `FK_USERTICKET` FOREIGN KEY (`IDSELLER`) REFERENCES `seller` (`IDSELLER`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
