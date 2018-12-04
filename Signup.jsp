<%-- 
    Document   : neSignup
    Created on : Dec 2, 2018, 7:58:07 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>

<html>
    <head>
        <style>
         .demo{
    border:0.5px solid black;    
    box-shadow: 30px 30px 35px ;
    border-radius: 15px;
    }
    body{
    background-image: url("action-blur-close-up-735911.jpg");
    background-size: 1790px;
    background-repeat: no-repeat;

}
.content {
    max-width: 500px;
    margin: auto;
    padding: 150px;
    animation-name:test;
    animation-duration: 3s; 
    animation-fill-mode: forwards;
}
@keyframes test{
    0%{
        width: 400px;
        height: 600px;
        
    }
    100%{
        width: 600px;
        
    }
    0%{
        opacity: 0;
    }
    100%{
        opacity: 1;
    }
    
}
.content{
    top:100px;
}
.rnd{
    border-radius: 15px;
    background: rgba(0,0,0,0);
    opacity: .6;
    color: white;

}
.rnd::placeholder{
    color:white;
}
.abc{
    
    box-shadow: 10px 10px 15px dodgerblue;
    width:50px;
    height:50px;
    //  border: 2px solid black;
    position: relative;
    top:20%;
    left:8%;
}
</style>
    </head>
  
        <div class="content" ><form action="Signup" method="get">
                 <div class="demo">
        <div class="abc"><img src="Quikr1-Logo.png" height="70px" width="90px"></div>
        <pre>
            <p class="rnd">                          &nbsp;Firstname: </p>   
                     <input type="text" name="fn" placeholder="Enter first name" required>
         <p class="rnd">                           Lastname:      </p><br> 
                     <input type="text" name="ln" placeholder="Enter last name" required>
            <p class="rnd">                       &nbsp;  Date of Birth:  </p>
                     <input type="date" name="db" required>
            
            <p class="rnd">                        &nbsp; Phone Number:  </p>
                     <input type="tel" name="pn" placeholder="Enter phone number" maxlength="10" required>
            <p class="rnd">                         &nbsp;Enter Username: </p>
                     <input type="text" name="uname" placeholder="Enter username" required>
               <p class="rnd">                     &nbsp; &nbsp; &nbsp;  Password:</p>
                     <input type="password" name="password" placeholder="Enter a Password" required><br>
                            <button class="rnd" type="submit" >Submit</button>
        </pre>
        </div>
        </form>
        </div>
    </body>
</html>
