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

public val Icons.Bold.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 23.8f)
                verticalLineTo(0.2f)
                lineTo(9.0f, 5.911f)
                verticalLineTo(0.317f)
                lineTo(22.18f, 9.058f)
                arcToRelative(3.278f, 3.278f, 0.0f, false, true, 0.0f, 5.335f)
                lineTo(9.0f, 23.8f)
                verticalLineTo(18.089f)
                close()
                moveTo(12.0f, 12.26f)
                verticalLineToRelative(5.715f)
                lineToRelative(8.437f, -6.023f)
                arcToRelative(0.271f, 0.271f, 0.0f, false, false, 0.116f, -0.226f)
                arcToRelative(0.268f, 0.268f, 0.0f, false, false, -0.1f, -0.217f)
                lineTo(12.0f, 5.906f)
                verticalLineTo(11.74f)
                lineTo(4.0f, 6.026f)
                verticalLineTo(17.974f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
