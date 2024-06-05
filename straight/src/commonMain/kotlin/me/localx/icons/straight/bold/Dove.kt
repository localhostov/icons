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

public val Icons.Bold.Dove: ImageVector
    get() {
        if (_dove != null) {
            return _dove!!
        }
        _dove = Builder(name = "Dove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.295f)
                lineToRelative(-2.199f, -0.943f)
                curveToRelative(-0.33f, -1.307f, -1.092f, -2.32f, -2.2f, -2.875f)
                curveToRelative(-1.074f, -0.539f, -2.293f, -0.627f, -3.435f, -0.247f)
                curveToRelative(-1.141f, 0.379f, -2.065f, 1.18f, -2.591f, 2.228f)
                lineToRelative(-1.047f, 1.992f)
                curveToRelative(-2.894f, -1.225f, -5.09f, -2.89f, -5.116f, -2.91f)
                lineTo(5.406f, 0.006f)
                lineToRelative(-0.388f, 2.494f)
                curveToRelative(-0.008f, 0.052f, -0.037f, 0.255f, -0.058f, 0.579f)
                curveToRelative(-0.904f, -0.618f, -1.444f, -1.093f, -1.458f, -1.106f)
                lineTo(1.36f, 0.05f)
                lineToRelative(-0.349f, 2.857f)
                curveToRelative(-0.039f, 0.316f, -0.776f, 6.935f, 3.988f, 12.199f)
                lineToRelative(-5.0f, 0.671f)
                verticalLineToRelative(1.312f)
                curveToRelative(0.0f, 2.606f, 1.338f, 5.767f, 5.093f, 6.825f)
                lineToRelative(0.604f, 0.17f)
                lineToRelative(5.066f, -2.887f)
                curveToRelative(0.14f, 0.046f, 0.274f, 0.093f, 0.406f, 0.139f)
                curveToRelative(0.897f, 0.312f, 1.825f, 0.634f, 3.581f, 0.634f)
                curveToRelative(3.998f, 0.0f, 7.25f, -3.252f, 7.25f, -7.25f)
                curveToRelative(0.0f, -1.703f, -0.007f, -5.726f, -0.011f, -8.064f)
                lineToRelative(2.011f, -0.862f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(14.75f, 18.971f)
                curveToRelative(-2.006f, 0.0f, -4.383f, -1.0f, -4.383f, -1.0f)
                lineToRelative(-5.021f, 2.862f)
                curveToRelative(-1.337f, -0.561f, -1.922f, -1.57f, -2.171f, -2.454f)
                lineToRelative(5.832f, -0.783f)
                lineToRelative(1.089f, -2.068f)
                lineToRelative(-1.03f, -0.766f)
                curveToRelative(-3.547f, -2.641f, -4.669f, -6.216f, -4.997f, -8.675f)
                curveToRelative(2.043f, 1.278f, 5.115f, 2.754f, 8.525f, 2.868f)
                lineToRelative(0.94f, 0.032f)
                lineToRelative(2.71f, -5.156f)
                curveToRelative(0.18f, -0.358f, 0.488f, -0.625f, 0.868f, -0.751f)
                curveToRelative(0.38f, -0.125f, 0.786f, -0.097f, 1.145f, 0.082f)
                curveToRelative(0.634f, 0.318f, 0.729f, 1.23f, 0.729f, 1.746f)
                curveToRelative(0.0f, 0.0f, 0.015f, 8.052f, 0.015f, 9.816f)
                curveToRelative(0.0f, 2.343f, -1.906f, 4.25f, -4.25f, 4.25f)
                close()
            }
        }
        .build()
        return _dove!!
    }

private var _dove: ImageVector? = null
