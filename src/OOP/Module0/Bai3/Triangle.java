package OOP.Module0.Bai3;

public class Triangle {
    private float edgeAB;
    private float edgeBC;
    private float edgeCA;

    public Triangle() {
        edgeAB = 0.0f;
        edgeBC = 0.0f;
        edgeCA = 0.0f;
    }

    public Triangle(float edgeAB, float edgeBC, float edgeCA) {
        if (edgeAB >= 0) {
            this.edgeAB = edgeAB;
        } else {
            this.edgeAB = 0.0f;
        }

        if (edgeBC >= 0) {
            this.edgeBC = edgeBC;
        } else {
            this.edgeBC = 0.0f;
        }

        if (edgeCA > 0) {
            this.edgeCA = edgeCA;
        } else {
            this.edgeCA = 0.0f;
        }
    }

    public void setEdgeAB(float edgeAB) {
        if (edgeAB >= 0) {
            this.edgeAB = edgeAB;
        } else {
            this.edgeAB = 0.0f;
        }
    }

    public void setEdgeBC(float edgeBC) {
        if (edgeBC >= 0) {
            this.edgeBC = edgeBC;
        } else {
            this.edgeBC = 0.0f;
        }
    }

    public void setEdgeCA(float edgeCA) {
        if (edgeAB >= 0) {
            this.edgeAB = edgeAB;
        } else {
            this.edgeAB = 0.0f;
        }
    }

    public float getEdgeAB() {
        return edgeAB;
    }

    public float getEdgeBC() {
        return edgeBC;
    }

    public float getEdgeCA() {
        return edgeCA;
    }

    public float perimeter() {
        return edgeAB + edgeBC + edgeCA;
    }

    public float acreage() {
        float p = (edgeAB + edgeBC + edgeCA) / 2;

        double acr = Math.sqrt(p * (p - edgeAB) * (p - edgeBC) * (p - edgeCA));

        return (float) acr;
    }

    public String triangleType() {
        boolean equilateral = false;
        boolean isosceles = false;
        boolean right = false;
        boolean isTriangle = true;

        if (edgeAB + edgeBC <= edgeCA || edgeBC + edgeCA <= edgeAB || edgeCA + edgeAB <= edgeBC) {
            isTriangle = false;
        }

        if (edgeAB == edgeBC && edgeAB == edgeCA) {
            equilateral = true;
        }

        if (edgeAB == edgeBC || edgeBC == edgeCA || edgeCA == edgeAB) {
            isosceles = true;
        }

        if (edgeAB * edgeAB + edgeBC * edgeBC == edgeCA * edgeCA || edgeBC * edgeBC + edgeCA * edgeCA == edgeBC * edgeAB || edgeCA * edgeCA + edgeAB * edgeAB == edgeBC * edgeBC) {
            right = true;
        }

        if (!isTriangle) {
            return "Not triangle!!!";
        } else {
            if (isosceles) {
                return "Is equilateral triangle!!!";
            } else if (isosceles && right) {
                return "Is isosceles right triangle!!!";
            } else if (isosceles) {
                return "Is isosceles triangle!!!";
            } else if (right) {
                return "Is right triangle!!!";
            } else {
                return "Is triangle!!!";
            }
        }
    }

    public String toString() {
        return String.format("%-10.2f %-10.2f %-10.2f %-20s %10.3f %10.3f", edgeAB, edgeBC, edgeCA, triangleType(), perimeter(), acreage());
    }
}
