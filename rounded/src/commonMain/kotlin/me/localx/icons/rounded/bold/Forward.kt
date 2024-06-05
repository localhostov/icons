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

public val Icons.Bold.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.16f, 20.809f)
                arcTo(4.168f, 4.168f, 0.0f, false, true, 0.0f, 16.648f)
                verticalLineToRelative(-9.3f)
                arcTo(4.157f, 4.157f, 0.0f, false, true, 6.615f, 4.0f)
                lineTo(9.527f, 6.135f)
                arcTo(4.159f, 4.159f, 0.0f, false, true, 15.962f, 4.0f)
                lineTo(22.3f, 8.648f)
                arcToRelative(4.156f, 4.156f, 0.0f, false, true, 0.0f, 6.7f)
                lineTo(15.963f, 20.0f)
                arcToRelative(4.16f, 4.16f, 0.0f, false, true, -6.436f, -2.135f)
                lineTo(6.615f, 20.0f)
                arcTo(4.14f, 4.14f, 0.0f, false, true, 4.16f, 20.809f)
                close()
                moveTo(10.848f, 13.537f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1.611f)
                arcToRelative(1.157f, 1.157f, 0.0f, false, false, 1.841f, 0.934f)
                lineToRelative(6.338f, -4.649f)
                arcToRelative(1.157f, 1.157f, 0.0f, false, false, 0.0f, -1.866f)
                lineTo(14.188f, 6.418f)
                arcToRelative(1.157f, 1.157f, 0.0f, false, false, -1.84f, 0.934f)
                lineTo(12.348f, 8.963f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.388f, 1.21f)
                lineTo(4.841f, 6.418f)
                arcTo(1.158f, 1.158f, 0.0f, false, false, 3.0f, 7.352f)
                verticalLineToRelative(9.3f)
                arcToRelative(1.158f, 1.158f, 0.0f, false, false, 1.841f, 0.934f)
                lineTo(9.96f, 13.827f)
                arcTo(1.506f, 1.506f, 0.0f, false, true, 10.848f, 13.537f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
