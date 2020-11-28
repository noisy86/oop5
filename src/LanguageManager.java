
public enum LanguageManager {
    INSTANCE;

    private Language language;

    public Language getLanguage() {

        if (InputManager.INSTANCE.getScanner().equals("cs")) {
            this.language = language.CESTINA;
        } else if (InputManager.INSTANCE.getScanner().equals("en")) {
            this.language = language.ENGLISH;
        }
        return this.language;

    }

}
