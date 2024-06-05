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

public val Icons.Bold.UserKey: ImageVector
    get() {
        if (_userKey != null) {
            return _userKey!!
        }
        _userKey = Builder(name = "UserKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.309f, 10.009f)
                curveToRelative(-2.089f, -0.127f, -3.932f, 1.166f, -4.845f, 3.049f)
                curveToRelative(-0.643f, 1.327f, -0.537f, 2.507f, -0.171f, 3.565f)
                curveToRelative(0.0f, 0.0f, -0.315f, 0.376f, -0.315f, 0.876f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.184f)
                curveToRelative(-0.451f, 0.0f, -0.816f, 0.365f, -0.816f, 0.816f)
                verticalLineToRelative(1.184f)
                horizontalLineToRelative(-1.163f)
                curveToRelative(-0.451f, 0.0f, -0.816f, 0.365f, -0.816f, 0.816f)
                verticalLineToRelative(1.136f)
                curveToRelative(0.0f, 0.579f, 0.469f, 1.048f, 1.048f, 1.048f)
                horizontalLineToRelative(0.935f)
                curveToRelative(0.398f, 0.0f, 0.779f, -0.158f, 1.06f, -0.44f)
                lineToRelative(3.973f, -3.973f)
                curveToRelative(0.948f, 0.411f, 2.044f, 0.544f, 3.193f, 0.267f)
                curveToRelative(1.885f, -0.454f, 3.373f, -2.035f, 3.71f, -3.945f)
                curveToRelative(0.538f, -3.055f, -1.7f, -5.723f, -4.611f, -5.9f)
                close()
                moveTo(20.0f, 15.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(8.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(9.922f, 17.382f)
                curveToRelative(-0.607f, -0.253f, -1.254f, -0.382f, -1.922f, -0.382f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                curveToRelative(1.067f, 0.0f, 2.103f, 0.206f, 3.078f, 0.614f)
                curveToRelative(0.764f, 0.318f, 1.125f, 1.197f, 0.806f, 1.962f)
                curveToRelative(-0.319f, 0.764f, -1.198f, 1.126f, -1.962f, 0.806f)
                close()
            }
        }
        .build()
        return _userKey!!
    }

private var _userKey: ImageVector? = null
