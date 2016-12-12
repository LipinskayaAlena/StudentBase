package by.bsu.famcs.lipinskaya.services;

import by.bsu.famcs.lipinskaya.model.Person;
import by.bsu.famcs.lipinskaya.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service("userDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private StudentService studentService;

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Student student = studentService.readByEmail(email);
        if (student == null) {
            throw new UsernameNotFoundException("Can't find student with email: " + email);
        }

        Set<GrantedAuthority> authorities =  new HashSet<GrantedAuthority>();
        return new User(student.getEmail(), student.getPassword(), authorities);
    }
}
