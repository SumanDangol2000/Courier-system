
package co.system.Dao;

import co.system.bll.UserAndProduct;
import java.io.IOException;
import java.util.ArrayList;


public interface UserAndProductDao {
    
    //User Curd
    void addUser(UserAndProduct UAP) throws IOException;
    ArrayList<String> viewUser() throws IOException;
    //void view(String fileName) throws IOException;
    void updateUser(UserAndProduct UAP) throws IOException;
    void deleteUser(UserAndProduct UAP) throws IOException;

    //Product Curd
    void addProduct(UserAndProduct UAP, String fileName) throws IOException;
    ArrayList<String> viewPending() throws IOException;
    ArrayList<String> viewDelivery() throws IOException;
    void updateProduct(UserAndProduct UAP, String fileName) throws IOException;
    void deleteProduct(UserAndProduct UAP) throws IOException; 
     
}

