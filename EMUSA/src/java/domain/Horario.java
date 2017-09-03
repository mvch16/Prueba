package domain;
// Generated 30-ago-2017 15:19:55 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Horario generated by hbm2java
 */
public class Horario  implements java.io.Serializable {


     private int idHorario;
     private String dia;
     private Date horaInicio;
     private Date horaFinal;
     private String lugar;
     private Integer aula;
     private Character estado;
     private Set<Cursos> cursoses = new HashSet<Cursos>(0);

    public Horario() {
    }

	
    public Horario(int idHorario) {
        this.idHorario = idHorario;
    }
    public Horario(int idHorario, String dia, Date horaInicio, Date horaFinal, String lugar, Integer aula, Character estado, Set<Cursos> cursoses) {
       this.idHorario = idHorario;
       this.dia = dia;
       this.horaInicio = horaInicio;
       this.horaFinal = horaFinal;
       this.lugar = lugar;
       this.aula = aula;
       this.estado = estado;
       this.cursoses = cursoses;
    }
   
    public int getIdHorario() {
        return this.idHorario;
    }
    
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
    public String getDia() {
        return this.dia;
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getHoraFinal() {
        return this.horaFinal;
    }
    
    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public Integer getAula() {
        return this.aula;
    }
    
    public void setAula(Integer aula) {
        this.aula = aula;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }
    public Set<Cursos> getCursoses() {
        return this.cursoses;
    }
    
    public void setCursoses(Set<Cursos> cursoses) {
        this.cursoses = cursoses;
    }




}


