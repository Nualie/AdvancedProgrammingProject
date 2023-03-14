package model;

import jakarta.persistence.*;

@Entity
@Table(name = "TUTORS", schema = "advancedprogramming")
public class TutorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "FIRSTNAME", nullable = false, length = 25)
    private String firstname;
    @Basic
    @Column(name = "LASTNAME", nullable = false, length = 25)
    private String lastname;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 25)
    private String email;
    @Basic
    @Column(name = "LOGIN", nullable = false, length = 25)
    private String login;
    @Basic
    @Column(name = "HASHEDPASS", nullable = false)
    private int hashedpass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getHashedpass() {
        return hashedpass;
    }

    public void setHashedpass(String unhashedPass) {
        this.hashedpass = hashPass(unhashedPass);
    }

    public boolean testPass(String unhashedtest) {
        int hashedtest = hashPass(unhashedtest);
        return (this.hashedpass == hashedtest);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TutorEntity that = (TutorEntity) o;

        if (id != that.id) return false;
        if (hashedpass != that.hashedpass) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return login != null ? login.equals(that.login) : that.login == null;
    }

    @Override
    public int hashCode() {
        int result = id ;
        result = 43 * result + firstname.hashCode();
        result = 43 * result + lastname.hashCode();
        result = 43 * result + email.hashCode();
        result = 43 * result + login.hashCode();
        return result;
    }

    public int hashPass(String unhashedPass) {
        int result = hashCode();
        result = 43 * result + unhashedPass.hashCode();
        return result;
    }
}
