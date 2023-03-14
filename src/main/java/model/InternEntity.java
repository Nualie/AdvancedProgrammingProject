package model;

import jakarta.persistence.*;

@Entity
@Table(name = "INTERNS", schema = "advancedprogramming")
public class InternEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "LASTNAME", nullable = true, length = 25)
    private String lastname;
    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 25)
    private String firstname;
    @Basic
    @Column(name = "CDC", nullable = true)
    private Boolean cdc;
    @Basic
    @Column(name = "FICHEVISITE", nullable = true)
    private Boolean fichevisite;
    @Basic
    @Column(name = "FICHEEVALENTREE", nullable = true)
    private Boolean ficheevalentree;
    @Basic
    @Column(name = "SONDAGEWEB", nullable = true)
    private Boolean sondageweb;
    @Basic
    @Column(name = "RAPPORTRENDU", nullable = true)
    private Boolean rapportrendu;
    @Basic
    @Column(name = "SOUT", nullable = true)
    private Boolean sout;
    @Basic
    @Column(name = "VISITEPLANIF", nullable = true)
    private Boolean visiteplanif;
    @Basic
    @Column(name = "VISITEFAITE", nullable = true)
    private Boolean visitefaite;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 25)
    private String email;
    @Basic
    @Column(name = "TUTORID", nullable = true)
    private Integer tutorid;

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

    public Boolean getCdc() {
        return cdc;
    }

    public void setCdc(Boolean cdc) {
        this.cdc = cdc;
    }

    public Boolean getFichevisite() {
        return fichevisite;
    }

    public void setFichevisite(Boolean fichevisite) {
        this.fichevisite = fichevisite;
    }

    public Boolean getFicheevalentree() {
        return ficheevalentree;
    }

    public void setFicheevalentree(Boolean ficheevalentree) {
        this.ficheevalentree = ficheevalentree;
    }

    public Boolean getSondageweb() {
        return sondageweb;
    }

    public void setSondageweb(Boolean sondageweb) {
        this.sondageweb = sondageweb;
    }

    public Boolean getRapportrendu() {
        return rapportrendu;
    }

    public void setRapportrendu(Boolean rapportrendu) {
        this.rapportrendu = rapportrendu;
    }

    public Boolean getSout() {
        return sout;
    }

    public void setSout(Boolean sout) {
        this.sout = sout;
    }

    public Boolean getVisiteplanif() {
        return visiteplanif;
    }

    public void setVisiteplanif(Boolean visiteplanif) {
        this.visiteplanif = visiteplanif;
    }

    public Boolean getVisitefaite() {
        return visitefaite;
    }

    public void setVisitefaite(Boolean visitefaite) {
        this.visitefaite = visitefaite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTutorid() {
        return tutorid;
    }

    public void setTutorid(Integer tutorid) {
        this.tutorid = tutorid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InternEntity that = (InternEntity) o;

        if (id != that.id) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return tutorid != null ? tutorid.equals(that.tutorid) : that.tutorid == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (tutorid != null ? tutorid.hashCode() : 0);
        return result;
    }
}
