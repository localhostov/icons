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

public val Icons.Bold.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.964f, 10.416f)
                arcToRelative(12.037f, 12.037f, 0.0f, true, false, -13.548f, 13.547f)
                arcToRelative(4.04f, 4.04f, 0.0f, false, false, 0.538f, 0.036f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, false, 3.066f, -1.29f)
                lineToRelative(8.689f, -8.689f)
                arcToRelative(4.329f, 4.329f, 0.0f, false, false, 1.255f, -3.604f)
                close()
                moveTo(3.057f, 11.0f)
                arcToRelative(9.042f, 9.042f, 0.0f, false, true, 17.505f, -1.978f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.54f, 11.539f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -5.965f, -9.561f)
                close()
                moveTo(12.027f, 20.457f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 8.432f, -8.431f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
