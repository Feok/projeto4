package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import fatec.poo.model.Curso;
import fatec.poo.model.Matricula;

public class DaoMatricula {
    
    private Connection conn;
    
    public DaoMatricula(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Matricula matricula) {
        PreparedStatement ps = null;
        try {      
            ps = conn.prepareStatement("INSERT INTO TbMatricula (data_matricula, cpfAluno_matricula, siglaTurma_matricula)"
                    + "VALUES(?,?,?)");
            ps.setString(1, matricula.getData());
            ps.setString(2, matricula.getAluno().getCpf());
            ps.setString(3, matricula.getTurma().getSiglaTurma());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public Matricula consultar(String cpf, String siglaTurma, String siglaCurso) {
        
        Matricula m = null;
        Curso curso = null;
        curso = new DaoCurso(conn).consultar(siglaCurso);
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbMatricula where " +
                                                 "cpfAluno_matricula = ? and siglaTurma_matricula = ?");
            
            ps.setString(1, cpf);
            ps.setString(2, siglaTurma);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                m = new Matricula (rs.getString("data_matricula"));
                m.setTurma(new DaoTurma(conn).consultar(rs.getString("siglaTurma_matricula"), curso));
                m.setAluno(new DaoAluno(conn).consultar(rs.getString("cpfAluno_matricula")));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (m);
    }
    
    public void excluir(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbMatricula where cpfAluno_matricula = ? and siglaTurma_matricula = ?");
            
            ps.setString(1, matricula.getAluno().getCpf());
            ps.setString(2, matricula.getTurma().getSiglaTurma());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
