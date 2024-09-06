data class Expense(val amount: Double, val category: String, val date: String) {
    fun displayExpense() {
        println("Количество: $amount, Категория: $category, Дата: $date")
    }
}