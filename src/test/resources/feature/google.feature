#language: pt
#Autor: gustavosantos962@gmail.com - Desafio Coodesh

Funcionalidade: Acessar o site da Coodesh e validar suas funcionalidades.
  Como usuario desejo acessar o site da Coodesh e encontrar uma vaga que se encaixe no meu perfil.


  Contexto: Acessar o a home page da Coodesh.
  Dado que esteja no site da Coodesh "https://beta.coodesh.com/"

  Cenario: Acessar a home page da Coodesh e validar se carrega corretamente.
  Entao rolar a pagina ate o final e validar a frase "Coodesh"

  
  Cenario: Navegar pela pagina e ir ao sistema de vagas ao menu superior
  Quando clicar na opcao (ver vagas)
  Entao valido a palavra "Categoria:" 
  
  Cenario: Um vez na tela de vagas buscar por uma empresa na tela de vagas
  Quando clicar na opcao (ver vagas)
  E pesquisar pela empresa "VipCommerce (Magazine Luiza)"
  Entao valido o nome da empresa "VipCommerce (Magazine Luiza)" 