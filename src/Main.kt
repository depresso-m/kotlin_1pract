fun main(){
    val expenseManager = ExpenseManager()


    expenseManager.addExpense(100.0, "Еда", "2024-10-01")
    expenseManager.addExpense(50.0, "Машина", "2024-10-02")
    expenseManager.addExpense(200.0, "Мотоцикл", "2024-10-03")
    expenseManager.addExpense(75.0, "Еда", "2024-10-04")

    println("Все расходы:")
    expenseManager.displayAllExpenses()

    val categoryTotals = expenseManager.calculateTotalByCategory()
    println("\nВсе расходы по категории:")
    for ((category, total) in categoryTotals) {
        println("$category: $total")
    }
}