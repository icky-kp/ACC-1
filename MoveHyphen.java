class MoveHyphen {
    static String moveHyphenToFront(String str) {
        StringBuilder hyphens = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '-') {
                hyphens.append(c); // Collect hyphens
            } else {
                others.append(c); // Collect non-hyphen characters
            }
        }

        return hyphens.append(others).toString(); // Combine hyphens and others
    }

    public static void main(String[] args) {
        String input = "a-bc-d-e";
        String result = moveHyphenToFront(input);
        System.out.println("Result: " + result);
    }
}
