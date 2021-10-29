

DROP TABLE IF EXISTS Cita;

CREATE TABLE Cita (
  idCita IDENTITY NOT NULL PRIMARY KEY,
  idCliente int NOT NULL,
  idMascota int NOT NULL,
  fecha varchar(45) DEFAULT NULL,
  hora varchar(45) DEFAULT NULL,
  tipoServicio varchar(45) DEFAULT NULL

);

DROP TABLE IF EXISTS Cliente;
CREATE TABLE Cliente (
   idCliente IDENTITY NOT NULL PRIMARY KEY,
   nombre varchar(100) DEFAULT NULL,
   direccion varchar(100) DEFAULT NULL,
   telefono varchar(100) DEFAULT NULL
);

DROP TABLE IF EXISTS Inventario;
CREATE TABLE Inventario (
    idProducto IDENTITY NOT NULL PRIMARY KEY,
    nombre varchar(100) DEFAULT NULL,
    sustanciaActiva varchar(100) DEFAULT NULL,
    fechaCaducidad varchar(100) DEFAULT NULL
);

DROP TABLE IF EXISTS Mascota;
CREATE TABLE Mascota (
    idMascota IDENTITY NOT NULL PRIMARY KEY,
    idCliente int NOT NULL,
    tipo varchar(100) DEFAULT NULL,
    descripcion varchar(100) DEFAULT NULL,
    nombre varchar(100) DEFAULT NULL,
    fechaIngreso varchar(100) DEFAULT NULL,
    razonIngreso varchar(100) DEFAULT NULL
);



INSERT INTO Cita (idCita, idCliente, idMascota, fecha, hora, tipoServicio) VALUES (1,1,1,'27/10/2021','14:00','Estetica Canina');
INSERT INTO Cita (idCita, idCliente, idMascota, fecha, hora, tipoServicio) VALUES (2,2,2,'28/10/2021','14:00','Estetica Canina');
INSERT INTO Cliente(idCliente, nombre, direccion, telefono) VALUES (1,'Enrique Farrera', 'direccion 1','9612886511');
INSERT INTO Cliente(idCliente, nombre, direccion, telefono) VALUES (2,'Ana Kristal Caballero', 'direccion 2','9612881111');
INSERT INTO Inventario(idProducto, nombre, sustanciaActiva, fechaCaducidad) VALUES (1,'desparacitante','antimicotico','22/10/2025');
INSERT INTO Inventario(idProducto, nombre, sustanciaActiva, fechaCaducidad) VALUES (2,'Antibiotico','Ampicilina','22/10/2025');
INSERT INTO Mascota(idMascota, idCliente, tipo, descripcion, nombre, fechaIngreso, razonIngreso) values (1,1,'gato','blanco con manchas negras','manguitoblack','22/10/21','dolor estomacal');
INSERT INTO Mascota(idMascota, idCliente, tipo, descripcion, nombre, fechaIngreso, razonIngreso) values (2,2,'perro','blanco con manchas cafes','manchas','22/10/21','dolor estomacal');



