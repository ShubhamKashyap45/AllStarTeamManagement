# AllStarTeamManagement System

This project is a Java-based console application designed for managing sports teams. It allows users to create teams, add players, assign captains, and search for teams or players through an interactive menu interface, leveraging object-oriented programming principles for a structured and efficient design.

⭐⭐⭐⭐⭐

---



## 🚀 Features

- **Add New Teams**: Enter details about new teams, including coach and captain.
- **Add Players**: Input player details such as ID, name, and specialization.
- **Search Teams**: Find teams by their unique team ID.
- **Search Players**: Locate a team based on a player ID.
- **Retrieve All Teams**: View a list of all registered teams along with their players.

---

## 🛠️ Technologies Used

- **Java**: The primary programming language for the application.
- **Object-Oriented Programming (OOP)**: Utilizes OOP concepts to enhance code organization and reusability, including:
  - **Encapsulation**: Each class (e.g., Player, Team) encapsulates its properties and behaviors, promoting data hiding.
  - **Inheritance**: Future enhancements may introduce inheritance to extend functionality.
  - **Polymorphism**: Allows method overriding for specific implementations.
  - **Method Overloading**: Enhances flexibility by enabling multiple methods with the same name but different parameters.

---

## 📂 Project Structure

```markdown
AllStarTeamManagement/
│── src/
│   ├── com/demo/beans/
│   │   ├── Player.java
│   │   ├── Team.java
│   ├── com/demo/service/
│   │   ├── TeamService.java
│   ├── com/demo/test/
│   │   ├── TestTeamPlayer.java
│── README.md
│── .gitignore
│── pom.xml (if using Maven)
```

---

## 📦 Package Structure

- **Beans**: Contains `Player` and `Team` classes that represent the core data structures used in the application.
- **Service**: Implements the core functionalities in `TeamService`, managing team and player operations.
- **Test**: Contains `TestTeamPlayer.java`, the entry point for user interaction via a menu-driven system.

---

## ▶️ How to Run

1. Clone the repository to your local machine:
   ```sh
   git clone https://github.com/ShubhamKashyap45/AllStarTeamManagement
   ```
2. Open the project in an IDE (Eclipse, IntelliJ IDEA, or VS Code).
3. Compile the project:
   ```sh
   javac -d bin src/com/demo/beans/*.java src/com/demo/service/*.java src/com/demo/test/*.java
   ```
4. Run the application:
   ```sh
   java com.demo.test.TestTeamPlayer
   ```

---

## 📝 Example Usage

- Upon starting the application, users are welcomed and presented with a menu of options to manage teams and players.
- After selecting an option, users can input relevant details, and the application will confirm successful additions or display the requested information.

