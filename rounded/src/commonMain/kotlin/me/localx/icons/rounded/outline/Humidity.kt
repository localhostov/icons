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
                moveTo(10.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.831f, -1.555f)
                lineToRelative(4.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.664f, 1.11f)
                lineToRelative(-4.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 17.0f)
                close()
                moveTo(19.779f, 20.778f)
                curveToRelative(6.858f, -7.336f, 1.519f, -14.521f, -4.565f, -19.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.947f, 4.947f, 0.0f, false, false, -6.426f, 0.0f)
                curveTo(2.706f, 6.231f, -2.63f, 13.491f, 4.222f, 20.778f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 15.556f, 0.0f)
                close()
                moveTo(13.919f, 2.7f)
                horizontalLineToRelative(0.0f)
                curveTo(18.7f, 6.777f, 24.43f, 12.966f, 18.364f, 19.364f)
                arcToRelative(9.043f, 9.043f, 0.0f, false, true, -12.728f, 0.0f)
                curveToRelative(-6.071f, -6.4f, -0.325f, -12.6f, 4.445f, -16.662f)
                arcToRelative(2.958f, 2.958f, 0.0f, false, true, 3.838f, 0.0f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 10.0f)
                close()
                moveTo(14.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 16.0f)
                close()
            }
        }
        .build()
        return _humidity!!
    }

private var _humidity: ImageVector? = null
