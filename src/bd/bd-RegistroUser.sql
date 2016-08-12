-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 12-08-2016 a las 12:09:45
-- Versión del servidor: 5.0.51
-- Versión de PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `bd_RegistroUser`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `cargo`
-- 

CREATE TABLE `cargo` (
  `idcargo` int(11) NOT NULL auto_increment,
  `Rector` varchar(45) NOT NULL,
  `Dir.Escuela` varchar(45) NOT NULL,
  `Docente` varchar(45) NOT NULL,
  `Alumno` varchar(45) NOT NULL,
  `Emp.General` varchar(45) NOT NULL,
  PRIMARY KEY  (`idcargo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `cargo`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `persona`
-- 

CREATE TABLE `persona` (
  `idpersona` int(11) NOT NULL auto_increment,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Edad` int(2) NOT NULL,
  `NumCel` int(9) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  PRIMARY KEY  (`idpersona`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `persona`
-- 

