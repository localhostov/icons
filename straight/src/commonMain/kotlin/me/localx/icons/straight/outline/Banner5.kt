package me.localx.icons.straight.outline

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

public val Icons.Outline.Banner5: ImageVector
    get() {
        if (_banner5 != null) {
            return _banner5!!
        }
        _banner5 = Builder(name = "Banner5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.068f)
                verticalLineToRelative(-0.068f)
                reflectiveCurveToRelative(-1.593f, -1.055f, -4.0f, -1.632f)
                verticalLineToRelative(-4.064f)
                lineToRelative(-0.651f, -0.242f)
                curveToRelative(-0.117f, -0.043f, -2.912f, -1.062f, -7.349f, -1.062f)
                reflectiveCurveToRelative(-7.231f, 1.019f, -7.349f, 1.062f)
                lineToRelative(-0.651f, 0.242f)
                verticalLineToRelative(4.064f)
                curveToRelative(-2.407f, 0.576f, -4.0f, 1.632f, -4.0f, 1.632f)
                verticalLineToRelative(0.068f)
                curveToRelative(1.5f, 0.932f, 3.0f, 2.932f, 3.0f, 2.932f)
                curveToRelative(0.0f, 0.0f, -1.808f, 2.038f, -3.0f, 4.932f)
                verticalLineToRelative(0.068f)
                curveToRelative(2.5f, -1.0f, 5.184f, -1.822f, 7.0f, -2.0f)
                verticalLineToRelative(-2.462f)
                curveToRelative(1.246f, -0.257f, 3.049f, -0.538f, 5.0f, -0.538f)
                reflectiveCurveToRelative(3.752f, 0.282f, 5.0f, 0.539f)
                verticalLineToRelative(2.461f)
                curveToRelative(1.816f, 0.178f, 4.5f, 1.0f, 7.0f, 2.0f)
                verticalLineToRelative(-0.068f)
                curveToRelative(-1.192f, -2.893f, -3.0f, -4.932f, -3.0f, -4.932f)
                curveToRelative(0.0f, 0.0f, 1.5f, -2.0f, 3.0f, -2.932f)
                close()
                moveTo(6.0f, 12.707f)
                verticalLineToRelative(-5.968f)
                curveToRelative(1.011f, -0.275f, 3.138f, -0.739f, 6.0f, -0.739f)
                reflectiveCurveToRelative(4.99f, 0.464f, 6.0f, 0.739f)
                verticalLineToRelative(5.968f)
                curveToRelative(-1.33f, -0.306f, -3.546f, -0.707f, -6.0f, -0.707f)
                reflectiveCurveToRelative(-4.67f, 0.401f, -6.0f, 0.707f)
                close()
            }
        }
        .build()
        return _banner5!!
    }

private var _banner5: ImageVector? = null
