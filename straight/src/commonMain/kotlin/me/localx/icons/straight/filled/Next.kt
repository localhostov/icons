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

public val Icons.Filled.Next: ImageVector
    get() {
        if (_next != null) {
            return _next!!
        }
        _next = Builder(name = "Next", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.124f, 9.879f)
                lineTo(18.538f, 5.293f)
                lineTo(17.124f, 6.707f)
                lineToRelative(4.262f, 4.263f)
                lineTo(0.0f, 11.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(21.446f, -0.03f)
                lineToRelative(-4.323f, 4.323f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.587f, -4.586f)
                arcTo(3.007f, 3.007f, 0.0f, false, false, 23.124f, 9.879f)
                close()
            }
        }
        .build()
        return _next!!
    }

private var _next: ImageVector? = null
