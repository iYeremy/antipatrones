public class PermissionManager {
    public void deleteFile(User user, File file) {
        if (user != null) {
            if (user.isActive()) {
                if (file != null) {
                    if (user.hasPermission(file)) {
                        file.delete();
                        System.out.println("Deleted");
                    } else {
                        System.out.println("No permission");
                    }
                }
            }
        }
    }
}
