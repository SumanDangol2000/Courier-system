package co.system.Dao;

import co.system.bll.UserAndProduct;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class UserAndProductDaoImpl implements UserAndProductDao {
    
    
    //Adding User information
    @Override
    public void addUser(UserAndProduct UAP) throws IOException {
        
        
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("src\\File_collection\\userInformation.txt",true));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("src\\File_collection\\LoginCredentials.txt",true));

           //Data is wrritng into the file
           bw1.write(UAP.getUserId()+","+UAP.getUserName()+","+UAP.getEmail()+","+UAP.getPhone()
                   +","+UAP.getPassword()+","+UAP.getPosition()+","+UAP.getGender());
           bw1.flush();
           bw1.newLine();
       
       
       bw2.write(UAP.getUserId()+","+UAP.getPosition()+","+UAP.getUserName()+","+UAP.getPassword()
               +","+UAP.getGender());
       bw2.flush();
       bw2.newLine();
       
       bw1.close();
       bw2.close();  //File is closed
        
    }

    //Retrieving User information
    @Override
    public ArrayList<String> viewUser() throws IOException {
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("src\\File_collection\\userInformation.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
      }
        return fileData;
    }
        
    //Updating User information
    @Override
    public void updateUser(UserAndProduct UAP) throws IOException {
        File file1 = new File("src\\File_collection\\userInformation.txt");
        File tempFile1 = new File("src\\File_collection\\temp_userInformation.txt");

        File file2 = new File("src\\File_collection\\LoginCredentials.txt");
        File tempFile2 = new File("src\\File_collection\\temp_LoginCredentials.txt");

        BufferedWriter bw1 = new BufferedWriter(new FileWriter(tempFile1));
        BufferedReader br1 = new BufferedReader( new FileReader(file1));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(tempFile2));
        BufferedReader br2 = new BufferedReader( new FileReader(file2));
            
            String userRecord1,userRecord2;
            while((userRecord1 = br1.readLine()) != null){
                if(userRecord1.contains(Integer.toString(UAP.getUserId()))){
                    bw1.write(UAP.getUserId()+","+UAP.getUserName()+","+UAP.getEmail()+","+UAP.getPhone()
                   +","+UAP.getPassword()+","+UAP.getPosition()+","+UAP.getGender());
                }else{
                    bw1.write(userRecord1);
                }
                bw1.flush();
                bw1.newLine();
            }   
            while((userRecord2 = br2.readLine()) != null){
                if(userRecord1.contains(Integer.toString(UAP.getUserId()))){
                    bw2.write(UAP.getUserId()+","+UAP.getPosition()+","+UAP.getUserName()+","+UAP.getPassword()
                            +","+UAP.getGender());
                }else{
                    bw2.write(userRecord2);
                }
                bw2.flush();
                bw2.newLine();
            }
        br1.close();
        bw1.close();
        br2.close();
        bw2.close();
        file1.delete();
        tempFile1.renameTo(file1);
        file2.delete();
        tempFile2.renameTo(file2);


    }

    //Deleting User information
    @Override
    public void deleteUser(UserAndProduct UAP) throws IOException {
        File file1 = new File("src\\File_collection\\userInformation.txt");
        File tempFile1 = new File("src\\File_collection\\temp_userInformation.txt");
       
        File file2 = new File("src\\File_collection\\LoginCredentials.txt");
        File tempFile2 = new File("src\\File_collection\\temp_LoginCredentials.txt");
       
        BufferedWriter bw1,bw2;
        BufferedReader br1,br2;
        br1 = new BufferedReader( new FileReader(file1));
        bw1 = new BufferedWriter(new FileWriter(tempFile1,true));
        br2 = new BufferedReader( new FileReader(file2));
        bw2 = new BufferedWriter(new FileWriter(tempFile2,true));
        String userRecord1,userRecord2;
            while((userRecord1 = br1.readLine()) != null){
               
               if(userRecord1.contains(Integer.toString(UAP.getUserId()))){
                   continue;
               }
               
               bw1.write(userRecord1);
               bw1.flush();
               bw1.newLine();
               
           }   
            while((userRecord2 = br2.readLine()) != null){
               
               if(userRecord2.contains(Integer.toString(UAP.getUserId()))){
                   continue;
               }
               
               bw2.write(userRecord2);
               bw2.flush();
               bw2.newLine();
               
           }
       bw1.close();
       br1.close();
       br2.close();
       bw2.close();
       file1.delete();
       tempFile1.renameTo(file1);
       file2.delete();
       tempFile2.renameTo(file2);
        
        
    }

    
    //Adding Product Information
    
    @Override
    public void addProduct(UserAndProduct UAP, String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\File_collection\\"+fileName,true));
            
        bw.write(UAP.getTracking_code()+","+UAP.getReceiver()+","+UAP.getSender()+","+UAP.getSend_from()+","+
                UAP.getDestination()+","+UAP.getDate()+","+UAP.getWeight_item());
        bw.flush();
        bw.newLine();
        bw.close();
        
    }
        
    
    //Retreiving pending information
    
    @Override
    public ArrayList<String> viewPending() throws IOException{
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("src\\File_collection\\pendingInfo.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
      }
        return fileData;
        
        
    }
    
    //Retreiving delivery information
    
    @Override
    public ArrayList<String> viewDelivery() throws IOException{
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("src\\File_collection\\deliveryInfo.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
      }
        return fileData;      
        
        
        
    }
    
    //Updating product information
    
    @Override
    public void updateProduct(UserAndProduct UAP, String fileName) throws IOException {

        File file = new File("src\\File_collection\\"+fileName);
        File tempFile = new File("src\\File_collection\\temp"+fileName);
        
 
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
            String productRecord;
            while((productRecord = br.readLine()) != null){
                if(productRecord.contains((Integer.toString(UAP.getTracking_code())))){
                    bw.write(UAP.getTracking_code()+","+UAP.getReceiver()+","+UAP.getSender()+","+UAP.getSend_from()+","+
                UAP.getDestination()+","+UAP.getDate()+","+UAP.getWeight_item());
                }else{
                    bw.write(productRecord);
                }
                bw.flush();
                bw.newLine();
            }
        
        bw.close();
        file.delete();
        tempFile.renameTo(file);
        
        
    }
    
    //Deleting product information
    @Override
    public void deleteProduct(UserAndProduct UAP) throws IOException {
        File file = new File("src\\File_collection\\pendingInfo.txt");
        File tempFile = new File("src\\File_collection\\tempPendingInfo.txt");
        
        
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
            String productRecord;
            while((productRecord = br.readLine()) != null){
                
                if(productRecord.contains((Integer.toString(UAP.getTracking_code())))){
                    continue;
                }
                
                bw.write(productRecord);
                bw.flush();
                bw.newLine();
                
            }
            
        br.close();
        bw.close();
        file.delete();
        tempFile.renameTo(file);
        
        
    }

   

 

    

    
    
}
