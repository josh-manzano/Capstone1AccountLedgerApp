# Ledger Application Project

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

![Main Menu](src/mainmenu.png)  
![Deposit Entry](src/mainMenuRunning.png)

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

## 💾 Most interesting code piece: loadFile();
One of the parts I’m proud of in this project is how I load and rebuild my transactions list cleanly from the CSV file every time the app runs.

<details>
<summary>📸 Screenshot of loadFile();</summary>

![writeTransactions method](src/loadFile().png)

</details>

#### 🔍 What it does::

- It reads each line from transactions.csv using a BufferedReader.
- It splits the line using | to get all the transaction data.
- Builds a UserTransactions object and adds it to the list using addFirst().


#### ⭐ Why I like it:
It made the logic clean, simple, and efficient. One small method handled everything in order, and it saved me from having to mess with sorting during output.

---

##  Example CSV Format

- 04-30-2025|02:36 PM|Paycheck|Acme Corp| 1500.00
- 04-30-2025|02:42 PM|Cash|Ken| 342.00

---


## 👤 Author

**Joshua Manzano**  
Year Up Software Development Program  
Capstone Project – 2025 