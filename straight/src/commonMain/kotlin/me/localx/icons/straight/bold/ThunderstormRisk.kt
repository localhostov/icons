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

public val Icons.Bold.ThunderstormRisk: ImageVector
    get() {
        if (_thunderstormRisk != null) {
            return _thunderstormRisk!!
        }
        _thunderstormRisk = Builder(name = "ThunderstormRisk", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 24.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(-7.0f, -12.0f)
                lineToRelative(-7.0f, 12.0f)
                close()
                moveTo(13.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(23.996f, 12.295f)
                curveToRelative(-0.02f, 3.382f, -2.217f, 6.252f, -5.258f, 7.287f)
                lineToRelative(-1.561f, -2.676f)
                curveToRelative(2.169f, -0.431f, 3.81f, -2.342f, 3.821f, -4.634f)
                curveToRelative(-0.011f, -2.206f, -1.587f, -4.127f, -3.758f, -4.572f)
                lineToRelative(-0.815f, -0.167f)
                lineToRelative(-0.29f, -0.78f)
                curveToRelative(-0.833f, -2.245f, -2.997f, -3.753f, -5.385f, -3.753f)
                curveToRelative(-3.17f, 0.0f, -5.75f, 2.58f, -5.75f, 5.75f)
                curveToRelative(0.0f, 0.437f, 0.054f, 0.874f, 0.164f, 1.337f)
                lineToRelative(0.253f, 1.062f)
                lineToRelative(-0.932f, 0.567f)
                curveToRelative(-0.888f, 0.541f, -1.484f, 1.54f, -1.484f, 2.488f)
                curveToRelative(0.0f, 1.542f, 1.04f, 2.796f, 2.318f, 2.796f)
                horizontalLineToRelative(1.45f)
                lineToRelative(-1.741f, 2.984f)
                curveToRelative(-2.797f, -0.166f, -5.027f, -2.691f, -5.027f, -5.78f)
                curveToRelative(0.0f, -1.645f, 0.787f, -3.287f, 2.065f, -4.417f)
                curveToRelative(-0.043f, -0.349f, -0.065f, -0.696f, -0.065f, -1.038f)
                curveTo(2.0f, 3.925f, 5.925f, 0.0f, 10.75f, 0.0f)
                curveToRelative(3.366f, 0.0f, 6.439f, 1.967f, 7.883f, 4.968f)
                curveToRelative(3.077f, 0.981f, 5.259f, 4.069f, 5.364f, 7.327f)
                close()
            }
        }
        .build()
        return _thunderstormRisk!!
    }

private var _thunderstormRisk: ImageVector? = null
