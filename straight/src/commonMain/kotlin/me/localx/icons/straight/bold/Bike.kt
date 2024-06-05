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

public val Icons.Bold.Bike: ImageVector
    get() {
        if (_bike != null) {
            return _bike!!
        }
        _bike = Builder(name = "Bike", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9f, 12.188f)
                arcTo(32.684f, 32.684f, 0.0f, false, false, 18.4f, 5.337f)
                curveToRelative(0.338f, -0.124f, 0.7f, -0.246f, 1.022f, -0.333f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, true, 0.318f, 0.019f)
                arcTo(1.321f, 1.321f, 0.0f, false, true, 20.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(4.083f, 4.083f, 0.0f, false, false, -1.435f, -3.355f)
                arcToRelative(3.335f, 3.335f, 0.0f, false, false, -2.918f, -0.54f)
                arcToRelative(21.716f, 21.716f, 0.0f, false, false, -2.762f, 1.016f)
                lineToRelative(-1.309f, 0.59f)
                lineToRelative(0.53f, 1.334f)
                curveToRelative(0.008f, 0.019f, 0.318f, 0.809f, 0.683f, 2.008f)
                lineToRelative(-3.9f, 3.214f)
                lineTo(8.621f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                lineTo(3.0f, 7.0f)
                lineTo(4.379f, 7.0f)
                lineToRelative(5.182f, 5.183f)
                lineToRelative(-0.953f, 0.784f)
                arcToRelative(5.513f, 5.513f, 0.0f, true, false, 1.918f, 2.308f)
                lineToRelative(6.072f, -5.0f)
                curveToRelative(0.124f, 0.639f, 0.228f, 1.3f, 0.3f, 1.966f)
                arcToRelative(5.508f, 5.508f, 0.0f, true, false, 3.0f, -0.052f)
                close()
                moveTo(5.5f, 20.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 8.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 20.0f)
                close()
                moveTo(18.5f, 20.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 21.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 20.0f)
                close()
            }
        }
        .build()
        return _bike!!
    }

private var _bike: ImageVector? = null
