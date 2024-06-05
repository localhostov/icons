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

public val Icons.Bold.MouseField: ImageVector
    get() {
        if (_mouseField != null) {
            return _mouseField!!
        }
        _mouseField = Builder(name = "MouseField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineToRelative(-0.013f)
                curveTo(16.824f, 0.447f, 14.851f, -0.31f, 12.879f, 0.124f)
                curveToRelative(-1.882f, 0.416f, -3.401f, 1.969f, -3.779f, 3.864f)
                curveToRelative(-0.277f, 1.39f, 0.023f, 2.77f, 0.832f, 3.899f)
                curveToRelative(0.004f, 0.008f, 0.008f, 0.015f, 0.012f, 0.023f)
                curveToRelative(-1.249f, 0.513f, -2.333f, 1.233f, -3.228f, 2.18f)
                curveToRelative(-1.848f, 1.954f, -2.447f, 4.36f, -2.636f, 5.911f)
                horizontalLineToRelative(-0.08f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                lineTo(14.0f, 24.001f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 21.001f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 19.001f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.441f, -2.244f, -7.0f, -6.0f, -7.0f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(7.111f, 16.0f)
                curveToRelative(0.18f, -1.105f, 0.638f, -2.648f, 1.804f, -3.869f)
                curveToRelative(0.952f, -0.997f, 2.258f, -1.64f, 3.884f, -1.937f)
                curveToRelative(0.711f, 1.158f, 1.847f, 2.035f, 3.201f, 2.477f)
                verticalLineToRelative(3.329f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.393f, 0.0f, -2.589f, -0.798f, -2.909f, -1.94f)
                curveToRelative(0.0f, 0.0f, -0.091f, -0.56f, -0.091f, -1.06f)
                curveToRelative(0.0f, 0.0f, -0.773f, -0.009f, -1.0f, 0.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.694f, 0.0f, 1.38f, -0.724f, 1.74f, -1.5f)
                horizontalLineToRelative(0.26f)
                curveToRelative(2.069f, 0.0f, 3.0f, 2.339f, 3.0f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _mouseField!!
    }

private var _mouseField: ImageVector? = null
