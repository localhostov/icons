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

public val Icons.Bold.Thunderstorm: ImageVector
    get() {
        if (_thunderstorm != null) {
            return _thunderstorm!!
        }
        _thunderstorm = Builder(name = "Thunderstorm", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.848f, 16.406f)
                lineTo(10.789f, 24.0f)
                lineTo(9.59f, 24.0f)
                lineTo(11.0f, 19.0f)
                lineTo(7.923f, 19.0f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, true, -0.883f, -1.19f)
                lineTo(9.7f, 10.0f)
                lineTo(14.0f, 10.0f)
                lineToRelative(-1.964f, 5.0f)
                horizontalLineToRelative(3.057f)
                arcTo(0.906f, 0.906f, 0.0f, false, true, 15.848f, 16.406f)
                close()
                moveTo(21.0f, 12.479f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(24.0f, 12.5f)
                arcToRelative(8.045f, 8.045f, 0.0f, false, true, -7.321f, 7.966f)
                lineToRelative(-1.194f, 0.091f)
                lineToRelative(2.029f, -3.045f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, false, 0.163f, -0.3f)
                lineToRelative(0.445f, -0.19f)
                arcTo(5.062f, 5.062f, 0.0f, false, false, 21.0f, 12.477f)
                horizontalLineToRelative(0.0f)
                arcTo(4.516f, 4.516f, 0.0f, false, false, 16.452f, 8.0f)
                lineTo(15.37f, 7.965f)
                lineToRelative(-0.308f, -1.038f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 10.091f, 3.0f)
                arcTo(4.935f, 4.935f, 0.0f, false, false, 5.0f, 8.0f)
                arcToRelative(5.972f, 5.972f, 0.0f, false, false, 0.246f, 2.025f)
                lineToRelative(0.48f, 1.258f)
                lineToRelative(-1.2f, 0.612f)
                arcTo(2.786f, 2.786f, 0.0f, false, false, 3.0f, 14.387f)
                arcToRelative(3.159f, 3.159f, 0.0f, false, false, 1.652f, 2.776f)
                lineToRelative(0.451f, 0.2f)
                arcToRelative(3.364f, 3.364f, 0.0f, false, false, 0.282f, 2.487f)
                arcToRelative(3.564f, 3.564f, 0.0f, false, false, 0.731f, 0.892f)
                arcToRelative(14.089f, 14.089f, 0.0f, false, true, -1.383f, -0.376f)
                arcTo(6.156f, 6.156f, 0.0f, false, true, 0.0f, 14.387f)
                verticalLineToRelative(-0.011f)
                arcTo(5.772f, 5.772f, 0.0f, false, true, 2.133f, 9.892f)
                arcTo(11.93f, 11.93f, 0.0f, false, true, 2.0f, 8.0f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 8.091f, -8.0f)
                arcToRelative(8.294f, 8.294f, 0.0f, false, true, 7.493f, 5.1f)
                arcTo(7.434f, 7.434f, 0.0f, false, true, 24.0f, 12.5f)
                close()
                moveTo(0.005f, 14.387f)
                lineTo(0.0f, 14.387f)
                curveTo(0.0f, 14.4f, 0.0f, 14.405f, 0.005f, 14.387f)
                close()
                moveTo(2.999f, 14.387f)
                lineTo(3.0f, 14.387f)
                curveTo(3.0f, 14.405f, 3.0f, 14.4f, 3.0f, 14.387f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null
