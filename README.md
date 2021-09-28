# Desafio Coodesh - Teste de Caixa Preta.

Neste desafio aplicaremos os conceitos de teste caixa preta, onde testaremos a página Beta da [Coodesh](https://beta.coodesh.com/) em vários aspectos como por exemplo:

- Se a home carrega corretamente;
- Se a página de vagas tem resultados;
- Se ao utilizar o buscar, obtemos o resultado esperado ou não;
- Se o botão candidatar nas vagas abrem o modal de candidatura;

##  Tecnologias Utilizadas

- BDD;
- Gherkin;
- Cucumber;
- Selenium WebDriver;
- JUnit;
- Java 11;

## Construção do Projeto (Cenários de Teste)

Nesse parte teremos que desenvolver um projeto para testar vários aspectos da página Beta da Coodesh:

- https://beta.coodesh.com/

- Testes para aplicar:

1- Se a página está carregando corretamente a home page;

2- Navegar pela página e ir ao sistema de vagas no menú superior;

3- Um vez na tela de vagas, nosso sistema de teste automatizado terá que buscar por uma empresa onde terá um ou mais resultados de vagas;

4- Depois obter o resultado, deveremos abrir a vaga e revisar se o carregamento é realizado com sucesso ou não;

5- Por último, precisamos saber se o sistema de candidatar está funcionando e para isso é necessário clicar no botão Candidatar-se e revisar se abriu o modal corretamente.
## Dependências utilizadas nos testes

| Plugin | Mais informações |
| ------ | ------ |
| Cucumber-java | [https://mvnrepository.com/artifact/io.cucumber/cucumber-java ]|
| Cucumber-junit | [https://mvnrepository.com/artifact/junit/junit] |
| Cucumber-core | [https://mvnrepository.com/artifact/io.cucumber/cucumber-core] |
| Selenium | [https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java]|
| Ashot | [https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot] |

## Execução do Projeto

- Clonar Repositório.
```bash
git clone https://github.com/GQUINHONERO/DesafioCoodesh.git
```
- Importar projeto Maven através da IDE;
- Mudar o padrão do texto para UTF-8;
- Rodar o projeto na classe "Execucao" (Teste JUnit) ou através do Cucumber;

OBS: Antes de executar o projeto, excluir a pasta "evidencias" para que novas evidências sejam geradas.
# Autor

Gustavo Quinhonero Santos

- Linkedin: 

https://www.linkedin.com/in/quinhonero-a23ab2178/
