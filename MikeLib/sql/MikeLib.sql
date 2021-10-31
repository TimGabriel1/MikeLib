-- -------------------------------------------------------------
-- TablePlus 3.12.2(358)
--
-- https://tableplus.com/
--
-- Database: MikeLib
-- Generation Time: 2021-10-31 09:50:54.0490
-- -------------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `bookTitle` varchar(200) NOT NULL,
  `authorName` varchar(200) DEFAULT NULL,
  `year` varchar(4) DEFAULT NULL,
  `isbn` varchar(200) DEFAULT NULL,
  `dateAdded` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;

CREATE TABLE `borrowed_book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `memberID` int NOT NULL,
  `bookID` int NOT NULL,
  `dateCollected` datetime DEFAULT NULL,
  `dateReturned` datetime DEFAULT NULL,
  `returned` tinyint(1) DEFAULT NULL,
  `issuedBy` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `book_id_idx` (`bookID`),
  KEY `member_id_idx` (`memberID`),
  KEY `issuedBy_idx` (`issuedBy`),
  CONSTRAINT `book_id` FOREIGN KEY (`bookID`) REFERENCES `book` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `issuedBy` FOREIGN KEY (`issuedBy`) REFERENCES `user` (`id`),
  CONSTRAINT `member_id` FOREIGN KEY (`memberID`) REFERENCES `member` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idNumber` varchar(50) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `phoneNumber` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `userName` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;

INSERT INTO `book` (`id`, `bookTitle`, `authorName`, `year`, `isbn`, `dateAdded`) VALUES
('1', 'Java How to Program', 'Mike Mike', '2020', '3212-2312-231-2312', '2021-10-31 08:39:09'),
('2', 'Java How to Program', 'Mike Mike', '2020', '3212-2312-231-2312', '2021-10-31 08:39:09'),
('3', 'Test book', 'test author', '3939', '3903923290323', '2021-10-31 08:39:09'),
('4', 'Test Book 2', 'Test author ', '2020', '2923023232323', '2021-10-31 08:39:09'),
('5', 'Python', 'python author', '3030', '2323-232-2323-232', '2021-10-31 08:39:09'),
('6', 'Test Book 3', 'Author 4', '2020', '121-2323-23232-2323', '2021-10-31 08:39:09'),
('7', 'New BOok', 'Mr Bean', '1999', '2323-232-3232-323-2323', '2021-10-31 08:38:53'),
('8', 'Boo5', 'Mr Timothy', '8383', '123454345432', '2021-10-31 08:39:56');

INSERT INTO `user` (`id`, `firstName`, `lastName`, `userName`, `password`) VALUES
('1', 'mike', 'mike', 'mike', 'mike');



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;