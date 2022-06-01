package com.cvpro.springbootcv.Entities;

import lombok.*;
import javax.persistence.*;

@Entity // import javax.persistence.*;
@Table(name="city") // import javax.persistence.*;
@Getter // import lombok.*;
@Setter // import lombok.*;
@NoArgsConstructor // import lombok.*;
@AllArgsConstructor // import lombok.*;
public class City {
	// import javax.persistence.*; all annotations
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="CountryCode")
	private String countryCode;
	@Column(name="District")
	private String district;
	@Column(name="Population")
	private int population;
}
