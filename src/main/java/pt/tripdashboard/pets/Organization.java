package pt.tripdashboard.pets;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Organization implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String logo;

    /* Constructors */
    public Organization() {

    }

    public Organization(Long id) {
        this.id = id;
    }

    /* Getters and Setters */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organization)) {
            return false;
        }
        Organization other = (Organization) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pt.tripdashboard.pets.entities.Organization[ id=" + id + " ]";
    }

}
