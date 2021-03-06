import java.util.Calendar;
public class MercadoDeEscobas {
        private Integer numeroArbitrario=100;
        private int longitud=100;
        private Integer anioDeCreacion=2019;

        public Integer getNumeroArbitrario(){
            return this.numeroArbitrario;
        }
        /** Seteamos un randmon, pero elegimos un numero arbitrario**/
        // public int getRandomElement(List<Integer> list)
        {
            //  Random rand = new Random();
            //   return list.get(rand.nextInt(list.size()));
        }
        //Los intervalos de números (rangos) son colecciones que pueden crearse como:
        // List<Integer> rango = IntStream.range(1, numeroAleatorio).boxed().collect(Collectors.toList());

        // public void actualizarMercado() {
        // this.numeroAleatorio=getRandomElement(this.list);
        //
        public Integer anioActual(){
            return Calendar.getInstance().get(Calendar.YEAR);
        }
        public Integer difDeAnios(){
            return anioActual()-anioDeCreacion;
        }

        public Integer actualizarMercadoDeEscobas(){
            return numeroArbitrario+difDeAnios();
        }
        public boolean debeActualizarMercadodeEscobas(){
            return difDeAnios()>0;
        }
        public Integer numeroArbitrario(){
            return getNumeroArbitrario()+difDeAnios();
        }
}


