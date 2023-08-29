package bi.seke.userservice.service;

import bi.seke.userservice.document.Principal;

import java.util.Optional;

public interface UserService {

    /**
     * Finds a user by uid or email
     *
     * @param identifier user uid or email
     * @return optional of {@link Principal}
     */

    Optional<Principal> getUser(String identifier);

}
