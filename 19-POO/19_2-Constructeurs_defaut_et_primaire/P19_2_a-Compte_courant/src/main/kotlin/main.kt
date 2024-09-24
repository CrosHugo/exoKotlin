class BankAccount(var deposited : Long, var withdrawn :Long){
    var balance = deposited - withdrawn
}


fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}