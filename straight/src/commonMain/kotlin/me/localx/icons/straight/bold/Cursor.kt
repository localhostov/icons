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

public val Icons.Bold.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.811f, 13.29f)
                lineToRelative(-14.796f, -12.777f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.015f, 1.987f)
                verticalLineToRelative(19.307f)
                lineToRelative(6.306f, -5.564f)
                lineToRelative(3.886f, 7.757f)
                lineToRelative(4.35f, -2.175f)
                lineToRelative(-3.767f, -7.643f)
                close()
                moveTo(7.0f, 3.6f)
                lineTo(15.647f, 11.069f)
                lineTo(10.714f, 11.614f)
                lineTo(7.0f, 15.16f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
