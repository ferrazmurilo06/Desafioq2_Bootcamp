class BankAccount(val accountHolder: String){
    private var balance: Double = 0.0
    fun deposit(amount: Double){
        if(amount > 0){
            balance += amount
        }else{
            println("Valor do depósito inválido")
        }
    }
    fun withdraw(amount: Double){
        if(amount > 0 && amount<=balance){
            balance -= amount
        }else{
            println("Saldo insuficiente ou valor do saque inválido")
        }
    }
    fun getBalance():Double{
        return balance
    }
}




fun main() {
val minha_conta = BankAccount("Murilo A. Ferraz")
    minha_conta.deposit(500000.0)
    println("Saldo atual da conta ${minha_conta.getBalance()}")
    minha_conta.withdraw(10000.0)
    println("Saldo atual da conta ${minha_conta.getBalance()}")
}