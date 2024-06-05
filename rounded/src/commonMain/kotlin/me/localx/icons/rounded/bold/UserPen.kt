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

public val Icons.Bold.UserPen: ImageVector
    get() {
        if (_userPen != null) {
            return _userPen!!
        }
        _userPen = Builder(name = "UserPen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(11.0f, 17.341f)
                curveToRelative(-0.64f, -0.226f, -1.313f, -0.341f, -2.0f, -0.341f)
                curveToRelative(-3.16f, 0.0f, -5.796f, 2.459f, -6.003f, 5.599f)
                curveToRelative(-0.052f, 0.793f, -0.711f, 1.401f, -1.495f, 1.401f)
                curveToRelative(-0.033f, 0.0f, -0.066f, 0.0f, -0.1f, -0.003f)
                curveToRelative(-0.827f, -0.054f, -1.453f, -0.769f, -1.398f, -1.595f)
                curveToRelative(0.31f, -4.711f, 4.262f, -8.401f, 8.997f, -8.401f)
                curveToRelative(1.029f, 0.0f, 2.038f, 0.172f, 3.0f, 0.513f)
                curveToRelative(0.781f, 0.276f, 1.19f, 1.133f, 0.914f, 1.914f)
                curveToRelative(-0.276f, 0.781f, -1.132f, 1.19f, -1.914f, 0.914f)
                close()
                moveTo(23.26f, 16.016f)
                lineToRelative(-6.715f, 6.715f)
                curveToRelative(-0.813f, 0.813f, -1.915f, 1.269f, -3.064f, 1.269f)
                horizontalLineToRelative(-0.955f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-0.955f)
                curveToRelative(0.0f, -1.149f, 0.457f, -2.252f, 1.269f, -3.064f)
                lineToRelative(6.808f, -6.808f)
                curveToRelative(0.953f, -0.953f, 2.534f, -0.894f, 3.409f, 0.176f)
                curveToRelative(0.761f, 0.93f, 0.598f, 2.317f, -0.252f, 3.167f)
                close()
            }
        }
        .build()
        return _userPen!!
    }

private var _userPen: ImageVector? = null
