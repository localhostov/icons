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

public val Icons.Bold.Bahai: ImageVector
    get() {
        if (_bahai != null) {
            return _bahai!!
        }
        _bahai = Builder(name = "Bahai", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.164f, 23.816f)
                lineToRelative(-4.164f, -3.323f)
                lineToRelative(-4.164f, 3.323f)
                lineToRelative(-1.053f, -5.222f)
                lineToRelative(-5.326f, -0.131f)
                lineToRelative(2.55f, -4.678f)
                lineTo(0.011f, 10.263f)
                lineToRelative(4.96f, -1.944f)
                lineToRelative(-0.796f, -5.267f)
                lineToRelative(5.049f, 1.698f)
                lineTo(12.0f, 0.203f)
                lineToRelative(2.776f, 4.547f)
                lineToRelative(5.049f, -1.698f)
                lineToRelative(-0.796f, 5.267f)
                lineToRelative(4.96f, 1.944f)
                lineToRelative(-3.996f, 3.523f)
                lineToRelative(2.55f, 4.678f)
                lineToRelative(-5.326f, 0.131f)
                lineToRelative(-1.053f, 5.222f)
                close()
                moveTo(12.0f, 16.655f)
                lineToRelative(2.194f, 1.751f)
                lineToRelative(0.555f, -2.753f)
                lineToRelative(2.807f, -0.068f)
                lineToRelative(-1.344f, -2.465f)
                lineToRelative(2.106f, -1.857f)
                lineToRelative(-2.614f, -1.024f)
                lineToRelative(0.419f, -2.776f)
                lineToRelative(-2.661f, 0.896f)
                lineToRelative(-1.463f, -2.396f)
                lineToRelative(-1.463f, 2.396f)
                lineToRelative(-2.661f, -0.896f)
                lineToRelative(0.419f, 2.776f)
                lineToRelative(-2.614f, 1.024f)
                lineToRelative(2.106f, 1.857f)
                lineToRelative(-1.344f, 2.465f)
                lineToRelative(2.807f, 0.068f)
                lineToRelative(0.555f, 2.753f)
                lineToRelative(2.194f, -1.751f)
                close()
            }
        }
        .build()
        return _bahai!!
    }

private var _bahai: ImageVector? = null
