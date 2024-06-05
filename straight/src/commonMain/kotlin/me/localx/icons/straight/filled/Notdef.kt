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

public val Icons.Filled.Notdef: ImageVector
    get() {
        if (_notdef != null) {
            return _notdef!!
        }
        _notdef = Builder(name = "Notdef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.72f, 0.3f)
                curveToRelative(0.39f, -0.18f, 0.82f, -0.3f, 1.28f, -0.3f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.46f, 0.0f, 0.89f, 0.11f, 1.28f, 0.3f)
                lineToRelative(-7.28f, 10.0f)
                lineTo(4.72f, 0.3f)
                close()
                moveTo(10.76f, 12.0f)
                lineTo(3.29f, 1.73f)
                curveToRelative(-0.18f, 0.39f, -0.29f, 0.82f, -0.29f, 1.27f)
                lineTo(3.0f, 22.68f)
                lineToRelative(7.76f, -10.67f)
                close()
                moveTo(21.0f, 22.67f)
                lineTo(21.0f, 3.0f)
                curveToRelative(0.0f, -0.46f, -0.11f, -0.88f, -0.29f, -1.27f)
                lineToRelative(-7.47f, 10.27f)
                lineToRelative(7.76f, 10.67f)
                close()
                moveTo(12.0f, 13.7f)
                lineToRelative(-7.49f, 10.3f)
                horizontalLineToRelative(14.98f)
                lineToRelative(-7.49f, -10.3f)
                close()
            }
        }
        .build()
        return _notdef!!
    }

private var _notdef: ImageVector? = null
