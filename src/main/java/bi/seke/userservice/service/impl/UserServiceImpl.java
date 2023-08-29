package bi.seke.userservice.service.impl;

import bi.seke.userservice.document.Principal;
import bi.seke.userservice.repository.PrincipleRepository;
import bi.seke.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service("userService")
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    protected PrincipleRepository principleRepository;

    @Override
    public Optional<Principal> getUser(String identifier) {
        try {
            UUID uuid = UUID.fromString(identifier);
            return principleRepository.findByUidOrEmail(uuid, identifier);
        } catch (IllegalArgumentException e) {
            return principleRepository.findByUidOrEmail(null, identifier);
        }
    }
}
