//Part (a)

public class SubstringChecker implements Checker
{
  private String substr;

  public SubstringChecker(String s)
  {
    this.substr = s;
  }

  public boolean accept(String text)
  {
    return text.indexOf(this.substr) >= 0;
  }
}


//Part (b)

public class AndChecker implements Checker
{
  private Checker checker1
  private Checker checker2;

  public AndChecker(Checker c1, Checker c2)
  {
    this.checker1 = c1;
    this.checker2 = c2;
  }

  public boolean accept(String text)
  {
    return this.checker1.accept(text) &&
            this.checker2.accept(text);
  }
}


//Part (c)

    yummyChecker = new AndChecker(new NotChecker(aChecker),
            new NotChecker(kChecker));







