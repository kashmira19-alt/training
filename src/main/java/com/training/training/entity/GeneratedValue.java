package com.training.training.entity;

import javax.persistence.GenerationType;

public @interface GeneratedValue {

	GenerationType strategy();

}
