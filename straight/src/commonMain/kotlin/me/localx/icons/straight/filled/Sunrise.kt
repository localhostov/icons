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

public val Icons.Filled.Sunrise: ImageVector
    get() {
        if (_sunrise != null) {
            return _sunrise!!
        }
        _sunrise = Builder(name = "Sunrise", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 11.0f)
                lineTo(5.071f, 11.0f)
                arcToRelative(6.921f, 6.921f, 0.0f, false, true, 0.447f, -1.626f)
                lineTo(1.134f, 6.822f)
                lineTo(2.14f, 5.094f)
                lineTo(6.525f, 7.646f)
                arcTo(7.062f, 7.062f, 0.0f, false, true, 7.674f, 6.509f)
                lineTo(5.126f, 2.127f)
                lineTo(6.854f, 1.121f)
                lineTo(9.4f, 5.5f)
                arcTo(6.935f, 6.935f, 0.0f, false, true, 11.0f, 5.079f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 5.079f)
                arcToRelative(6.936f, 6.936f, 0.0f, false, true, 1.61f, 0.43f)
                lineToRelative(2.552f, -4.388f)
                lineToRelative(1.729f, 1.006f)
                lineTo(16.337f, 6.518f)
                arcTo(7.012f, 7.012f, 0.0f, false, true, 17.48f, 7.653f)
                lineToRelative(4.4f, -2.559f)
                lineToRelative(1.006f, 1.728f)
                lineToRelative(-4.4f, 2.56f)
                arcTo(6.913f, 6.913f, 0.0f, false, true, 18.929f, 11.0f)
                lineTo(24.0f, 11.0f)
                close()
                moveTo(21.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(17.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(11.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(5.0f, 20.0f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -3.5f, 1.315f)
                lineTo(-0.009f, 22.632f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 6.0f, 22.618f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.005f, 4.005f, 0.0f, false, false, 6.01f, 0.013f)
                lineTo(22.5f, 21.316f)
                arcTo(1.992f, 1.992f, 0.0f, false, true, 21.0f, 22.0f)
                close()
                moveTo(6.0f, 17.618f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.005f, 4.005f, 0.0f, false, false, 6.01f, 0.013f)
                lineTo(22.5f, 16.316f)
                arcTo(2.01f, 2.01f, 0.0f, false, true, 19.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(11.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(5.0f, 15.0f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -3.5f, 1.315f)
                lineTo(-0.009f, 17.632f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 6.0f, 17.618f)
                close()
            }
        }
        .build()
        return _sunrise!!
    }

private var _sunrise: ImageVector? = null
