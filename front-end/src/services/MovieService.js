export default class MovieServie {
    baseUri = "https://api.themoviedb.org/3/movie/top_rated"

    async getAllMovies() {
        const rawResponse = await fetch(this.baseUri, {
            headers: {
                'Authorization': ' Bearer ACCESS_TOKEN',
                'Accept' : 'application/json'
            }
        })
        const response = await rawResponse.json()
        return response
    }

    async getMovieById(id) {
        const rawResponse = await fetch(`${this.baseUri}/${id}`)
        const response = await rawResponse.json()
        return response
    }
}