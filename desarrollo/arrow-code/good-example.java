public class PermissionManager {
    public void deleteFile(User user, File file) {
        if (user == null || !user.isActive()) return;
        if (file == null) return;
        
        if (!user.hasPermission(file)) {
            System.out.println("No permission");
            return;
        }

        file.delete();
        System.out.println("Deleted");
    }
}
