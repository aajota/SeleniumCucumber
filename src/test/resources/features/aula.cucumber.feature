
@teste
Feature: Preencher formulario
  como usuário quero utilizar o cucumber para preencher um formulario


  Scenario: Acessar um site e preencher um formulario
    Given que estaja no formulario
    When preencher as informacoes 
    Then enviar o formulario

