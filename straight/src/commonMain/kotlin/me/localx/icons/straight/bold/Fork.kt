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

public val Icons.Bold.Fork: ImageVector
    get() {
        if (_fork != null) {
            return _fork!!
        }
        _fork = Builder(name = "Fork", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.787f, 7.162f)
                lineTo(15.07f, 13.88f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineTo(13.3f, 12.819f)
                lineToRelative(7.071f, -7.071f)
                lineTo(18.252f, 3.627f)
                lineTo(11.181f, 10.7f)
                lineTo(10.12f, 9.638f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                lineToRelative(6.718f, -6.717f)
                lineTo(14.717f, 0.092f)
                lineTo(8.0f, 6.809f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 4.95f)
                lineToRelative(1.061f, 1.06f)
                lineToRelative(-9.0f, 8.995f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(8.995f, -9.0f)
                lineTo(12.241f, 16.0f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, 4.95f, 0.0f)
                lineToRelative(6.717f, -6.718f)
                close()
            }
        }
        .build()
        return _fork!!
    }

private var _fork: ImageVector? = null
