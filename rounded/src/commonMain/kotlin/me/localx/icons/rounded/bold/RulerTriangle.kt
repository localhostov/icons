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

public val Icons.Bold.RulerTriangle: ImageVector
    get() {
        if (_rulerTriangle != null) {
            return _rulerTriangle!!
        }
        _rulerTriangle = Builder(name = "RulerTriangle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.717f, 16.559f)
                lineTo(7.442f, 1.282f)
                curveTo(6.171f, 0.012f, 4.351f, -0.351f, 2.691f, 0.338f)
                curveTo(1.031f, 1.025f, 0.0f, 2.568f, 0.0f, 4.365f)
                verticalLineToRelative(14.135f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(14.135f)
                curveToRelative(1.797f, 0.0f, 3.34f, -1.031f, 4.028f, -2.691f)
                reflectiveCurveToRelative(0.325f, -3.48f, -0.945f, -4.75f)
                close()
                moveTo(20.89f, 20.162f)
                curveToRelative(-0.082f, 0.196f, -0.413f, 0.839f, -1.256f, 0.839f)
                lineTo(5.5f, 21.001f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 4.365f)
                curveToRelative(0.0f, -0.843f, 0.642f, -1.175f, 0.839f, -1.256f)
                curveToRelative(0.093f, -0.039f, 0.295f, -0.107f, 0.545f, -0.107f)
                curveToRelative(0.28f, 0.0f, 0.622f, 0.087f, 0.937f, 0.401f)
                lineToRelative(2.688f, 2.689f)
                lineToRelative(-1.08f, 1.08f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(1.08f, -1.08f)
                lineToRelative(1.768f, 1.768f)
                lineToRelative(-1.08f, 1.08f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(1.08f, -1.08f)
                lineToRelative(1.759f, 1.759f)
                lineToRelative(-1.08f, 1.098f)
                curveToRelative(-0.581f, 0.591f, -0.573f, 1.54f, 0.018f, 2.121f)
                curveToRelative(0.292f, 0.287f, 0.672f, 0.431f, 1.052f, 0.431f)
                curveToRelative(0.388f, 0.0f, 0.776f, -0.149f, 1.069f, -0.448f)
                lineToRelative(1.062f, -1.08f)
                lineToRelative(2.697f, 2.697f)
                curveToRelative(0.596f, 0.596f, 0.376f, 1.284f, 0.294f, 1.481f)
                close()
                moveTo(10.56f, 15.44f)
                curveToRelative(0.429f, 0.429f, 0.558f, 1.074f, 0.325f, 1.635f)
                curveToRelative(-0.232f, 0.561f, -0.779f, 0.926f, -1.386f, 0.926f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.606f, 0.365f, -1.153f, 0.926f, -1.386f)
                curveToRelative(0.561f, -0.233f, 1.207f, -0.104f, 1.635f, 0.325f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _rulerTriangle!!
    }

private var _rulerTriangle: ImageVector? = null
