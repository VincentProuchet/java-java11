package java8.ex02;

import java.util.List;

import org.junit.Test;

import java8.data.Data;
import java8.data.Person;

/**
 * Exercice 02 - Redéfinition
 */
public class Method_02_Test {

	// tag::IDao[]
	interface IDao {
		List<Person> findAll();

		/**
		 * @return la méthode retourne une chaîne de
		 *  la forme [<nb_personnes> persons] 
		 *   exemple de résultat : "[14 persons]"
		 * "[30 persons]"
		 */
		public default String format() {
			StringBuilder stringBuilder = new StringBuilder();
			return stringBuilder.append("[").append(findAll().size()).append(" persons]").toString();
		}

	}
	// end::IDao[]

	// tag::DaoA[]
	class DaoA implements IDao {

		List<Person> people = Data.buildPersonList(20);

		@Override
		public List<Person> findAll() {
			return people;
		}

		/**
		 * redéfinit la méthode String format()
		 * 
		 * @return une chaîne de la forme DaoA[<nb_personnes> persons]
		 *  l'implémentation réutilise la méthode format() de l'interface
		 */
		@Override
		public String format() {
			// TODO Auto-generated method stub
			return new StringBuilder().append("DaoA").append(IDao.super.format()).toString();
		}

	}
	// end::DaoA[]

	@Test
	public void test_daoA_format() throws Exception {

		DaoA daoA = new DaoA();

		// TODO invoquer la méthode format() pour que le test soit passant
		String result = daoA.format();

		assert "DaoA[20 persons]".equals(result);
	}
}
