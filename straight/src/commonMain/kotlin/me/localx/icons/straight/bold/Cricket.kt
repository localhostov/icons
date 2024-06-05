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

public val Icons.Bold.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.558f, 11.6f)
                arcTo(2.11f, 2.11f, 0.0f, false, true, 17.0f, 10.032f)
                arcToRelative(2.056f, 2.056f, 0.0f, false, true, 0.561f, -1.471f)
                lineTo(21.0f, 5.121f)
                lineToRelative(0.862f, 0.862f)
                lineToRelative(2.121f, -2.121f)
                lineTo(20.132f, 0.011f)
                lineTo(18.011f, 2.132f)
                lineTo(18.879f, 3.0f)
                lineToRelative(-3.44f, 3.439f)
                arcTo(2.063f, 2.063f, 0.0f, false, true, 13.967f, 7.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 12.4f, 6.441f)
                lineToRelative(-1.06f, -1.057f)
                lineTo(0.4f, 16.325f)
                lineToRelative(-0.111f, 0.336f)
                arcToRelative(5.858f, 5.858f, 0.0f, false, false, 1.221f, 5.826f)
                arcTo(5.383f, 5.383f, 0.0f, false, false, 5.4f, 24.0f)
                arcToRelative(6.315f, 6.315f, 0.0f, false, false, 1.944f, -0.3f)
                lineToRelative(0.336f, -0.112f)
                lineToRelative(10.94f, -10.94f)
                close()
                moveTo(6.1f, 20.929f)
                arcToRelative(2.788f, 2.788f, 0.0f, false, true, -2.466f, -0.563f)
                arcTo(2.791f, 2.791f, 0.0f, false, true, 3.07f, 17.9f)
                lineTo(10.0f, 10.97f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(3.029f)
                close()
                moveTo(24.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null
