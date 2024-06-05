package me.localx.icons.rounded.outline

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

public val Icons.Outline.UserCrown: ImageVector
    get() {
        if (_userCrown != null) {
            return _userCrown!!
        }
        _userCrown = Builder(name = "UserCrown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.142f, 23.99f)
                curveToRelative(-0.048f, 0.007f, -0.096f, 0.01f, -0.143f, 0.01f)
                curveToRelative(-0.489f, 0.0f, -0.917f, -0.359f, -0.988f, -0.858f)
                curveToRelative(-0.419f, -2.932f, -3.003f, -5.142f, -6.01f, -5.142f)
                reflectiveCurveToRelative(-5.591f, 2.21f, -6.01f, 5.142f)
                curveToRelative(-0.079f, 0.547f, -0.589f, 0.922f, -1.131f, 0.849f)
                curveToRelative(-0.547f, -0.078f, -0.927f, -0.585f, -0.848f, -1.132f)
                curveToRelative(0.559f, -3.91f, 3.994f, -6.858f, 7.99f, -6.858f)
                reflectiveCurveToRelative(7.431f, 2.948f, 7.99f, 6.858f)
                curveToRelative(0.079f, 0.547f, -0.301f, 1.054f, -0.848f, 1.132f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(6.0f, 0.764f)
                curveToRelative(0.0f, -0.754f, 0.978f, -1.051f, 1.397f, -0.423f)
                lineToRelative(1.603f, 2.659f)
                lineTo(11.297f, 0.32f)
                curveToRelative(0.37f, -0.431f, 1.037f, -0.431f, 1.406f, 0.0f)
                lineToRelative(2.297f, 2.68f)
                lineToRelative(1.603f, -2.659f)
                curveToRelative(0.419f, -0.628f, 1.397f, -0.331f, 1.397f, 0.423f)
                verticalLineToRelative(7.236f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _userCrown!!
    }

private var _userCrown: ImageVector? = null
