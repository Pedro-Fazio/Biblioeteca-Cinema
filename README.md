# Descrição do projeto
Usando meus conhecimentos de POO, foi projetado classes que constroem uma estrutura básica de uma biblioteca de vídeos. Essa biblioteca armazena dados de filmes criados pelo usuário, tanto quanto outras informações de agentes do filme, lembrando que apenas os dados serão guardados para simular que há um filme guardado para ser reproduzido, não há arquivos em vídeo a serem reproduzidos no projeto. Para isso, foram realizados as seguintes classes com suas funcionalidades específicas:
- Main
- Director
- Util
- Video
- Actor

Com essa biblioetca o usuário poderá criar novos filmes e adiciona-los a biblioetca, contendo os seus atores e diretores do filme e suas informações próprias, também como verificar informações sobre os filmes criados.

# Diagrama de Classe

O Diagrama de Classe abaixo representa a classe "Video" que é suportada pelas classes "Director" e "Actor", além de dois enum (enumeradores), que foram fornecidos pelo próprio projeto. Para esses enumeradores foi criado uma única classe chamada "Util" para armazenar as funcionalidades dos enumeradores.
![alt text](https://i.imgur.com/W9mE2y9.png)

# Funcionalidades

As funcionalidades que o projeto possibilita ao usuário são contempladas pelos seguintes tópicos:

● **Manipulação dos agentes**
- Criar um usuário com suas informações (nome, idade e nacionalidade)
- Criar um diretor com suas informações (nome, idade e nacionalidade)
- Criar quantos atores quiser com suas informações (nome, idade e nacionalidade)

● **Manipulação dos filmes**
- Adicionar filmes com sua data de criação, classificação indicativa, gênero e duração
- Simular que assistiu o filme e dar uma nota para o mesmo
- Verificar informações sobre o filme:
(1) Verificar informações sobre o(a) diretor(a) do filme
(2) Verificar nome do filme
(3) Verificar ID do filme
(4) Verificar duração do filme
(5) Verificar ano do filme
(6) Verificar número de visualizações do filme
(7) Verificar número de avaliações do filme
(8) Verificar média das avaliações do filme
(9) Verificar genero do filme
(10) Verificar classificação indicativa do filme
(11) Verificar informações sobre os atores

# Utilização da biblioetca de vídeos

A biblioteca conta com uma interface escrita no terminal que fornecerá opções para escolher ou dizer quando o usuário precisa escrever algum dado, desta forma será possível criar os dados do seu filme e verifica-los em seguida.

# Lembrete

 Apenas lembrando que, como o programa não possui backend, os dados criados para os filmes ficam armanezados nas variáveis em tempo de execução, ou seja, quando o programa terminar de rodar, os dados não ficarão salvos em lugar algum. O código também contém alguns bugs de execução pela falta de tratamento dos dados.

# Intuito do projeto

Parte do projeto foi realizado para a disciplina de POO no segundo ano de faculdade, e outra parte foi por hobby, pois reutilizei o código para fazer algo divertido que interagisse com o usuário, assim o possibilitando criar filmes e verificar seus dados através de uma interface no próprio terminal.