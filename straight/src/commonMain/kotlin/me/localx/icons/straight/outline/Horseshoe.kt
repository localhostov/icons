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

public val Icons.Outline.Horseshoe: ImageVector
    get() {
        if (_horseshoe != null) {
            return _horseshoe!!
        }
        _horseshoe = Builder(name = "Horseshoe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                curveTo(23.0f, 4.935f, 18.065f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 4.162f, 1.591f, 8.74f, 2.492f, 11.0f)
                horizontalLineToRelative(-1.492f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 24.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-0.033f, -0.254f)
                curveToRelative(-0.02f, -0.075f, -1.967f, -7.532f, -1.967f, -11.246f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 3.714f, -1.948f, 11.171f, -1.967f, 11.246f)
                lineToRelative(-0.033f, 1.754f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.492f)
                curveToRelative(0.901f, -2.26f, 2.492f, -6.838f, 2.492f, -11.0f)
                close()
                moveTo(17.045f, 7.765f)
                lineToRelative(2.444f, -1.746f)
                curveToRelative(0.953f, 1.428f, 1.511f, 3.14f, 1.511f, 4.982f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.192f, -0.353f, -2.301f, -0.955f, -3.235f)
                close()
                moveTo(4.511f, 6.019f)
                lineToRelative(2.444f, 1.746f)
                curveToRelative(-0.602f, 0.935f, -0.955f, 2.044f, -0.955f, 3.236f)
                lineTo(3.0f, 11.001f)
                curveToRelative(0.0f, -1.841f, 0.558f, -3.554f, 1.511f, -4.982f)
                close()
                moveTo(5.656f, 22.001f)
                curveToRelative(-0.597f, -1.417f, -2.09f, -5.239f, -2.531f, -9.0f)
                horizontalLineToRelative(2.997f)
                curveToRelative(0.339f, 3.233f, 1.304f, 7.327f, 1.721f, 9.0f)
                horizontalLineToRelative(-2.186f)
                close()
                moveTo(8.313f, 6.278f)
                lineToRelative(-2.506f, -1.79f)
                curveToRelative(1.388f, -1.32f, 3.19f, -2.205f, 5.193f, -2.428f)
                verticalLineToRelative(3.031f)
                curveToRelative(-1.002f, 0.169f, -1.919f, 0.585f, -2.688f, 1.186f)
                close()
                moveTo(13.001f, 5.092f)
                lineTo(13.001f, 2.059f)
                curveToRelative(2.003f, 0.223f, 3.806f, 1.108f, 5.194f, 2.428f)
                lineToRelative(-2.506f, 1.79f)
                curveToRelative(-0.769f, -0.601f, -1.686f, -1.017f, -2.688f, -1.187f)
                close()
                moveTo(17.88f, 13.002f)
                horizontalLineToRelative(2.997f)
                curveToRelative(-0.441f, 3.761f, -1.934f, 7.583f, -2.531f, 9.0f)
                horizontalLineToRelative(-2.186f)
                curveToRelative(0.416f, -1.673f, 1.382f, -5.767f, 1.721f, -9.0f)
                close()
            }
        }
        .build()
        return _horseshoe!!
    }

private var _horseshoe: ImageVector? = null
