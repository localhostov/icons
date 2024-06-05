package me.localx.icons.rounded.outline

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

public val Icons.Outline.ThermometerAlt: ImageVector
    get() {
        if (_thermometerAlt != null) {
            return _thermometerAlt!!
        }
        _thermometerAlt = Builder(name = "ThermometerAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.536f, 1.465f)
                curveToRelative(-0.945f, -0.944f, -2.2f, -1.465f, -3.536f, -1.465f)
                reflectiveCurveToRelative(-2.591f, 0.521f, -3.536f, 1.465f)
                lineTo(4.233f, 12.695f)
                curveToRelative(-1.597f, 1.597f, -1.281f, 5.22f, -1.067f, 6.725f)
                lineToRelative(-2.873f, 2.873f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(2.873f, -2.873f)
                curveToRelative(0.572f, 0.081f, 1.45f, 0.177f, 2.407f, 0.177f)
                curveToRelative(1.56f, 0.0f, 3.328f, -0.255f, 4.318f, -1.244f)
                lineToRelative(11.231f, -11.231f)
                curveToRelative(0.944f, -0.944f, 1.464f, -2.199f, 1.464f, -3.535f)
                reflectiveCurveToRelative(-0.52f, -2.591f, -1.464f, -3.535f)
                close()
                moveTo(21.122f, 7.121f)
                lineToRelative(-11.231f, 11.231f)
                curveToRelative(-0.719f, 0.717f, -3.021f, 0.749f, -4.777f, 0.534f)
                curveToRelative(-0.215f, -1.758f, -0.184f, -4.059f, 0.534f, -4.777f)
                lineToRelative(1.524f, -1.524f)
                lineToRelative(1.622f, 1.622f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-1.622f, -1.622f)
                lineToRelative(2.086f, -2.086f)
                lineToRelative(1.621f, 1.621f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-1.621f, -1.621f)
                lineToRelative(2.086f, -2.086f)
                lineToRelative(1.621f, 1.621f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-1.621f, -1.621f)
                lineToRelative(1.293f, -1.293f)
                curveToRelative(1.17f, -1.17f, 3.073f, -1.17f, 4.243f, 0.0f)
                curveToRelative(0.566f, 0.566f, 0.878f, 1.319f, 0.878f, 2.121f)
                reflectiveCurveToRelative(-0.312f, 1.555f, -0.878f, 2.121f)
                close()
            }
        }
        .build()
        return _thermometerAlt!!
    }

private var _thermometerAlt: ImageVector? = null
