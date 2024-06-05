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

public val Icons.Bold.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.021f, 0.979f)
                arcToRelative(3.384f, 3.384f, 0.0f, false, false, -2.732f, -0.979f)
                curveToRelative(-1.8f, 0.176f, -8.0f, 1.087f, -12.35f, 5.44f)
                arcToRelative(28.486f, 28.486f, 0.0f, false, false, -7.49f, 12.46f)
                lineToRelative(-0.3f, 0.879f)
                lineToRelative(5.071f, 5.071f)
                lineToRelative(0.879f, -0.294f)
                arcToRelative(28.5f, 28.5f, 0.0f, false, false, 12.457f, -7.491f)
                curveToRelative(4.358f, -4.358f, 5.269f, -10.557f, 5.444f, -12.353f)
                arcToRelative(3.388f, 3.388f, 0.0f, false, false, -0.979f, -2.733f)
                close()
                moveTo(16.439f, 13.939f)
                arcToRelative(25.2f, 25.2f, 0.0f, false, true, -10.411f, 6.467f)
                lineToRelative(-0.157f, -0.156f)
                lineToRelative(11.69f, -11.689f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(-11.689f, 11.69f)
                lineToRelative(-0.156f, -0.156f)
                arcToRelative(25.2f, 25.2f, 0.0f, false, true, 6.467f, -10.412f)
                curveToRelative(3.648f, -3.649f, 8.974f, -4.425f, 10.52f, -4.576f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, 0.319f, 0.115f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, true, 0.116f, 0.319f)
                curveToRelative(-0.152f, 1.546f, -0.928f, 6.872f, -4.577f, 10.52f)
                close()
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
