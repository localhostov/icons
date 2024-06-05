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

public val Icons.Bold.Tired: ImageVector
    get() {
        if (_tired != null) {
            return _tired!!
        }
        _tired = Builder(name = "Tired", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.9f, -2.7f)
                lineTo(7.0f, 9.0f)
                lineToRelative(-0.4f, -0.3f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.4f, 6.3f)
                lineToRelative(2.0f, 1.5f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, 0.0f, 2.4f)
                lineToRelative(-2.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 12.0f)
                close()
                moveTo(17.7f, 11.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.3f, -2.1f)
                lineTo(17.0f, 9.0f)
                lineToRelative(0.4f, -0.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.8f, -2.4f)
                lineToRelative(-2.0f, 1.5f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, 0.0f, 2.4f)
                lineToRelative(2.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.1f, -0.3f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(-3.9f, 0.6f, -3.893f, 23.4f, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, 9.0f)
                curveTo(0.076f, 20.548f, 0.081f, 3.45f, 12.0f, 3.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(16.7f, 15.614f)
                curveToRelative(-2.6f, -3.445f, -6.815f, -3.441f, -9.407f, 0.0f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, false, 1.335f, 1.975f)
                arcToRelative(9.943f, 9.943f, 0.0f, false, true, 6.737f, 0.0f)
                arcTo(1.239f, 1.239f, 0.0f, false, false, 16.7f, 15.614f)
                close()
            }
        }
        .build()
        return _tired!!
    }

private var _tired: ImageVector? = null
