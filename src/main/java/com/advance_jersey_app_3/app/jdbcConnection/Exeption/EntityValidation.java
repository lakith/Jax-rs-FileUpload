package com.advance_jersey_app_3.app.jdbcConnection.Exeption;

import com.advance_jersey_app_3.app.jdbcConnection.models.ErrorMessage;
import com.advance_jersey_app_3.app.jdbcConnection.models.ErrorMessages;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.ArrayList;

@Provider
public class EntityValidation implements ExceptionMapper<ConstraintViolationException> {


    @Override
    public Response toResponse(ConstraintViolationException exception) {
        ErrorMessages error = new ErrorMessages(prepareMessage(exception),500,"https://www.google.com");
        return Response.status(Response.Status.BAD_REQUEST)
                .type(MediaType.APPLICATION_JSON)
                .entity(error)
                .build();
    }

    private ArrayList<String> prepareMessage(ConstraintViolationException exception) {
        ArrayList<String> msg= new ArrayList<String>();

        for (ConstraintViolation<?> cv : exception.getConstraintViolations()) {
            msg.add(cv.getPropertyPath()+" "+cv.getMessage()+"\n");
            //msg+=cv.getPropertyPath()+" "+cv.getMessage()+"\n";
        }
        return msg;
    }
}
