package aphamale.project.appointment.Entity;

import java.sql.Date;

import aphamale.project.appointment.DTO.SignUpDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="tbl_todo")
public class TblTodoEntity {
    @Id
    private int tno;
    private int complete;
    private Date due_date;
    private String title;
    private String writer;
    
    
    
    public TblTodoEntity(SignUpDto dto){
        this.tno = dto.getTno();
        this.complete = dto.getComplete();
        this.due_date = dto.getDue_date();
        this.title = dto.getTitle();
        this.writer = dto.getWriter();        
    }

};