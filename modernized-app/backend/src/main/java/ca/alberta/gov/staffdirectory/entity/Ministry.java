package ca.alberta.gov.staffdirectory.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Ministry entity mapping exactly to existing 'ministries' table
 * READ-ONLY access to maintain compatibility with ICEfaces legacy app
 */
@Entity
@Table(name = "ministries")
public class Ministry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;

    private String description;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // Relationships
    @OneToMany(mappedBy = "ministry", fetch = FetchType.LAZY)
    private List<OrganizationalUnit> organizationalUnits = new ArrayList<>();

    @OneToMany(mappedBy = "ministry", fetch = FetchType.LAZY)
    private List<Contact> contacts = new ArrayList<>();

    // Constructors
    public Ministry() {}

    public Ministry(String name) {
        this.name = name;
    }

    // Helper methods
    public boolean hasOrganizationalUnits() {
        return organizationalUnits != null && !organizationalUnits.isEmpty();
    }

    public boolean hasContacts() {
        return contacts != null && !contacts.isEmpty();
    }

    public int getTotalContacts() {
        int total = contacts != null ? contacts.size() : 0;
        if (organizationalUnits != null) {
            for (OrganizationalUnit unit : organizationalUnits) {
                total += unit.getTotalContacts();
            }
        }
        return total;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<OrganizationalUnit> getOrganizationalUnits() {
        return organizationalUnits;
    }

    public void setOrganizationalUnits(List<OrganizationalUnit> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Ministry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", organizationalUnitsCount=" + (organizationalUnits != null ? organizationalUnits.size() : 0) +
                ", contactsCount=" + (contacts != null ? contacts.size() : 0) +
                '}';
    }
}