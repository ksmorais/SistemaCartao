<h1>Sistema de Cadastro de Funcionários</h1>
        <p>Este projeto implementa um sistema de cadastro de funcionários em Java, utilizando conceitos de Programação Orientada a Objetos (POO). O sistema permite adicionar, buscar e exibir informações dos funcionários da empresa MGS (Max Global Sports), que atua no ramo de representação de empresas que produzem artigos esportivos em todo o mundo.</p>

<h2>Funcionalidades</h2>
        <ul>
            <li><strong>Adicionar Funcionário</strong>: Permite adicionar um novo funcionário ao sistema, coletando informações como nome, identificador, alergias, problemas médicos, telefone e e-mail.</li>
            <li><strong>Buscar Funcionário</strong>: Permite buscar um funcionário pelo identificador e exibir suas informações.</li>
            <li><strong>Exibir Informações do Funcionário</strong>: Exibe as informações do funcionário em um formato legível.</li>
        </ul>

       
<h2>Estrutura do Projeto</h2>
        <p>O projeto é composto pelas seguintes classes:</p>
        <ul>
            <li><code>Funcionario</code>: Representa os dados de um funcionário.</li>
            <li><code>GerenciadorFuncionarios</code>: Gerencia a coleção de funcionários, permitindo adicionar e buscar funcionários.</li>
            <li><code>SistemaCartoes</code>: Interface do usuário que interage via terminal, permitindo adicionar e buscar funcionários.</li>
        </ul>
 <h2>Requisitos</h2>
        <ul>
            <li>Java 8 ou superior</li>
            <li>IDE para Java (opcional, mas recomendado)</li>
        </ul>

  <h2>Como Executar</h2>
        <ol>
            <li><strong>Clone o Repositório</strong>:
                <pre><code>git clone https://github.com/ksmorais/SistemaCartao</code></pre>
            </li>
            <li><strong>Compile as Classes</strong>:
                <p>Navegue até o diretório do projeto e compile as classes:</p>
                <pre><code>java Funcionario.java GerenciadorFuncionarios.java SistemaCartoes.java</code></pre>
            </li>
            <li><strong>Execute o Programa</strong>:
                <p>Execute a classe <code>SistemaCartoes</code>:</p>
                <pre><code>java SistemaCartoes</code></pre>
            </li>
        </ol>
<h2>Uso</h2>
        <h3>Menu Principal</h3>
        <p>Ao executar o programa, você verá o seguinte menu:</p>
        <pre><code>1. Adicionar Funcionário
2. Buscar Funcionário
3. Sair
Escolha uma opção: </code></pre>

   <h3>Adicionar Funcionário</h3>
        <p>Escolha a opção 1 para adicionar um novo funcionário. Você será solicitado a fornecer as seguintes informações:</p>
        <ul>
            <li>Nome</li>
            <li>Identificador</li>
            <li>Alergias</li>
            <li>Problemas Médicos</li>
            <li>Telefone</li>
            <li>Email</li>
        </ul>

  <h3>Buscar Funcionário</h3>
        <p>Escolha a opção 2 para buscar um funcionário pelo identificador. O sistema exibirá as informações do funcionário, se encontrado.</p>

  <h3>Sair</h3>
        <p>Escolha a opção 3 para sair do programa.</p>

  <h2>Exemplo de Uso</h2>
  <h3>Adicionar um Funcionário</h3>
  <pre><code>Escolha uma opção: 1
Nome: Karen
Identificador: 2541
Alergias: Nenhuma
Problemas Médicos: Hipertensão
Telefone: (11) 99999-9999
Email: karen.ksmorais@gmail.com
Funcionário adicionado com sucesso!</code></pre>

  <h3>Buscar um Funcionário</h3>
  <pre><code>Escolha uma opção: 2
Identificador do Funcionário: 2541
Informações do Funcionário:
Nome: Karen
Identificador: 2541
Alergias: Nenhuma
Problemas Médicos: Hipertensão
Telefone: (11) 99999-9999
Email: karen.ksmorais@gmail.com</code></pre>

  <h2>Contribuição</h2>
        <p>Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorar o projeto.</p>

   <h2>Licença</h2>
        <p>Este projeto está licenciado sob a licença MIT - veja o arquivo <code>LICENSE</code> para mais detalhes.</p>

  <h2>Autor</h2>
        <p><a href="https://github.com/ksmorais">Karen Morais</a></p>
    </div>
