package bean;

import model.InternsEntity;

public class InternInfoBean {
    private String email;
    private String name;
    private String firstname;

    public static InternInfoBean Beanify(InternsEntity intern){
        InternInfoBean bean = new InternInfoBean();
        bean.setEmail(intern.getEmail());
        bean.setName(intern.getLastname());
        bean.setFirstname(intern.getFirstname());
        return bean;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
