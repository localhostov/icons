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

public val Icons.Bold.HomeHeart: ImageVector
    get() {
        if (_homeHeart != null) {
            return _homeHeart!!
        }
        _homeHeart = Builder(name = "HomeHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.657f, 7.408f)
                lineTo(14.157f, 0.756f)
                curveToRelative(-1.271f, -0.994f, -3.045f, -0.994f, -4.314f, 0.0f)
                lineTo(1.344f, 7.407f)
                curveToRelative(-0.854f, 0.668f, -1.344f, 1.673f, -1.344f, 2.757f)
                verticalLineToRelative(13.824f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.824f)
                curveToRelative(0.0f, -1.084f, -0.489f, -2.089f, -1.343f, -2.756f)
                close()
                moveTo(21.0f, 20.988f)
                lineTo(3.0f, 20.988f)
                verticalLineToRelative(-10.824f)
                curveToRelative(0.0f, -0.155f, 0.07f, -0.298f, 0.192f, -0.394f)
                lineTo(11.692f, 3.118f)
                curveToRelative(0.182f, -0.142f, 0.434f, -0.142f, 0.615f, 0.0f)
                lineToRelative(8.501f, 6.652f)
                curveToRelative(0.121f, 0.095f, 0.191f, 0.239f, 0.191f, 0.394f)
                verticalLineToRelative(10.824f)
                close()
                moveTo(16.481f, 12.475f)
                curveToRelative(0.0f, 2.592f, -4.5f, 5.775f, -4.5f, 5.775f)
                curveToRelative(0.0f, 0.0f, -4.5f, -3.183f, -4.5f, -5.775f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                close()
            }
        }
        .build()
        return _homeHeart!!
    }

private var _homeHeart: ImageVector? = null
