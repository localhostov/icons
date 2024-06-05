package me.localx.icons.straight.outline

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

public val Icons.Outline.Humidity: ImageVector
    get() {
        if (_humidity != null) {
            return _humidity!!
        }
        _humidity = Builder(name = "Humidity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 4.929f, 6.929f)
                lineTo(12.0f, 0.013f)
                lineToRelative(7.063f, 6.908f)
                arcToRelative(10.014f, 10.014f, 0.0f, false, true, 0.008f, 14.15f)
                horizontalLineToRelative(0.0f)
                arcTo(9.936f, 9.936f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.811f)
                lineTo(6.335f, 8.351f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.322f, -0.008f)
                close()
                moveTo(9.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 10.0f)
                close()
                moveTo(15.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 16.0f)
                close()
                moveTo(8.434f, 18.0f)
                horizontalLineToRelative(2.332f)
                lineToRelative(4.8f, -8.0f)
                lineTo(13.234f, 10.0f)
                close()
            }
        }
        .build()
        return _humidity!!
    }

private var _humidity: ImageVector? = null
