# Student Management System

## JavaFX Student Management System Project

### Disclaimer
- Welcome to our JavaFX Student Management System project, inspired by [MarcoMan's](https://github.com/marcoman2) [original work](https://github.com/marcoman2/StudentManagementSystem).
- This project marks our exciting journey into the world of JavaFX.
- A huge shoutout to MarcoMan for his invaluable YouTube tutorial, which guided us through this project's creation.
- While this project shares its foundation with MarcoMan's, we've introduced several enhancements and customized the methods to suit our needs.
- This project is just the beginning; we plan to apply the knowledge gained here to future JavaFX projects.

## Software Requirements
### Before you dive in, make sure to download and install the following:

1. [Git](https://git-scm.com/)
2. [SceneBuilder](https://gluonhq.com/products/scene-builder/)
3. [IntelliJ IDEA IDE](https://www.jetbrains.com/idea/)
4. [XAMPP](https://www.apachefriends.org/index.html)

## Installation
### Configuring SceneBuilder
#### Before opening the `view.fxml` files in SceneBuilder, we need to add essential dependencies.

1. Add the following dependencies to SceneBuilder:
   1. `io.github.palexdev:materialfx:11.16.1`
   2. `org.kordamp.ikonli:ikonli-fontawesome-pack:12.3.1`
   3. `org.kordamp.ikonli:ikonli-fontawesome5-pack:12.3.1`
   4. `org.kordamp.ikonli:ikonli-javafx:12.3.1`

2. To add these dependencies, follow these steps within SceneBuilder:
   1. Select the **Empty** desktop application option.
   2. On the left panel, click the gear icon next to "Library" and the search bar.
   3. Choose **JAR/FXML Manager**.
   4. Click **Search repositories**.
   5. Search and add the dependencies one by one:
      1. `io.github.palexdev:materialfx`
      2. `org.kordamp.ikonli:ikonli-fontawesome-pack`
      3. `org.kordamp.ikonli:ikonli-fontawesome5-pack`
      4. `org.kordamp.ikonli:ikonli-javafx`
   6. Select each item from the search results and click **Add Jar**.
   7. Choose **Import Component**.
   8. Repeat these steps until all dependencies are added.

### Setting Up IntelliJ IDEA IDE
1. Open IntelliJ IDEA and select **Get from VCS**.
2. In the "GitHub" tab, log in to your GitHub account.
3. Click the "Repository URL" tab and paste the project URL: `https://github.com/XAPHNE/StudentManagementSystem`. Then click **Clone**.

### Configuring XAMPP
1. Start both the MySQL and Apache servers.
2. Open a web browser and navigate to [`http://localhost/phpmyadmin/index.php`](http://localhost/phpmyadmin/index.php).
3. Click on **SQL** in the top navigation panel.
4. Copy and paste the following SQL code:

   ```sql
   CREATE DATABASE studentManagementSystem;
   CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';
   GRANT ALL PRIVILEGES ON studentManagementSystem.* TO 'admin'@'localhost';
   ```

5. Refresh the page and select the **studentManagementSystem** database from the left panel.
6. Click on **Import** in the top navigation panel.
7. Select **Choose file** and navigate to the `src/main/resources/com/xaphene/studentmanagementsystem/studentManagementSystem.sql` file within the project directory. Then click **Import**.

### Running the Project
You can run the project by pressing **`Shift + F10`** on the `src/main/java/com/xaphene/studentmanagementsystem/StudentManagementApplication.java` file.

Now, enjoy the benefits of our Student Management System!