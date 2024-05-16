<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="ListServlet">Show Product<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="form.jsp">Add Product</a>
      </li>
     
    </ul>
<form class="form-inline my-2 my-lg-0" id="searchForm">
    <select class="form-control mr-sm-2" id="searchCriteria">
        <option value="id">ID</option>
        <option value="category">Category</option>
        <option value="name">Name</option>
    </select>
    <input class="form-control mr-sm-2" type="search" name="search" id="searchInput" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
</form>
  </div>
</nav>



<script>
    document.getElementById("searchForm").addEventListener("submit", function(event) {
    	 event.preventDefault();
        var searchCriteria = document.getElementById("searchCriteria").value;
        var searchValue = document.getElementById("searchInput").value;
        var actionURL;
        switch (searchCriteria) {
            case "id":
                actionURL = "GetServlet?id=" + searchValue;
                break;
            case "category":
                actionURL = "GetByCategoryServlet?category=" + searchValue;
                break;
            case "name":
                actionURL = "GetByProductName?name=" + searchValue;
                break;
            default:
                actionURL = "";
        }
        window.location.href = actionURL;
    });
</script>