package TO.project.CinemaStreet;

import java.util.Arrays;

public enum Roles {
    EMPLOYEE("EMPLOYEE"),
    MODERATOR("MODERATOR"),
    ADMIN("ADMIN");

    private final String role;

    final Permissions[] employee = {
            Permissions.VIEW_USERS,
            Permissions.VIEW_RECOMMENDED_MOVIES,
            Permissions.VIEW_MOVIES,
            Permissions.UPDATE_HALLS,
            Permissions.VIEW_HALLMOVIES,
    };
    final Permissions[] moderator = {
            Permissions.VIEW_USERS,
            Permissions.ADD_USER,
            Permissions.SEND_MAILS,
            Permissions.VIEW_RECOMMENDED_MOVIES,
            Permissions.VIEW_MOVIES,
            Permissions.EDIT_MOVIES,
            Permissions.REMOVE_MOVIES,
            Permissions.ADD_MOVIES,
            Permissions.EDIT_RECOMMENDATIONS,
            Permissions.REMOVE_RECOMMENDATIONS,
            Permissions.VIEW_HALLMOVIES,
    };
    final Permissions[] admin = {
            Permissions.VIEW_USERS,
            Permissions.ADD_USER,
            Permissions.EDIT_USER,
            Permissions.REMOVE_USER,
            Permissions.SEND_MAILS,
            Permissions.VIEW_MOVIES,
            Permissions.VIEW_RECOMMENDED_MOVIES,
            Permissions.EDIT_MOVIES,
            Permissions.REMOVE_MOVIES,
            Permissions.ADD_MOVIES,
            Permissions.EDIT_RECOMMENDATIONS,
            Permissions.REMOVE_RECOMMENDATIONS,
            Permissions.SELL_TICKETS,
            Permissions.UPDATE_HALLS,
            Permissions.VIEW_HALLMOVIES,

    };

    Roles(String role) {
        this.role = role;
    }

    public boolean authorize(Permissions permission) {
//        temporary solution
//        return true;
        return switch (role) {
            case "EMPLOYEE" -> Arrays.asList(employee).contains(permission);
            case "MODERATOR" -> Arrays.asList(moderator).contains(permission);
            case "ADMIN" -> true;
            default -> false;
        };

    }

    @Override
    public String toString() {
        return role;
    }
}