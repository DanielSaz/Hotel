CREATE TABLE Clientes(
    ID_Cliente INT AUTO_INCREMENT,
    DNI_Cliente VARCHAR(9) PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellidos VARCHAR(50),
    FechaInscrito DATE,
    Num_tlf INT(9), 
    Direccion VARCHAR(50),
    Email VARCHAR(100),
    Habitacion INT(20)

)