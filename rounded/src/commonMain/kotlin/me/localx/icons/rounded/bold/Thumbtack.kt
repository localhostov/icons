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

public val Icons.Bold.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 24.008f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, false, 1.061f, -0.44f)
                lineToRelative(5.95f, -5.954f)
                lineToRelative(0.728f, 0.753f)
                arcToRelative(5.291f, 5.291f, 0.0f, false, false, 3.7f, 1.64f)
                arcToRelative(4.241f, 4.241f, 0.0f, false, false, 1.417f, -0.241f)
                arcToRelative(3.932f, 3.932f, 0.0f, false, false, 2.606f, -3.334f)
                arcToRelative(8.337f, 8.337f, 0.0f, false, false, -0.213f, -2.94f)
                lineToRelative(-0.042f, -0.2f)
                lineToRelative(3.388f, -3.387f)
                lineToRelative(0.452f, 0.453f)
                arcToRelative(2.049f, 2.049f, 0.0f, false, false, 2.621f, 0.292f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, false, 0.254f, -3.026f)
                lineTo(16.455f, 0.641f)
                arcTo(2.049f, 2.049f, 0.0f, false, false, 13.834f, 0.349f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, false, -0.254f, 3.026f)
                lineTo(14.1f, 3.9f)
                lineTo(10.72f, 7.281f)
                arcToRelative(8.382f, 8.382f, 0.0f, false, false, -3.009f, -0.227f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 4.253f, 9.8f)
                arcToRelative(4.221f, 4.221f, 0.0f, false, false, 0.977f, 4.423f)
                lineToRelative(1.2f, 1.236f)
                lineTo(0.439f, 21.448f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 24.008f)
                close()
                moveTo(7.081f, 10.8f)
                arcToRelative(1.112f, 1.112f, 0.0f, false, true, 0.942f, -0.762f)
                arcToRelative(5.45f, 5.45f, 0.0f, false, true, 1.955f, 0.15f)
                lineToRelative(0.829f, 0.211f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.431f, -0.393f)
                lineTo(16.22f, 6.022f)
                lineToRelative(1.754f, 1.76f)
                lineTo(14.01f, 11.747f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.407f, 1.369f)
                lineToRelative(0.225f, 1.063f)
                arcToRelative(5.437f, 5.437f, 0.0f, false, true, 0.148f, 1.942f)
                arcToRelative(0.909f, 0.909f, 0.0f, false, true, -0.625f, 0.817f)
                arcToRelative(1.961f, 1.961f, 0.0f, false, true, -1.973f, -0.675f)
                lineTo(7.37f, 12.118f)
                arcTo(1.252f, 1.252f, 0.0f, false, true, 7.081f, 10.8f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
