package LibrarySystem;

import Factory.SchoolManagementApp;

public class LibrarySystemAdapter implements SchoolManagementApp {
    LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }
    @Override
    public String integrateSystem() {
        return librarySystem.manageBooks();
    }
}
