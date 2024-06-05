package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.492f, 7.969f)
                lineTo(10.954f, 0.975f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 3.0f, 5.005f)
                verticalLineTo(19.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, 7.954f, 4.03f)
                lineToRelative(9.538f, -6.994f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -8.062f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
