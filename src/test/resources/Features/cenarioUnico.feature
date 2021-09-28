#language: pt
#Autor: gustavosantos962@gmail.com - Desafio Coodesh
@executa
Funcionalidade: Acessar o site da Coodesh e validar suas funcionalidades.
  Como usuario desejo acessar o site da Coodesh e encontrar uma vaga que se encaixe no meu perfil.

  Cenario: o a home page da Coodesh.
    Dado que esteja no site da Coodesh "https://beta.coodesh.com/"
    Entao rolar a pagina ate o final e validar a frase "Coodesh"
    Quando clicar na opcao (ver vagas)
    Entao valido a palavra "Categoria:"
    E pesquisar pela empresa "VipCommerce"
    Entao valido o nome da empresa "VipCommerce (Magazine Luiza)"
    E clicar em umas das vagas
    Entao validar a frase "Resumo da Vaga"
    E clicar em candidata-se
    Entao validar a palavra "Candidatar-se"
