-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3306
-- Время создания: Май 23 2022 г., 19:12
-- Версия сервера: 5.5.62
-- Версия PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `auto`
--

-- --------------------------------------------------------

--
-- Структура таблицы `auction`
--

CREATE TABLE `auction` (
  `id` bigint(20) NOT NULL,
  `lot_id` bigint(20) NOT NULL,
  `seller_id` bigint(20) NOT NULL,
  `buyer_id` bigint(20) NOT NULL,
  `first_price` decimal(10,0) NOT NULL,
  `price_buy` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `auction`
--

INSERT INTO `auction` (`id`, `lot_id`, `seller_id`, `buyer_id`, `first_price`, `price_buy`) VALUES
(1, 2, 5, 1, '500', '15000'),
(2, 3, 6, 2, '1000', '25000'),
(3, 1, 4, 3, '1500', '30000');

-- --------------------------------------------------------

--
-- Структура таблицы `buyer`
--

CREATE TABLE `buyer` (
  `id` bigint(20) NOT NULL,
  `login` varchar(30) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `buyer`
--

INSERT INTO `buyer` (`id`, `login`, `password`, `email`) VALUES
(1, 'user1', '$2a$10$I0BOCCDqRH6905RIlUmgd.2L008fmT3QvFtjEynyJQ2WoKDFRNGo6', 'email123@mail.ru'),
(2, 'user2', '$2b$10$I0BOCCDqRH6905RIlUmgd.2L008fmT3QvFtjEynyJQ2WoKDFRNGo6', 'email31@mail.ru'),
(3, 'user3', '$2a$10$I0BOCCDqRH6905RIlsmgd.2L008fmT3QvFtjEynyJQ2WoKDFRNGo6', 'email44@mail.ru');

-- --------------------------------------------------------

--
-- Структура таблицы `lot`
--

CREATE TABLE `lot` (
  `id` bigint(20) NOT NULL,
  `profile_id` bigint(20) NOT NULL,
  `car_brand` varchar(255) NOT NULL,
  `country` varchar(255) NOT NULL,
  `years_car` int(11) NOT NULL,
  `type_engine` varchar(255) NOT NULL,
  `type_of_gearbox` varchar(255) NOT NULL,
  `engine_volume` varchar(255) NOT NULL,
  `mileage` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `lot`
--

INSERT INTO `lot` (`id`, `profile_id`, `car_brand`, `country`, `years_car`, `type_engine`, `type_of_gearbox`, `engine_volume`, `mileage`) VALUES
(1, 8, 'Volvo', 'Russia', 2015, 'diesel', 'machine', '2000', 543000),
(2, 3, 'Audi', 'Belarus', 2010, 'petrol', 'mechanics', '2300', 20000),
(3, 2, 'Fiat', 'Ukraine', 1996, 'diesel', 'mechanics', '2100', 10000);

-- --------------------------------------------------------

--
-- Структура таблицы `profile`
--

CREATE TABLE `profile` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `passport` varchar(9) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `Phone_number` varchar(15) DEFAULT NULL,
  `Status` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `profile`
--

INSERT INTO `profile` (`id`, `name`, `surname`, `avatar`, `passport`, `address`, `Phone_number`, `Status`) VALUES
(1, 'Ivan', 'Ivanov', 'vk.com://photo_155', 'bm2323521', 'Vitebsk, st. Pravdy d.50 kv.53', '375295115621', 1),
(2, 'Ilya', 'Ivanov', 'vk.com://photo_251', 'bm2325731', 'Minsk, st. Pravdy d.50 kv.50', '375295189111', 1),
(3, 'Maksim', 'Samoveh', 'vk.com://photo_3215', 'bm2111231', 'Gomel, st. Pravdy d.50 kv.54', '375295134711', 1),
(4, 'Semen', 'Demidov', 'vk.com://photo_1455', 'bm2397131', 'Vitebsk, st. Pravdy d.50 kv.54', '375295111111', 0),
(5, 'Vladimir', 'Alekseev', 'vk.com://photo_2511', 'bm3619231', 'Mogilev, st. Pravdy d.51 kv.52', '375295518111', 0),
(6, 'Vitaliy', 'Ivanov', 'vk.com://photo_367215', 'bm2320231', 'Orsha, st. Pravdy d.54 kv.5', '375295171111', 0);

-- --------------------------------------------------------

--
-- Структура таблицы `seller`
--

CREATE TABLE `seller` (
  `id` bigint(20) NOT NULL,
  `login` varchar(30) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `seller`
--

INSERT INTO `seller` (`id`, `login`, `password`, `email`) VALUES
(4, 'vit21', '$2a$10$jrryFNptnoGWwyWhxc47eeeHpin/LPO545454545VcvJS', 'gil@mail.ru'),
(5, 'v222221', '$2a$10dssdasaddsadsasda4545VcvJSfdfsddfssdfsdfsdff', 'github@mail.ru'),
(6, 'vit21', '$2a$10$jrryFNptnosdfsdfdfsfsdsdffsdfsd5VcvJSffsdwwww', '548fff@mail.ru');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `buyer`
--
ALTER TABLE `buyer`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idbuyerkey` (`id`);

--
-- Индексы таблицы `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `seller`
--
ALTER TABLE `seller`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idsellserkey` (`id`);

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `buyer`
--
ALTER TABLE `buyer`
  ADD CONSTRAINT `idbuyerkey` FOREIGN KEY (`id`) REFERENCES `profile` (`id`);

--
-- Ограничения внешнего ключа таблицы `seller`
--
ALTER TABLE `seller`
  ADD CONSTRAINT `idsellserkey` FOREIGN KEY (`id`) REFERENCES `profile` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
