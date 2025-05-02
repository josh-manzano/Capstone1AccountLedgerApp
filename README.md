# LedgerXProject

A console-based Java app that lets users log deposits and payments, view their full transaction history, and filter through detailed reports.

---

## ⚙️ Features

- ✅ Add deposits and payments
- 🔍 Filter transactions by type or vendor
- 🧾 View reports:
    - Month to Date
    - Previous Month
    - Year to Date
    - Previous Year
- 📁 Transactions saved to CSV
- 📌 Clean terminal menu navigation

---

<details>
<summary>📸 Screenshots</summary>

![Main Menu](https://raw.githubusercontent.com/yourusername/yourrepo/main/screenshots/main_menu.png)  
![Deposit Entry](https://raw.githubusercontent.com/yourusername/yourrepo/main/screenshots/deposit.png)  
![Reports Page](https://raw.githubusercontent.com/yourusername/yourrepo/main/screenshots/reports.png)

</details>

---

<details>
<summary>🧠 How It Works</summary>

- The app uses a `.csv` file to store transactions
- Every deposit or payment writes a new line to the file
- `LocalDate` and `LocalTime` track when the action happened
- A list keeps all transactions in memory for filtering/report features

</details>

---

<details>
<summary>⚙️ Tech used</summary>

- Java 17+
- IntelliJ IDEA
- CSV file handling (`FileWriter`, `BufferedReader`)
- LocalDate & LocalTime for timestamps

</details>

---

## 🧪 Tap to Run App

```bash
src/LedgerApp.java

```
---

##  Example CSV Format

- 04-30-2025|02:36 PM|Paycheck|Acme Corp| 1500.00
- 04-30-2025|02:42 PM|Cash|Ken| 342.00

---


## 👤 Author

**Joshua Manzano**  
Year Up Software Development Program  
Capstone Project – 2025 