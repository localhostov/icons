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

public val Icons.Bold.Clip: ImageVector
    get() {
        if (_clip != null) {
            return _clip!!
        }
        _clip = Builder(name = "Clip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.145f, 24.0f)
                arcTo(8.994f, 8.994f, 0.0f, false, true, 2.782f, 8.647f)
                lineTo(9.526f, 1.9f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 9.189f, 9.19f)
                lineToRelative(-6.742f, 6.743f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.656f, -5.656f)
                lineToRelative(6.39f, -6.389f)
                lineToRelative(2.12f, 2.121f)
                lineTo(8.438f, 14.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineTo(16.6f, 8.973f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -4.949f, -4.949f)
                lineTo(4.9f, 10.767f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.484f, 8.484f)
                lineToRelative(6.389f, -6.39f)
                lineTo(21.9f, 14.982f)
                lineToRelative(-6.39f, 6.39f)
                arcTo(8.973f, 8.973f, 0.0f, false, true, 9.145f, 24.0f)
                close()
            }
        }
        .build()
        return _clip!!
    }

private var _clip: ImageVector? = null
