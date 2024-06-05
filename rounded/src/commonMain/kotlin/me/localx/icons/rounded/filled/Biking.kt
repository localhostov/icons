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

public val Icons.Filled.Biking: ImageVector
    get() {
        if (_biking != null) {
            return _biking!!
        }
        _biking = Builder(name = "Biking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 23.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, -5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 23.0f)
                close()
                moveTo(19.0f, 23.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, -5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 19.0f, 23.0f)
                close()
                moveTo(13.0f, 18.0f)
                lineTo(13.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.348f, -0.758f)
                lineToRelative(-2.287f, -1.965f)
                arcToRelative(0.986f, 0.986f, 0.0f, false, true, -0.348f, -0.744f)
                arcToRelative(0.967f, 0.967f, 0.0f, false, true, 0.273f, -0.708f)
                lineToRelative(1.964f, -1.563f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 1.418f, 0.067f)
                lineToRelative(2.6f, 2.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.679f, 0.266f)
                lineTo(20.0f, 10.995f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(17.34f, 8.995f)
                lineTo(15.063f, 6.893f)
                arcToRelative(2.973f, 2.973f, 0.0f, false, false, -4.105f, -0.153f)
                lineTo(8.994f, 8.3f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.068f, 4.491f)
                lineTo(11.0f, 14.459f)
                lineTo(11.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(16.5f, 1.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 19.0f, 3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 1.0f)
                close()
            }
        }
        .build()
        return _biking!!
    }

private var _biking: ImageVector? = null
