package me.localx.icons.straight.outline

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

public val Icons.Outline.Pan: ImageVector
    get() {
        if (_pan != null) {
            return _pan!!
        }
        _pan = Builder(name = "Pan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, -0.008f)
                arcTo(9.981f, 9.981f, 0.0f, false, false, 5.144f, 14.6f)
                lineTo(-0.008f, 19.753f)
                lineToRelative(4.24f, 4.239f)
                lineToRelative(5.151f, -5.151f)
                arcTo(9.99f, 9.99f, 0.0f, true, false, 14.0f, -0.008f)
                close()
                moveTo(4.232f, 21.166f)
                lineTo(2.818f, 19.753f)
                lineToRelative(3.447f, -3.448f)
                arcToRelative(10.105f, 10.105f, 0.0f, false, false, 1.414f, 1.414f)
                close()
                moveTo(14.0f, 17.98f)
                arcToRelative(7.995f, 7.995f, 0.0f, true, true, 7.994f, -7.994f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 14.0f, 17.98f)
                close()
                moveTo(20.0f, 9.98f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.0f, -6.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _pan!!
    }

private var _pan: ImageVector? = null
