package bi.seke.userservice.service.impl;

import bi.seke.userservice.document.Address;
import bi.seke.userservice.repository.AddressRepository;
import bi.seke.userservice.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }
}

