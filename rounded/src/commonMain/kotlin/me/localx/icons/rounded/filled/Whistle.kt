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

public val Icons.Filled.Whistle: ImageVector
    get() {
        if (_whistle != null) {
            return _whistle!!
        }
        _whistle = Builder(name = "Whistle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 16.0f)
                close()
                moveTo(24.0f, 10.5f)
                verticalLineToRelative(1.248f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.054f, 2.46f)
                lineToRelative(-5.161f, 0.938f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 16.152f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.806f, 3.287f)
                arcTo(7.956f, 7.956f, 0.0f, false, true, 9.285f, 23.9f)
                arcToRelative(8.264f, 8.264f, 0.0f, false, true, -1.279f, 0.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.984f, -8.6f)
                arcTo(8.152f, 8.152f, 0.0f, false, true, 8.229f, 8.0f)
                lineTo(21.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 24.0f, 10.5f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 16.0f)
                close()
                moveTo(11.0f, 4.0f)
                lineTo(11.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 1.0f)
                lineTo(9.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(14.4f, 5.447f)
                lineTo(15.9f, 2.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.79f, -0.894f)
                lineToRelative(-1.5f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.789f, 0.894f)
                close()
                moveTo(6.972f, 5.893f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.441f, -1.344f)
                lineToRelative(-1.516f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.786f, 0.9f)
                lineToRelative(1.517f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.518f, 6.0f)
                arcTo(1.011f, 1.011f, 0.0f, false, false, 6.968f, 5.893f)
                close()
            }
        }
        .build()
        return _whistle!!
    }

private var _whistle: ImageVector? = null
