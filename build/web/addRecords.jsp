
<h2>Entry form</h2>
<form role="form" action="saveuser.jsp" method="post"> 
    <label>Name:</label>
    <input type="text" class="form-control" name="studentname" placeholder="Enter Name of the student">            
    <label>Roll:</label>
    <input type="text" class="form-control" name="roll" placeholder="Enter roll">
    <label>Subject:</label>
    <select name="subject" class="form-control">
        <option  value="IT Enterpreneur" name="IT Enterpreneur">IT Enterpreneur</option>
        <option value="Human Resource Management" name="Human Resource Management" >Human Resource Management</option>
        <option value="Critical thinking and Decision Making" name="Critical thinking and Decision Making">Critical thinking and Decision Making</option>
        <option value="Organization Relation" name="Organization Relation">Organization Relation</option>
        <option value="High Speed and Multimedia Networking" name="High Speed and Multimedia Networking">High Speed and Multimedia Networking</option>
        <option value="Management Information System" name="Management Information System">Management Information System</option>
    </select>
     <label>Faculty:</label>
    <select name="class" class="form-control">
        <option value="bim1st" name="bim1st">BIM 1st</option>
        <option value="bim2nd" name="bim2nd">BIM 2nd</option>
        <option value="bim3rd" name="bim3rd">BIM 3rd</option>
        <option value="bim4th" name="bim4th">BIM 4th</option>
        <option value="bim5th" name="bim5th">BIM 5th</option>
        <option value="bim6th" name="bim6th">BIM 6th</option>
        <option value="bim7th" name="bim7th">BIM 7th</option>
        <option value="bim8th" name="bim8th">BIM 8th</option>    
    </select>
    <!--<input type="text" class="form-control" name="class" placeholder="Enter class">-->
     <label>Assignment:</label>
    <input type="text" class="form-control" name="assignment" placeholder="Enter marks secured in assignment">
     <label>Report:</label>
    <input type="text" class="form-control" name="report" placeholder="Enter marks secured in report">
     <label>Mid Term:</label>
    <input type="text" class="form-control" name="midterm" placeholder="Enter marks secured in midterm">
     <label>Presentation:</label>
    <input type="text" class="form-control" name="presentation" placeholder="Enter presentation">
     <label>PreBoard:</label>
    <input type="text" class="form-control" name="preboard" placeholder="Enter preboard">
     <label>Total:</label>
    <input type="text" class="form-control" name="total" placeholder="Enter total">
    <br>
    <button type="submit" class="btn btn-default">Submit</button>
</form>  