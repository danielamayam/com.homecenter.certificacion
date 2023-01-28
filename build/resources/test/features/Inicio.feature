#Author: Daniel Amaya Marin - Analista Móvil

@Inicio
Feature: Autenticación en Homecenter
  Como persona natural
  Quiero ingresar a homecenter
  Para comprar, consultar los productos de hogar


  Background: Inicio app
    Given Daniel abre la web Homecenter

  @Registro
  Scenario Outline: Nuevo registro en Homecenter
    When Diligencia el formulario de registro
      | nombre   | apellidos   | tipodocumento   | cedulaciudadania   | telefono   | contribuyente   | correoelectronico   | contrasena   | puntos   |
      | <nombre> | <apellidos> | <tipodocumento> | <Cédulaciudadanía> | <teléfono> | <contribuyente> | <correoelectrónico> | <contraseña> | <puntos> |
    Then válido el mensaje de:Tu cuenta fue creada con éxito

    Examples: Tabla Registro
      | nombre      | apellidos      | tipodocumento        | Cédulaciudadanía | teléfono   | contribuyente | correoelectrónico            | contraseña     | puntos |
      | Automations | Prueba Viernes | Cédula de Ciudadanía | 123456789        | 3000000000 | No Aplica     | juan-puerta20234@hotmail.com | Medellin123*** | true   |