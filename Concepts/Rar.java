class Rar {
    int id;
    String name;
    Chaitanya[] closeMembers;

    Chaitanya(int id, String name) {
        this.id = id;
        this.name = name;
        this.closeMembers = new Chaitanya[10];
    }

    public String toString(int members) {
        String f = "";
        for (int i = 0; i < members; i++) {
            f = f + " " + closeMembers[i].name;
        }
        return "I'm " + this.name + " my close members are " + f;
    }

    public static void main(String[] args) {
        int members = 0;
        Chaitanya a = new Chaitanya(12234, "Chaitanya");
        Chaitanya b = new Chaitanya(34566, "Bharath");
        Chaitanya c = new Chaitanya(67899, "Chandu");
        members++;
        a.closeMembers[0] = b;
        System.out.println(a.toString(members));
        members = 0;

        b.closeMembers[0] = a;
        members++;

        b.closeMembers[1] = c;
        members++;

        System.out.println(b.toString(members));

        members = 0;
        c.closeMembers[0] = b;
        members++;
        System.out.println(c.toString(members));

    }
}