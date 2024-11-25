package guru.springframework.spring6restmvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Class CustomErrorController
 * <p>
 * Description: [Add class description here]
 * <p>
 * Created by Hasan on 2024-11-25.
 */
@ControllerAdvice
public class CustomErrorController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    ResponseEntity handleBindErrors(MethodArgumentNotValidException exception){
        return ResponseEntity.badRequest().body(exception.getBindingResult().getFieldErrors());
    }
}
