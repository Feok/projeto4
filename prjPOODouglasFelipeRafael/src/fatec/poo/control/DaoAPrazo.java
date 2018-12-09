package fatec.poo.control;

import fatec.poo.model.APrazo;
import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAPrazo {
    private Connection conn;
    
    public DaoAPrazo(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(APrazo aprazo) {
        PreparedStatement ps = null;
        try {      
            ps = conn.prepareStatement("INSERT INTO tbAprazo (valor_aprazo, dtVencimento_aprazo, taxaJuros_aprazo, "
                    + "qtdeMensalidade_aprazo, data_matricula, cpfAluno_matricula, siglaTurma_matricula)"
                    + "VALUES(?,?,?,?,?,?,?)");
            
            ps.setDouble(1, aprazo.getValor());
            ps.setString(2, aprazo.getDtVencimento());
            ps.setDouble(3, aprazo.getTaxaJuros());
            ps.setInt(4, aprazo.getQtdeMensalidade());
            ps.setString(5, aprazo.getMatricula().getData());
            ps.setString(6, aprazo.getMatricula().getAluno().getCpf());
            ps.setString(7, aprazo.getMatricula().getTurma().getSiglaTurma());
                
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public APrazo consultar(String dtMatricula, String cpf, Turma turma) {
        APrazo p = null;
        PreparedStatement ps = null;
        try {      
            ps = conn.prepareStatement("SELECT * from tbAprazo where " +
                                                 "data_matricula = ? and cpfAluno_matricula = ? and siglaTurma_matricula = ?");
            ps.setString(1, dtMatricula);
            ps.setString(2, cpf);
            ps.setString(3, turma.getSiglaTurma());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                p = new APrazo();
                p.setMatricula(new DaoMatricula(conn).consultar(cpf, turma.getSiglaTurma(), turma.getCurso().getSigla()));
                p.setDtVencimento(rs.getString("dtVencimento_aprazo"));
                p.setQtdeMensalidade(rs.getInt("qtdeMensalidade_aprazo"));
                p.setTaxaJuros(rs.getDouble("taxaJuros_aprazo"));
                p.setValor(rs.getDouble("valor_aprazo"));
            }           
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
        return  p;
    }
    public void alterar(APrazo aprazo) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbAprazo set qtdeMensalidade_aprazo = ?, taxaJuros_aprazo = ?, dtVencimento_aprazo = ? "
                                     + "where data_matricula = ? and cpfAluno_matricula = ? and siglaTurma_matricula = ?");
            
            ps.setInt(1, aprazo.getQtdeMensalidade());
            ps.setDouble(2, aprazo.getTaxaJuros());
            ps.setString(3, aprazo.getDtVencimento());
            ps.setString(4, aprazo.getMatricula().getData());
            ps.setString(5, aprazo.getMatricula().getAluno().getCpf());
            ps.setString(6, aprazo.getMatricula().getTurma().getSiglaTurma());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(APrazo aprazo) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbAprazo where data_matricula = ? and cpfAluno_matricula = ? and siglaTurma_matricula = ?");
            
            ps.setString(1, aprazo.getMatricula().getData());
            ps.setString(2, aprazo.getMatricula().getAluno().getCpf());
            ps.setString(3, aprazo.getMatricula().getTurma().getSiglaTurma());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
