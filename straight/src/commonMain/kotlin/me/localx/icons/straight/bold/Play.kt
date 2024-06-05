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

public val Icons.Bold.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 23.76f)
                verticalLineTo(0.279f)
                lineTo(19.029f, 9.235f)
                arcToRelative(3.275f, 3.275f, 0.0f, false, true, -0.008f, 5.539f)
                close()
                moveTo(8.0f, 5.754f)
                verticalLineTo(18.273f)
                lineToRelative(9.412f, -6.032f)
                arcToRelative(0.264f, 0.264f, 0.0f, false, false, 0.14f, -0.239f)
                arcToRelative(0.257f, 0.257f, 0.0f, false, false, -0.129f, -0.232f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
