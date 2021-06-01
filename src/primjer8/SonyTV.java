package primjer8;

public class SonyTV implements TV {
    int program;
    int zvuk;
    boolean upaljeno;

    public SonyTV() {
        this.program = 0;
        this.zvuk = 10;
        this.upaljeno = false;
    }

    @Override
    public void upali() {
        this.upaljeno = true;
    }

    @Override
    public void ugasi() {
        this.upaljeno = false;
    }

    @Override
    public void pojacaj() {
        if (this.zvuk < 100)
            this.zvuk += 1;
    }

    @Override
    public void smanji() {
        if (this.zvuk > 0)
            this.zvuk -= 1;
    }

    @Override
    public void prebaci(int n) {
        this.program = n;
    }

    @Override
    public String toString() {
        return "SonyTV{" +
                "program=" + program +
                ", zvuk=" + zvuk +
                ", upaljeno=" + upaljeno +
                '}';
    }
}
