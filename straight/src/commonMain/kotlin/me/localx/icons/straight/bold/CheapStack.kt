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

public val Icons.Bold.CheapStack: ImageVector
    get() {
        if (_cheapStack != null) {
            return _cheapStack!!
        }
        _cheapStack = Builder(name = "CheapStack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.049f, 19.573f)
                lineToRelative(-3.793f, 3.707f)
                curveToRelative(-0.48f, 0.48f, -1.115f, 0.72f, -1.751f, 0.72f)
                curveToRelative(-0.641f, 0.0f, -1.283f, -0.243f, -1.772f, -0.732f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.896f, 1.896f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(19.334f)
                lineToRelative(1.951f, -1.907f)
                lineToRelative(2.098f, 2.146f)
                close()
                moveTo(12.0f, 5.0f)
                verticalLineToRelative(15.25f)
                curveToRelative(0.0f, 2.173f, -2.523f, 3.75f, -6.0f, 3.75f)
                reflectiveCurveToRelative(-6.0f, -1.577f, -6.0f, -3.75f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.72f, 2.579f, 1.0f, 6.0f, 1.0f)
                reflectiveCurveToRelative(6.0f, 1.72f, 6.0f, 4.0f)
                close()
                moveTo(3.0f, 5.014f)
                verticalLineToRelative(0.006f)
                curveToRelative(0.085f, 0.248f, 1.127f, 0.98f, 3.0f, 0.98f)
                curveToRelative(1.843f, 0.0f, 2.881f, -0.708f, 2.996f, -1.0f)
                curveToRelative(-0.115f, -0.292f, -1.153f, -1.0f, -2.996f, -1.0f)
                curveToRelative(-1.873f, 0.0f, -2.915f, 0.732f, -3.0f, 1.014f)
                close()
                moveTo(3.0f, 10.0f)
                curveToRelative(0.077f, 0.263f, 1.121f, 1.0f, 3.0f, 1.0f)
                reflectiveCurveToRelative(2.915f, -0.732f, 3.0f, -1.014f)
                verticalLineToRelative(-1.491f)
                curveToRelative(-0.873f, 0.322f, -1.891f, 0.505f, -3.0f, 0.505f)
                reflectiveCurveToRelative(-2.127f, -0.183f, -3.0f, -0.505f)
                verticalLineToRelative(1.505f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.077f, 0.263f, 1.121f, 1.0f, 3.0f, 1.0f)
                reflectiveCurveToRelative(2.915f, -0.732f, 3.0f, -1.014f)
                verticalLineToRelative(-1.491f)
                curveToRelative(-0.873f, 0.322f, -1.891f, 0.505f, -3.0f, 0.505f)
                reflectiveCurveToRelative(-2.127f, -0.183f, -3.0f, -0.505f)
                verticalLineToRelative(1.505f)
                close()
                moveTo(9.0f, 20.162f)
                verticalLineToRelative(-1.667f)
                curveToRelative(-0.873f, 0.322f, -1.891f, 0.505f, -3.0f, 0.505f)
                reflectiveCurveToRelative(-2.127f, -0.183f, -3.0f, -0.505f)
                verticalLineToRelative(1.667f)
                curveToRelative(0.217f, 0.275f, 1.275f, 0.838f, 3.0f, 0.838f)
                reflectiveCurveToRelative(2.783f, -0.563f, 3.0f, -0.838f)
                close()
            }
        }
        .build()
        return _cheapStack!!
    }

private var _cheapStack: ImageVector? = null
