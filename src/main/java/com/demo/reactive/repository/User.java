package com.demo.reactive.repository;

import org.springframework.data.relational.core.mapping.Table;
import java.math.BigInteger;

@Table(name = "USERS")
public class User {

  BigInteger id;
}
