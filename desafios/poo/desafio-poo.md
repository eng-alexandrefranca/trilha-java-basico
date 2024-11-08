Markdown
## Analisando o Desafio e Propondo uma Solução

### Entendendo o Problema

O desafio consiste em:

1. **Analisar o vídeo de lançamento do iPhone 2007:** Identificar as funcionalidades principais de um iPhone, como reprodutor musical, telefone e navegador.
2. **Modelar em UML:** Criar um diagrama de classes que represente as classes e interfaces envolvidas nas funcionalidades identificadas.
3. **Implementar em Java:** Criar as classes e interfaces em Java de acordo com o diagrama UML.

### Proposta de Solução

**1. Diagrama UML (Mermaid):**

```mermaid
classDiagram
    class iPhone {
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }
