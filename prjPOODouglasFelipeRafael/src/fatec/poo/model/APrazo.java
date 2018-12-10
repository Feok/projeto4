package fatec.poo.model;

public class APrazo {
    private double valor;
    private String dtVencimento;
    private double taxaJuros;
    private int qtdeMensalidade;
    private Matricula matricula;

    public Matricula getMatricula() {
        return matricula;
    }

    public double getValor() {
        return valor;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public int getQtdeMensalidade() {
        return qtdeMensalidade;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    public void setDtVencimento(String DtVencimento) {
        this.dtVencimento = DtVencimento;
    }
   
    public void setTaxaJuros(double TaxaJuros) {
        this.taxaJuros = TaxaJuros;
    }
    
    public void setQtdeMensalidade(int QtdeMensalidade) {
        this.qtdeMensalidade = QtdeMensalidade;
    }    



}
