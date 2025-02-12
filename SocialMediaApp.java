class User {
    int userId;
    String name;
    int age;
    User next;
    LinkedList<Integer> friends;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new LinkedList<>();
        this.next = null;
    }
}

class SocialMedia {
    private User head;

    public SocialMedia() {
        this.head = null;
    }

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
    }

    public void addFriend(int userId, int friendId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                current.friends.add(friendId);
                break;
            }
            current = current.next;
        }
    }

    public void removeFriend(int userId, int friendId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                current.friends.remove(Integer.valueOf(friendId));
                break;
            }
            current = current.next;
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        User user1 = null, user2 = null;
        User current = head;
        while (current != null) {
            if (current.userId == userId1) user1 = current;
            if (current.userId == userId2) user2 = current;
            current = current.next;
        }

        if (user1 != null && user2 != null) {
            System.out.println("Mutual Friends:");
            for (Integer friendId : user1.friends) {
                if (user2.friends.contains(friendId)) {
                    System.out.println(friendId);
                }
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void displayFriends(int userId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                System.out.println("User " + current.name + "'s Friends:");
                for (Integer friendId : current.friends) {
                    System.out.println(friendId);
                }
                break;
            }
            current = current.next;
        }
    }

    public void searchUser(int userId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                System.out.println("User found: " + current.name + ", Age: " + current.age);
                return;
            }
            current = current.next;
        }
        System.out.println("User not found.");
    }

    public void countFriends(int userId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                System.out.println("User " + current.name + " has " + current.friends.size() + " friends.");
                return;
            }
            current = current.next;
        }
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.addUser(1, "Alice", 25);
        socialMedia.addUser(2, "Bob", 28);
        socialMedia.addUser(3, "Charlie", 22);

        socialMedia.addFriend(1, 2);
        socialMedia.addFriend(2, 3);

        socialMedia.displayFriends(1);
        socialMedia.findMutualFriends(1, 2);
        socialMedia.countFriends(2);
    }
}
