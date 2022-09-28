package production;

import productionCompany.ProductionCompany;

import javax.persistence.*;

@Entity
@Table
public class Production {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "productionCompanyId")
    private ProductionCompany productionCompany;

    private String title;
    private String filmingType;
    private Integer releaseYear;
    private Integer season;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductionCompany getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(ProductionCompany productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilmingType() {
        return filmingType;
    }

    public void setFilmingType(String filmingType) {
        this.filmingType = filmingType;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Production() {
    }
}
