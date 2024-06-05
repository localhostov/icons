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

public val Icons.Filled.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.535f, 17.9f)
                lineTo(1.707f, 23.707f)
                lineTo(0.293f, 22.293f)
                lineToRelative(5.828f, -5.809f)
                close()
                moveTo(13.835f, 20.665f)
                arcToRelative(7.478f, 7.478f, 0.0f, false, false, 1.942f, -7.146f)
                lineToRelative(-0.312f, -1.276f)
                lineToRelative(3.62f, -3.64f)
                lineToRelative(0.57f, 0.571f)
                arcToRelative(2.578f, 2.578f, 0.0f, false, false, 3.293f, 0.346f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.318f, -3.805f)
                lineTo(18.344f, 0.788f)
                arcTo(2.581f, 2.581f, 0.0f, false, false, 15.051f, 0.442f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.319f, 3.806f)
                lineToRelative(0.647f, 0.646f)
                lineToRelative(-3.621f, 3.64f)
                lineTo(10.49f, 8.223f)
                arcToRelative(7.479f, 7.479f, 0.0f, false, false, -7.154f, 1.941f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(10.5f, 10.5f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
