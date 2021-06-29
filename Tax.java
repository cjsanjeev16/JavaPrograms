/** Write a Java Program to input personal account number,
name and annual taxable income and calculate the tax as follows:
Total Annual Taxable Income Tax Rate 
Upto 1,00,000   No tax
From 1,00,001 to 1,50,000   10% of the annual income exceeding 1,00,000
From 1,50,001 to 2,50,000  5000 + 20% of the annual income exceeding 1,50,000
Above 2,50,000             25,000+30% of the annual income exceeding 2,50,000
Display the output in the following format:
Pan Number                  Name                 Tax-income            Tax
    _                         _                       _                 _ */

class Tax
{
    void main(String PanNumber,String name, double income,double Tax )
   {
    if(income <= 100000)
    {
        Tax = 0.0;//tax = 0
    }
    else if(income > 100000 && income <= 150000)
    {
        Tax = income* 10.0/100.0;//eg 250000* 10%
    }
    else if(income > 150000&& income <= 250000)
    {
       Tax = 5000 +  income * 20.0/100.0;
    }
    else 
        Tax = 25000 +  income * 30.0/100.0;
    }
}