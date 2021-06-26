import numpy as np
def vec_est_Stochastique (v) : 
        if sum(v) == 1 : 
            return True
        return False

def m_est_Stochastique(p) : 
    for v in (p) : 
        if not vec_est_Stochastique(v) : 
            return False
    return True

def matrice_puissance(list, puissance) : 
    p = np.matrix(np.array(list))
    return p**puissance

matrice = [
    [0,0.6,0.4,0], 
    [0.8,0,0.2,0],
    [0,0.5,0.5,0], 
    [0,0,1,0],
]


print(
    m_est_Stochastique(
        matrice
    )
)

print(matrice_puissance(matrice,4))
