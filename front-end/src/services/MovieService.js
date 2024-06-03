export default class MovieService {
    baseUri = "https://api.themoviedb.org/3/movie/top_rated";

    async getAllMovies() {
        const rawResponse = await fetch(this.baseUri, {
            headers: {
                'Authorization': 'Bearer TU_API_KEY_DE_TMDB', // Aquí es donde debes poner 'Bearer' antes de tu API Key
                'Accept': 'application/json'
            }
        });
        const response = await rawResponse.json();
        return response;
    }

    async getMovieById(id) {
        const rawResponse = await fetch(`${this.baseUri}/${id}`);
        const response = await rawResponse.json();
        return response;
    }
}
