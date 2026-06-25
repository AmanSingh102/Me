const express = require('express');
const router = express.Router();

// define the home page route
router.get('/', (req, res) => {
  res.send('Shops home page');
});
// define the about route
router.get('/about', (req, res) => {
  res.send('About shops');
});

// define a route with a parameter
router.get('/shoppost/:slug', (req, res) => {
  res.send(`fetching shop post with slug: ${req.params.slug}`);
});

module.exports = router;