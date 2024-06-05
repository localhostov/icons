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

public val Icons.Bold.MugAlt: ImageVector
    get() {
        if (_mugAlt != null) {
            return _mugAlt!!
        }
        _mugAlt = Builder(name = "MugAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                close()
                moveTo(24.0f, 8.5f)
                curveToRelative(0.0f, 3.006f, -2.4f, 6.5f, -5.5f, 6.5f)
                lineTo(17.206f, 15.0f)
                lineToRelative(-0.813f, 4.0f)
                lineTo(3.107f, 19.0f)
                lineTo(0.075f, 4.1f)
                arcTo(3.389f, 3.389f, 0.0f, false, true, 3.39f, 0.0f)
                lineTo(16.11f, 0.0f)
                arcToRelative(3.379f, 3.379f, 0.0f, false, true, 3.315f, 4.059f)
                curveTo(22.3f, 4.342f, 24.0f, 5.949f, 24.0f, 8.5f)
                close()
                moveTo(16.484f, 3.5f)
                curveToRelative(0.041f, -0.318f, -0.074f, -0.463f, -0.374f, -0.5f)
                lineTo(3.39f, 3.0f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, false, -0.38f, 0.474f)
                lineTo(5.559f, 16.0f)
                horizontalLineToRelative(8.382f)
                close()
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, -0.428f, 0.0f, -1.4f, -2.168f, -1.491f)
                lineTo(17.817f, 12.0f)
                lineTo(18.5f, 12.0f)
                curveTo(19.645f, 12.0f, 21.0f, 10.1f, 21.0f, 8.5f)
                close()
            }
        }
        .build()
        return _mugAlt!!
    }

private var _mugAlt: ImageVector? = null
