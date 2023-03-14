package oldmodel;

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
    @Column(name = "EMAIL", nullable = true, length = 25)
    private String email;
    @Basic
    @Column(name = "CDC", nullable = true)
    private Boolean cdc;
    @Basic
    @Column(name = "FICHEVISITE", nullable = true)
    private Boolean ficheVisite;
    @Basic
    @Column(name = "FICHEEVALENTREE", nullable = true)
    private Boolean ficheEvalEntree;
    @Basic
    @Column(name = "RAPPORTRENDU", nullable = true)
    private Boolean rapportRendu;
    @Basic
    @Column(name = "VISITEPLANIF", nullable = true)
    private Boolean visitePlanif;
    @Basic
    @Column(name = "VISITEFAITE", nullable = true)
    private Boolean visiteFaite;



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

    public void setCdc(Boolean cdc) { this.cdc = cdc; }

    public Boolean getCdc() { return cdc; }

    public void setFicheVisite(Boolean ficheVisite) { this.ficheVisite = ficheVisite; }

    public Boolean getFicheVisite() { return ficheVisite; }

    public void setFicheEvalEntree(Boolean ficheEvalEntree) { this.ficheEvalEntree = ficheEvalEntree; }

    public Boolean getFicheEvalEntree() { return ficheEvalEntree; }

    public void setRapportRendu(Boolean rapportRendu) { this.rapportRendu = rapportRendu; }

    public Boolean getRapportRendu() { return rapportRendu; }

    public void setVisitePlanif(Boolean visitePlanif) { this.visitePlanif = visitePlanif; }

    public Boolean getVisitePlanif() { return visitePlanif; }

    public void setVisiteFaite(Boolean visiteFaite) { this.visiteFaite = visiteFaite; }

    public Boolean getVisiteFaite() { return visiteFaite; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InternEntity that = (InternEntity) o;

        if (id != that.id) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        return email != null ? email.equals(that.email) : that.email == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
