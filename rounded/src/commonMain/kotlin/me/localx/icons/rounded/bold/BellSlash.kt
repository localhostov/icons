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

public val Icons.Bold.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.058f, 17.026f)
                lineToRelative(4.451f, 4.451f)
                curveToRelative(-0.946f, 1.478f, -2.555f, 2.524f, -4.405f, 2.524f)
                curveToRelative(-2.413f, 0.0f, -4.426f, -1.773f, -5.077f, -3.974f)
                horizontalLineToRelative(-0.525f)
                curveToRelative(-1.677f, 0.0f, -3.241f, -0.75f, -4.291f, -2.059f)
                curveToRelative(-1.049f, -1.308f, -1.442f, -2.997f, -1.079f, -4.634f)
                lineToRelative(1.44f, -5.794f)
                lineToRelative(2.475f, 2.475f)
                lineToRelative(-0.986f, 3.969f)
                curveToRelative(-0.166f, 0.744f, 0.013f, 1.512f, 0.49f, 2.106f)
                curveToRelative(0.477f, 0.595f, 1.188f, 0.936f, 1.95f, 0.936f)
                horizontalLineToRelative(5.557f)
                close()
                moveTo(23.56f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                curveTo(1.025f, -0.146f, 1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(2.451f, 2.451f)
                curveToRelative(1.727f, -1.803f, 4.15f, -2.891f, 6.815f, -2.891f)
                curveToRelative(4.226f, 0.0f, 7.968f, 2.844f, 9.099f, 6.916f)
                lineToRelative(1.871f, 6.138f)
                curveToRelative(0.464f, 1.67f, 0.128f, 3.42f, -0.92f, 4.8f)
                curveToRelative(-0.277f, 0.364f, -0.592f, 0.685f, -0.938f, 0.962f)
                lineToRelative(2.623f, 2.623f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
                moveTo(7.144f, 5.023f)
                lineToRelative(11.645f, 11.645f)
                curveToRelative(0.266f, -0.161f, 0.503f, -0.373f, 0.698f, -0.63f)
                curveToRelative(0.477f, -0.627f, 0.629f, -1.422f, 0.418f, -2.182f)
                lineToRelative(-1.871f, -6.138f)
                curveToRelative(-0.771f, -2.778f, -3.325f, -4.719f, -6.208f, -4.719f)
                curveToRelative(-1.84f, 0.0f, -3.506f, 0.764f, -4.683f, 2.023f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
