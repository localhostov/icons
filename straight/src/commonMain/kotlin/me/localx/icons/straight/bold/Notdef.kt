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

public val Icons.Bold.Notdef: ImageVector
    get() {
        if (_notdef != null) {
            return _notdef!!
        }
        _notdef = Builder(name = "Notdef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(3.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(10.16f, 11.99f)
                lineToRelative(-4.16f, 5.83f)
                lineTo(6.0f, 6.16f)
                lineToRelative(4.16f, 5.83f)
                close()
                moveTo(7.43f, 3.0f)
                horizontalLineToRelative(9.15f)
                lineToRelative(-4.57f, 6.41f)
                lineTo(7.43f, 3.0f)
                close()
                moveTo(12.0f, 14.57f)
                lineToRelative(4.59f, 6.43f)
                lineTo(7.41f, 21.0f)
                lineToRelative(4.59f, -6.43f)
                close()
                moveTo(13.84f, 11.99f)
                lineToRelative(4.16f, -5.83f)
                verticalLineToRelative(11.65f)
                lineToRelative(-4.16f, -5.83f)
                close()
            }
        }
        .build()
        return _notdef!!
    }

private var _notdef: ImageVector? = null
