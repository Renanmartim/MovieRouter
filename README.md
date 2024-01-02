<h2>MovieStore Handler</h2>

<h2>Introduction</h2>
<p>This repository contains the <code>StoreHandler</code> class, a component in the MovieStore application designed to handle requests related to movie stores. The handler is implemented using Spring WebFlux, providing reactive programming support.</p>

<h2>Prerequisites</h2>
<ul>
    <li>Java</li>
    <li>Maven</li>
    <li>Spring Boot</li>
    <li>Spring Reactive</li>
    <li><a href="https://beanvalidation.org/">Jakarta Validation API</a></li>
</ul>

<h2>Installation</h2>
  <ol>
      <li>Clone the repository:</li>
      <code>git clone https://github.com/your-username/MovieStore.git</code>
      <li>Include the <code>StoreHandler</code> class in your project.</li>
      <li>Configure the necessary dependencies, including Spring Boot and Jakarta Validation API.</li>
  </ol>

<h2>Usage</h2>
  <p>Instantiate the <code>StoreHandler</code> class in your Spring application, providing the required dependencies (<code>StoreRepository</code> and <code>Validator</code>). Once instantiated, you can use its methods to handle incoming HTTP requests related to movie stores.</p>

<h3>Example Instantiation:</h3>
<code>StoreHandler storeHandler = new StoreHandler(storeRepository, validator);</code>

<h2>Endpoints</h2>

<h3>1. Add Movie</h3>
  <ul>
      <li>Endpoint: <code>/v1/add</code></li>
      <li>HTTP Method: POST</li>
      <li>Description: Adds a movie to the movie store.</li>
      <li>Request Body: JSON representation of <code>StoreEntity</code></li>
      <li>Response: HTTP 201 Created if successful</li>
  </ul>

<h3>2. Get All Movies</h3>
  <ul>
      <li>Endpoint: <code>/v1/get</code></li>
      <li>HTTP Method: GET</li>
      <li>Description: Retrieves all movies from the movie store.</li>
      <li>Response: HTTP 200 OK with a JSON array of <code>StoreEntity</code></li>
  </ul>

<h2>Contributing</h2>
  <p>Feel free to contribute to the development of this handler by opening issues or creating pull requests. Follow the established <a href="CONTRIBUTING.md">contributing guidelines</a> for a smooth collaboration.</p>

<h2>License</h2>
<p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>
