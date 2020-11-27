public enum LanguageManager {
    INSTANCE;

    private Language language;

    public Language setLanguage() {
        if (InputManager.INSTANCE.getScanner().equals("cs")) {
            System.out.println(Language.CESTINA);
        } else if (InputManager.INSTANCE.getScanner().equals("en")) {
            System.out.println(Language.ENGLISH);

        }
        return this.language;

    }
}
