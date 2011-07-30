package book

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/15/11
 * Time: 3:13 PM
 * To change this template use File | Settings | File Templates.
 */

class Rational(n: Int, d: Int) extends Ordered[Rational]{
  require(d!=0)
  private val g = gcd(n,d)
  val numer = n/g
  val denumer = d/g
  def this(n: Int) = this(n, 1)
  override def toString = numer + "/" + denumer

  def +(that: Rational): Rational =
    new Rational(
          this.numer*that.denumer+this.denumer*that.numer,
          this.denumer*that.denumer
    )
  def +(int: Int): Rational =
    new Rational(this.numer+this.denumer*int, this.denumer)

  def -(that:Rational): Rational =
    new Rational(
      this.numer*that.denumer-this.denumer*that.numer,
      this.denumer*that.denumer
    )
  def -(int: Int): Rational =
    new Rational(numer - int * denumer, denumer)

  def *(that: Rational): Rational =
    new Rational(
          this.numer*that.numer,
          this.denumer*that.denumer
    )
  def *(int: Int): Rational = new Rational(this.numer*int, this.denumer)

  def /(that: Rational): Rational =
    new Rational(
          this.numer*that.denumer,
          this.denumer*that.numer
    )
  def /(int: Int): Rational = new Rational(this.numer, this.denumer*int)

  def lessThan(that: Rational): Boolean =
      this.numer*that.denumer < this.denumer*that.numer
  def max(that: Rational): Rational = if(this.lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int =
    if(b==0) a else gcd(b, a%b)

  def compare(that: Rational): Int = (this.numer*that.denumer) - (this.denumer*that.numer)
}