/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.UserDTO;
import java.util.ArrayList;

/**
 *
 * @author tomnyson
 */
public class UserDAO {

    public ArrayList<UserDTO> lsUser = new ArrayList<UserDTO>();

    public UserDAO() {
        lsUser.add(new UserDTO("admin", "123456"));
        lsUser.add(new UserDTO("user", "123456"));
    }

    public boolean isLogin(String username, String pass) {
        /**
         * duyet qua tat ca item cua lsUser check user, password of item trong
         * lsUser neu trung thi tra ve true / false neu ko dung
         */
        for (int i = 0; i < lsUser.size(); i++) {
            UserDTO current = lsUser.get(i);
            if (current.getUsername().equals(username)
                    && current.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

}
