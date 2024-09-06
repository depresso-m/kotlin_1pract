class ExpenseManager {
    private val expenses = mutableListOf<Expense>()

    fun addExpense(amount: Double, category: String, date: String) {
        val expense = Expense(amount, category, date)
        expenses.add(expense)
    }

    fun displayAllExpenses() {
        for (expense in expenses) {
            expense.displayExpense()
        }
    }

    fun calculateTotalByCategory(): Map<String, Double> {
        val categoryTotals = mutableMapOf<String, Double>()
        for (expense in expenses) {
            val currentTotal = categoryTotals.getOrDefault(expense.category, 0.0)
            categoryTotals[expense.category] = currentTotal + expense.amount
        }
        return categoryTotals
    }
}