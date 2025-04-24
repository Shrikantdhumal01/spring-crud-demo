//package com.example.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor       // Generates a no-argument constructor
//@AllArgsConstructor 
//public class AccountDto {
//
//	private Long id;
//	private String accountHoldername;
//	private double balance;
//public AccountDto(Object id2, Object accountHoldername2, double balance2) {
//		 TODO Auto-generated constructor stub
//	}
//	//	public AccountDto(Long id2, String accountHoldername2, double balance2) {
//		 TODO Auto-generated constructor stub
//	}
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getAccountHoldername() {
//		return accountHoldername;
//	}
//	public void setAccountHoldername(String accountHoldername) {
//		this.accountHoldername = accountHoldername;
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//}

//package com.example.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class AccountDto {
//    private Long id;
//    private String accountHoldername;
//    private double balance;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getAccountHoldername() {
//		return accountHoldername;
//	}
//	public void setAccountHoldername(String accountHoldername) {
//		this.accountHoldername = accountHoldername;
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//}
//

//package com.example.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class AccountDto {
//    private Long id;
//    private String accountHoldername;
//    private double balance;
//}

//package com.example.dto;
//
//public class AccountDto {
//    private Long id;
//    private String accountHoldername;
//    private double balance;
//
//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getAccountHoldername() {
//        return accountHoldername;
//    }
//
//    public void setAccountHoldername(String accountHoldername) {
//        this.accountHoldername = accountHoldername;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//}

package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor    
@AllArgsConstructor   
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private Double balance;
    
    
    public Double getBalance() {
        return (balance != null) ? balance : 0.0; // Prevents NullPointerException
    }

    public void setBalance(Double balance) {
        this.balance = (balance != null) ? balance : 0.0;
    }
}

