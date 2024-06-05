package me.localx.icons.rounded.filled

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

public val Icons.Filled.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.782f, 12.173f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, -0.966f, 1.539f)
                lineToRelative(-9.1f, 9.1f)
                arcToRelative(4.026f, 4.026f, 0.0f, false, true, -1.539f, 0.95f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, true, -0.084f, -2.851f)
                arcToRelative(10.05f, 10.05f, 0.0f, false, true, 8.827f, -8.826f)
                arcToRelative(10.256f, 10.256f, 0.0f, false, true, 2.862f, 0.088f)
                close()
                moveTo(10.1f, 20.7f)
                arcToRelative(12.063f, 12.063f, 0.0f, false, true, 10.6f, -10.6f)
                arcToRelative(12.357f, 12.357f, 0.0f, false, true, 3.228f, 0.078f)
                arcToRelative(12.034f, 12.034f, 0.0f, true, false, -13.752f, 13.744f)
                arcToRelative(12.306f, 12.306f, 0.0f, false, true, -0.076f, -3.222f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
