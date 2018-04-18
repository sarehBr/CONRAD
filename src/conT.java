
import ij.ImageJ;
import edu.stanford.rsl.conrad.data.numeric.Grid3D;
import edu.stanford.rsl.conrad.data.numeric.NumericPointwiseOperators;
import edu.stanford.rsl.conrad.geometry.trajectories.Trajectory;
import edu.stanford.rsl.conrad.phantom.NumericalSheppLogan3D;
import edu.stanford.rsl.conrad.utils.Configuration;
import edu.stanford.rsl.tutorial.cone.ConeBeamBackprojector;
import edu.stanford.rsl.tutorial.cone.ConeBeamCosineFilter;
import edu.stanford.rsl.tutorial.filters.RamLakKernel;

public class conT {
	public static void main(String[] args) {
		
		new ImageJ();
		Trajectory geo=new Trajectory();
		
		//int a=geo.setReconDimensionX(265);
		geo.setReconDimensionY(256);
		geo.setReconDimensionZ(256);
		Grid3D test3D = new NumericalSheppLogan3D(256,256, 256).getNumericalSheppLoganPhantom();
	}
}
