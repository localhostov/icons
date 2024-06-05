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

public val Icons.Bold.Sausage: ImageVector
    get() {
        if (_sausage != null) {
            return _sausage!!
        }
        _sausage = Builder(name = "Sausage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.313f, 3.716f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 23.0f, 0.0f)
                horizontalLineTo(20.0f)
                arcToRelative(2.975f, 2.975f, 0.0f, false, true, -1.0f, 1.792f)
                arcTo(2.973f, 2.973f, 0.0f, false, true, 18.0f, 0.0f)
                horizontalLineTo(15.0f)
                arcToRelative(5.445f, 5.445f, 0.0f, false, false, 1.49f, 3.5f)
                arcToRelative(5.176f, 5.176f, 0.0f, false, false, -3.065f, 4.66f)
                arcTo(5.913f, 5.913f, 0.0f, false, true, 11.5f, 11.519f)
                arcToRelative(6.155f, 6.155f, 0.0f, false, true, -3.323f, 1.918f)
                arcToRelative(5.207f, 5.207f, 0.0f, false, false, -4.67f, 3.06f)
                arcTo(5.445f, 5.445f, 0.0f, false, false, 0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, 1.793f, 1.0f)
                arcTo(2.978f, 2.978f, 0.0f, false, true, 0.0f, 20.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.607f, 5.607f, 0.0f, false, false, 3.714f, -1.684f)
                arcTo(5.281f, 5.281f, 0.0f, false, false, 8.3f, 24.0f)
                curveToRelative(0.95f, 0.0f, 5.93f, -0.267f, 10.681f, -5.007f)
                curveTo(23.758f, 14.225f, 24.0f, 9.263f, 24.0f, 8.317f)
                arcTo(5.306f, 5.306f, 0.0f, false, false, 21.313f, 3.716f)
                close()
                moveTo(16.858f, 16.869f)
                curveTo(12.937f, 20.781f, 9.026f, 21.0f, 8.289f, 21.0f)
                arcTo(2.291f, 2.291f, 0.0f, false, true, 6.0f, 18.729f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, true, 2.279f, -2.293f)
                arcToRelative(9.016f, 9.016f, 0.0f, false, false, 5.341f, -2.793f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, 2.8f, -5.4f)
                arcTo(2.245f, 2.245f, 0.0f, false, true, 18.712f, 6.0f)
                arcTo(2.306f, 2.306f, 0.0f, false, true, 21.0f, 8.317f)
                curveTo(21.0f, 9.055f, 20.8f, 12.938f, 16.858f, 16.869f)
                close()
            }
        }
        .build()
        return _sausage!!
    }

private var _sausage: ImageVector? = null
