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

public val Icons.Bold.Banner5: ImageVector
    get() {
        if (_banner5 != null) {
            return _banner5!!
        }
        _banner5 = Builder(name = "Banner5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                reflectiveCurveToRelative(-1.593f, -1.057f, -4.0f, -1.634f)
                verticalLineToRelative(-3.882f)
                lineToRelative(-0.943f, -0.377f)
                curveToRelative(-0.112f, -0.045f, -2.816f, -1.107f, -7.057f, -1.107f)
                reflectiveCurveToRelative(-6.944f, 1.062f, -7.057f, 1.107f)
                lineToRelative(-0.943f, 0.377f)
                verticalLineToRelative(3.882f)
                curveToRelative(-2.407f, 0.577f, -4.0f, 1.634f, -4.0f, 1.634f)
                curveToRelative(1.5f, 0.932f, 3.0f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.0f, -1.808f, 2.107f, -3.0f, 5.0f)
                curveToRelative(2.5f, -1.0f, 5.184f, -1.822f, 7.0f, -2.0f)
                verticalLineToRelative(-2.36f)
                curveToRelative(1.103f, -0.272f, 2.97f, -0.64f, 5.0f, -0.64f)
                reflectiveCurveToRelative(3.897f, 0.368f, 5.0f, 0.64f)
                verticalLineToRelative(2.36f)
                curveToRelative(1.816f, 0.178f, 4.5f, 1.0f, 7.0f, 2.0f)
                curveToRelative(-1.192f, -2.893f, -3.0f, -5.0f, -3.0f, -5.0f)
                curveToRelative(0.0f, 0.0f, 1.5f, -2.068f, 3.0f, -3.0f)
                close()
                moveTo(17.0f, 11.559f)
                curveToRelative(-1.279f, -0.276f, -3.063f, -0.559f, -5.0f, -0.559f)
                reflectiveCurveToRelative(-3.721f, 0.283f, -5.0f, 0.559f)
                verticalLineToRelative(-3.954f)
                curveToRelative(1.001f, -0.261f, 2.745f, -0.605f, 5.0f, -0.605f)
                reflectiveCurveToRelative(4.001f, 0.344f, 5.0f, 0.604f)
                verticalLineToRelative(3.955f)
                close()
            }
        }
        .build()
        return _banner5!!
    }

private var _banner5: ImageVector? = null
