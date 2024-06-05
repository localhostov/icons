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

public val Icons.Bold.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 12.0f)
                close()
                moveTo(16.953f, 20.575f)
                curveToRelative(4.683f, 0.673f, 7.914f, -4.955f, 4.859f, -8.59f)
                arcToRelative(5.345f, 5.345f, 0.0f, false, false, -4.888f, -8.633f)
                arcToRelative(5.312f, 5.312f, 0.0f, false, false, -9.848f, 0.0f)
                arcToRelative(5.344f, 5.344f, 0.0f, false, false, -4.888f, 8.632f)
                curveToRelative(-3.056f, 3.637f, 0.177f, 9.263f, 4.859f, 8.59f)
                arcToRelative(5.294f, 5.294f, 0.0f, false, false, 9.906f, 0.0f)
                close()
                moveTo(7.438f, 17.389f)
                curveToRelative(-2.65f, 1.247f, -4.944f, -2.5f, -2.218f, -4.073f)
                arcToRelative(1.511f, 1.511f, 0.0f, false, false, 0.0f, -2.632f)
                curveTo(2.567f, 9.148f, 4.7f, 5.105f, 7.442f, 6.616f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.7f, 5.318f)
                arcToRelative(2.3f, 2.3f, 0.0f, true, true, 4.6f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.258f, 1.294f)
                curveTo(19.3f, 5.105f, 21.432f, 9.15f, 18.78f, 10.684f)
                arcToRelative(1.511f, 1.511f, 0.0f, false, false, 0.0f, 2.632f)
                curveToRelative(2.727f, 1.576f, 0.429f, 5.32f, -2.218f, 4.073f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.3f, 18.682f)
                arcToRelative(2.3f, 2.3f, 0.0f, true, true, -4.6f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.262f, -1.293f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
