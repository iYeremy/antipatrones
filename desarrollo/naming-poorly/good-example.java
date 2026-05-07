public class UserManager {
    public void printActiveUsers(List<User> users) {
        for (User user : users) {
            if (user.isActive()) {
                System.out.println(user.getFullName());
            }
        }
    }
}
