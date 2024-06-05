package me.localx.icons.rounded.bold

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
                moveTo(23.553f, 7.431f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 0.016f)
                lineToRelative(-4.492f, 4.564f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.641f, 0.812f)
                lineTo(20.56f, 5.56f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, -2.121f)
                lineTo(11.177f, 10.7f)
                arcToRelative(3.487f, 3.487f, 0.0f, false, true, 0.8f, -3.633f)
                lineToRelative(4.572f, -4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.447f, 0.43f)
                lineTo(9.868f, 4.939f)
                arcToRelative(6.507f, 6.507f, 0.0f, false, false, -0.932f, 8.0f)
                lineToRelative(-8.5f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 2.121f)
                lineToRelative(8.5f, -8.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 8.012f, -0.94f)
                lineToRelative(4.5f, -4.571f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.553f, 7.431f)
                close()
            }
        }
        .build()
        return _fork!!
    }

private var _fork: ImageVector? = null
