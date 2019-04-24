-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-04-2019 a las 00:42:17
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
  `NAME` varchar(32) DEFAULT NULL,
  `LASTNAME` varchar(32) DEFAULT NULL,
  `ADDRESS` varchar(32) DEFAULT NULL,
  `TELEPHONE` char(10) DEFAULT NULL,
  `EMAIL` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `seller`
--

INSERT INTO `seller` (`IDSELLER`, `NAME`, `LASTNAME`, `ADDRESS`, `TELEPHONE`, `EMAIL`) VALUES
(1, 'Michel', 'Leyburn', '018 Graceland Circle', '0963255773', 'mleyburn0@alexa.com'),
(2, 'Eleni', 'Bendik', '49 Grayhawk Park', '0935768155', 'ebendik1@buzzfeed.com'),
(3, 'Layla', 'Mayall', '42 Superior Junction', '0945219724', 'lmayall2@thetimes.co.uk'),
(4, 'Alisha', 'Grimshaw', '5329 Schlimgen Circle', '0902475869', 'agrimshaw3@i2i.jp'),
(5, 'Keane', 'Chasmer', '613 Aberg Court', '0985334073', 'kchasmer4@hostgator.com'),
(6, 'Evyn', 'Cornick', '415 Dwight Way', '0956644377', 'ecornick5@tuttocitta.it'),
(7, 'Netta', 'Offell', '868 Prairie Rose Point', '0984406310', 'noffell6@sciencedaily.com'),
(8, 'Bertina', 'Borrel', '8077 Sunfield Crossing', '0967258043', 'bborrel7@dyndns.org'),
(9, 'Lisetta', 'Eastwood', '7 Cherokee Way', '0926452959', 'leastwood8@com.com'),
(10, 'Cob', 'Millhouse', '2 Packers Drive', '0996464020', 'cmillhouse9@hugedomains.com'),
(11, 'Nisse', 'Burk', '32232 Waxwing Court', '0940784974', 'nburka@elegantthemes.com'),
(12, 'Jean', 'Maydwell', '55711 Armistice Lane', '0980959124', 'jmaydwellb@people.com.cn'),
(13, 'Corrine', 'Schreiner', '3 Westend Junction', '0953905247', 'cschreinerc@hp.com'),
(14, 'Kimbell', 'Dunbleton', '250 Canary Trail', '0914616006', 'kdunbletond@loc.gov'),
(15, 'Barbaraanne', 'Grindlay', '91 Westerfield Lane', '0917340016', 'bgrindlaye@amazon.com'),
(16, 'Hartley', 'McGavin', '816 Corben Terrace', '0981677140', 'hmcgavinf@ehow.com'),
(17, 'Kristofer', 'Godehard.sf', '3074 Nova Court', '0920196091', 'kgodehardsfg@360.cn'),
(18, 'Levi', 'Upfold', '43476 Ridgeway Parkway', '0932345329', 'lupfoldh@wordpress.org'),
(19, 'Lucine', 'Hruska', '30872 Comanche Junction', '0939416667', 'lhruskai@joomla.org'),
(20, 'Shane', 'Foran', '7061 Coleman Crossing', '0929782830', 'sforanj@mediafire.com'),
(21, 'Phyllis', 'Hinstock', '471 Lyons Terrace', '0975998872', 'phinstockk@sakura.ne.jp'),
(22, 'Annemarie', 'Duberry', '067 Buena Vista Trail', '0970166609', 'aduberryl@lycos.com'),
(23, 'Donny', 'Cheshir', '64 Tomscot Place', '0986582197', 'dcheshirm@telegraph.co.uk'),
(24, 'Elnore', 'Mitrovic', '6 Thompson Crossing', '0960392745', 'emitrovicn@shutterfly.com'),
(25, 'Antin', 'Leavey', '4 Lien Center', '0932274467', 'aleaveyo@vinaora.com'),
(26, 'Elsie', 'Symper', '42095 6th Avenue', '0909660004', 'esymperp@weebly.com'),
(27, 'Willy', 'Manwell', '0117 Schiller Alley', '0958328241', 'wmanwellq@omniture.com'),
(28, 'Nona', 'Letson', '733 Atwood Point', '0925054892', 'nletsonr@phpbb.com'),
(29, 'Ber', 'Cushe', '70 Northwestern Pass', '0951706331', 'bcushes@soup.io'),
(30, 'Ned', 'Deem', '51354 1st Point', '0923578376', 'ndeemt@disqus.com'),
(31, 'Harv', 'Jerger', '4 Crescent Oaks Road', '0963461152', 'hjergeru@usnews.com'),
(32, 'Rosanna', 'Jales', '06701 Macpherson Center', '0902668478', 'rjalesv@newyorker.com'),
(33, 'Galina', 'Boycott', '30746 Nevada Parkway', '0920856875', 'gboycottw@va.gov'),
(34, 'Flora', 'Heams', '7 Mariners Cove Road', '0931481304', 'fheamsx@friendfeed.com'),
(35, 'Konrad', 'Aslott', '524 Shelley Circle', '0908992135', 'kaslotty@usgs.gov'),
(36, 'Marylou', 'Elderfield', '6162 Darwin Drive', '0935655025', 'melderfieldz@epa.gov'),
(37, 'Cherice', 'Abernethy', '36137 Walton Plaza', '0916697671', 'cabernethy10@cnet.com'),
(38, 'Evangeline', 'Baniard', '08 Kim Parkway', '0913802488', 'ebaniard11@arizona.edu'),
(39, 'Corny', 'Comusso', '275 Moose Circle', '0904911780', 'ccomusso12@sakura.ne.jp'),
(40, 'Marv', 'Coniff', '05112 Lakewood Gardens Terrace', '0937557902', 'mconiff13@qq.com'),
(41, 'Cindee', 'Pollack', '398 Elgar Court', '0904896815', 'cpollack14@epa.gov'),
(42, 'Scotti', 'Brooks', '2435 Cardinal Drive', '0992526945', 'sbrooks15@jalbum.net'),
(43, 'Thomasine', 'Timbridge', '07508 Kenwood Street', '0900183936', 'ttimbridge16@miitbeian.gov.cn'),
(44, 'Bail', 'Skullet', '57786 Quincy Point', '0923218683', 'bskullet17@youtube.com'),
(45, 'Revkah', 'Habbijam', '3 Gateway Alley', '0929954014', 'rhabbijam18@smh.com.au'),
(46, 'Ericha', 'Denys', '899 Orin Park', '0935479532', 'edenys19@home.pl'),
(47, 'Stanwood', 'Flemming', '3379 Saint Paul Court', '0912144765', 'sflemming1a@ebay.co.uk'),
(48, 'Vi', 'Laurenty', '67557 Clarendon Terrace', '0923441287', 'vlaurenty1b@nasa.gov'),
(49, 'Killian', 'Armell', '854 Karstens Pass', '0995727567', 'karmell1c@t.co'),
(50, 'Angelika', 'Robke', '2 Hoard Trail', '0956400597', 'arobke1d@vinaora.com'),
(51, 'Torrey', 'Keelinge', '311 Sundown Junction', '0981154324', 'tkeelinge1e@washingtonpost.com'),
(52, 'Vin', 'Avrahamof', '6 Leroy Road', '0901596752', 'vavrahamof1f@reddit.com'),
(53, 'Brandtr', 'Marder', '703 Emmet Place', '0942226914', 'bmarder1g@hexun.com'),
(54, 'Constantine', 'Agar', '58 Corben Pass', '0946180961', 'cagar1h@businessweek.com'),
(55, 'Christa', 'Tillot', '16 Pawling Avenue', '0959108608', 'ctillot1i@washington.edu'),
(56, 'Reagan', 'Bonnett', '05 Vahlen Crossing', '0941273979', 'rbonnett1j@technorati.com'),
(57, 'Loren', 'Fawcus', '2 Chive Street', '0946868478', 'lfawcus1k@netscape.com'),
(58, 'Betti', 'Bein', '981 Steensland Point', '0984492107', 'bbein1l@msn.com'),
(59, 'Albina', 'Fentem', '3 Oneill Park', '0983488405', 'afentem1m@woothemes.com'),
(60, 'Hephzibah', 'Gouth', '537 Summerview Trail', '0998607001', 'hgouth1n@godaddy.com'),
(61, 'Pryce', 'Mackness', '454 Bellgrove Avenue', '0964730947', 'pmackness1o@chron.com'),
(62, 'Shea', 'Baden', '62368 International Terrace', '0999309960', 'sbaden1p@paypal.com'),
(63, 'Tina', 'Wyldbore', '82 Rutledge Point', '0922625884', 'twyldbore1q@theatlantic.com'),
(64, 'Hally', 'Reedshaw', '65 Sheridan Court', '0969012512', 'hreedshaw1r@over-blog.com'),
(65, 'Carissa', 'Kenway', '2066 Arapahoe Center', '0963726806', 'ckenway1s@ehow.com'),
(66, 'Harper', 'Lorkins', '7 Clarendon Plaza', '0978404091', 'hlorkins1t@accuweather.com'),
(67, 'Rice', 'Swatton', '305 Transport Park', '0972325889', 'rswatton1u@sbwire.com'),
(68, 'Ilyssa', 'Van\'t Hoff', '94 Hoard Street', '0966886190', 'ivanthoff1v@examiner.com'),
(69, 'Helga', 'Halfacre', '1747 Heath Place', '0986902678', 'hhalfacre1w@elpais.com'),
(70, 'Rodge', 'Oxburgh', '544 Caliangt Road', '0935814938', 'roxburgh1x@microsoft.com'),
(71, 'Kay', 'Archbutt', '1 1st Pass', '0943437740', 'karchbutt1y@technorati.com'),
(72, 'Danica', 'Baysting', '6547 Merry Park', '0907787985', 'dbaysting1z@sourceforge.net'),
(73, 'Selestina', 'Fredson', '2 Norway Maple Pass', '0919554231', 'sfredson20@indiegogo.com'),
(74, 'Pieter', 'Romaint', '56 American Terrace', '0929463797', 'promaint21@drupal.org'),
(75, 'Nydia', 'Twatt', '396 Hanover Lane', '0951685225', 'ntwatt22@sbwire.com'),
(76, 'Darcie', 'Harrower', '26989 Aberg Lane', '0965356259', 'dharrower23@liveinternet.ru'),
(77, 'Jarrod', 'Heistermann', '3903 Atwood Drive', '0956533360', 'jheistermann24@privacy.gov.au'),
(78, 'Doria', 'Aizikovitz', '5 Emmet Pass', '0912853318', 'daizikovitz25@soup.io'),
(79, 'Em', 'Benham', '24992 Sycamore Plaza', '0951546741', 'ebenham26@omniture.com'),
(80, 'Lyn', 'Crease', '04 Amoth Way', '0969190911', 'lcrease27@adobe.com'),
(81, 'Claribel', 'Ludwell', '75141 Talmadge Hill', '0951932988', 'cludwell28@xing.com'),
(82, 'Jocelyn', 'Guyton', '36410 Melody Junction', '0903451466', 'jguyton29@cnbc.com'),
(83, 'Philip', 'Lionel', '52 Lakewood Gardens Road', '0938114758', 'plionel2a@topsy.com'),
(84, 'Herve', 'Roome', '9406 Petterle Place', '0912180681', 'hroome2b@bravesites.com'),
(85, 'Lyda', 'Ferenczy', '5 Jana Way', '0959452751', 'lferenczy2c@amazon.co.uk'),
(86, 'Rayshell', 'Gantzer', '02424 Buena Vista Park', '0917511925', 'rgantzer2d@cdc.gov'),
(87, 'Mace', 'Malling', '650 Stoughton Avenue', '0943074646', 'mmalling2e@instagram.com'),
(88, 'Alys', 'Palle', '1 Green Ridge Crossing', '0977765319', 'apalle2f@aol.com'),
(89, 'Pris', 'Searle', '691 Cottonwood Point', '0948654916', 'psearle2g@typepad.com'),
(90, 'Pat', 'Romand', '3307 Ohio Plaza', '0938300041', 'promand2h@devhub.com'),
(91, 'Vern', 'Vaugham', '1997 Kingsford Lane', '0954816414', 'vvaugham2i@opensource.org'),
(92, 'Shela', 'McKeon', '80473 4th Hill', '0936051404', 'smckeon2j@indiegogo.com'),
(93, 'Maurizia', 'Mobius', '39724 Nobel Plaza', '0915922149', 'mmobius2k@si.edu'),
(94, 'Agretha', 'Buckmaster', '63626 Mayfield Road', '0923785952', 'abuckmaster2l@amazon.co.uk'),
(95, 'Collie', 'O\'Lyhane', '332 Golf View Parkway', '0961039422', 'colyhane2m@bandcamp.com'),
(96, 'Angelia', 'Lamport', '614 Surrey Court', '0992128826', 'alamport2n@narod.ru'),
(97, 'Sophi', 'Khristoforov', '6699 Hoffman Pass', '0946887086', 'skhristoforov2o@ycombinator.com'),
(98, 'Keslie', 'Tibols', '533 Express Trail', '0984032793', 'ktibols2p@creativecommons.org'),
(99, 'Cob', 'Hallagan', '85 Kropf Plaza', '0941111096', 'challagan2q@time.com'),
(100, 'Henryetta', 'Medland', '366 International Place', '0961641887', 'hmedland2r@about.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE `ticket` (
  `IDTICKET` int(11) NOT NULL,
  `IDSELLER` int(11) NOT NULL,
  `PRICE` double DEFAULT NULL,
  `DEPARTURE` varchar(32) DEFAULT NULL,
  `ARRIVAL` varchar(32) DEFAULT NULL,
  `CLASS` varchar(32) DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `HOUR` time DEFAULT NULL,
  `AIRLINE` varchar(32) DEFAULT NULL,
  `GATE` varchar(32) DEFAULT NULL,
  `FLIGHTNUMBER` varchar(32) DEFAULT NULL,
  `SEAT` varchar(32) DEFAULT NULL,
  `STOCK` int(11) DEFAULT NULL,
  `DISCOUNT` int(11) DEFAULT NULL,
  `STATE` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`IDTICKET`, `IDSELLER`, `PRICE`, `DEPARTURE`, `ARRIVAL`, `CLASS`, `DATE`, `HOUR`, `AIRLINE`, `GATE`, `FLIGHTNUMBER`, `SEAT`, `STOCK`, `DISCOUNT`, `STATE`) VALUES
(1, 43, 523, 'Quito', 'Caromatan', 'Turista', '2019-02-06', '23:03:00', 'Tame', 'P99', 'B859', 'A68', 85, 1, 0),
(2, 63, 129, 'Quito', 'Ed', 'Turista', '2019-03-05', '20:42:00', 'Tame', 'P05', 'B232', 'A76', 96, 27, 1),
(3, 10, 506, 'Quito', 'Yamada', 'Turista', '2019-01-27', '14:10:00', 'Tame', 'P63', 'B680', 'A82', 42, 96, 0),
(4, 63, 603, 'Quito', 'Krasnyy Oktyabr’', 'Turista', '2018-09-25', '23:21:00', 'Tame', 'P80', 'B182', 'A79', 18, 9, 1),
(5, 70, 350, 'Quito', 'Zhujiang', 'Turista', '2019-04-02', '23:44:00', 'Tame', 'P33', 'B733', 'A60', 78, 27, 1),
(6, 9, 807, 'Quito', 'Jingzhuang', 'Turista', '2018-06-28', '22:19:00', 'Tame', 'P41', 'B256', 'A18', 10, 83, 0),
(7, 43, 933, 'Quito', 'Chelbasskaya', 'Turista', '2019-03-19', '20:17:00', 'Tame', 'P59', 'B457', 'A49', 77, 57, 1),
(8, 90, 811, 'Quito', 'Linglu', 'Turista', '2019-03-14', '14:57:00', 'Tame', 'P84', 'B030', 'A11', 4, 22, 0),
(9, 45, 770, 'Quito', 'Shengtang', 'Turista', '2019-01-14', '16:22:00', 'Tame', 'P09', 'B416', 'A71', 42, 97, 1),
(10, 39, 999, 'Quito', 'B?ng S?n', 'Turista', '2018-12-29', '19:33:00', 'Tame', 'P26', 'B926', 'A99', 18, 77, 1),
(11, 38, 789, 'Quito', 'Tiebiancheng', 'Turista', '2018-07-11', '22:53:00', 'Tame', 'P77', 'B490', 'A49', 83, 72, 1),
(12, 75, 121, 'Quito', 'Yashalta', 'Turista', '2018-09-13', '17:39:00', 'Tame', 'P66', 'B235', 'A55', 80, 18, 0),
(13, 42, 384, 'Quito', 'São Brás de Alportel', 'Turista', '2018-07-15', '23:34:00', 'Tame', 'P42', 'B064', 'A13', 90, 81, 0),
(14, 31, 122, 'Quito', 'Gorobinci', 'Turista', '2018-10-23', '21:33:00', 'Tame', 'P45', 'B835', 'A25', 9, 88, 1),
(15, 41, 901, 'Quito', 'Bethlehem', 'Turista', '2018-10-05', '23:32:00', 'Tame', 'P61', 'B871', 'A85', 89, 31, 0),
(16, 73, 807, 'Quito', 'Kastav', 'Turista', '2019-01-21', '20:58:00', 'Tame', 'P47', 'B835', 'A23', 74, 88, 1),
(17, 95, 138, 'Quito', 'Kamen’-na-Obi', 'Turista', '2018-05-30', '19:47:00', 'Tame', 'P89', 'B433', 'A24', 37, 59, 1),
(18, 64, 141, 'Quito', 'Petaling Jaya', 'Turista', '2018-11-12', '13:03:00', 'Tame', 'P28', 'B417', 'A08', 80, 64, 1),
(19, 78, 941, 'Quito', 'Chincha Baja', 'Turista', '2018-04-24', '23:03:00', 'Tame', 'P17', 'B141', 'A70', 15, 93, 1),
(20, 14, 827, 'Quito', 'Khorram?b?d', 'Turista', '2019-04-10', '18:39:00', 'Tame', 'P58', 'B142', 'A96', 2, 3, 1),
(21, 24, 613, 'Quito', 'Gaspar Hernández', 'Turista', '2018-05-07', '15:32:00', 'Tame', 'P17', 'B036', 'A17', 68, 44, 1),
(22, 30, 943, 'Quito', 'Stavropol’', 'Turista', '2018-09-22', '17:12:00', 'Tame', 'P77', 'B249', 'A10', 99, 1, 0),
(23, 6, 630, 'Quito', 'Stupsk', 'Turista', '2018-08-20', '21:37:00', 'Tame', 'P66', 'B868', 'A34', 7, 64, 1),
(24, 49, 730, 'Quito', 'Piojó', 'Turista', '2018-09-21', '23:36:00', 'Tame', 'P76', 'B917', 'A44', 4, 43, 1),
(25, 55, 348, 'Quito', 'Altos', 'Turista', '2019-04-09', '20:39:00', 'Tame', 'P71', 'B493', 'A16', 57, 34, 1),
(26, 66, 415, 'Quito', 'Sernur', 'Turista', '2018-12-27', '17:33:00', 'Tame', 'P73', 'B906', 'A98', 97, 27, 0),
(27, 58, 681, 'Quito', 'Sabae', 'Turista', '2019-02-12', '15:21:00', 'Tame', 'P75', 'B618', 'A33', 36, 10, 0),
(28, 83, 512, 'Quito', 'Puqi', 'Turista', '2018-05-26', '18:28:00', 'Tame', 'P99', 'B836', 'A43', 46, 3, 1),
(29, 64, 395, 'Quito', 'Fengjiang', 'Turista', '2018-06-07', '14:46:00', 'Tame', 'P08', 'B742', 'A26', 60, 3, 0),
(30, 76, 309, 'Quito', 'Chak Two Hundred Forty-Nine TDA', 'Turista', '2018-11-11', '16:02:00', 'Tame', 'P21', 'B247', 'A64', 72, 95, 1),
(31, 89, 838, 'Quito', 'Yijiang', 'Turista', '2019-04-04', '17:01:00', 'Tame', 'P95', 'B001', 'A15', 37, 21, 1),
(32, 68, 153, 'Quito', 'Carriedo', 'Turista', '2018-11-14', '23:03:00', 'Tame', 'P30', 'B365', 'A18', 66, 2, 1),
(33, 73, 347, 'Quito', 'Marseille', 'Turista', '2018-08-06', '13:27:00', 'Tame', 'P68', 'B289', 'A66', 56, 29, 1),
(34, 65, 732, 'Quito', 'Bissen', 'Turista', '2018-06-25', '16:37:00', 'Tame', 'P93', 'B087', 'A94', 77, 78, 0),
(35, 60, 689, 'Quito', 'Xiyuan', 'Turista', '2018-09-30', '17:19:00', 'Tame', 'P86', 'B307', 'A69', 11, 100, 0),
(36, 16, 302, 'Quito', 'Kroczyce', 'Turista', '2018-09-14', '18:14:00', 'Tame', 'P96', 'B284', 'A69', 87, 62, 0),
(37, 94, 947, 'Quito', 'Banatski Despotovac', 'Turista', '2019-04-16', '21:37:00', 'Tame', 'P96', 'B008', 'A00', 28, 40, 1),
(38, 39, 127, 'Quito', 'Sridadi', 'Turista', '2018-08-16', '13:27:00', 'Tame', 'P81', 'B314', 'A35', 27, 28, 0),
(39, 39, 456, 'Quito', 'Cupira', 'Turista', '2018-12-26', '22:38:00', 'Tame', 'P46', 'B471', 'A12', 67, 48, 0),
(40, 52, 203, 'Quito', 'Kokembang', 'Turista', '2018-12-19', '16:50:00', 'Tame', 'P92', 'B403', 'A73', 2, 18, 0),
(41, 24, 601, 'Quito', 'Patalan', 'Turista', '2018-09-10', '21:58:00', 'Tame', 'P79', 'B606', 'A44', 30, 55, 0),
(42, 5, 824, 'Quito', 'Xijiang', 'Turista', '2019-02-16', '17:20:00', 'Tame', 'P83', 'B438', 'A09', 5, 86, 0),
(43, 79, 724, 'Quito', 'Alejal', 'Turista', '2018-09-18', '17:26:00', 'Tame', 'P98', 'B521', 'A79', 90, 28, 0),
(44, 77, 266, 'Quito', 'Orosh', 'Turista', '2018-07-12', '17:11:00', 'Tame', 'P43', 'B664', 'A31', 42, 69, 1),
(45, 20, 997, 'Quito', 'Amman', 'Turista', '2018-12-01', '23:57:00', 'Tame', 'P41', 'B865', 'A92', 74, 100, 0),
(46, 77, 804, 'Quito', 'Primorsko-Akhtarsk', 'Turista', '2019-02-19', '16:34:00', 'Tame', 'P65', 'B371', 'A64', 91, 49, 0),
(47, 2, 568, 'Quito', 'Opatov', 'Turista', '2018-09-22', '23:43:00', 'Tame', 'P29', 'B488', 'A20', 82, 3, 0),
(48, 24, 886, 'Quito', 'Zhoujiang', 'Turista', '2018-08-10', '16:40:00', 'Tame', 'P56', 'B889', 'A05', 22, 31, 0),
(49, 2, 821, 'Quito', 'Bato', 'Turista', '2019-04-02', '18:56:00', 'Tame', 'P25', 'B048', 'A75', 99, 7, 1),
(50, 7, 691, 'Quito', 'Tengah', 'Turista', '2019-02-11', '16:09:00', 'Tame', 'P00', 'B004', 'A11', 80, 80, 0),
(51, 36, 262, 'Quito', 'Spas’ke', 'Turista', '2018-06-18', '20:28:00', 'Tame', 'P00', 'B525', 'A83', 33, 91, 1),
(52, 53, 433, 'Quito', 'Markaz-e Woluswal?-ye ?ch?n', 'Turista', '2018-09-26', '19:47:00', 'Tame', 'P04', 'B151', 'A02', 11, 98, 0),
(53, 96, 983, 'Quito', 'Inhambane', 'Turista', '2018-08-02', '23:10:00', 'Tame', 'P43', 'B068', 'A54', 53, 70, 1),
(54, 57, 951, 'Quito', 'Modot', 'Turista', '2019-04-22', '23:35:00', 'Tame', 'P74', 'B615', 'A89', 60, 39, 0),
(55, 85, 944, 'Quito', 'Flandes', 'Turista', '2019-02-07', '14:41:00', 'Tame', 'P89', 'B628', 'A26', 24, 100, 1),
(56, 34, 816, 'Quito', 'Bulihan', 'Turista', '2019-02-14', '14:16:00', 'Tame', 'P38', 'B931', 'A61', 98, 87, 0),
(57, 88, 891, 'Quito', 'Samho-rodongjagu', 'Turista', '2018-12-25', '21:37:00', 'Tame', 'P08', 'B433', 'A27', 48, 21, 0),
(58, 87, 205, 'Quito', 'Niemodlin', 'Turista', '2018-12-12', '21:30:00', 'Tame', 'P11', 'B505', 'A68', 31, 69, 0),
(59, 50, 175, 'Quito', 'Ningzhong', 'Turista', '2018-06-17', '16:51:00', 'Tame', 'P41', 'B138', 'A20', 14, 100, 0),
(60, 3, 321, 'Quito', 'Bungu', 'Turista', '2018-04-26', '23:16:00', 'Tame', 'P47', 'B596', 'A74', 8, 35, 0),
(61, 17, 692, 'Quito', 'Asímion', 'Turista', '2018-12-23', '15:02:00', 'Tame', 'P84', 'B389', 'A93', 12, 57, 0),
(62, 78, 921, 'Quito', 'Birmingham', 'Turista', '2018-12-28', '13:56:00', 'Tame', 'P58', 'B769', 'A44', 33, 35, 1),
(63, 30, 464, 'Quito', 'Londres', 'Turista', '2019-04-22', '23:56:00', 'Tame', 'P51', 'B431', 'A86', 43, 11, 1),
(64, 63, 890, 'Quito', 'Kondoa', 'Turista', '2018-04-28', '23:02:00', 'Tame', 'P44', 'B052', 'A00', 15, 55, 0),
(65, 25, 550, 'Quito', 'Paraíso de Chabasquén', 'Turista', '2018-12-06', '22:49:00', 'Tame', 'P34', 'B554', 'A84', 54, 62, 0),
(66, 63, 325, 'Quito', 'Ortigueira', 'Turista', '2019-01-01', '15:14:00', 'Tame', 'P06', 'B436', 'A24', 69, 45, 0),
(67, 59, 172, 'Quito', 'Cimongkor', 'Turista', '2019-02-08', '23:39:00', 'Tame', 'P75', 'B025', 'A12', 5, 49, 0),
(68, 56, 776, 'Quito', 'Krupka', 'Turista', '2019-02-06', '20:49:00', 'Tame', 'P58', 'B534', 'A30', 62, 78, 0),
(69, 21, 935, 'Quito', 'Kandah?r', 'Turista', '2018-11-17', '22:20:00', 'Tame', 'P97', 'B752', 'A75', 25, 60, 0),
(70, 49, 270, 'Quito', 'Guayaramerín', 'Turista', '2019-01-08', '14:45:00', 'Tame', 'P41', 'B715', 'A52', 8, 16, 0),
(71, 34, 298, 'Quito', 'Tournon-sur-Rhône', 'Turista', '2019-01-15', '18:10:00', 'Tame', 'P44', 'B120', 'A07', 12, 98, 0),
(72, 97, 285, 'Quito', 'Minle', 'Turista', '2019-02-10', '21:24:00', 'Tame', 'P90', 'B273', 'A29', 60, 15, 1),
(73, 62, 635, 'Quito', 'Th? Tr?n M??ng Tè', 'Turista', '2018-07-16', '13:53:00', 'Tame', 'P95', 'B826', 'A82', 35, 67, 0),
(74, 64, 588, 'Quito', 'Ramón Castilla', 'Turista', '2018-08-13', '23:25:00', 'Tame', 'P24', 'B536', 'A82', 5, 25, 0),
(75, 70, 134, 'Quito', 'Milán', 'Turista', '2018-06-26', '21:57:00', 'Tame', 'P93', 'B855', 'A10', 50, 56, 1),
(76, 30, 277, 'Quito', 'Brits', 'Turista', '2018-11-26', '21:17:00', 'Tame', 'P05', 'B647', 'A99', 78, 8, 1),
(77, 37, 307, 'Quito', 'Seydi', 'Turista', '2018-08-30', '20:19:00', 'Tame', 'P20', 'B828', 'A33', 67, 82, 1),
(78, 2, 222, 'Quito', 'Tampa', 'Turista', '2018-11-19', '14:01:00', 'Tame', 'P74', 'B705', 'A08', 29, 26, 1),
(79, 50, 204, 'Quito', 'Inriville', 'Turista', '2019-03-13', '20:34:00', 'Tame', 'P41', 'B561', 'A80', 14, 32, 0),
(80, 22, 924, 'Quito', 'Kuncen', 'Turista', '2018-07-29', '21:54:00', 'Tame', 'P60', 'B719', 'A84', 94, 8, 1),
(81, 38, 473, 'Quito', 'Belyye Berega', 'Turista', '2019-03-16', '14:20:00', 'Tame', 'P64', 'B492', 'A73', 10, 1, 1),
(82, 48, 220, 'Quito', 'Mingguang', 'Turista', '2018-11-15', '16:47:00', 'Tame', 'P17', 'B744', 'A63', 95, 92, 0),
(83, 95, 690, 'Quito', 'Fare', 'Turista', '2018-04-29', '23:11:00', 'Tame', 'P55', 'B527', 'A00', 9, 87, 1),
(84, 11, 362, 'Quito', 'Laocheng', 'Turista', '2018-11-05', '20:19:00', 'Tame', 'P09', 'B479', 'A65', 36, 18, 0),
(85, 12, 478, 'Quito', 'Providencia', 'Turista', '2018-12-31', '13:48:00', 'Tame', 'P55', 'B124', 'A15', 75, 65, 0),
(86, 25, 432, 'Quito', 'Nofoali‘i', 'Turista', '2018-09-08', '15:04:00', 'Tame', 'P76', 'B754', 'A39', 43, 33, 1),
(87, 69, 544, 'Quito', 'Anzhero-Sudzhensk', 'Turista', '2019-04-12', '13:13:00', 'Tame', 'P17', 'B739', 'A31', 69, 66, 1),
(88, 74, 495, 'Quito', 'Niterói', 'Turista', '2018-11-29', '17:21:00', 'Tame', 'P59', 'B245', 'A49', 41, 40, 1),
(89, 76, 698, 'Quito', 'Talu', 'Turista', '2019-01-06', '18:33:00', 'Tame', 'P00', 'B282', 'A05', 86, 87, 0),
(90, 28, 572, 'Quito', 'Semampirbarat', 'Turista', '2018-11-05', '16:14:00', 'Tame', 'P58', 'B166', 'A37', 66, 35, 0),
(91, 22, 361, 'Quito', 'Baishan', 'Turista', '2018-07-22', '22:44:00', 'Tame', 'P70', 'B881', 'A98', 30, 14, 0),
(92, 81, 547, 'Quito', 'Fukushima-shi', 'Turista', '2019-04-20', '23:15:00', 'Tame', 'P66', 'B311', 'A17', 30, 3, 0),
(93, 14, 187, 'Quito', 'Barg-e Mat?l', 'Turista', '2018-11-28', '14:57:00', 'Tame', 'P12', 'B638', 'A16', 15, 91, 1),
(94, 100, 275, 'Quito', 'Qiaotou', 'Turista', '2019-04-13', '22:01:00', 'Tame', 'P14', 'B792', 'A71', 73, 53, 0),
(95, 79, 210, 'Quito', 'Isulan', 'Turista', '2018-07-01', '20:48:00', 'Tame', 'P73', 'B935', 'A24', 88, 51, 0),
(96, 16, 979, 'Quito', 'Norton', 'Turista', '2019-04-22', '15:13:00', 'Tame', 'P85', 'B940', 'A10', 47, 84, 1),
(97, 9, 751, 'Quito', 'Yingtou', 'Turista', '2019-01-28', '23:50:00', 'Tame', 'P21', 'B621', 'A23', 53, 5, 0),
(98, 9, 771, 'Quito', 'Kolonowskie', 'Turista', '2019-02-15', '23:35:00', 'Tame', 'P86', 'B406', 'A30', 3, 71, 1),
(99, 68, 109, 'Quito', 'General Manuel J. Campos', 'Turista', '2018-08-10', '22:49:00', 'Tame', 'P19', 'B037', 'A51', 1, 1, 0),
(100, 70, 596, 'Quito', 'Viitasaari', 'Turista', '2018-05-05', '19:37:00', 'Tame', 'P53', 'B464', 'A33', 36, 52, 0);

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
