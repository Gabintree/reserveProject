package aphamale.project.appointment.DTO;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDto {
    
    private int tno;
    private int complete;
    private Date due_date;
    private String title;
    private String writer;     
}
