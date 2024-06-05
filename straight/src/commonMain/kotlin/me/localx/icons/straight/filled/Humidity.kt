package me.localx.icons.straight.filled

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

public val Icons.Filled.Humidity: ImageVector
    get() {
        if (_humidity != null) {
            return _humidity!!
        }
        _humidity = Builder(name = "Humidity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.063f, 6.921f)
                lineTo(12.0f, 0.013f)
                lineTo(4.929f, 6.929f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 14.134f, -0.008f)
                close()
                moveTo(8.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 11.0f)
                close()
                moveTo(10.766f, 18.0f)
                lineTo(8.434f, 18.0f)
                lineToRelative(4.8f, -8.0f)
                horizontalLineToRelative(2.332f)
                close()
                moveTo(15.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 18.0f)
                close()
            }
        }
        .build()
        return _humidity!!
    }

private var _humidity: ImageVector? = null
