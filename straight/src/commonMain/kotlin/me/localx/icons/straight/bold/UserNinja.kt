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

public val Icons.Bold.UserNinja: ImageVector
    get() {
        if (_userNinja != null) {
            return _userNinja!!
        }
        _userNinja = Builder(name = "UserNinja", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 14.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.649f, 0.311f, -1.226f, 0.791f, -1.592f)
                curveToRelative(0.77f, 1.415f, 2.228f, 3.849f, 4.45f, 6.592f)
                horizontalLineToRelative(3.955f)
                curveToRelative(-0.453f, -0.499f, -0.881f, -0.993f, -1.284f, -1.48f)
                curveToRelative(1.585f, -2.127f, 2.67f, -3.959f, 3.297f, -5.112f)
                curveToRelative(0.48f, 0.366f, 0.791f, 0.943f, 0.791f, 1.591f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(10.015f, 17.0f)
                horizontalLineToRelative(3.974f)
                curveToRelative(-0.496f, 0.841f, -1.156f, 1.885f, -1.985f, 3.044f)
                curveToRelative(-0.831f, -1.161f, -1.492f, -2.204f, -1.989f, -3.044f)
                close()
                moveTo(20.812f, 6.017f)
                curveToRelative(-0.409f, -0.288f, -0.916f, -0.441f, -1.41f, -0.517f)
                curveToRelative(0.494f, -0.076f, 1.001f, -0.229f, 1.41f, -0.517f)
                curveToRelative(1.219f, -0.859f, 1.565f, -2.916f, 1.565f, -2.916f)
                curveToRelative(0.0f, 0.0f, -2.093f, -0.34f, -3.312f, 0.518f)
                curveToRelative(-0.636f, 0.448f, -1.034f, 1.221f, -1.27f, 1.859f)
                curveToRelative(-0.685f, -2.559f, -3.02f, -4.444f, -5.796f, -4.444f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                curveToRelative(3.009f, 0.0f, 5.5f, -2.215f, 5.933f, -5.103f)
                curveToRelative(0.243f, 0.555f, 0.607f, 1.148f, 1.132f, 1.518f)
                curveToRelative(1.219f, 0.859f, 3.312f, 0.518f, 3.312f, 0.518f)
                curveToRelative(0.0f, 0.0f, -0.346f, -2.057f, -1.565f, -2.916f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _userNinja!!
    }

private var _userNinja: ImageVector? = null
