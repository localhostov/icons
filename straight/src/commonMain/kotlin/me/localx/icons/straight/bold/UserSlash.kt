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

public val Icons.Bold.UserSlash: ImageVector
    get() {
        if (_userSlash != null) {
            return _userSlash!!
        }
        _userSlash = Builder(name = "UserSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.998f, 18.877f)
                curveToRelative(-0.064f, -2.66f, -2.216f, -4.811f, -4.876f, -4.876f)
                lineToRelative(-2.289f, -2.289f)
                curveToRelative(2.414f, -0.777f, 4.166f, -3.044f, 4.166f, -5.713f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-2.669f, 0.0f, -4.936f, 1.752f, -5.713f, 4.166f)
                lineTo(2.161f, 0.04f)
                lineTo(0.04f, 2.161f)
                lineTo(21.839f, 23.96f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.962f, -2.962f)
                close()
                moveTo(9.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-0.375f, 0.0f, -0.736f, -0.067f, -1.078f, -0.199f)
                lineToRelative(-1.787f, -1.787f)
                lineToRelative(0.036f, -0.013f)
                curveToRelative(-0.113f, -0.32f, -0.17f, -0.657f, -0.17f, -1.001f)
                close()
                moveTo(9.05f, 14.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(-4.05f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(1.05f)
                close()
            }
        }
        .build()
        return _userSlash!!
    }

private var _userSlash: ImageVector? = null
