package aphamale.project.appointment.Service;

import java.sql.Date;

import org.springframework.stereotype.Service;

import aphamale.project.appointment.DTO.ResponseDto;
import aphamale.project.appointment.DTO.SignUpDto;
import aphamale.project.appointment.Entity.TblTodoEntity;
import aphamale.project.appointment.Repository.TblTodoRepository;

@Service
public class AuthServeice {

    TblTodoRepository tblTodoRepository;

    public ResponseDto<?> signUp(SignUpDto dto){
        int tno = dto.getTno();
        int complete = dto.getComplete();
        Date due_date = dto.getDue_date();
        String title = dto.getTitle();
        String writer = dto.getWriter();   
      
        // 숫자 -> 문자 변환
        String convertTno = Integer.toString(tno);

        try{   
            if (tblTodoRepository.existsById(convertTno)) {
                return ResponseDto.setFailed("중복된 tno입니다.");
            }
        }catch(Exception e){
            return ResponseDto.setFailed("데이터베이스 연결에 실패하였습니다.");
        }

        // 엔터티 생성
        TblTodoEntity tblTodoEntity = new TblTodoEntity(dto);   

        try{
            // db에 저장
            tblTodoRepository.save(tblTodoEntity);
        }catch(Exception e){
            return ResponseDto.setFailed("데이터베이스 연결에 실패하였습니다.");
        }


        return ResponseDto.setSuccess("데이터 생성에 성공했습니다.");

    }

    
}
