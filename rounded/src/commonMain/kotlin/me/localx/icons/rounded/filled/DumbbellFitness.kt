package me.localx.icons.rounded.filled

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

public val Icons.Filled.DumbbellFitness: ImageVector
    get() {
        if (_dumbbellFitness != null) {
            return _dumbbellFitness!!
        }
        _dumbbellFitness = Builder(name = "DumbbellFitness", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 0.0f)
                curveTo(5.467f, 0.0f, 3.0f, 2.467f, 3.0f, 5.5f)
                reflectiveCurveToRelative(2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                reflectiveCurveTo(11.533f, 0.0f, 8.5f, 0.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24.009f, 19.094f)
                curveToRelative(0.0f, 1.174f, -0.682f, 2.232f, -1.747f, 2.727f)
                curveToRelative(-1.99f, 0.926f, -5.58f, 2.202f, -10.253f, 2.202f)
                curveToRelative(-4.905f, 0.0f, -9.169f, -2.343f, -10.794f, -3.895f)
                curveToRelative(-0.782f, -0.747f, -1.217f, -1.777f, -1.216f, -2.858f)
                curveToRelative(0.002f, -1.953f, 0.488f, -5.097f, 1.861f, -8.286f)
                curveToRelative(1.005f, 1.911f, 2.809f, 3.332f, 4.97f, 3.823f)
                curveToRelative(-0.114f, 1.02f, -0.307f, 2.011f, -0.639f, 2.885f)
                curveToRelative(0.525f, -0.635f, 2.99f, -2.594f, 6.317f, -2.669f)
                curveToRelative(2.102f, -0.045f, 4.123f, 1.923f, 4.169f, 1.968f)
                curveToRelative(0.196f, 0.201f, 0.456f, 0.302f, 0.716f, 0.302f)
                curveToRelative(0.252f, 0.0f, 0.503f, -0.095f, 0.697f, -0.283f)
                curveToRelative(0.396f, -0.386f, 0.404f, -1.019f, 0.02f, -1.414f)
                curveToRelative(-0.047f, -0.049f, -0.579f, -0.595f, -1.426f, -1.171f)
                curveToRelative(0.884f, -0.724f, 2.059f, -1.425f, 3.324f, -1.425f)
                curveToRelative(0.446f, 0.0f, 0.884f, 0.023f, 1.297f, 0.058f)
                curveToRelative(1.537f, 0.133f, 2.703f, 1.444f, 2.703f, 2.986f)
                verticalLineToRelative(5.05f)
                close()
            }
        }
        .build()
        return _dumbbellFitness!!
    }

private var _dumbbellFitness: ImageVector? = null
