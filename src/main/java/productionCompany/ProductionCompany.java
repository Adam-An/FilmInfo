package productionCompany;

import production.Production;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "productionCompany")
public class ProductionCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productionCompanyId")
    private Long id;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "productionCompany")
    private List<Production> productions;

    private String name;

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


    public ProductionCompany() {
    }


}
