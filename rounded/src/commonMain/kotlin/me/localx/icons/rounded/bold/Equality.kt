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

public val Icons.Bold.Equality: ImageVector
    get() {
        if (_equality != null) {
            return _equality!!
        }
        _equality = Builder(name = "Equality", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.5f)
                curveToRelative(0.219f, 6.249f, 9.441f, 5.76f, 8.937f, -0.431f)
                lineToRelative(-2.572f, -8.575f)
                curveToRelative(-0.447f, -1.492f, -1.795f, -2.494f, -3.353f, -2.494f)
                horizontalLineToRelative(-4.512f)
                verticalLineToRelative(-0.5f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                verticalLineToRelative(0.5f)
                lineTo(5.988f, 2.0f)
                curveToRelative(-1.558f, 0.0f, -2.905f, 1.002f, -3.353f, 2.494f)
                lineTo(0.063f, 13.069f)
                curveToRelative(-0.396f, 2.599f, 1.85f, 4.953f, 4.436f, 4.931f)
                curveToRelative(2.585f, 0.021f, 4.821f, -2.323f, 4.44f, -4.92f)
                lineTo(6.583f, 5.0f)
                horizontalLineToRelative(3.917f)
                lineTo(10.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(3.917f)
                lineToRelative(-2.357f, 8.08f)
                curveToRelative(-0.039f, 0.136f, -0.06f, 0.278f, -0.06f, 0.42f)
                close()
                moveTo(4.521f, 8.646f)
                lineToRelative(1.27f, 4.354f)
                lineTo(3.216f, 13.0f)
                lineToRelative(1.306f, -4.354f)
                close()
                moveTo(20.784f, 13.0f)
                horizontalLineToRelative(-2.576f)
                lineToRelative(1.27f, -4.354f)
                lineToRelative(1.306f, 4.354f)
                close()
            }
        }
        .build()
        return _equality!!
    }

private var _equality: ImageVector? = null
