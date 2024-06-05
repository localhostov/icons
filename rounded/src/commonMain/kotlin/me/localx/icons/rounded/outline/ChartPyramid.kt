package me.localx.icons.rounded.outline

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

public val Icons.Outline.ChartPyramid: ImageVector
    get() {
        if (_chartPyramid != null) {
            return _chartPyramid!!
        }
        _chartPyramid = Builder(name = "ChartPyramid", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.413f, 18.24f)
                lineTo(15.593f, 2.275f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.185f, 0.0f)
                lineTo(0.587f, 18.24f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.179f, 24.0f)
                lineTo(19.82f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.593f, -5.76f)
                close()
                moveTo(19.6f, 15.0f)
                lineTo(4.4f, 15.0f)
                lineTo(6.85f, 10.0f)
                horizontalLineToRelative(10.3f)
                close()
                moveTo(10.2f, 3.155f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.592f, 0.0f)
                lineTo(16.169f, 8.0f)
                lineTo(7.83f, 8.0f)
                close()
                moveTo(21.514f, 21.055f)
                arcToRelative(1.964f, 1.964f, 0.0f, false, true, -1.7f, 0.942f)
                lineTo(4.179f, 21.997f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.8f, -2.88f)
                lineTo(3.421f, 17.0f)
                lineTo(20.578f, 17.0f)
                lineToRelative(1.038f, 2.12f)
                arcTo(1.961f, 1.961f, 0.0f, false, true, 21.518f, 21.058f)
                close()
            }
        }
        .build()
        return _chartPyramid!!
    }

private var _chartPyramid: ImageVector? = null
