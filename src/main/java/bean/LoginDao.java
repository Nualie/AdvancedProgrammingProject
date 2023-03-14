package bean;

import jakarta.ws.rs.NotAuthorizedException;
import model.TutorEntity;

import java.util.List;
import model.InternSB;

public class LoginDao {

    public static TutorEntity findByEmail(String email){
        if(email == null) return null;
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

    public static String getLogin(LoginBean bean){
        if(!validate(bean)) throw new NotAuthorizedException("Incorrect login details");

        TutorEntity CheckLogin = findByEmail(bean.getEmail());
        return CheckLogin.getFirstname()+" "+CheckLogin.getLastname();
    }

    public static int getTutorId(LoginBean bean){
        if(!validate(bean)) throw new NotAuthorizedException("Incorrect login details");

        TutorEntity CheckLogin = findByEmail(bean.getEmail());
        return CheckLogin.getId();
    }
    public static boolean validate(LoginBean bean){
        boolean status=false;

        TutorEntity CheckLogin = findByEmail(bean.getEmail());
        if(CheckLogin == null) return false;

        System.out.println(CheckLogin.hashPass("mypassword"));
        if(CheckLogin.getEmail().trim().equals(bean.getEmail()) && CheckLogin.testPass(bean.getPassword()))
        {status = true;}

        return status;

    }
}