CREATE TABLE `sga`.`tornillo` (
  `ID_Tornillo` INT NOT NULL auto_increment,
  `Tamaño` DECIMAL(3,2) NULL,
  `Material` VARCHAR(20) NULL,
  `PrecioXpieza` DECIMAL(3,2) NULL,
  PRIMARY KEY (`ID_Tornillo`)
  ) auto_increment=100;
  
  CREATE TABLE `sga`.`clavo` (
  `ID_Clavo` INT NOT NULL auto_increment,
  `Tamaño` DECIMAL(3,2) NULL,
  `Material` VARCHAR(20) NULL,
  `PrecioXpieza` DECIMAL(3,2) NULL,
  PRIMARY KEY (`ID_Clavo`)
  ) auto_increment=200;
  
CREATE TABLE `sga`.`Inventario` (
  `ID_Articulo` INT NOT NULL,
  `Piezas` int NULL,
  `Tipo` enum('Tornillo','Clavo'),
  PRIMARY KEY (`ID_Articulo`),
  foreign key(ID_Articulo) references tornillo(ID_Tornillo) on delete cascade on update cascade,
  foreign key(ID_Articulo) references clavo(ID_Clavo) on delete cascade on update cascade
);

CREATE TABLE `sga`.`Cliente` (
  `ID_Cliente` INT NOT NULL auto_increment,
  `Nombre` varchar(30)NULL,
  `Direccion` varchar(50),
  PRIMARY KEY (`ID_Cliente`)
)auto_increment=50;

CREATE TABLE `sga`.`Empleado` (
  `ID_Empleado` INT NOT NULL auto_increment,
  `Nombre` varchar(30),
  `Paterno` varchar(50),
  `Materno` varchar(50),
  `Fecha_Nacimiento` date,
  PRIMARY KEY (`ID_Empleado`)
)auto_increment=100;

CREATE TABLE `sga`.`Cuenta` (
  `ID_Cuenta` INT NOT NULL auto_increment,
  `ID_Usuario` INT NOT NULL ,
  `Tipo` enum('Cliente','Empleado'),
  `Paswword` varchar(50),
  PRIMARY KEY (`ID_Empleado`),
  foreign key(ID_Usuario) references Empleado(ID_Empleado) on delete cascade on update cascade,
  foreign key(ID_Usuario) references Cliente(ID_Cliente) on delete cascade on update cascade
)auto_increment=500;

CREATE TABLE `sga`.`Venta` (
  `ID_Venta` INT NOT NULL auto_increment,
  `Cliente` int NOT NULL,
  `Articulo` INT NOT NULL ,
  `Piezas` INT NOT NULL,
  `Subtotal` varchar(50),
  `Fecha_Venta` date,
  PRIMARY KEY (`ID_Venta`),
  foreign key(Cliente) references Cliente(ID_Cliente) on delete cascade on update cascade,
  foreign key(Articulo) references Inventario(ID_Articulo) on delete cascade on update cascade
)auto_increment=40;

CREATE TABLE `sga`.`Entrega` (
  `ID_Entrega` INT NOT NULL auto_increment,
  `Venta` int NOT NULL,
  `Fecha_Entrega` date,
  PRIMARY KEY (`ID_Entrega`),
  foreign key(Venta) references Venta(ID_Venta) on delete cascade on update cascade
)auto_increment=40;


CREATE TABLE `sga`.`Acuse` (
  `ID_Acuse` INT NOT NULL auto_increment,
  `Entrega` int NOT NULL,
  `Fecha_Entrega` date,
  PRIMARY KEY (`ID_Acuse`),
  foreign key(Entrega) references Entrega(ID_Entrega) on delete cascade on update cascade
)auto_increment=50;






  
  
  
  
  #foreign key(ID_Persona) references Persona(ID_Persona) on delete cascade on update cascade