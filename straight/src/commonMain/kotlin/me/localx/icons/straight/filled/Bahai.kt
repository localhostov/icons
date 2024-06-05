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

public val Icons.Filled.Bahai: ImageVector
    get() {
        if (_bahai != null) {
            return _bahai!!
        }
        _bahai = Builder(name = "Bahai", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.181f, 24.0f)
                lineToRelative(-4.171f, -3.329f)
                lineToRelative(-4.171f, 3.329f)
                lineToRelative(-1.054f, -5.231f)
                lineToRelative(-5.335f, -0.13f)
                lineToRelative(2.554f, -4.687f)
                lineTo(0.0f, 10.423f)
                lineToRelative(4.969f, -1.947f)
                lineToRelative(-0.798f, -5.277f)
                lineToRelative(5.059f, 1.703f)
                lineTo(12.01f, 0.345f)
                lineToRelative(2.781f, 4.557f)
                lineToRelative(5.058f, -1.703f)
                lineToRelative(-0.798f, 5.277f)
                lineToRelative(4.969f, 1.947f)
                lineToRelative(-4.003f, 3.529f)
                lineToRelative(2.554f, 4.687f)
                lineToRelative(-5.335f, 0.13f)
                lineToRelative(-1.054f, 5.231f)
                close()
            }
        }
        .build()
        return _bahai!!
    }

private var _bahai: ImageVector? = null
