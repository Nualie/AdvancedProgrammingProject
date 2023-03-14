package model;

import jakarta.persistence.*;

@Entity
@Table(name = "tutors", schema = "advancedprogramming")
public class TutorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "LOGIN", nullable = false, length = 25)
    private String login;
    @Basic
    @Column(name = "HASHEDPASS", nullable = false)
    private int hashedpass;
    @Basic
    @Column(name = "LASTNAME", nullable = false, length = 25)
    private String lastname;
    @Basic
    @Column(name = "FIRSTNAME", nullable = false, length = 25)
    private String firstname;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 25)
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() { return login; }

    public void setLogin(String login) { this.login = login; }

    public int getHashedpass() { return hashedpass; }

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
        if (lastname != that.lastname) return false;
        if (firstname != that.firstname) return false;
        if (email != that.email) return false;

        return true;
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
