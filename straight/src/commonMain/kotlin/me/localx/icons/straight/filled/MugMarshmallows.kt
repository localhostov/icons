package me.localx.icons.straight.filled

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

public val Icons.Filled.MugMarshmallows: ImageVector
    get() {
        if (_mugMarshmallows != null) {
            return _mugMarshmallows!!
        }
        _mugMarshmallows = Builder(name = "MugMarshmallows", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.014f, 13.954f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(1.014f, 7.954f)
                lineToRelative(-0.004f, 13.047f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineToRelative(0.004f, -1.046f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.001f)
                close()
                moveTo(21.014f, 17.955f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.001f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.001f)
                close()
                moveTo(8.76f, 3.417f)
                lineToRelative(2.829f, -2.829f)
                curveToRelative(0.779f, -0.779f, 2.048f, -0.78f, 2.828f, 0.0f)
                lineToRelative(2.829f, 2.83f)
                curveToRelative(0.378f, 0.377f, 0.586f, 0.879f, 0.586f, 1.414f)
                curveToRelative(0.0f, 0.428f, -0.139f, 0.832f, -0.387f, 1.172f)
                horizontalLineToRelative(-8.883f)
                curveToRelative(-0.568f, -0.782f, -0.506f, -1.882f, 0.198f, -2.586f)
                close()
                moveTo(3.003f, 6.003f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineTo(3.003f, 2.002f)
                curveTo(3.002f, 0.899f, 3.899f, 0.002f, 5.002f, 0.002f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.107f, 0.0f, 0.209f, 0.015f, 0.312f, 0.031f)
                lineToRelative(-1.969f, 1.969f)
                curveToRelative(-1.082f, 1.082f, -1.395f, 2.63f, -0.976f, 4.0f)
                horizontalLineToRelative(-3.367f)
                close()
            }
        }
        .build()
        return _mugMarshmallows!!
    }

private var _mugMarshmallows: ImageVector? = null
