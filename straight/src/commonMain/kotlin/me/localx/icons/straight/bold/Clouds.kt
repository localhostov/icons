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

public val Icons.Bold.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 24.0f)
                horizontalLineTo(10.5f)
                arcToRelative(4.508f, 4.508f, 0.0f, false, true, -1.495f, -8.745f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 19.63f, 13.573f)
                arcTo(5.255f, 5.255f, 0.0f, false, true, 18.75f, 24.0f)
                close()
                moveTo(10.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(8.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, -4.5f)
                horizontalLineTo(17.124f)
                lineToRelative(-0.166f, -1.312f)
                arcToRelative(2.481f, 2.481f, 0.0f, true, false, -4.864f, 0.933f)
                lineTo(12.585f, 18.0f)
                close()
                moveTo(17.833f, 5.56f)
                lineToRelative(-0.023f, 0.011f)
                arcTo(8.113f, 8.113f, 0.0f, false, false, 8.883f, 0.088f)
                arcTo(8.174f, 8.174f, 0.0f, false, false, 2.6f, 11.466f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 4.462f, 21.893f)
                arcToRelative(6.358f, 6.358f, 0.0f, false, true, -0.373f, -3.411f)
                arcTo(2.6f, 2.6f, 0.0f, false, true, 3.1f, 17.048f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.0f, -3.446f)
                lineToRelative(2.155f, -0.556f)
                lineTo(5.93f, 11.257f)
                arcToRelative(5.176f, 5.176f, 0.0f, true, true, 9.289f, -3.765f)
                lineToRelative(0.075f, 0.563f)
                arcToRelative(7.529f, 7.529f, 0.0f, false, true, 5.746f, 3.813f)
                arcTo(7.217f, 7.217f, 0.0f, false, true, 24.0f, 13.749f)
                curveTo(24.0f, 9.0f, 19.93f, 6.268f, 17.833f, 5.56f)
                close()
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
