### Programação Orientada a Objetos em Java: uma abordagem simples para entendimento e aplicação no dia a dia.
------------
<p align="center">
  <img  src="https://i.imgur.com/7cTB4or.png">
</p>

# 📌 Sobre

Para compreender os paradigmas da linguagem orientada a objeto, desenvolvi uma aplicação de uma livraria, no qual utilizei os principais pilares da POO, com a OO nosso código fica organizado e evitamos repetição.
- Encapsulamento
- Herança
- Polimorfismo

# 📌 Instalação

- Instalação do  [Java SE Development Kit 13](https://www.oracle.com/java/technologies/javase-jdk13-downloads.html "Java SE Development Kit 13")
- IDE de sua preferência [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/ "IntelliJ IDEA"), [Eclipse](https://www.eclipse.org "Eclipse"), [NetBeans](https://netbeans.org "NetBeans") ou [Vsc](https://code.visualstudio.com "Vsc")
- Clone do repositório
`git clone https://github.com/anadeso/orientacaoaobjetos.git`

🔎 JDK (Java Development Kit) contém todo o ambiente para desenvolvermos e executarmos aplicações em Java, no qual possui uma cópia do JRE que pode ser distrbuído junto com sua aplicação em algum tipo de instalador, por exemplo, para que os clientes náo tenham que baixar/instalar o Java pessoalmente. 

🔎 JRE (Java Runtime Envirorment) é o ambiente de execução Java, no qual precisamos ter instalado para poder rodar um aplicativo Java.

Material de apoio: [Apêndice - Instalação do Java](https://www.caelum.com.br/apostila-java-orientacao-objetos/apendice-instalacao-do-java/ "Apêndice - Instalação do Java")

# 📌 Alguns conceitos importantes

- Classe x Objeto

Uma classe é o nosso molde, uma especificação que define o que um objeto desse tipo deverá ter e como ele deve se comportar(métodos). Vamos abstrair um pouco, nossa livraria poderá ter milhares de livros(objetos), mas existirá apenas uma classe Livro (molde). Cada objeto que criarmos do tipo Livro terá seus próprios valores, logo cada livro terá o seu próprio nome, sua descrição, um valor.

[![](https://i.imgur.com/9BqLo8V.png)](https://i.imgur.com/9BqLo8V.png)

- Método

São ações que uma classe tem, por exemplo, na nossa classe Livro existe um método de mostrar detalhes do livro como nome, descrição e valor. A classe Livro possui método que  no qual é void. Void representa a ausência de um retorno. Por exemplo, como saber se um livro tem ou não um autor? Um alternativa seria criar um método temAutor, tendo um boolean como retorno. 

    
    public class Livro {
    
      	/*
		  * Demais códigos
		  */
		  
        // Método retorno vazio (void)
        void mostraDetalhes() {
            
            System.out.println("Mostrando detalhes do livro");
            System.out.println("Nome: " + nome);
            System.out.println("Descricao: " + descricao);
            System.out.println("Valor: " + valor);
            System.out.println();
            
        }   


------------


    public class Livro {
	
          /*
          * Demais códigos
          */
		  
        // Método com retorno
        public boolean temAutor(){
            return this.autor != null;
        }
    }
------------

- Referência a objetos
Quando instanciamos um novo objeto com a palavra new, um Autor, guardamos em sua variável uma referência para esse objeto, e não seus valores. Ou seja, a variável autor não guarda o valor de um nome, email e outros atributos da classe Autor, mas sim uma forma de acessar esses atributos do autor em memória.

    public class CadastroLivro {
    
        public static void main(String[] args) {
    
            // Criando objeto Autor e automaticamente espaco na memoria
            Autor autorCriado = new Autor();
            autorCriado.setNome("Carlos Almeida");
            autorCriado.setEmail("carlos.almeida@autor.com.br");
            autorCriado.setCpf("123.456.789.10");
    
            Autor outroAutorCriado = new Autor();
            outroAutorCriado.setNome("Fernando Paulo");
            outroAutorCriado.setEmail("fernando.paulo@autor.com.br");
            outroAutorCriado.setCpf("321.533.005.33");
			...


   

[![](https://i.imgur.com/zmpjA99.png)](https://i.imgur.com/zmpjA99.png)


- Construtor
Toda classe tem um construtor e ele é iniciado quando criamos um objeto dessa classe, tem o mesmo nome da classe, não tem um retorno declarado. O construtor pode ser vazio ou com argumentos. Obs: O Construtor pode parecer um método, mas não é!


    public class Livro {
    
        // Atributos da classe
        private String nome;
        private String descricao;
        private double valor;
        private Autor autor;
    
        // Construtor
        public Livro() {
    
        }
        
         // Construtor
        public Livro(Autor autor) {
            this.autor = autor;
        }
    }

------------



    public class entendendoConstrutor(){
    
    		public static void main(String[] args) {
    
    				Autor autor = new Autor();
					
     				Livro livroSemArgumento = new Livro();
    				 Livro livroComArgumento = new Livro(autor);
   
    		}
    
    }


- Compisição
Perceba que na classe livro está falando informações do autor, vamos inserir os atributos do autor na própria classe livro? Não, pois isso não é de responsabilidade da classe livro, vamos criar uma classe Autor.


    public class Autor {
	
        private String nome;
        private String email;
        private String cpf;

Ta...mas como eu posso acessar as informações do Autor na minha classe Livro? Podemos adicionar na classe Livro um atributo do tipo Autor. Uma classe pode ter outra classe como atributo, e isso chamamos de composição.

    public class Livro {
    
        private String nome;
        private String descricao;
        private double valor;
        // Composicao, quando uma classe pode ter outra classe como atributo.
        private Autor autor;

Nome Ambíguos e o THIS
Metodo com retorno
Construtor




