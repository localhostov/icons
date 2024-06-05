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

public val Icons.Bold.Watermelon: ImageVector
    get() {
        if (_watermelon != null) {
            return _watermelon!!
        }
        _watermelon = Builder(name = "Watermelon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 23.939f)
                arcTo(13.348f, 13.348f, 0.0f, false, true, 1.0f, 20.0f)
                lineTo(-0.061f, 18.947f)
                lineTo(18.947f, -0.061f)
                lineTo(20.0f, 1.0f)
                arcTo(13.439f, 13.439f, 0.0f, false, true, 20.0f, 20.0f)
                arcTo(13.351f, 13.351f, 0.0f, false, true, 10.5f, 23.939f)
                close()
                moveTo(4.235f, 18.873f)
                arcTo(10.458f, 10.458f, 0.0f, false, false, 20.955f, 10.5f)
                arcToRelative(10.374f, 10.374f, 0.0f, false, false, -2.082f, -6.263f)
                close()
                moveTo(19.635f, 8.879f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 17.0f, 8.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 0.879f, 2.636f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, false, 1.757f, -1.757f)
                close()
                moveTo(14.635f, 16.879f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 0.879f, 2.636f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, false, 1.757f, -1.757f)
                close()
                moveTo(17.635f, 13.879f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 15.0f, 13.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 0.879f, 2.636f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, false, 1.757f, -1.757f)
                close()
                moveTo(9.635f, 17.879f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 7.0f, 17.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 0.879f, 2.636f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, false, 1.757f, -1.757f)
                close()
            }
        }
        .build()
        return _watermelon!!
    }

private var _watermelon: ImageVector? = null
