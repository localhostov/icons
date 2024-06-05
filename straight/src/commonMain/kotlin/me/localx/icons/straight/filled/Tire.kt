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

public val Icons.Filled.Tire: ImageVector
    get() {
        if (_tire != null) {
            return _tire!!
        }
        _tire = Builder(name = "Tire", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(4.083f, 4.083f, 0.0f, false, false, -0.845f, 0.1f)
                arcToRelative(3.674f, 3.674f, 0.0f, false, false, -0.446f, -1.592f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 0.71f, -0.362f)
                arcTo(3.618f, 3.618f, 0.0f, false, false, 12.0f, 10.636f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 1.291f, 0.869f)
                arcToRelative(3.674f, 3.674f, 0.0f, false, false, -0.446f, 1.592f)
                arcTo(4.083f, 4.083f, 0.0f, false, false, 12.0f, 13.0f)
                close()
                moveTo(18.029f, 8.461f)
                lineTo(15.19f, 9.646f)
                arcTo(1.6f, 1.6f, 0.0f, false, true, 13.0f, 8.163f)
                lineTo(13.0f, 5.08f)
                arcTo(7.006f, 7.006f, 0.0f, false, true, 18.029f, 8.461f)
                close()
                moveTo(11.0f, 5.08f)
                lineTo(11.0f, 8.163f)
                arcTo(1.6f, 1.6f, 0.0f, false, true, 8.815f, 9.649f)
                lineTo(5.956f, 8.485f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 11.0f, 5.08f)
                close()
                moveTo(5.207f, 10.339f)
                lineToRelative(2.63f, 1.073f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, true, 0.924f, 3.239f)
                lineTo(7.014f, 16.9f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.207f, 10.339f)
                close()
                moveTo(8.607f, 18.117f)
                lineTo(10.4f, 15.8f)
                arcToRelative(2.053f, 2.053f, 0.0f, false, true, 3.208f, 0.011f)
                lineToRelative(1.78f, 2.31f)
                arcTo(7.03f, 7.03f, 0.0f, false, true, 8.605f, 18.117f)
                close()
                moveTo(16.983f, 16.911f)
                lineTo(15.25f, 14.662f)
                arcToRelative(2.127f, 2.127f, 0.0f, false, true, 0.93f, -3.256f)
                lineToRelative(2.608f, -1.091f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.981f, 16.911f)
                close()
            }
        }
        .build()
        return _tire!!
    }

private var _tire: ImageVector? = null
