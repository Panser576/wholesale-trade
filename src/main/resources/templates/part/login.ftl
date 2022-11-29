<#macro login path>
<form action="${path}" method="post">
  <div><label> User Name : <input type="text" name="username"/> </label></div>
  <div><label> Password: <input type="password" name="password"/> </label></div>
  <input type="hidden" name="csrf" value="${ csrf.token}" />
  <div><input type="submit" value="Sign In"/></div>
</form>

</#macro>