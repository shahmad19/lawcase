//package com.lawcase.app;
//
//import com.lawcase.app.repositories.UserRepository;
//import org.springframework.stereotype.Service;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    @Transactional(readOnly = true)
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//
//        Set < GrantedAuthority > grantedAuthorities = new HashSet < > ();
//        for (Role role: user.getRoles()) {
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
//    }
//}
