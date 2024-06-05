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
                moveTo(19.586f, 7.0f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                close()
                moveTo(9.985f, 14.121f)
                lineTo(0.952f, 5.089f)
                curveToRelative(0.909f, -1.259f, 2.379f, -2.089f, 4.048f, -2.089f)
                horizontalLineToRelative(7.295f)
                curveToRelative(-0.19f, 0.634f, -0.295f, 1.305f, -0.295f, 2.0f)
                curveToRelative(0.0f, 3.065f, 1.984f, 5.671f, 4.733f, 6.616f)
                lineToRelative(-2.505f, 2.505f)
                curveToRelative(-1.134f, 1.133f, -3.109f, 1.133f, -4.243f, 0.0f)
                close()
                moveTo(24.0f, 9.889f)
                verticalLineToRelative(9.111f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -0.322f, 0.037f, -0.635f, 0.095f, -0.941f)
                lineToRelative(8.476f, 8.476f)
                curveToRelative(0.944f, 0.944f, 2.2f, 1.465f, 3.536f, 1.465f)
                reflectiveCurveToRelative(2.591f, -0.521f, 3.535f, -1.465f)
                lineToRelative(3.545f, -3.545f)
                curveToRelative(1.883f, -0.05f, 3.582f, -0.843f, 4.813f, -2.101f)
                close()
            }
        }
        .build()
        return _emailPending!!
    }

private var _emailPending: ImageVector? = null
