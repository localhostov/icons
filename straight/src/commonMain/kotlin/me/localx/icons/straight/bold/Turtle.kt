package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Turtle: ImageVector
    get() {
        if (_turtle != null) {
            return _turtle!!
        }
        _turtle = Builder(name = "Turtle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.958f, 10.345f)
                curveToRelative(-0.107f, -1.332f, -0.524f, -2.659f, -1.249f, -3.868f)
                curveToRelative(0.682f, -0.054f, 1.349f, -0.328f, 1.87f, -0.849f)
                curveToRelative(1.162f, -1.162f, 2.034f, -3.918f, 0.872f, -5.08f)
                curveToRelative(-1.162f, -1.162f, -3.918f, -0.29f, -5.08f, 0.872f)
                curveToRelative(-0.521f, 0.521f, -0.796f, 1.189f, -0.849f, 1.871f)
                curveToRelative(-1.208f, -0.724f, -2.535f, -1.141f, -3.867f, -1.248f)
                curveToRelative(-0.367f, -0.476f, -1.827f, -2.043f, -5.156f, -2.043f)
                horizontalLineToRelative(-2.531f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.531f)
                curveToRelative(0.191f, 0.0f, 0.359f, 0.014f, 0.527f, 0.027f)
                curveToRelative(-0.603f, 0.338f, -1.173f, 0.752f, -1.682f, 1.261f)
                curveToRelative(-1.308f, 1.308f, -2.577f, 3.508f, -3.403f, 5.829f)
                curveToRelative(-1.858f, 0.39f, -3.943f, 1.82f, -3.943f, 4.883f)
                curveToRelative(0.0f, 0.0f, 3.006f, 0.011f, 3.006f, 0.0f)
                curveToRelative(0.0f, 1.15f, 0.195f, 2.112f, 0.59f, 2.971f)
                curveToRelative(-1.272f, 1.655f, -2.096f, 4.529f, -2.096f, 4.529f)
                curveToRelative(0.0f, 0.0f, 2.88f, -0.826f, 4.534f, -2.1f)
                curveToRelative(0.877f, 0.394f, 1.89f, 0.568f, 2.965f, 0.571f)
                verticalLineToRelative(3.029f)
                curveToRelative(3.068f, 0.0f, 4.498f, -2.092f, 4.885f, -3.952f)
                curveToRelative(2.381f, -0.839f, 4.566f, -2.131f, 5.827f, -3.393f)
                curveToRelative(0.509f, -0.509f, 0.923f, -1.078f, 1.261f, -1.682f)
                curveToRelative(0.013f, 0.168f, 0.027f, 0.335f, 0.027f, 0.526f)
                verticalLineToRelative(2.531f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.531f)
                curveToRelative(0.0f, -3.324f, -1.564f, -4.785f, -2.042f, -5.155f)
                close()
                moveTo(10.0f, 17.927f)
                curveToRelative(-1.41f, 0.173f, -2.633f, 0.023f, -3.292f, -0.636f)
                curveToRelative(-0.606f, -0.606f, -0.82f, -1.786f, -0.643f, -3.292f)
                horizontalLineToRelative(3.935f)
                verticalLineToRelative(3.928f)
                close()
                moveTo(12.0f, 8.607f)
                lineToRelative(-2.311f, 0.619f)
                lineToRelative(-0.475f, 1.773f)
                horizontalLineToRelative(-2.397f)
                curveToRelative(0.675f, -1.845f, 1.688f, -3.629f, 2.651f, -4.591f)
                curveToRelative(0.706f, -0.706f, 1.588f, -1.144f, 2.533f, -1.319f)
                verticalLineToRelative(3.517f)
                close()
                moveTo(15.0f, 5.384f)
                curveToRelative(0.792f, 0.299f, 1.547f, 0.769f, 2.197f, 1.419f)
                curveToRelative(0.649f, 0.649f, 1.104f, 1.406f, 1.403f, 2.196f)
                horizontalLineToRelative(-3.6f)
                verticalLineToRelative(-3.615f)
                close()
                moveTo(17.591f, 14.534f)
                curveToRelative(-1.0f, 1.0f, -2.755f, 1.983f, -4.591f, 2.647f)
                verticalLineToRelative(-2.344f)
                lineToRelative(1.813f, -0.486f)
                lineToRelative(0.63f, -2.351f)
                horizontalLineToRelative(3.45f)
                curveToRelative(-0.176f, 0.943f, -0.597f, 1.829f, -1.302f, 2.534f)
                close()
            }
        }
        .build()
        return _turtle!!
    }

private var _turtle: ImageVector? = null
