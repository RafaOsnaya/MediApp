package com.rafaosnaya.model;

import lombok.*;

/*@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {


    private Integer idPatient;
    private String firstName;
}
