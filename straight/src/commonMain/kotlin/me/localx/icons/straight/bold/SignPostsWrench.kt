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

public val Icons.Bold.SignPostsWrench: ImageVector
    get() {
        if (_signPostsWrench != null) {
            return _signPostsWrench!!
        }
        _signPostsWrench = Builder(name = "SignPostsWrench", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.5f)
                verticalLineToRelative(4.106f)
                curveToRelative(-0.82f, -0.837f, -1.847f, -1.468f, -3.0f, -1.812f)
                verticalLineToRelative(-2.294f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 5.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(9.165f)
                curveToRelative(0.246f, 1.125f, 0.761f, 2.149f, 1.476f, 3.0f)
                horizontalLineToRelative(-7.641f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -1.758f, 1.308f, -3.204f, 3.0f, -3.449f)
                lineTo(3.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.051f)
                curveToRelative(1.692f, 0.245f, 3.0f, 1.691f, 3.0f, 3.449f)
                close()
                moveTo(21.0f, 9.922f)
                verticalLineToRelative(3.078f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-3.078f)
                curveToRelative(-1.764f, 0.772f, -3.0f, 2.529f, -3.0f, 4.578f)
                reflectiveCurveToRelative(1.236f, 3.806f, 3.0f, 4.578f)
                verticalLineToRelative(4.922f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.922f)
                curveToRelative(1.764f, -0.772f, 3.0f, -2.529f, 3.0f, -4.578f)
                reflectiveCurveToRelative(-1.236f, -3.806f, -3.0f, -4.578f)
                close()
            }
        }
        .build()
        return _signPostsWrench!!
    }

private var _signPostsWrench: ImageVector? = null
