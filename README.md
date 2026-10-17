
# Lista de Exercícios 4

## Questão 1

### a) Verdadeiro
Os construtores não são herdados. No entanto, o construtor da superclasse é executado (chamado implícita ou explicitamente) durante a instanciação da subclasse para inicializar os atributos herdados.

### b) Falso
O relacionamento "tem um" representa a composição ou associação, em que uma classe possui uma referência para outra como atributo, e não a herança. A herança implementa o relacionamento "é um" (is-a).

### c) Falso
Quando um método é redefinido na subclasse com a mesma assinatura, chama-se sobrescrita (override). A sobrecarga (overload) ocorre quando criamos vários métodos com o mesmo nome, mas com assinaturas diferentes (parâmetros distintos), na mesma classe ou por meio da herança.

---

## Questão 2

### Acesso `private`
Oferece maior encapsulamento e segurança. Os dados ficam restritos à própria classe, exigindo o uso de métodos de acesso, como getters e setters, quando necessário pelas subclasses. Isso protege o estado interno contra modificações indevidas e facilita a manutenção, pois mudanças na implementação interna não afetam diretamente as subclasses.

### Acesso `protected`
Permite que os membros sejam acessados pelas subclasses e por classes do mesmo pacote. Embora reduza a necessidade de getters e setters na hierarquia e facilite o acesso interno, diminui o encapsulamento, pois expõe detalhes de implementação que poderiam permanecer ocultos. Isso torna o código mais acoplado e sujeito a efeitos colaterais caso a superclasse seja modificada.

---

## Questão 3

Quando uma subclasse é instanciada, o construtor da superclasse é executado antes do corpo do construtor da subclasse. Isso ocorre por meio da chamada `super()`, de forma implícita ou explícita, ou por uma sequência de chamadas `this()` que leva ao construtor da superclasse. Esse processo segue a hierarquia de classes, da mais genérica para a mais específica.

Essa chamada é obrigatória porque a superclasse precisa inicializar seus próprios atributos e garantir que seu estado interno seja construído corretamente antes que a subclasse execute sua inicialização. Sem isso, a parte herdada do objeto poderia ficar em um estado inconsistente ou não inicializado.
