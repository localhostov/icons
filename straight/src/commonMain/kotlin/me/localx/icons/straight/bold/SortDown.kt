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

public val Icons.Bold.SortDown: ImageVector
    get() {
        if (_sortDown != null) {
            return _sortDown!!
        }
        _sortDown = Builder(name = "SortDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.024f, 18.0f)
                curveToRelative(-0.793f, 0.0f, -1.552f, -0.339f, -2.082f, -0.929f)
                lineTo(1.643f, 8.0f)
                lineTo(22.405f, 8.0f)
                lineToRelative(-8.31f, 9.082f)
                curveToRelative(-0.521f, 0.579f, -1.279f, 0.918f, -2.071f, 0.918f)
                close()
                moveTo(11.875f, 15.064f)
                lineToRelative(-0.002f, 0.003f)
                lineToRelative(0.002f, -0.003f)
                close()
                moveTo(12.164f, 15.055f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(8.453f, 10.999f)
                lineToRelative(3.571f, 3.902f)
                lineToRelative(3.57f, -3.902f)
                horizontalLineToRelative(-7.142f)
                close()
            }
        }
        .build()
        return _sortDown!!
    }

private var _sortDown: ImageVector? = null
