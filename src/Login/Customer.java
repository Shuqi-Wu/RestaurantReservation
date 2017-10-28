/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Shuqi
 */
public class Customer extends User{
    
    private String username;
    private String password;
    private int usertype;
    private String bankcardNo;

    public Customer(){}
    
    public Customer(String username, String password, int usertype, String bankcardNo)
    {
        this.username=username;
        this.password=password;
        this.usertype=usertype;
        this.bankcardNo=bankcardNo;
    }
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the usertype
     */
    public int getUsertype() {
        return usertype;
    }

    /**
     * @param usertype the usertype to set
     */
    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    /**
     * @return the bankcardNo
     */
    public String getBankcardNo() {
        return bankcardNo;
    }

    /**
     * @param bankcardNo the bankcardNo to set
     */
    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo;
    }

}
