public class Main
{
    public int input1;
    public int input2;
    public int output;
    public int arithmeticOperations(int input1,int input2)
    {
        return 0;
    }
}

class OpAdd extends Main
{
    public int arithmeticOperations(int input1,int input2)
    {
        output=input1+input2;
        return output;
    }
}

class OpSub extends Main
{
    public int arithmeticOperations(int input1,int input2)
    {
        output=input1-input2;
        return output;
    }
}

class OpMul extends Main
{
    public int arithmeticOperations(int input1,int input2)
    {
        input1=input1*input2;
        return output;
    }
}

class OpDiv extends Main
{
    public int arithmeticOperations(int first,int second)
    {
        input1=input1/input2;
        return output;
    }
}