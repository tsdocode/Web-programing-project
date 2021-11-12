<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div id="page-wrapper">
<h2>Edit Profile</h2>
<hr />
<div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title">Profile Form Elements</h3>
  </div>

  <div class="panel-body">
    <form action="#" role="form" id="validate_edit_profile_form">
      <fieldset>
        <label>First Name</label>
        <div class="form-group">
          <input
            class="form-control"
            placeholder="Enter the first name"
            name="firstName"
            type="text"
          />
        </div>
        <label>Last Name</label>
        <div class="form-group">
          <input
            class="form-control"
            placeholder="Enter the last name"
            name="lastName"
            type="text"
            value=""
          />
        </div>
        <label>Email</label>
        <div class="form-group">
          <input
            class="form-control"
            name="email"
            type="email"
            value=""
            readonly
          />
        </div>

        <label>Phone</label>
        <div class="form-group">
          <input
            class="form-control"
            placeholder="Enter your phone number"
            name="phone"
            type="text"
            value=""
          />
        </div>
        <label>Description</label>
        <div class="form-group">
          <textarea class="form-control" name="description" rows="4">
          </textarea>
        </div>
        <button class="btn btn-default" type="submit" value="Add">
          Submit Button
        </button>
        <button class="btn btn-default" type="reset">Reset Button</button>
      </fieldset>
    </form>
  </div>
</div>

	<!-- /.container-fluid -->
</div>