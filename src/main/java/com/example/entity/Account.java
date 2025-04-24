//package com.example.entity;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//
//
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "accounts")
//@Entity
//public class Account {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	@Column(name = "account_holder_name")
//	private String accountHolderName;
//	private double balance;
//public Account(Long id2, String accountHoldername2, double balance2) {
//		// TODO Auto-generated constructor stub
//	}
	//	public Account(Long id2, String accountHoldername2, double balance2) {
//		// TODO Auto-generated constructor stub
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//	this.balance = balance;
//	
//	
//	}
//	public String getAccountHoldername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public Long getId() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//	public Object getAccountHoldername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public Object getId() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//
//}


//package com.example.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "accounts")
//@Entity
//public class Account {
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    
//    @Column(name = "account_holder_name")
//    private String accountHolderName;
//    
//    private double balance;
//
//    // ❌ No need to manually define constructors, getters, or setters
//}
	
//	package com.example.entity;
//
//	import jakarta.persistence.Column;
//	import jakarta.persistence.Entity;
//	import jakarta.persistence.GeneratedValue;
//	import jakarta.persistence.GenerationType;
//	import jakarta.persistence.Id;
//	import jakarta.persistence.Table;
//	import lombok.AllArgsConstructor;
//	import lombok.Getter;
//	import lombok.NoArgsConstructor;
//	import lombok.Setter;
//
//	@Getter
//	@Setter
//	@NoArgsConstructor
//	@AllArgsConstructor
//	@Table(name = "accounts")
//	@Entity
//	public class Account {
//
//	    @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    private Long id;
//
//	    @Column(name = "account_holder_name")
//	    private String accountHolderName;
//
//	    private double balance;
//
//	    // Custom constructor (optional, if needed)
//	    public Account(Long id, String accountHolderName, double balance) {
//	        this.id = id;
//	        this.accountHolderName = accountHolderName;
//	        this.balance = balance;
//	    }
//	}
	
	
//	package com.example.entity;
    package com.example.entity;
	import jakarta.persistence.*;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	import lombok.ToString;

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	@Table(name = "accounts")
	@Entity
	public class Account {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "account_holder_name")
	    private String accountHolderName;

	    private double balance;


	}
