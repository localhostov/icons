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

public val Icons.Filled.Summer: ImageVector
    get() {
        if (_summer != null) {
            return _summer!!
        }
        _summer = Builder(name = "Summer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.0f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, true, -7.0f, 7.0f)
                curveToRelative(-6.077f, 0.117f, -9.335f, -7.638f, -5.0f, -11.889f)
                lineTo(12.0f, 5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                verticalLineToRelative(7.111f)
                arcTo(7.007f, 7.007f, 0.0f, false, true, 24.0f, 17.0f)
                close()
                moveTo(20.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.816f)
                lineTo(18.0f, 8.0f)
                lineTo(16.0f, 8.0f)
                verticalLineToRelative(6.184f)
                arcTo(2.995f, 2.995f, 0.0f, true, false, 20.0f, 17.0f)
                close()
                moveTo(8.258f, 14.9f)
                arcTo(8.957f, 8.957f, 0.0f, false, true, 10.0f, 11.353f)
                lineTo(10.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 3.083f)
                arcToRelative(5.968f, 5.968f, 0.0f, false, false, -1.092f, 0.3f)
                lineTo(5.357f, 0.716f)
                lineTo(3.629f, 1.722f)
                lineTo(5.175f, 4.381f)
                arcToRelative(5.989f, 5.989f, 0.0f, false, false, -0.774f, 0.778f)
                lineTo(1.73f, 3.6f)
                lineToRelative(-1.0f, 1.729f)
                lineTo(3.387f, 6.882f)
                arcTo(5.951f, 5.951f, 0.0f, false, false, 3.091f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.093f, 10.0f)
                arcToRelative(5.966f, 5.966f, 0.0f, false, false, 0.295f, 1.11f)
                lineTo(0.729f, 12.657f)
                lineToRelative(1.006f, 1.729f)
                lineTo(4.4f, 12.832f)
                arcToRelative(5.963f, 5.963f, 0.0f, false, false, 0.761f, 0.763f)
                lineTo(3.607f, 16.273f)
                lineToRelative(1.729f, 1.006f)
                lineTo(6.9f, 14.6f)
                arcToRelative(5.893f, 5.893f, 0.0f, false, false, 1.339f, 0.353f)
                curveTo(8.238f, 14.935f, 8.252f, 14.915f, 8.258f, 14.9f)
                close()
            }
        }
        .build()
        return _summer!!
    }

private var _summer: ImageVector? = null
