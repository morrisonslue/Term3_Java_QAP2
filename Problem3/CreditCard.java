package Problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // new card
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); // note to self: constructor
        this.balance = new Money(0.0); // start at zero
    }

    // return balance
    public Money getBalance() {
        return new Money(balance);
    }

    // return limit
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    // add to balance if not over limit
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            System.out.println("Charge: " + amount);
            balance = newBalance;
        } else {
            System.out.println("Over credit limit");
        }
    }

    // subtract from balance
    public void payment(Money amount) {
        System.out.println("Payment: " + amount);
        balance = balance.subtract(amount);
    }
}
