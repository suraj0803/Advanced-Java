<%@page errorPage="error.jsp" %>
<%!
    public double total(double basic, double hr, double ta, double pf){
    if(basic <= 0){
            throw new IllegalArgumentException("Amount should be greater than 0:"+ basic);  
        }
        if(hr <= 0){
            throw new IllegalArgumentException("Interest should be greater than 0:"+ hr);  
        }
        if(ta <= 0){
            throw new IllegalArgumentException("Period should be greater than 0:"+ ta);  
        }
        if(pf <= 0){
            throw new IllegalArgumentException("Period should be greater than 0:"+ pf);  
        }

        double total = basic + hr + ta;
        total -= total*0.01*pf;

        return total;
}
%>

<html>
    <head>
        <title>Salary Calculate</title>
    </head>
    <style>
        h1{text-align: center;}
        p{text-align: center;}
        table.center{
            margin-left: auto;
            margin-right: auto;
        }
    </style>
    <body style="font-family: verdana; font-size: 10pt;">
        <%
            String name = request.getParameter("name");
            double basic = Double.valueOf(request.getParameter("basic"));
            double hr = Double.valueOf(request.getParameter("hr"));
            double ta = Double.valueOf(request.getParameter("ta"));
            double pf = Double.valueOf(request.getParameter("pf"));
            double gross = basic+hr+ta;

       
        %>
        <h1>ABC Company</h1>
        <p>Hello <%=name%></p>
        
        <table class="center" border = "1" style = "font-family:verdana; font-size: 10pt; border-collapse: collapse; width: 50%; background-color: #cccccc;">
            <tr style="background-color: #cccccc">
                <th>Earnings and Deductions</th>
                <th>Amount</th>
            </tr>
            <tr style="background-color: #ffffff">
                <th>Basic Salary</th>
                <td><%=basic%></td>
            </tr>
            <tr style="background-color: #cccccc">
                <th>HR Allowance</th>
                <td><%=hr%></td>
            </tr>
            <tr style="background-color: #ffffff">
                <th>Travel Allowance</th>
                <td><%=ta%></td>
            </tr>
            <tr style="background-color: #cccccc">
                <th>PF Deduction(in %)</th>
                <td><%=pf%></td>
            </tr>
            <tr style="background-color: #ffffff">
                <th>Gross Salary</th>
                <td><%=gross%></td>
            </tr>
            <tr style="background-color: #cccccc">
                <th>Net Salary</th>
                <td><%=total(basic,hr,ta,pf)%></td>
            </tr>
        </table>
    </body>
</html>
