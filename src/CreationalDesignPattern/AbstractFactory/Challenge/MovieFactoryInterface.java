package CreationalDesignPattern.AbstractFactory.Challenge;

interface MovieFactoryInterface {
    HollyWoodMovieInterface GetHollyWoodMovie(String type);
    BollyWoodMovieInterface GetBollyWoodMovie(String type);
}

class HollyWoodMovieFactory implements MovieFactoryInterface {
    public HollyWoodMovieInterface GetHollyWoodMovie(String type)
    {
        if (type.equalsIgnoreCase("action"))
            return new HollyWoodActionMovie();
        else if (type.equalsIgnoreCase("comedy"))
            return new HollyWoodComedyMovie();

        return null;
    }

    public BollyWoodMovieInterface GetBollyWoodMovie(String type) {
        return null;
    }
}

class BollyWoodMovieFactory implements MovieFactoryInterface {
    public HollyWoodMovieInterface GetHollyWoodMovie(String type)
    {
        return null;
    }

    public BollyWoodMovieInterface GetBollyWoodMovie(String type) {
        if(type.equalsIgnoreCase("action"))
            return new BollyWoodActionMovie();
        else if (type.equalsIgnoreCase("comedy"))
            return new BollyWoodComedyMovie();

        return null;
    }
}

