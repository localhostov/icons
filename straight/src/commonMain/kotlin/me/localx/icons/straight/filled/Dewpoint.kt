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

public val Icons.Filled.Dewpoint: ImageVector
    get() {
        if (_dewpoint != null) {
            return _dewpoint!!
        }
        _dewpoint = Builder(name = "Dewpoint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 23.994f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.929f, 6.922f)
                lineTo(10.0f, 0.006f)
                lineToRelative(7.063f, 6.909f)
                arcToRelative(10.012f, 10.012f, 0.0f, false, true, 0.008f, 14.149f)
                horizontalLineToRelative(0.0f)
                arcTo(9.931f, 9.931f, 0.0f, false, true, 10.0f, 23.994f)
                close()
                moveTo(21.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 6.0f)
                close()
                moveTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 2.0f)
                close()
            }
        }
        .build()
        return _dewpoint!!
    }

private var _dewpoint: ImageVector? = null
