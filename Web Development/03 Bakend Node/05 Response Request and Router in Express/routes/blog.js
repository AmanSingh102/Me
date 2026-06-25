const express = require('express');
const router = express.Router();

// define the home page route
router.get('/', (req, res) => {
  res.send('Blogs home page');
});
// define the about route
router.get('/about', (req, res) => {
  res.send('About blogs');
});

// define a route with a parameter
router.get('/blogpost/:slug', (req, res) => {
  res.send(`fetching blog post with slug: ${req.params.slug}`);
});

module.exports = router;