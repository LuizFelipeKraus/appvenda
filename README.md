# Projeto de Aplicativo de Vendas

## Informações do Aluno
- **Nome do Aluno:** Luiz Felipe Kraus
- **Curso:** Pós-graduação em Arquitetura de Software
- **Instituição:** Instituto Infnet


# Feature 01: Estabelecendo a Base do Sistema de Venda de Produtos

## Tarefas

1. **Criação das Classes de Domínio:**
   - Criar as classes de domínio conforme o diagrama previamente projetado.
   - Classes: `Vendedor`, `Produto`, `TipoProduto`, e `Loader`.

2. **Atributos das Classes de Domínio:**
   - Definir pelo menos dois atributos relevantes para cada classe.
   - Considere a possibilidade de adicionar novos atributos, se necessário.

3. **Relacionamentos entre as Classes:**
   - Implementar os relacionamentos entre as classes conforme especificado no diagrama.
   - Exemplo: Um Vendedor está associado a vários Produtos.

4. **Utilização dos Tipos de Dados Fundamentais:**
   - Utilizar os tipos de dados fundamentais (String, int, float/double, boolean) conforme necessário.

5. **Classes Loader:**
   - Criar classes Loader para leitura de arquivos textos e inicialização dos objetos.
   - Responsáveis por transformar dados de arquivos em instâncias das classes de domínio.

6. **Arquivos Textos:**
   - Criar arquivos textos com informações de cada classe (campos separados por `;`).
   - Servirão como fonte de dados para o sistema.

# Feature 02: Estabelecendo uma Infraestrutura Robusta de Banco de Dados

## Tarefas Essenciais

1. **Criação do Banco de Dados e Configuração do Datasource:**
   - Criar um banco de dados para armazenar e recuperar dados do sistema.
   - Configurar um datasource para permitir a comunicação com o banco.

2. **Mapeamento das Classes de Domínio em Entidades do Banco:**
   - Mapear as classes de domínio criadas na Feature 01 em entidades do banco de dados.
   - Definir como os atributos de cada classe correspondem às colunas do banco.

3. **Relacionamento One-to-Many entre as Entidades de Vendedor e Produto:**
   - Estabelecer um relacionamento "one-to-many" entre as entidades de "Vendedor" e "Produto".
   - Permitir que um vendedor esteja associado a vários produtos.

4. **Relacionamento de Herança entre a Classe de Produto e suas Filhas:**
   - Estabelecer um relacionamento de herança entre a classe "Produto" e suas subclasses.
   - Lidar com diferentes tipos de produtos de maneira eficiente.

5. **Criação das Interfaces @Repository:**
   - Criar interfaces anotadas com `@Repository` para as entidades do banco.
   - Estender a `CrudRepository` para proporcionar operações padrão de CRUD.

6. **Injeção de Dependência dos Repositories nas Classes de Serviço:**
   - Injetar os repositórios criados nas classes de serviço correspondentes.
   - Permitir que as classes de serviço acessem o banco de dados eficientemente.

7. **Desconsiderar a Estrutura Map após Injeção dos Repositories:**
   - Desconsiderar a estrutura de dados `Map` usada na Feature 01 após a injeção dos repositories.
   - Realizar operações de armazenamento e recuperação de dados diretamente no banco de dados.

8. **Atualizar as Classes Loader para Relacionar Produtos com Vendedores:**
   - Atualizar as classes Loader criadas na Feature 01 para preencher o banco de dados com dados relacionados.
   - Associar produtos cadastrados aos vendedores existentes de acordo com os relacionamentos definidos.

## Feature 03: Melhorando a Usabilidade e Validando Dados

### Objetivo

A terceira feature tem como objetivo melhorar a usabilidade da aplicação, permitindo que os usuários vejam os dados de forma organizada e compreensível. Além disso, foca na qualidade dos dados, validando e tratando exceções durante o processo. A integração com a API de CEP adiciona valor ao fornecer informações geográficas úteis para os registros dos vendedores. Certifique-se de que a interface do usuário seja amigável e intuitiva para os usuários finais.

### Principais Requisitos e Atividades

1. **Tela de Visualização de Dados:**
   - Criar uma interface de usuário utilizando tecnologias como JSP ou outra proposta de frontend para exibir os dados das quatro tabelas do banco de dados. Isso permitirá que os usuários visualizem os registros de forma amigável.

2. **Visualização da Quantidade de Registros:**
   - Implementar a funcionalidade para mostrar a quantidade de registros existentes em cada uma das quatro tabelas. Isso fornece uma visão geral do tamanho de cada conjunto de dados.

3. **Classe de Controle Única:**
   - Criar uma classe de controle única que atuará como um ponto central para a navegação na aplicação. Esta classe deve conter rotas para acessar a tela de visualização e outras quatro rotas para recuperar os dados de cada uma das tabelas.

4. **Validações de Dados:**
   - Implementar validações de dados para garantir a integridade e a qualidade dos dados inseridos. Use anotações como `@Size`, `@Pattern`, `@Positive`, `@PositiveOrZero`, `@NotNull`, `@Unique`, `@Default` e outras, conforme necessário, para validar os campos das tabelas.

5. **Tratamento de Exceções:**
   - Atualizar as classes de carga de dados (Loaders) para possibilitar o tratamento de exceções durante a inserção de registros no banco de dados. Isso ajuda a lidar com erros de forma adequada e manter a integridade dos dados.

6. **Classes de Controle para Exclusão:**
   - Criar classes de controle separadas para implementar rotas de exclusão de registros. Isso permitirá que os usuários removam dados das tabelas de maneira controlada.

7. **Classe para Representar o CEP do Vendedor:**
   - Criar uma classe dedicada para representar o CEP do vendedor. Essa classe deve conter os campos e métodos necessários para armazenar e manipular informações de CEP.

8. **Consumo da API de CEP:**
   - Integrar uma API de consulta de CEP para recuperar informações com base no número do CEP informado. Atualizar os dados obtidos da API no banco de dados, associando-os aos registros dos vendedores. Isso permitirá que os dados de CEP estejam disponíveis para visualização na tela.


# FEATURE 04

A quarta feature do projeto abrange melhorias significativas na interação com dados, organização e integração por meio do ajuste do processo de exclusão, ordenação mais flexível, busca unificada e a introdução de uma API para manipulação eficiente das informações.

Essa feature visa proporcionar uma experiência mais completa e eficiente aos usuários, permitindo uma interação mais avançada com os dados, organização personalizada e uma integração mais robusta entre o frontend e a API.

Certifique-se de realizar testes abrangentes para garantir a estabilidade e a eficácia das novas funcionalidades. Abaixo estão os principais requisitos e atividades a serem entregues nesta feature:

1. **Ajuste do Processo de Exclusão:**
   - Aprimore o processo de exclusão para evitar informações órfãs no relacionamento entre vendedores e produtos. Isso garante a consistência referencial no banco de dados, mantendo a integridade dos dados.

2. **Organização da Ordenação das Informações:**
   - Implemente uma funcionalidade que permita a organização personalizada das informações nos cadastros. Cada contexto, como vendedores, produtos, etc., deve ter seu critério de ordenação específico, proporcionando flexibilidade aos usuários.

3. **Busca Unificada:**
   - Integre uma funcionalidade de busca unificada que permita aos usuários procurar informações em todos os cadastros a partir da tela principal do projeto. Isso melhora a usabilidade e facilita o acesso rápido aos dados desejados.

4. **Criação de API para Cadastro de Informações:**
   - Desenvolva uma API para cadastrar informações no projeto. Os endpoints "incluir" e "excluir" devem ser criados, possibilitando a manipulação eficiente dos dados por meio dessa interface.

5. **Atualização do Projeto Web para Consumir a API:**
   - Faça as devidas atualizações no projeto web para integrar e consumir os novos endpoints da API. Certifique-se de que a comunicação entre o frontend e o backend seja eficaz e que as operações de inclusão e exclusão sejam refletidas corretamente na interface do usuário.

6. **Atualização da Tela Home para Apresentar Informações da API:**
   - Modifique a tela inicial (home) para apresentar as informações provenientes da API. Isso pode incluir a exibição de dados cadastrados, estatísticas ou qualquer outra informação relevante obtida por meio dos novos endpoints.

7. **Novos Endpoints na API:**
   - Expanda a API para incluir novos endpoints além do "obterLista". Implemente os endpoints "incluir" e "excluir" para permitir operações completas de CRUD (criação, leitura, atualização e exclusão) por meio da API.

8. **Atualização da API para Suportar Novos Endpoints:**
   - Atualize a API para garantir que ela esteja configurada corretamente e suporte os novos endpoints "incluir" e "excluir". Certifique-se de que a autenticação, validação e demais aspectos de segurança estejam adequadamente implementados.



# API SERVICE

A api se encontra no Repositorio https://github.com/LuizFelipeKraus/apivendas