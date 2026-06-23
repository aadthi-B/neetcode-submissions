class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            String str=tokens[i];
            if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")) {
                int m=str.length();
                int num=Integer.parseInt(str);
                stack.push(num);
            }
            else{
                if(str.charAt(0)=='+'){
                    int second=stack.pop();
                    int first=stack.pop();
                    int s=first+second;
                    stack.push(s);
                }
                if(str.charAt(0)=='-'){
                    int second=stack.pop();
                    int first=stack.pop();
                    int s=first-second;
                    stack.push(s);
                }
                if(str.charAt(0)=='*'){
                   int second=stack.pop();
                    int first=stack.pop();
                    int s=first*second;
                    stack.push(s);
                }
                if(str.charAt(0)=='/'){
                    int second=stack.pop();
                    int first=stack.pop();
                    int s=first/second;
                    stack.push(s);
                }
            }
        }
        return stack.pop();
    }
}
