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

public val Icons.Bold.Tomato: ImageVector
    get() {
        if (_tomato != null) {
            return _tomato!!
        }
        _tomato = Builder(name = "Tomato", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.558f, 5.311f)
                arcTo(4.247f, 4.247f, 0.0f, false, false, 18.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcToRelative(2.248f, 2.248f, 0.0f, false, true, -1.5f, 1.714f)
                verticalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(5.214f)
                arcTo(2.248f, 2.248f, 0.0f, false, true, 9.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcToRelative(4.243f, 4.243f, 0.0f, false, false, 0.427f, 1.815f)
                arcTo(8.981f, 8.981f, 0.0f, false, false, 0.0f, 14.029f)
                arcTo(10.433f, 10.433f, 0.0f, false, false, 10.091f, 24.0f)
                horizontalLineToRelative(3.818f)
                arcTo(9.71f, 9.71f, 0.0f, false, false, 24.0f, 14.029f)
                arcTo(8.981f, 8.981f, 0.0f, false, false, 17.558f, 5.311f)
                close()
                moveTo(13.909f, 21.0f)
                horizontalLineTo(10.091f)
                arcTo(7.411f, 7.411f, 0.0f, false, true, 3.0f, 14.029f)
                arcTo(5.86f, 5.86f, 0.0f, false, true, 8.659f, 8.0f)
                arcToRelative(5.292f, 5.292f, 0.0f, false, true, 1.325f, 0.216f)
                arcToRelative(4.542f, 4.542f, 0.0f, false, true, -1.848f, 0.829f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 12.0f)
                arcToRelative(1.532f, 1.532f, 0.0f, false, false, 0.365f, -0.045f)
                arcTo(7.363f, 7.363f, 0.0f, false, false, 12.0f, 10.425f)
                arcToRelative(7.356f, 7.356f, 0.0f, false, false, 3.134f, 1.53f)
                arcTo(1.538f, 1.538f, 0.0f, false, false, 15.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.363f, -2.955f)
                arcTo(4.553f, 4.553f, 0.0f, false, true, 14.0f, 8.2f)
                arcTo(5.306f, 5.306f, 0.0f, false, true, 15.341f, 8.0f)
                arcTo(5.86f, 5.86f, 0.0f, false, true, 21.0f, 14.029f)
                arcTo(6.735f, 6.735f, 0.0f, false, true, 13.909f, 21.0f)
                close()
            }
        }
        .build()
        return _tomato!!
    }

private var _tomato: ImageVector? = null
