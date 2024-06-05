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

public val Icons.Bold.Tire: ImageVector
    get() {
        if (_tire != null) {
            return _tire!!
        }
        _tire = Builder(name = "Tire", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 9.0f, -9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(9.625f, 12.935f)
                lineTo(6.813f, 16.684f)
                arcTo(6.963f, 6.963f, 0.0f, false, true, 5.0f, 12.0f)
                arcToRelative(7.091f, 7.091f, 0.0f, false, true, 0.063f, -0.891f)
                close()
                moveTo(10.5f, 10.053f)
                lineTo(6.078f, 8.284f)
                arcTo(7.016f, 7.016f, 0.0f, false, true, 10.5f, 5.166f)
                close()
                moveTo(17.922f, 8.285f)
                lineTo(13.5f, 10.053f)
                lineTo(13.5f, 5.166f)
                arcTo(7.014f, 7.014f, 0.0f, false, true, 17.922f, 8.285f)
                close()
                moveTo(19.0f, 12.0f)
                arcToRelative(6.963f, 6.963f, 0.0f, false, true, -1.813f, 4.684f)
                lineToRelative(-2.812f, -3.75f)
                lineToRelative(4.562f, -1.825f)
                arcTo(7.091f, 7.091f, 0.0f, false, true, 19.0f, 12.0f)
                close()
                moveTo(12.0f, 14.769f)
                lineTo(14.75f, 18.436f)
                arcToRelative(6.986f, 6.986f, 0.0f, false, true, -5.5f, 0.0f)
                close()
            }
        }
        .build()
        return _tire!!
    }

private var _tire: ImageVector? = null
