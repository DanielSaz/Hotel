CREATE TABLE Clientes(
    ID_Cliente INT AUTO_INCREMENT,
    DNI_Cliente VARCHAR(9) PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellidos VARCHAR(50),
    FechaInscrito DATE,
    Num_tlf INT(9), 
    Direccion VARCHAR(50),
    Email VARCHAR(100),
    Habitacion INT(20),
    FOREIGN KEY (Habitacion) REFERENCES Habitaciones(Numero)

);

CREATE TABLE Empleados (
    ID_Empleado INT AUTO_INCREMENT,
    DNI_Empleado VARCHAR(9) PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellidos VARCHAR(50), 
    Num_tlf VARCHAR(15), 
    NumeroSS VARCHAR(12),
    CuentaBanco VARCHAR(24)
);

CREATE TABLE Garaje (
    ID_Vehiculo INT AUTO_INCREMENT,
    Matricula VARCHAR(7) PRIMARY KEY,  
    Habitacion INT(20),
    Cliente VARCHAR(9),
    FOREIGN KEY (Cliente) REFERENCES Clientes(DNI_Cliente),
    FOREIGN KEY (Habitacion) REFERENCES Habitaciones(Numero)

);

CREATE TABLE Habitaciones (
    Numero INT(20) PRIMARY KEY,
    Tipo VARCHAR(50),
    Capacidad INT(20),
    
    

);