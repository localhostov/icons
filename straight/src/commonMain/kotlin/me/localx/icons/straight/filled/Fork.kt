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

public val Icons.Filled.Fork: ImageVector
    get() {
        if (_fork != null) {
            return _fork!!
        }
        _fork = Builder(name = "Fork", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.606f, 5.636f)
                lineToRelative(-6.072f, 6.071f)
                arcToRelative(1.022f, 1.022f, 0.0f, false, true, -1.413f, 0.0f)
                lineTo(14.414f, 11.0f)
                lineToRelative(6.778f, -6.778f)
                lineTo(19.778f, 2.808f)
                lineTo(13.0f, 9.586f)
                lineToRelative(-0.707f, -0.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(6.071f, -6.071f)
                lineTo(16.95f, -0.021f)
                lineTo(10.879f, 6.05f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.243f)
                lineToRelative(0.707f, 0.707f)
                lineTo(0.043f, 22.543f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.0f, 12.414f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 0.0f)
                lineTo(24.021f, 7.05f)
                close()
            }
        }
        .build()
        return _fork!!
    }

private var _fork: ImageVector? = null
