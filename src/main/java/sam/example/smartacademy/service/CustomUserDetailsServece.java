/*
package sam.example.smartacademy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sam.example.smartacademy.repo.UserRepository;
@Service
@RequiredArgsConstructor
public class CustomUserDetailsServece implements UserDetailsService {

    private final UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String phoneNumber) throws UsernameNotFoundException {
        User user=userRepository.findByPhoneNumber(phoneNumber)
                .orElseThrow(()->new UsernameNotFoundException("user not found with phone number "+phoneNumber))
                .return org.springframework




        return null;
    }


}
*/
