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

public val Icons.Bold.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.608f, 17.013f)
                lineToRelative(-2.8f, -10.1f)
                arcTo(9.443f, 9.443f, 0.0f, false, false, 2.486f, 7.4f)
                lineTo(0.321f, 17.14f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.441f, 3.042f)
                lineTo(6.905f, 20.182f)
                arcToRelative(5.285f, 5.285f, 0.0f, false, false, 10.154f, 0.0f)
                lineTo(21.2f, 20.182f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.409f, -3.169f)
                close()
                moveTo(3.385f, 17.182f)
                lineTo(5.415f, 8.045f)
                arcToRelative(6.443f, 6.443f, 0.0f, false, true, 12.5f, -0.326f)
                lineToRelative(2.628f, 9.463f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
