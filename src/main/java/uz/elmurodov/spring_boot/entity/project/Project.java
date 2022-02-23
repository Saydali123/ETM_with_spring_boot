package uz.elmurodov.spring_boot.entity.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import uz.elmurodov.spring_boot.entity.Auditable;
import uz.elmurodov.spring_boot.entity.BaseEntity;
import uz.elmurodov.spring_boot.entity.organization.Organization;

import javax.persistence.*;

@Entity
@Table(name = "project", schema = "etm_b4")
@AllArgsConstructor
@Getter
@Setter
public class Project extends Auditable implements BaseEntity {

    @Column(nullable = false)
    private String name;


    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Column(name = "closed")
    private Boolean closed;



    public Project() {
    }

    public Project(Long id) {
        super(id);
    }

}