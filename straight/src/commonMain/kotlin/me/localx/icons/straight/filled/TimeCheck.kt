package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.TimeCheck: ImageVector
    get() {
        if (_timeCheck != null) {
            return _timeCheck!!
        }
        _timeCheck = Builder(name = "TimeCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 23.0f)
                horizontalLineToRelative(-0.033f)
                curveToRelative(-0.511f, -0.008f, -0.997f, -0.225f, -1.345f, -0.6f)
                lineToRelative(-2.168f, -2.262f)
                lineToRelative(1.446f, -1.382f)
                lineToRelative(2.106f, 2.2f)
                lineToRelative(4.081f, -4.082f)
                lineToRelative(1.413f, 1.411f)
                lineToRelative(-4.161f, 4.162f)
                curveToRelative(-0.354f, 0.356f, -0.837f, 0.556f, -1.339f, 0.553f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.017f, 0.0f)
                curveToRelative(-6.617f, -0.02f, -11.997f, 5.336f, -12.017f, 11.963f)
                reflectiveCurveToRelative(5.327f, 12.017f, 11.943f, 12.037f)
                curveToRelative(1.097f, 0.003f, 2.19f, -0.144f, 3.247f, -0.439f)
                curveToRelative(-1.968f, -2.658f, -1.411f, -6.411f, 1.243f, -8.382f)
                curveToRelative(2.116f, -1.571f, 5.009f, -1.571f, 7.125f, 0.0f)
                curveToRelative(1.771f, -6.367f, -1.946f, -12.966f, -8.302f, -14.74f)
                curveToRelative(-1.054f, -0.294f, -2.144f, -0.442f, -3.239f, -0.439f)
                close()
                moveTo(13.017f, 11.414f)
                lineTo(9.724f, 14.707f)
                lineTo(8.31f, 13.293f)
                lineTo(11.017f, 10.586f)
                verticalLineToRelative(-4.586f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _timeCheck!!
    }

private var _timeCheck: ImageVector? = null
