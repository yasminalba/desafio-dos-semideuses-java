public class semideuses extends  deuses implements joguinho{
    private String efeitoColateral;
    private String nomedoPai;
    @Override
    public void executarminijoguinho(){
        if (getEscolha() == 1) {
            minijogos.minijoguinhoPercy();
        } else if (getEscolha() == 2) {
            minijogos.minijogoAnabaeth();
        } else if (getEscolha() == 3) {
            minijogos.minijoguinhoNico();
        }else if (getEscolha() == 4){
            minijogos.minijoguinhoThalia();
        }
    }
    public String getEfeitoColateral() {
        return efeitoColateral;
    }

    public void setEfeitoColateral(String efeitoColateral) {
        this.efeitoColateral = efeitoColateral;
    }

    public String getNomedoPai() {
        return nomedoPai;
    }

    public void setNomedoPai(String nomedoPai) {
        this.nomedoPai = nomedoPai;
    }
}
