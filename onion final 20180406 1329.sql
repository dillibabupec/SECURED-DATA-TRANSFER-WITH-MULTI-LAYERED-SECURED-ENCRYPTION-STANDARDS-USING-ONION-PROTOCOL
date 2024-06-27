-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema netcom
--

CREATE DATABASE IF NOT EXISTS netcom;
USE netcom;

--
-- Definition of table `flowetn`
--

DROP TABLE IF EXISTS `flowetn`;
CREATE TABLE `flowetn` (
  `client5` varchar(50) default NULL,
  `client0` varchar(50) default NULL,
  `client7` decimal(10,0) default NULL,
  `client1` decimal(10,0) default NULL,
  `client9` decimal(10,0) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flowetn`
--

/*!40000 ALTER TABLE `flowetn` DISABLE KEYS */;
INSERT INTO `flowetn` (`client5`,`client0`,`client7`,`client1`,`client9`) VALUES 
 ('b','a>b','1','0','0');
/*!40000 ALTER TABLE `flowetn` ENABLE KEYS */;


--
-- Definition of table `jcointm`
--

DROP TABLE IF EXISTS `jcointm`;
CREATE TABLE `jcointm` (
  `clientj` varchar(50) default NULL,
  `clienty` varchar(50) default NULL,
  `clientm` int(11) default NULL,
  `clientx` varchar(50) default NULL,
  `cliento` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jcointm`
--

/*!40000 ALTER TABLE `jcointm` DISABLE KEYS */;
INSERT INTO `jcointm` (`clientj`,`clienty`,`clientm`,`clientx`,`cliento`) VALUES 
 ('b','a',1,'enable','123'),
 ('a','b',1,'enable','s24'),
 ('c','a',1,'enable','123'),
 ('a','c',1,'enable','s24'),
 ('d','a',1,'enable','123'),
 ('a','d',1,'enable','s24'),
 ('e','b',1,'enable','123'),
 ('b','e',1,'enable','123'),
 ('f','c',1,'disable','123'),
 ('c','f',1,'disable','123'),
 ('g','d',1,'disable','123'),
 ('d','g',1,'disable','123'),
 ('h','e',1,'disable','123'),
 ('e','h',1,'disable','123'),
 ('i','f',1,'disable','123'),
 ('f','i',1,'disable','123'),
 ('j','g',1,'disable','123'),
 ('g','j',1,'disable','123'),
 ('k','h',1,'disable','123'),
 ('h','k',1,'disable','123'),
 ('k','i',1,'disable','123'),
 ('i','k',1,'disable','123'),
 ('k','j',1,'disable','123'),
 ('j','k',1,'disable','123');
/*!40000 ALTER TABLE `jcointm` ENABLE KEYS */;


--
-- Definition of table `undetil`
--

DROP TABLE IF EXISTS `undetil`;
CREATE TABLE `undetil` (
  `xclient` varchar(50) default NULL,
  `yclient` varchar(50) default NULL,
  `mclient` varchar(50) default NULL,
  `fclient` varchar(50) default NULL,
  `wclient` varchar(50) default NULL,
  `dclient` varchar(50) default NULL,
  `oclient` varchar(50) default NULL,
  `xcol` varchar(50) default NULL,
  `ycol` varchar(50) default NULL,
  `mkey` varchar(50) default NULL,
  `skey` varchar(50) default NULL,
  `ekey` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undetil`
--

/*!40000 ALTER TABLE `undetil` DISABLE KEYS */;
INSERT INTO `undetil` (`xclient`,`yclient`,`mclient`,`fclient`,`wclient`,`dclient`,`oclient`,`xcol`,`ycol`,`mkey`,`skey`,`ekey`) VALUES 
 ('a','192.168.2.88','9001','enable','a','s24','10','1','Node','m43','s24','e290'),
 ('b','192.168.2.99','9002','enable','b','123','10','1','Node','m33','s135','e105'),
 ('c','192.168.2.99','0','disable','c','123','10','1','Node','m93','s32','e281'),
 ('d','192.168.2.99','0','disable','d','123','10','1','Node','m12','s8','e78'),
 ('e','192.168.2.99','0','disable','e','500','10','1','Node','m76','s144','e70'),
 ('f','192.168.2.99','0','disable','f','123','10','1','Node','m44','s119','e149'),
 ('g','192.168.2.99','0','disable','g','123','10','1','Node','m93','s32','e96'),
 ('h','192.168.2.99','0','disable','h','123','10','1','Node','m5','s23','e146'),
 ('i','192.168.2.99','0','disable','i','123','10','1','Node','m10','s147','e84'),
 ('j','192.168.2.99','0','disable','j','123','10','1','Node','m53','s199','e273'),
 ('k','192.168.2.99','0','disable','k','123','10','1','Node','m48','s64','e51');
/*!40000 ALTER TABLE `undetil` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
