class Solution {
    public int evalRPN(String[] tokens) {
Stack<Integer> st = new Stack<>();

for(String ope : tokens){
    if(ope.equals("+")){
        st.push(st.pop() + st.pop());
    }
    else if(ope.equals("-")){
        int a = st.pop();
        int b = st.pop();
        st.push(b-a);
    }
    else if(ope.equals("*")){
        st.push(st.pop() * st.pop());
    }
    else if(ope.equals("/")){
        int a = st.pop();
        int b = st.pop();

        st.push(b/a);
    }
    else{
        st.push(Integer.parseInt(ope));
    }
}
return st.pop();

       
        
    }
}
