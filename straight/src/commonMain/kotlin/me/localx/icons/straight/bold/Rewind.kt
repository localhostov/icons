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

public val Icons.Bold.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 23.8f)
                lineToRelative(-8.0f, -5.714f)
                verticalLineTo(23.8f)
                lineTo(1.82f, 14.393f)
                arcToRelative(3.278f, 3.278f, 0.0f, false, true, 0.0f, -5.335f)
                lineToRelative(0.043f, -0.029f)
                lineTo(15.0f, 0.317f)
                verticalLineTo(5.911f)
                lineTo(23.0f, 0.2f)
                close()
                moveTo(3.551f, 11.509f)
                arcToRelative(0.268f, 0.268f, 0.0f, false, false, -0.1f, 0.217f)
                arcToRelative(0.271f, 0.271f, 0.0f, false, false, 0.116f, 0.226f)
                lineTo(12.0f, 17.975f)
                verticalLineTo(12.26f)
                lineToRelative(8.0f, 5.714f)
                verticalLineTo(6.026f)
                lineTo(12.0f, 11.74f)
                verticalLineTo(5.906f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
