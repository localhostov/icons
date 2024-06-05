package me.localx.icons.rounded.outline

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

public val Icons.Outline.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.967f, 10.417f)
                arcToRelative(12.04f, 12.04f, 0.0f, true, false, -13.55f, 13.55f)
                arcToRelative(3.812f, 3.812f, 0.0f, false, false, 0.489f, 0.032f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 2.805f, -1.184f)
                lineToRelative(9.1f, -9.1f)
                arcToRelative(3.962f, 3.962f, 0.0f, false, false, 1.156f, -3.298f)
                close()
                moveTo(2.067f, 10.891f)
                arcToRelative(10.034f, 10.034f, 0.0f, false, true, 19.8f, -0.884f)
                arcToRelative(12.006f, 12.006f, 0.0f, false, false, -11.86f, 11.852f)
                arcToRelative(9.988f, 9.988f, 0.0f, false, true, -7.944f, -10.968f)
                close()
                moveTo(12.3f, 21.4f)
                arcToRelative(2.121f, 2.121f, 0.0f, false, true, -0.278f, 0.225f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.606f, -9.607f)
                arcToRelative(2.043f, 2.043f, 0.0f, false, true, -0.224f, 0.279f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
