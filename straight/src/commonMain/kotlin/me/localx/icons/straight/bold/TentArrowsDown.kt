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

public val Icons.Bold.TentArrowsDown: ImageVector
    get() {
        if (_tentArrowsDown != null) {
            return _tentArrowsDown!!
        }
        _tentArrowsDown = Builder(name = "TentArrowsDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.018f)
                lineTo(2.427f, 19.593f)
                curveToRelative(-0.554f, 0.908f, -0.573f, 2.003f, -0.053f, 2.93f)
                curveToRelative(0.524f, 0.934f, 1.523f, 1.514f, 2.606f, 1.514f)
                horizontalLineToRelative(14.038f)
                curveToRelative(1.083f, 0.0f, 2.082f, -0.58f, 2.606f, -1.514f)
                curveToRelative(0.521f, -0.927f, 0.501f, -2.021f, -0.082f, -2.977f)
                lineTo(12.0f, 6.018f)
                close()
                moveTo(15.261f, 21.042f)
                lineToRelative(-3.261f, -4.542f)
                lineToRelative(-3.268f, 4.553f)
                lineToRelative(-3.679f, 0.006f)
                lineToRelative(6.947f, -9.597f)
                lineToRelative(6.934f, 9.575f)
                lineToRelative(-3.672f, 0.006f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.793f, 3.707f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-3.793f, -3.707f)
                close()
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(3.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.793f, 3.707f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineTo(0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _tentArrowsDown!!
    }

private var _tentArrowsDown: ImageVector? = null
