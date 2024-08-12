// class Student {
//     private String name;
//     private int rollNumber;
//     private double[] marks;
//     private static final double PASSING_PERCENTAGE = 40.0;

//     public Student(String name, int rollNumber, double[] marks) {
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.marks = marks;
//     }

//     public double calculateAverage() {
//         double sum = 0.0;
//         for (double mark : marks) {
//             sum += mark;
//         }
//         return sum / marks.length;
//     }

//     public void displayDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Roll Number: " + rollNumber);
//         System.out.print("Marks: ");
//         for (double mark : marks) {
//             System.out.print(mark + " ");
//         }
//         System.out.println("\nAverage Marks: " + calculateAverage());
//         System.out.println("Result: " + (hasPassed() ? "Passed" : "Failed"));
//         System.out.println();
//     }

//     public boolean hasPassed() {
//         return calculateAverage() >= PASSING_PERCENTAGE;
//     }

//     public static void main(String[] args) {
//         Student[] students = {
//             new Student("Gul", 1, new double[]{85, 78, 90}),
//             new Student("farman", 2, new double[]{65, 70, 75}),
//             new Student("mumtaz", 3, new double[]{50, 55, 60}),
//             new Student("kashif", 4, new double[]{30, 40, 35})
//         };

//         double classTotal = 0.0;
//         for (Student student : students) {
//             student.displayDetails();
//             classTotal += student.calculateAverage();
//         }

//         double classAverage = classTotal / students.length;
//         System.out.println("Class Average: " + classAverage);
//     }
// }



// abstract class Shape {
//     abstract double calculateArea();
// }

// class Circle extends Shape {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }

// class Rectangle extends Shape {
//     private double length;
//     private double width;

//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     double calculateArea() {
//         return length * width;
//     }
// }

// class Triangle extends Shape {
//     private double base;
//     private double height;

//     public Triangle(double base, double height) {
//         this.base = base;
//         this.height = height;
//     }

//     @Override
//     double calculateArea() {
//         return 0.5 * base * height;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Shape[] shapes = new Shape[3];

//         shapes[0] = new Circle(5);      
//         shapes[1] = new Rectangle(4, 6);
//         shapes[2] = new Triangle(3, 7);   

//         for (Shape shape : shapes) {
//             System.out.println("Area: " + shape.calculateArea());
//         }
//     }
// }





// class BankAccount {
//     private String accountNumber;
//     private double balance;
//     private String accountHolderName;

//     public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.balance = initialBalance;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount);
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrew: " + amount);
//         } else if (amount > balance) {
//             System.out.println("Insufficient funds.");
//         } else {
//             System.out.println("Invalid withdrawal amount.");
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void displayAccountDetails() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolderName);
//         System.out.println("Balance: " + balance);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         BankAccount account1 = new BankAccount("009900", "Gul", 3000.0);
//         BankAccount account2 = new BankAccount("123456", "Gul M", 2000.0);

//         account1.deposit(1500.0);
//         account1.withdraw(500.0);
//         account1.displayAccountDetails();

//         System.out.println();

//         account2.deposit(1000.0);
//         account2.withdraw(500.0);
//         account2.displayAccountDetails();
//     }
// }


// import java.util.ArrayList;
// import java.util.Date;

// class Book {
//     private String title;
//     private String author;
//     private String ISBN;
//     private boolean isAvailable;
//     private ArrayList<LendingHistory> lendingHistory;

//     public Book(String title, String author, String ISBN) {
//         this.title = title;
//         this.author = author;
//         this.ISBN = ISBN;
//         this.isAvailable = true;
//         this.lendingHistory = new ArrayList<>();
//     }

//     public String getTitle() {
//         return title;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public String getISBN() {
//         return ISBN;
//     }

//     public boolean isAvailable() {
//         return isAvailable;
//     }

//     public void checkOut(String borrower) {
//         if (isAvailable) {
//             isAvailable = false;
//             lendingHistory.add(new LendingHistory(borrower, new Date()));
//             System.out.println(borrower + " has checked out \"" + title + "\".");
//         } else {
//             System.out.println("The book \"" + title + "\" is not available.");
//         }
//     }

//     public void returnBook() {
//         if (!isAvailable) {
//             isAvailable = true;
//             LendingHistory lastLending = lendingHistory.get(lendingHistory.size() - 1);
//             lastLending.setReturnDate(new Date());
//             System.out.println("The book \"" + title + "\" has been returned.");
//         } else {
//             System.out.println("The book \"" + title + "\" was not checked out.");
//         }
//     }

//     public void displayLendingHistory() {
//         System.out.println("Lending history for \"" + title + "\":");
//         for (LendingHistory history : lendingHistory) {
//             System.out.println(history);
//         }
//     }
// }

// class LendingHistory {
//     private String borrower;
//     private Date borrowDate;
//     private Date returnDate;

//     public LendingHistory(String borrower, Date borrowDate) {
//         this.borrower = borrower;
//         this.borrowDate = borrowDate;
//     }

//     public void setReturnDate(Date returnDate) {
//         this.returnDate = returnDate;
//     }

//     @Override
//     public String toString() {
//         return "Borrower: " + borrower + ", Borrowed on: " + borrowDate + ", Returned on: " + (returnDate != null ? returnDate : "Not yet returned");
//     }
// }

// class Library {
//     private ArrayList<Book> books;

//     public Library() {
//         books = new ArrayList<>();
//     }

//     public void addBook(Book book) {
//         books.add(book);
//         System.out.println("Added book \"" + book.getTitle() + "\" to the library.");
//     }

//     public Book searchByTitle(String title) {
//         for (Book book : books) {
//             if (book.getTitle().equalsIgnoreCase(title)) {
//                 return book;
//             }
//         }
//         System.out.println("Book with title \"" + title + "\" not found.");
//         return null;
//     }

//     public Book searchByISBN(String ISBN) {
//         for (Book book : books) {
//             if (book.getISBN().equals(ISBN)) {
//                 return book;
//             }
//         }
//         System.out.println("Book with ISBN \"" + ISBN + "\" not found.");
//         return null;
//     }

//     public void checkOutBook(String title, String borrower) {
//         Book book = searchByTitle(title);
//         if (book != null) {
//             book.checkOut(borrower);
//         }
//     }

//     public void returnBook(String title) {
//         Book book = searchByTitle(title);
//         if (book != null) {
//             book.returnBook();
//         }
//     }

//     public void displayLibraryBooks() {
//         System.out.println("Books available in the library:");
//         for (Book book : books) {
//             System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getISBN() + ")");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Library library = new Library();

//         library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
//         library.addBook(new Book("1999", "George Orwell", "9780451524935"));
//         library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));

//         library.displayLibraryBooks();

//         System.out.println();

//         library.checkOutBook("1999", "Naveed");

//         System.out.println();

//         library.returnBook("1999");

//         System.out.println();

//         Book book = library.searchByTitle("1999");
//         if (book != null) {
//             book.displayLendingHistory();
//         }

//         System.out.println();

//         library.checkOutBook("The Catcher in Rye","Gul m");
//     }
// }


class MobilePhone {
    private String brand;
    private String model;
    private double price;
    private int storage; // storage in GB

    public MobilePhone(String brand, String model, double price, int storage) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getStorage() {
        return storage;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Storage: " + storage + "GB");
    }

    public static int comparePrices(MobilePhone phone1, MobilePhone phone2) {
        return Double.compare(phone1.price, phone2.price);
    }

    public boolean meetsRequirements(int minStorage) {
        return this.storage >= minStorage;
    }

    public static MobilePhone findPhoneWithHighestStorage(MobilePhone[] phones) {
        if (phones == null || phones.length == 0) return null;
        
        MobilePhone maxStoragePhone = phones[0];
        for (MobilePhone phone : phones) {
            if (phone.getStorage() > maxStoragePhone.getStorage()) {
                maxStoragePhone = phone;
            }
        }
        return maxStoragePhone;
    }
}

public class Main {
    public static void main(String[] args) {
        MobilePhone[] phones = {
            new MobilePhone("Apple", "iPhone 14", 999.99, 128),
            new MobilePhone("Samsung", "Galaxy S23", 899.99, 256),
            new MobilePhone("Google", "Pixel 7", 599.99, 128),
            new MobilePhone("OnePlus", "OnePlus 11", 749.99, 256)
        };

        // Display details of each phone
        for (MobilePhone phone : phones) {
            phone.displayDetails();
            System.out.println();
        }

        // Compare prices of two phones
        MobilePhone phone1 = phones[0]; // iPhone 14
        MobilePhone phone2 = phones[1]; // Galaxy S23
        int priceComparison = MobilePhone.comparePrices(phone1, phone2);
        if (priceComparison < 0) {
            System.out.println(phone1.getModel() + " is cheaper than " + phone2.getModel());
        } else if (priceComparison > 0) {
            System.out.println(phone1.getModel() + " is more expensive than " + phone2.getModel());
        } else {
            System.out.println(phone1.getModel() + " and " + phone2.getModel() + " have the same price");
        }

        // Check if a phone meets specific storage requirements
        int minStorage = 256;
        System.out.println("\nPhones with at least " + minStorage + "GB storage:");
        for (MobilePhone phone : phones) {
            if (phone.meetsRequirements(minStorage)) {
                phone.displayDetails();
                System.out.println();
            }
        }

        // Find the phone with the highest storage capacity
        MobilePhone maxStoragePhone = MobilePhone.findPhoneWithHighestStorage(phones);
        if (maxStoragePhone != null) {
            System.out.println("Phone with the highest storage capacity:");
            maxStoragePhone.displayDetails();
        }
    }
}