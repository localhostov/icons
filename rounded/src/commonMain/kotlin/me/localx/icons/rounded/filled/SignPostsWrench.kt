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

public val Icons.Filled.SignPostsWrench: ImageVector
    get() {
        if (_signPostsWrench != null) {
            return _signPostsWrench!!
        }
        _signPostsWrench = Builder(name = "SignPostsWrench", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 20.288f)
                verticalLineToRelative(2.212f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.212f)
                curveToRelative(-2.307f, -0.654f, -4.0f, -2.771f, -4.0f, -5.288f)
                curveToRelative(0.0f, -1.982f, 1.05f, -3.95f, 2.624f, -4.917f)
                curveToRelative(0.382f, -0.235f, 0.876f, 0.061f, 0.876f, 0.509f)
                verticalLineToRelative(2.301f)
                curveToRelative(0.0f, 0.996f, 0.681f, 1.92f, 1.664f, 2.08f)
                curveToRelative(1.253f, 0.204f, 2.336f, -0.758f, 2.336f, -1.973f)
                verticalLineToRelative(-2.408f)
                curveToRelative(0.0f, -0.448f, 0.494f, -0.744f, 0.876f, -0.509f)
                curveToRelative(1.573f, 0.967f, 2.624f, 2.935f, 2.624f, 4.917f)
                curveToRelative(0.0f, 2.517f, -1.693f, 4.634f, -4.0f, 5.288f)
                close()
                moveTo(18.5f, 7.5f)
                curveToRelative(2.176f, 0.0f, 4.13f, 0.933f, 5.5f, 2.413f)
                verticalLineToRelative(-2.913f)
                curveToRelative(0.0f, -2.045f, -1.237f, -3.802f, -3.0f, -4.576f)
                verticalLineToRelative(-1.424f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.424f)
                curveTo(1.237f, 3.198f, 0.0f, 4.955f, 0.0f, 7.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.045f, 1.237f, 3.802f, 3.0f, 4.576f)
                verticalLineToRelative(5.424f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.628f)
                curveToRelative(-0.402f, -0.919f, -0.628f, -1.933f, -0.628f, -3.0f)
                curveToRelative(0.0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
                close()
            }
        }
        .build()
        return _signPostsWrench!!
    }

private var _signPostsWrench: ImageVector? = null
