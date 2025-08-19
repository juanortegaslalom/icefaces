package ca.alberta.gov.staffdirectory.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * Contact entity mapping exactly to existing 'contacts' table
 * READ-ONLY access to maintain compatibility with ICEfaces legacy app
 */
@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ministry_id")
    private Integer ministryId;

    @Column(name = "organizational_unit_id")
    private Integer organizationalUnitId;

    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;

    private String title;

    private String phone;

    @Email(message = "Email should be valid")
    private String email;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // JPA relationships for convenience (but data comes from foreign keys above)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ministry_id", insertable = false, updatable = false)
    private Ministry ministry;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organizational_unit_id", insertable = false, updatable = false)
    private OrganizationalUnit organizationalUnit;

    // Constructors
    public Contact() {}

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMinistryId() {
        return ministryId;
    }

    public void setMinistryId(Integer ministryId) {
        this.ministryId = ministryId;
    }

    public Integer getOrganizationalUnitId() {
        return organizationalUnitId;
    }

    public void setOrganizationalUnitId(Integer organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Ministry getMinistry() {
        return ministry;
    }

    public void setMinistry(Ministry ministry) {
        this.ministry = ministry;
    }

    public OrganizationalUnit getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(OrganizationalUnit organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}