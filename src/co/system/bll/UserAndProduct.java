
package co.system.bll;


public class UserAndProduct {
    
    //Uers datamembers
    private int userId;
    private String userName;
    private String password;
    private String position;
    private String gender;
    private String email;
    private String phone;
    
    //Product datamembers
    private int tracking_code;
    private String receiver;
    private String sender;
    private String send_from;
    private String destination;
    private String date;
    private String weight_item;

    //Getters and Setters for both Users and Products
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = 000+userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getTracking_code() {
        return tracking_code;
    }

    public void setTracking_code(int tracking_code) {
        this.tracking_code = tracking_code;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSend_from() {
        return send_from;
    }

    public void setSend_from(String send_form) {
        this.send_from = send_form;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeight_item() {
        return weight_item;
    }

    public void setWeight_item(String weight_item) {
        this.weight_item = weight_item;
    }
    
    
    
    
    
    
}
