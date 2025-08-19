package ca.alberta.gov.staffdirectory.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Organizational Unit entity mapping exactly to existing 'organizational_units' table
 * READ-ONLY access to maintain compatibility with ICEfaces legacy app
 */
@Entity
@Table(name = "organizational_units")
public class OrganizationalUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ministry_id")
    private Integer ministryId;

    @Column(name = "parent_id")
    private Integer parentId;

    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;

    @Column(name = "unit_type")
    @Enumerated(EnumType.STRING)
    private UnitType unitType; // department, office, division, branch, section

    private Integer level = 0;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // JPA relationships for convenience (but data comes from foreign keys above)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ministry_id", insertable = false, updatable = false)
    private Ministry ministry;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", insertable = false, updatable = false)
    @JsonIgnore
    private OrganizationalUnit parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<OrganizationalUnit> children = new ArrayList<>();

    @OneToMany(mappedBy = "organizationalUnit", fetch = FetchType.LAZY)
    private List<Contact> contacts = new ArrayList<>();

    // Unit type enum to match database ENUM
    public enum UnitType {
        department, office, division, branch, section
    }

    // Constructors
    public OrganizationalUnit() {}

    public OrganizationalUnit(String name, UnitType unitType) {
        this.name = name;
        this.unitType = unitType;
    }

    // Helper methods
    public boolean hasChildren() {
        return children != null && !children.isEmpty();
    }

    public boolean hasContacts() {
        return contacts != null && !contacts.isEmpty();
    }

    public int getTotalContacts() {
        int total = contacts != null ? contacts.size() : 0;
        if (children != null) {
            for (OrganizationalUnit child : children) {
                total += child.getTotalContacts();
            }
        }
        return total;
    }

    public void addChild(OrganizationalUnit child) {
        children.add(child);
        child.setParent(this);
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        contact.setOrganizationalUnit(this);
    }

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    public OrganizationalUnit getParent() {
        return parent;
    }

    public void setParent(OrganizationalUnit parent) {
        this.parent = parent;
    }

    public List<OrganizationalUnit> getChildren() {
        return children;
    }

    public void setChildren(List<OrganizationalUnit> children) {
        this.children = children;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "OrganizationalUnit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitType='" + unitType + '\'' +
                ", level=" + level +
                ", contactCount=" + (contacts != null ? contacts.size() : 0) +
                ", childrenCount=" + (children != null ? children.size() : 0) +
                '}';
    }
}