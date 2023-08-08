package bi.seke.userservice.service;

import bi.seke.userservice.document.Address;
import bi.seke.userservice.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressServiceImpl  implements AddressService{
  private final AddressRepository addressRepository;
  public List<Address> getAllAddresses(){
    return addressRepository.findAll();
  }
}

