package by.bsu.famcs.lipinskaya.utils.handlers;

import by.bsu.famcs.lipinskaya.model.Student;
import by.bsu.famcs.lipinskaya.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private StudentService studentService;

    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        HttpSession session = httpServletRequest.getSession();
        User authPerson = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Student student = studentService.readByEmail(authPerson.getUsername());
        session.setAttribute("student", student);

        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        httpServletResponse.sendRedirect("/personal-cabinet");
    }
}
