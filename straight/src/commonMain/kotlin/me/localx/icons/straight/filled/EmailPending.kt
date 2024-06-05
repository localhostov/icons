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

public val Icons.Filled.EmailPending: ImageVector
    get() {
        if (_emailPending != null) {
            return _emailPending!!
        }
        _emailPending = Builder(name = "EmailPending", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.239f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.239f, 5.0f, -5.0f)
                reflectiveCurveTo(21.761f, 0.0f, 19.0f, 0.0f)
                close()
                moveTo(20.293f, 7.707f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(-3.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.707f, 1.707f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(9.88f, 14.12f)
                lineTo(0.362f, 4.602f)
                curveToRelative(0.505f, -0.948f, 1.491f, -1.602f, 2.638f, -1.602f)
                horizontalLineToRelative(9.294f)
                curveToRelative(-0.189f, 0.634f, -0.294f, 1.305f, -0.294f, 2.0f)
                curveToRelative(0.0f, 3.041f, 1.943f, 5.622f, 4.652f, 6.588f)
                lineToRelative(-2.532f, 2.532f)
                curveToRelative(-1.17f, 1.17f, -3.07f, 1.17f, -4.24f, 0.0f)
                close()
                moveTo(24.0f, 9.894f)
                verticalLineToRelative(14.106f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 7.07f)
                lineToRelative(8.46f, 8.46f)
                curveToRelative(0.98f, 0.97f, 2.26f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.57f, -0.49f, 3.54f, -1.46f)
                lineToRelative(3.534f, -3.534f)
                curveToRelative(1.93f, -0.02f, 3.672f, -0.82f, 4.926f, -2.102f)
                close()
            }
        }
        .build()
        return _emailPending!!
    }

private var _emailPending: ImageVector? = null
