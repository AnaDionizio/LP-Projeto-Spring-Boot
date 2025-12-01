# LP-Projeto-Spring-Boot
organização dos arquivos:


   src\main\java
              ├── com\example\petcare
              │                 │
              │                 ├── PetCareApplication.java   ← classe main  
              │                 │
              │                 ├──controller/                      
              │                 |     ├── AdocaoController.java                     
              │                 |     ├── AnimalController.java                     
              │                 |     ├── ClienteController.java
              │                 |     ├── DoacaoController.java                     
              │                 |     └── ProdutoController.java
              │                 ├── model/                          
              │                 │     ├── animais/                   
              │                 │     │     ├── Animal.java                   
              │                 │     │     ├── Cachorro.java                     
              │                 │     │     └──  Gato.java                    
              │                 │     ├── Pessoas/                  
              │                 │     │     ├── Cliente.java 
              │                 │     │     ├── Pessoa.java                     
              │                 │     │     └──  Voluntario.java                    
              │                 │     ├── Produtos/          
              │                 │     │      ├── Produto.java                    
              │                 │     └── Transações/                   
              │                 │            ├── Adocao.java                     
              │                 │            └── Doacao.java
              │                 │     
              │                 ├── repostory/   
              │                 │      ├── AdocaoRepositoryArray.java
              │                 │      ├── AnimalRepositoryArray.java                
              │                 │      ├── ClienteRepositoryArray.java                   
              │                 │      ├── DoacaoRepositoryArray.java
              │                 │      └── ProdutoRepositoryArray.java                     
              │                 │         
              │                 └── Service/
              │                        ├── AdocaoService.java
              │                        ├── AnimalService.java
              │                        ├── ClienteService.java                                     
              │                        ├── DoacaoService.java
              │                        └── ProdutoService.java
              └──resources/
                        └── static/
                              ├── css/
                              │     └── style.css
                              ├── index.html
                              └── script.js
