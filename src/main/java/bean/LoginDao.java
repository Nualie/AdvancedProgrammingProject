package bean;

import model.TutorsEntity;

import java.util.List;
import model.InternSB;

public class LoginDao {

    public static TutorsEntity findByEmail(String email){
        if(email == null) return null;
        InternSB Requester = new InternSB();
        List<TutorsEntity> result = Requester.getTutorLoginDetails(email.trim());
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

        TutorsEntity CheckLogin = findByEmail(bean.getEmail());
        if(CheckLogin == null) return false;
        System.out.println(bean.getPassword()+"turns into"+CheckLogin.hashPass(bean.getPassword())+"compared to"+CheckLogin.getHashedpass());
        if(CheckLogin.getEmail().trim().equals(bean.getEmail()) && CheckLogin.testPass(bean.getPassword()))
        {status = true;}

        return status;

    }
}