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

public val Icons.Bold.HexagonDivide: ImageVector
    get() {
        if (_hexagonDivide != null) {
            return _hexagonDivide!!
        }
        _hexagonDivide = Builder(name = "HexagonDivide", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.072f, 9.4f)
                lineToRelative(-2.951f, -5.5f)
                curveToRelative(-0.96f, -1.789f, -2.817f, -2.899f, -4.847f, -2.899f)
                horizontalLineToRelative(-6.532f)
                curveToRelative(-2.025f, 0.0f, -3.88f, 1.107f, -4.842f, 2.891f)
                lineTo(0.934f, 9.395f)
                curveToRelative(-0.879f, 1.635f, -0.879f, 3.586f, 0.002f, 5.219f)
                lineToRelative(2.965f, 5.497f)
                curveToRelative(0.962f, 1.782f, 2.816f, 2.889f, 4.841f, 2.889f)
                horizontalLineToRelative(6.533f)
                curveToRelative(2.029f, 0.0f, 3.887f, -1.111f, 4.847f, -2.899f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(2.949f, -5.5f)
                curveToRelative(0.874f, -1.628f, 0.874f, -3.572f, 0.0f, -5.2f)
                close()
                moveTo(20.427f, 13.182f)
                lineToRelative(-2.95f, 5.5f)
                curveToRelative(-0.437f, 0.813f, -1.28f, 1.318f, -2.203f, 1.318f)
                horizontalLineToRelative(-6.533f)
                curveToRelative(-0.92f, 0.0f, -1.764f, -0.503f, -2.2f, -1.313f)
                lineToRelative(-2.965f, -5.497f)
                curveToRelative(-0.4f, -0.743f, -0.4f, -1.63f, 0.0f, -2.373f)
                lineToRelative(2.966f, -5.503f)
                curveToRelative(0.438f, -0.811f, 1.28f, -1.314f, 2.201f, -1.314f)
                horizontalLineToRelative(6.532f)
                curveToRelative(0.923f, 0.0f, 1.768f, 0.505f, 2.203f, 1.318f)
                lineToRelative(2.951f, 5.5f)
                curveToRelative(0.396f, 0.74f, 0.396f, 1.624f, 0.0f, 2.364f)
                close()
                moveTo(16.999f, 12.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(10.499f, 7.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(13.499f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hexagonDivide!!
    }

private var _hexagonDivide: ImageVector? = null
