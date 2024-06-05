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

public val Icons.Bold.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = Builder(name = "Shrimp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.886f, 17.533f)
                lineToRelative(-0.5f, -0.951f)
                lineTo(14.0f, 21.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -4.534f, -1.8f)
                arcToRelative(5.226f, 5.226f, 0.0f, false, true, -1.463f, -3.89f)
                arcToRelative(5.682f, 5.682f, 0.0f, false, true, 0.054f, -0.623f)
                arcTo(6.142f, 6.142f, 0.0f, false, false, 12.0f, 16.0f)
                lineTo(12.0f, 13.0f)
                arcToRelative(3.179f, 3.179f, 0.0f, false, true, -2.547f, -1.118f)
                arcTo(6.885f, 6.885f, 0.0f, false, true, 14.316f, 10.0f)
                lineTo(14.316f, 9.994f)
                arcTo(7.947f, 7.947f, 0.0f, false, false, 21.888f, 3.0f)
                lineTo(24.0f, 3.0f)
                lineTo(24.0f, 0.0f)
                lineTo(12.865f, 0.0f)
                curveTo(5.773f, 0.0f, 0.123f, 5.169f, 0.0f, 11.767f)
                arcToRelative(11.731f, 11.731f, 0.0f, false, false, 3.344f, 8.509f)
                arcTo(12.676f, 12.676f, 0.0f, false, false, 12.5f, 24.0f)
                lineTo(21.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                arcTo(9.385f, 9.385f, 0.0f, false, false, 22.886f, 17.533f)
                close()
                moveTo(13.094f, 3.0f)
                arcTo(1.483f, 1.483f, 0.0f, false, false, 13.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcTo(1.483f, 1.483f, 0.0f, false, false, 15.91f, 3.0f)
                horizontalLineToRelative(2.925f)
                arcTo(4.9f, 4.9f, 0.0f, false, true, 14.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                close()
                moveTo(8.094f, 4.059f)
                arcTo(4.861f, 4.861f, 0.0f, false, false, 9.273f, 8.3f)
                arcTo(8.8f, 8.8f, 0.0f, false, false, 7.215f, 9.907f)
                arcTo(3.244f, 3.244f, 0.0f, false, true, 5.0f, 6.5f)
                lineTo(4.971f, 6.5f)
                arcTo(9.27f, 9.27f, 0.0f, false, true, 8.1f, 4.059f)
                close()
                moveTo(3.0f, 11.821f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, 0.143f, -1.37f)
                arcTo(5.692f, 5.692f, 0.0f, false, false, 5.571f, 12.5f)
                arcToRelative(8.079f, 8.079f, 0.0f, false, false, -0.563f, 2.725f)
                arcTo(8.561f, 8.561f, 0.0f, false, false, 5.4f, 18.082f)
                arcTo(8.754f, 8.754f, 0.0f, false, true, 3.0f, 11.821f)
                close()
            }
        }
        .build()
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
