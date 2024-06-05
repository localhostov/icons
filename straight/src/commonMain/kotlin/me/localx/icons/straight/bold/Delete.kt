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

public val Icons.Bold.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 2.0f)
                horizontalLineToRelative(-13.241f)
                lineToRelative(-7.648f, 10.0f)
                lineToRelative(7.648f, 10.0f)
                horizontalLineToRelative(13.241f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-11.759f)
                lineToRelative(-5.352f, -7.0f)
                lineToRelative(5.352f, -7.0f)
                horizontalLineToRelative(11.759f)
                close()
                moveTo(9.939f, 13.939f)
                lineTo(11.879f, 12.0f)
                lineTo(9.939f, 10.061f)
                lineTo(12.061f, 7.939f)
                lineTo(14.0f, 9.879f)
                lineTo(15.939f, 7.939f)
                lineTo(18.061f, 10.061f)
                lineTo(16.121f, 12.0f)
                lineTo(18.061f, 13.939f)
                lineTo(15.939f, 16.061f)
                lineTo(14.0f, 14.121f)
                lineTo(12.061f, 16.061f)
                close()
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
