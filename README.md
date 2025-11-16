# LP-Projeto-Spring-Boot
organização dos arquivos:


bemestaranimal\project\src\main\java
  ├── com\example\bemestaranimal
    │
    ├── BemEstaranimalApplication.java   ← classe main
    │
    ├──controller/                       ← endpoints REST
    |     ├── AdocaoController.java     
    |     ├── AgendamentoController.java
    |     ├── AnimalController.java
    |     ├── DoacaoController.java
    |     └── ProdutoController.java
    ├── entity/                          ← todas as entidades
    │     ├── Adocao.java
    │     ├── Agendamento.java
    │     ├── Animal.java
    │     ├── Doacao.java
    │     ├── Fornecedor.java
    │     ├── HistoricoClinico.java
    │     ├── MovimentoEstoque.java
    │     ├── Pessoa.java
    │     ├── Produto.java
    │     ├── Usuario.java
    │     ├── Voluntario.java
    │     │
    │     └── enums/                     ← todos os enums separados
    │           ├── ServicoAgendamento.java
    │           ├── Sexo.java
    │           ├── StatusAdocao.java
    │           ├── StatusAgendamento.java
    │           ├── StatusAnimal.java
    │           ├── TipoMovimento.java
    │           └── TipoPessoa.java
    │
    ├── repository/                      ← interfaces JPA
    │     ├── AdocaoRepository.java
    │     ├── AgendamentoRepository.java
    │     ├── AnimalRepository.java
    │     ├── DoacaoRepository.java 
    │     ├── FornecedorRepository.java
    │     ├── HistoricoClinicoRepository.java
    │     ├── MovimentoEstoqueRepository.java
    │     ├── PessoaRepository.java
    │     ├── ProdutoRepository.java
    │     └── VoluntarioRepository.java
    │
    ├── service/                         ← regra de negócio
    │     ├── AdocaoService.java 
    │     ├── AgendamentoService.java
    │     ├── AnimalService.java
    │     ├── DoacaoService.java
    │     └── EstoqueService.java
 
