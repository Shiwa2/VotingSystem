package Service;

import Model.Admin;


import java.util.List;

public interface AdminService {
    void SaveAdmin(Admin user);

    List<Admin> FindAll();
   Admin FindAdminById (Long id);
    void deleteAdminById(Long id);
}
