class Account{

    BigDecimal balance = 0
    String type

    void Deposit(BigDecimal depositAmount){
        balance += depositAmount
    }

    void Withdraw(BigDecimal withdrawAmount){
        balance -= withdrawAmount
    }

    BigDecimal plus(Account other){
        balance: this.balance + other.balance
    }

    @Override
    String toString() {
        "Account type: ${type.toUpperCase()}, balance $balance"
    }
}

Account checking = new Account(type:"checking")
checking.Deposit(100.00)
Account savings = new Account(type:"savings")
savings.Deposit(500.00)
println checking
println savings

BigDecimal total = checking + savings
println checking + savings
