package me.localx.icons.straight.filled

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

public val Icons.Filled.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-13.242f)
                lineToRelative(-7.758f, 10.0f)
                lineToRelative(7.758f, 10.0f)
                horizontalLineToRelative(13.242f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
                moveTo(17.959f, 14.543f)
                lineTo(16.545f, 15.957f)
                lineTo(14.0f, 13.414f)
                lineTo(11.457f, 15.957f)
                lineTo(10.043f, 14.543f)
                lineTo(12.586f, 12.0f)
                lineTo(10.043f, 9.457f)
                lineTo(11.457f, 8.043f)
                lineTo(14.0f, 10.586f)
                lineTo(16.543f, 8.043f)
                lineTo(17.957f, 9.457f)
                lineTo(15.414f, 12.0f)
                close()
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
