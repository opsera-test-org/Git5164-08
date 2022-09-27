<%@ Page Language="C#" %>
 <script language="C#" runat="Server"> 
 void Page_Load(object sender, EventArgs e) 
 { 
lblMessage.Text = "Hello World !"; 
 }
 </script> 
<html> 
 <head> 
 <title>First ASP.NET page written in Notepad</title>
 </head>
 <body>
 <a>Test</a>
 <asp:Label ID="lblMessage" runat="Server" />
 </body> 
 </html>