package Service;

import Model.Admin;
import Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService  {
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public void SaveAdmin(Admin admin) {
adminRepository.save(admin);
    }

    @Override
    public List<Admin> FindAll() {
        return adminRepository.findAll();
    }

    @Override
    public Admin FindAdminById(Long id) {
        return adminRepository.getOne(id);
    }

    @Override
    public void deleteAdminById(Long id) {
adminRepository.deleteAll();
    }
}
