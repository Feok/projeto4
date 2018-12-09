package fatec.poo.control;

import fatec.poo.model.Turma;
import fatec.poo.model.AVista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAVista {
    private Connection conn;
    
    public DaoAVista(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(AVista avista) {
        PreparedStatement ps = null;
        try {      
            ps = conn.prepareStatement("INSERT INTO TbAvista (valor_avista, agencia_avista, "
                    + "nCheque_avista, preData_avista, data_matricula, cpfAluno_matricula, siglaTurma_matricula)"
                    + "VALUES(?,?,?,?,?,?,?)");
            
            ps.setDouble(1, avista.getValor());
            ps.setInt(2, avista.getAgencia());
            ps.setInt(3, avista.getnCheque());
            ps.setString(4, avista.getPreData());
            ps.setString(5, avista.getMatricula().getData());
            ps.setString(6, avista.getMatricula().getAluno().getCpf());
            ps.setString(7, avista.getMatricula().getTurma().getSiglaTurma());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public AVista consultar(String dtMatricula, String cpf, Turma turma) {
        AVista v = null;
        PreparedStatement ps = null;
        try {      
            ps = conn.prepareStatement("SELECT * from TbAvista where " +
                                                 "data_matricula = ? and cpfAluno_matricula = ? and siglaTurma_matricula = ?");
            ps.setString(1, dtMatricula);
            ps.setString(2, cpf);
            ps.setString(3, turma.getSiglaTurma());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                v = new AVista();
                v.setMatricula(new DaoMatricula(conn).consultar(cpf, turma.getSiglaTurma(), turma.getCurso().getSigla()));
                v.setAgencia(rs.getInt("agencia_avista"));
                v.setPreData(rs.getString("preData_avista"));
                v.setValor(rs.getDouble("valor_avista"));
                v.setnCheque(rs.getInt("nCheque_avista"));
            }   
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
        return  v;
    }
    
    public void alterar(AVista avista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbAvista set agencia_avista = ?, nCheque_avista = ?, preData_avista = ? "
                                     + "where data_matricula = ? and cpfAluno_matricula = ? and siglaTurma_matricula = ?");
            
            ps.setInt(1, avista.getAgencia());
            ps.setDouble(2, avista.getnCheque());
            ps.setString(3, avista.getPreData());
            ps.setString(4, avista.getMatricula().getData());
            ps.setString(5, avista.getMatricula().getAluno().getCpf());
            ps.setString(6, avista.getMatricula().getTurma().getSiglaTurma());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(AVista avista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbAvista where data_matricula = ? and cpfAluno_matricula = ? and siglaTurma_matricula = ?");
            
            ps.setString(1, avista.getMatricula().getData());
            ps.setString(2, avista.getMatricula().getAluno().getCpf());
            ps.setString(3, avista.getMatricula().getTurma().getSiglaTurma());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}