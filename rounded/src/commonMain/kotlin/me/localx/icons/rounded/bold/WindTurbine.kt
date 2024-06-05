package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.WindTurbine: ImageVector
    get() {
        if (_windTurbine != null) {
            return _windTurbine!!
        }
        _windTurbine = Builder(name = "WindTurbine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.452f, 13.059f)
                curveToRelative(-1.248f, -0.998f, -3.523f, -2.771f, -5.524f, -4.087f)
                curveToRelative(-0.286f, -2.376f, -0.858f, -5.205f, -1.194f, -6.768f)
                curveToRelative(-0.278f, -1.297f, -1.403f, -2.204f, -2.733f, -2.204f)
                reflectiveCurveToRelative(-2.455f, 0.906f, -2.733f, 2.203f)
                curveToRelative(-0.336f, 1.563f, -0.908f, 4.392f, -1.194f, 6.768f)
                curveToRelative(-2.001f, 1.317f, -4.276f, 3.09f, -5.523f, 4.087f)
                curveToRelative(-1.021f, 0.814f, -1.338f, 2.257f, -0.753f, 3.43f)
                curveToRelative(0.593f, 1.19f, 1.903f, 1.791f, 3.191f, 1.464f)
                curveToRelative(1.336f, -0.342f, 3.524f, -0.931f, 5.527f, -1.588f)
                verticalLineToRelative(4.636f)
                horizontalLineToRelative(-2.014f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.986f)
                verticalLineToRelative(-4.627f)
                curveToRelative(1.995f, 0.654f, 4.17f, 1.239f, 5.5f, 1.579f)
                curveToRelative(0.235f, 0.06f, 0.47f, 0.089f, 0.702f, 0.089f)
                curveToRelative(1.039f, 0.0f, 2.003f, -0.58f, 2.489f, -1.553f)
                curveToRelative(0.584f, -1.172f, 0.268f, -2.614f, -0.752f, -3.43f)
                close()
                moveTo(12.552f, 12.849f)
                curveToRelative(-0.354f, -0.14f, -0.749f, -0.14f, -1.104f, 0.0f)
                curveToRelative(-1.851f, 0.732f, -4.451f, 1.472f, -6.27f, 1.954f)
                curveToRelative(1.4f, -1.099f, 3.433f, -2.639f, 5.103f, -3.685f)
                curveToRelative(0.395f, -0.247f, 0.652f, -0.663f, 0.697f, -1.126f)
                curveToRelative(0.191f, -1.958f, 0.663f, -4.464f, 1.022f, -6.209f)
                curveToRelative(0.359f, 1.745f, 0.831f, 4.252f, 1.022f, 6.209f)
                curveToRelative(0.045f, 0.463f, 0.302f, 0.879f, 0.697f, 1.126f)
                curveToRelative(1.67f, 1.045f, 3.703f, 2.586f, 5.103f, 3.685f)
                curveToRelative(-1.819f, -0.482f, -4.418f, -1.221f, -6.27f, -1.954f)
                close()
            }
        }
        .build()
        return _windTurbine!!
    }

private var _windTurbine: ImageVector? = null
