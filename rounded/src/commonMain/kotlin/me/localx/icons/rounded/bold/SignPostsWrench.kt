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
                moveToRelative(24.0f, 7.0f)
                verticalLineToRelative(0.577f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-0.577f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.924f)
                curveToRelative(-1.763f, -0.774f, -3.0f, -2.531f, -3.0f, -4.576f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -2.045f, 1.237f, -3.802f, 3.0f, -4.576f)
                verticalLineToRelative(-0.924f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(0.924f)
                curveToRelative(1.763f, 0.774f, 3.0f, 2.531f, 3.0f, 4.576f)
                close()
                moveTo(21.0f, 11.358f)
                verticalLineToRelative(1.529f)
                curveToRelative(0.0f, 0.997f, -0.679f, 1.923f, -1.662f, 2.085f)
                curveToRelative(-1.252f, 0.206f, -2.338f, -0.759f, -2.338f, -1.972f)
                verticalLineToRelative(-1.636f)
                curveToRelative(0.0f, -0.742f, -0.89f, -1.125f, -1.43f, -0.616f)
                curveToRelative(-1.162f, 1.094f, -1.799f, 2.857f, -1.494f, 4.637f)
                curveToRelative(0.283f, 1.645f, 1.419f, 3.039f, 2.924f, 3.695f)
                verticalLineToRelative(2.919f)
                curveToRelative(0.0f, 1.104f, 0.896f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.896f, 2.0f, -2.0f)
                verticalLineToRelative(-2.924f)
                curveToRelative(1.764f, -0.772f, 3.0f, -2.527f, 3.0f, -4.576f)
                curveToRelative(0.0f, -1.453f, -0.621f, -2.878f, -1.612f, -3.79f)
                curveToRelative(-0.527f, -0.486f, -1.388f, -0.068f, -1.388f, 0.649f)
                close()
            }
        }
        .build()
        return _signPostsWrench!!
    }

private var _signPostsWrench: ImageVector? = null
