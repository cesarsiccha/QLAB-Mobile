Feature: YouTube App
  @YT
  Scenario: Busqueda Simple YT
    Given estoy en la app de YouTube
    When busco el termino "peliculas"
    Then valido los resultados de la busqueda