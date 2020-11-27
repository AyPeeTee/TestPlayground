public enum LanguageManager {
    INSTANCE;

    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public static void languageChanger(){
        InputManager.newInput();
        if (InputManager.input.equals("cs")) {
            LanguageManager.INSTANCE.setLanguage(Language.CESTINA);
        } else if (InputManager.input.equals("en")) {
            LanguageManager.INSTANCE.setLanguage(Language.ENGLISH);
        }
    }
}
