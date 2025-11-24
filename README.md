# LP-Projeto-Spring-Boot
organização dos arquivos:


bemestaranimal\project\src\main\java
 ├── com\example\bemestaranimal
    │
    ├── BemEstaranimalApplication.java   ← classe main  ok
    │
    ├──controller/                       ← endpoints REST
    |     ├── AdocaoController.java                     ok
    |     ├── AgendamentoController.java
    |     ├── AnimalController.java                     ok
    |     ├── DoacaoController.java
    |     ├── PessoaController.java                     ok
    |     └── ProdutoController.java
    ├── dto/
    |     ├── AdocaoDTO                     ok
    |     ├── AnimalDTO                     ok
    ├── entity/                          ← todas as entidades
    │     ├── Adocao.java                     ok
    │     ├── Agendamento.java                   
    │     ├── Animal.java                     ok
    │     ├── Doacao.java                    
    │     ├── Fornecedor.java                    
    │     ├── HistoricoClinico.java                    
    │     ├── MovimentoEstoque.java                     
    │     ├── Pessoa.java                     ok
    │     ├── Produto.java                     
    │     ├── Usuario.java
    │     ├── Voluntario.java
    │     │
    │     └── enums/                     ← todos os enums separados
    │           ├── ServicoAgendamento.java
    │           ├── Sexo.java
    │           ├── StatusAdocao.java                     ok
    │           ├── StatusAgendamento.java
    │           ├── StatusAnimal.java                     ok
    │           ├── TipoMovimento.java
    │           └── TipoPessoa.java                     ok
    │
    ├── repository/                      ← interfaces JPA
    │     ├── AdocaoRepository.java                     ok
    │     ├── AgendamentoRepository.java
    │     ├── AnimalRepository.java                     ok
    │     ├── DoacaoRepository.java 
    │     ├── FornecedorRepository.java
    │     ├── HistoricoClinicoRepository.java
    │     ├── MovimentoEstoqueRepository.java
    │     ├── PessoaRepository.java                     
    │     ├── ProdutoRepository.java
    │     └── VoluntarioRepository.java
    │
    └── service/                         ← regra de negócio
          ├── AdocaoService.java                      ok
          ├── AgendamentoService.java
          ├── AnimalService.java                     ok
          ├── DoacaoService.java
          ├── EstoqueService.java
          ├──PessoaService.java                     
          └── impl
              ├── AnimalServiceImpl                      ok
              └── EstoqueServiceImpl

               
