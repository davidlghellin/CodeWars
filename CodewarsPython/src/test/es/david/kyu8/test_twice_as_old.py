import pytest

from src.main.es.david.kyu8.TwiceAsOld import twice_as_old


class TestTwiceAsOld:

    def test_twice_as_old(self):
        assert twice_as_old(55, 30) == 5
        assert twice_as_old(42, 21) == 0
        assert twice_as_old(36, 7) == 22
        assert twice_as_old(22, 1) == 20
        assert twice_as_old(29, 0) == 29

    @pytest.mark.parametrize('edad_padre, edad_hijo, result', [(55, 30, 5),
                                                               (42, 21, 0),
                                                               (36, 7, 22)
                                                               ])
    def test_twice_as_old(self, edad_padre, edad_hijo, result):
        assert result == twice_as_old(edad_padre, edad_hijo)
