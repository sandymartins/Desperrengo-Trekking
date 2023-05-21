package com.desperrengo.trekking.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
@Entity
@Table(name = "tb_product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Atributo obrigatório!")
    @Size(min = 6, max = 6, message = "O Atributo deve conter no máximo 6 caracteres")
    private String id_cod_prod;

    @NotNull(message = "Atributo obrigatório!")
    @Size(min = 6, max = 6, message = "O Atributo deve conter no máximo 6 caracteres")
    private String cod_seg_prod;

    @NotNull(message = "Atributo deve ter no mínimo 5 caracteres!")
    @Size(min = 10, max = 120, message = "O Atributo deve conter no máximo 120 caracteres")
    private String desc_prod;

    @NotBlank
    private Integer price_prod;

    @NotBlank
    private Boolean active_prom_prod;

    @NotBlank
    private Integer quant_stock_prod;

    @NotBlank
    private Timestamp date_reg_prod;
}
