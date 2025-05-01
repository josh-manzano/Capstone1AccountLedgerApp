# LedgerXProject

A Java-based personal finance tracker that allows users to manage deposits, payments, and generate detailed reports — all saved and organized through a CSV file system.

---

## 🧠 Key Concepts Used

- Object-Oriented Programming
- File I/O (`BufferedReader`, `FileWriter`)
- `LocalDate` and `LocalTime` usage
- Input validation and user interaction
- Looping and conditional logic

---

## 🚀 How to Run

1. Clone or download the repository
2. Open it in IntelliJ IDEA or any Java IDE
3. Ensure `transactions.csv` is located at the specified path
4. Run `LedgerApp.java`
5. Follow the terminal prompts to interact with the system

---

## 🗂️ File Structure

| File | Description |
|------|-------------|
| `LedgerApp.java` | Main class that handles logic, input, menu navigation, and file operations |
| `UserTransactions.java` | Object class that structures transaction data |
| `transactions.csv` | Stores all user transaction records in a readable format |

---

## 📘 Features

<details>
<summary><strong>💰 Add Deposits</strong></summary>

- Add an amount to a selected account  
- Choose deposit method (e.g., paycheck, transfer)  
- Saved to CSV with current date & time  
</details>

<details>
<summary><strong>💳 Make Payments</strong></summary>

- Enter vendor and amount  
- Description for each payment  
- Values saved as negative to distinguish from deposits  
</details>

<details>
<summary><strong>📄 View Transactions</strong></summary>

- View all transactions  
- View only deposits  
- View only payments  
</details>

<details>
<summary><strong>📊 Reporting Tools</strong></summary>

- Month to Date  
- Previous Month  
- Year to Date  
- Previous Year  
- Search by Vendor or Account  
</details>

---

## 📝 Sample CSV Output

```plaintext
04-30-2025|02:36 PM|Paycheck|Acme Corp| 1500.00
04-30-2025|02:38 PM|Groceries|Walmart| -85.20
