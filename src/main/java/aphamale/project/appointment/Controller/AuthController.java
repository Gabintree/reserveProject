package aphamale.project.appointment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import aphamale.project.appointment.DTO.ResponseDto;
import aphamale.project.appointment.DTO.SignUpDto;
import aphamale.project.appointment.Service.AuthServeice;

import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class AuthController {

    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }

    @GetMapping("/api/todo")
    public String todoList() {
        return "Success";
    }

    @Autowired AuthServeice authServeice;
    @PostMapping("/api/signUp")
    public ResponseDto<?> signUp(@RequestBody SignUpDto requestBody) {
        ResponseDto<?> result = authServeice.signUp(requestBody);
        return result; 
    }
    
    
}