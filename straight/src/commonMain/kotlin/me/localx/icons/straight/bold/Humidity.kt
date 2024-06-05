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

public val Icons.Bold.Humidity: ImageVector
    get() {
        if (_humidity != null) {
            return _humidity!!
        }
        _humidity = Builder(name = "Humidity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 11.5f)
                close()
                moveTo(15.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 17.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 15.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(3.2f)
                lineTo(16.0f, 10.0f)
                lineTo(12.8f, 10.0f)
                close()
                moveTo(19.071f, 21.071f)
                horizontalLineToRelative(0.0f)
                arcToRelative(10.015f, 10.015f, 0.0f, false, false, -0.012f, -14.154f)
                lineTo(12.0f, 0.013f)
                lineTo(4.929f, 6.929f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 19.071f, 21.071f)
                close()
                moveTo(16.95f, 9.05f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -9.912f, 0.012f)
                lineTo(12.0f, 4.209f)
                close()
            }
        }
        .build()
        return _humidity!!
    }

private var _humidity: ImageVector? = null
