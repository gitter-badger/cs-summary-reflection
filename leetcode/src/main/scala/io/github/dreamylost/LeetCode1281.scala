package io.github.dreamylost

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/3/12
 */
object LeetCode1281 extends App {
  def subtractProductAndSum(n: Int): Int = {
    val f = n.toString.toCharArray.map(c => Integer.parseInt(c + ""))
    f.product - f.sum
  }

  Console println subtractProductAndSum(234)
}
