package com.cardapio.food;

import com.cardapio.DTOs.FoodRequestDTO;
import com.cardapio.DTOs.FoodResponseDTO;
import jakarta.persistence.*;


@Table(name = "foods")
@Entity(name = "foods")

//Para Lombok, add as anotações abaixo e remove os metodos construtor e gets e sets
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode(of = "id")

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(Long id, String title, String image, Integer price) {

    }

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
