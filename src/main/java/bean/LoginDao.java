package bean;

import model.TutorEntity;

import java.sql.*;
import java.util.List;
import model.InternSB;

public class LoginDao implements UserDao {

    public static TutorEntity findByEmail(String email){
        InternSB Requester = new InternSB();
        List<TutorEntity> result = Requester.getTutorLoginDetails(email.trim());
        if(result.size() == 0) //if there are no matches something is wrong
        {
            throw new IllegalStateException("No email match in database");
        }
        if(result.size() == 1) //if there are multiple matches something is wrong
        {
            return result.get(0);
        }
        throw new IllegalStateException("Duplicate email matches in database");
    }
    public static boolean validate(LoginBean bean){
        boolean status=false;

        TutorEntity CheckLogin = findByEmail(bean.getEmail());
        if(CheckLogin.getEmail().trim().equals(bean.getEmail()) && CheckLogin.testPass(bean.getPassword()))
        {status = true;}

        return status;

    }
}