package Problem3;

// classes
public class Money {
    private long dollars;
    private long cents;

    // constructor that splits double into dollars and cents
    public Money(double amount) {
        dollars = (long) amount;
        cents = Math.round((amount - dollars) * 100);
    }

    // copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // adds another money to this one and return new one
    public Money add(Money other) {
        long totalCents = this.toCents() + other.toCents();
        return fromCents(totalCents);
    }

    // subtracts another money from this one and return new one
    public Money subtract(Money other) {
        long totalCents = this.toCents() - other.toCents();
        return fromCents(totalCents);
    }

    // bigger/smaller/same compare
    public int compareTo(Money other) {
        return Long.compare(this.toCents(), other.toCents());
    }

    // check if equal
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    // format
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    // one cent amount
    private long toCents() {
        return dollars * 100 + cents;
    }

    // total cents to money
    private Money fromCents(long cents) {
        long d = cents / 100;
        long c = cents % 100;
        Money m = new Money(0);
        m.dollars = d;
        m.cents = c;
        return m;
    }
}
