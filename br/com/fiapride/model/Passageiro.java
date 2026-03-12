package br.com.fiapride.model;

public class Passageiro {
    
    // Agora ninguém fora desta classe consegue mexer nisso diretamente!
    private String nome;
    private String cpf;
    private double saldo;
    
    // ... métodos anteriores (adicionarSaldo) continuam aqui
}

public Passageiro(String nome, String cpf) {
    this.setNome(nome);
    this.setCpf(cpf);
    this.setSaldo(0); // Todo mundo começa com zero!
}

// Método para PEGAR o saldo (Leitura)
public double getSaldo() {
    return this.saldo; // Apenas devolve o valor, não altera nada.
}

// Método para DEFINIR o saldo (Escrita com Regra de Negócio!)
private void setSaldo(double valor) {
    if (valor >= 0) {
        this.saldo = valor;
    } else {
        System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
    }
}

// Faça o mesmo para o nome (sem regras complexas por enquanto)
public String getNome() {
    return this.nome;
}

private void setNome(String nome) {
    this.nome = nome;
}

// Faça o mesmo para o cpf (sem regras complexas por enquanto)
public String getCpf() {
    return this.cpf;
}

private void setCpf(String cpf) {
    this.cpf = cpf;
}