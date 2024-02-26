public class Main {
    public static void main(String[] args) {
//Exercise 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + System.lineSeparator() + cat + System.lineSeparator() + paper);
//Exercise 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + System.lineSeparator() + cat + System.lineSeparator() + paper);
//Exercise 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + System.lineSeparator() + cat + System.lineSeparator() + paper);
//Exercise 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
//Exercise 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
//Exercise 6
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var difference = boxerTwo - boxerOne;
        var boxersTogether = boxerOne + boxerTwo;
        System.out.println(difference + System.lineSeparator() + boxersTogether);
//Exercise 7
        var divisionRemainder = boxerTwo % boxerOne;
        System.out.println(divisionRemainder);
//Exercise 8
        var workingHours = 640;
        var shiftLength = 8;
        System.out.println("Всего работников в компании " + workingHours / shiftLength + System.lineSeparator() + "если в компании работает 174 человека, то всего " + workingHours / 174 + " часа работы может быть поделено между сотрудниками." );
    }
}