package co.cue.edu.gestioninventariosamuelbuitrago.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private int stock;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
