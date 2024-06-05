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

public val Icons.Bold.UserSalary: ImageVector
    get() {
        if (_userSalary != null) {
            return _userSalary!!
        }
        _userSalary = Builder(name = "UserSalary", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 15.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.294f, 0.177f, 0.555f, 0.45f, 0.665f)
                lineToRelative(2.214f, 0.886f)
                curveToRelative(1.419f, 0.567f, 2.336f, 1.922f, 2.336f, 3.45f)
                curveToRelative(0.0f, 1.58f, -1.059f, 2.903f, -2.5f, 3.337f)
                verticalLineToRelative(1.163f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.163f)
                curveToRelative(-1.441f, -0.434f, -2.5f, -1.757f, -2.5f, -3.337f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.276f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                curveToRelative(0.0f, -0.294f, -0.177f, -0.555f, -0.45f, -0.665f)
                lineToRelative(-2.214f, -0.886f)
                curveToRelative(-1.419f, -0.567f, -2.336f, -1.922f, -2.336f, -3.45f)
                curveToRelative(0.0f, -1.58f, 1.059f, -2.903f, 2.5f, -3.337f)
                verticalLineToRelative(-1.163f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.163f)
                curveToRelative(1.441f, 0.434f, 2.5f, 1.757f, 2.5f, 3.337f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(2.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                close()
                moveTo(17.0f, 6.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(7.691f, 0.0f, 11.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(14.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _userSalary!!
    }

private var _userSalary: ImageVector? = null
