# Bookstore – Fawry Challenge 2

An extensible and testable implementation of an online book store that supports multiple types of books, dynamic inventory management, and purchase processing — following clean OOP design principles.

---

## Table of Contents

- [System in Action](#system-in-action)
- [Design Draft](#design-draft)
- [Testing](#testing)
- [Important Note on Submission](#important-note-on-submission)

---

## System in Action

Screenshots demonstrating the system features:

- Initial Setup  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/Kickstart.png" />

- Add an Existing Book to Inventory  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/AddExBookToInv.png "/>

- Remove a Book from Inventory  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/NormalRemove.png" />

- Try to Remove a Non-Existent Book  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/RemoveNotExist.png" />

- Refresh Outdated Books (by Age)  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/Refresh1-years.png" />

- Refresh Outdated Books (by Year)  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/Refresh2-Year.png" />

- Buy a Paper Book and Check Quantity  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/BuyPaperBookChkQty.png" />

- Buy an EBook  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/BuyEBook.png" />

- Try to Buy a Demo Book (Not for Sale)  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/BuyDemo.png" />

- Buy a book with sufficient portion of the required qty Y and n
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/BuyPaperBookSuffPorQty.png" />
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/BuyPaperBookSuffPorQty2.png" />

- Buy a book with sufficient portion of the required qty Y and n
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/BuyPaperBookSuffPorQty.png" />
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/BuyPaperBookSuffPorQty2.png" />

- Attempt to Buy with Insufficient Quantity  
  <img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/UnSuffThrowError.png" />

---

## Design Draft

The project following Thought and design process:

1. **Requirement Analysis**  
   The requirements were reformulated into actionable rules to ensure full understanding before implementation.

2. **Proposed Trait-Based design via Interfaces**

   - Introduced `Shippable` and `Purchasable` interfaces
    
3. **Final Design (Category-Driven Polymorphism)**
   - Defined high-level categories (`PaperBook`, `EBook`, `ShowCaseBook`)
   - Applied only the traits needed (e.g., `Shippable`, `Purchasable`)
   - Introduced `PurchasingService` to decouple checkout logic from `Inventory`
   - Each service (e.g., `MailService`, `ShippingService`) now works independently with injected dependencies

This structure ensures that adding new book types (like `AudioBook`) requires no modifications to existing classes.

<img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/DD2.jpg"/>

---

## Testing

JUnit tests were written to validate:

- Adding books to inventory
- Preventing duplicates
- Removing books
- Purchasing in normal and edge-case scenarios

Test results:  
<img src="https://github.com/AbdallahGasem/Fawry-Challenge2/blob/main/Planning/Tests.png"/>

---

## Important Note on Submission

I received the challenge email at **2:16 PM on 07/10/2025**, but started working on it at **5:00 PM** after reading the email.  
Despite the **10:00 PM deadline**, I completed the **entire project in just 5 hours**

On **11/07/2025**, after seeing the deadline had been extended by 2 days, I made a **final commit** to:

- Refine this README
- Handle an edge case in the purchasing process: _buying a book with a partially sufficient quantity_

Although the deadline was extended, I hope the original 5-hour effort is considered during evaluation. It reflects my ability to deliver fast, clean, and complete solutions under tight time constraints.


— *Sincerly, Abdallah*
