package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0001f, 3.0f)
                    verticalLineTo(1.0f)
                    curveTo(13.0001f, 0.7348f, 12.8948f, 0.4804f, 12.7072f, 0.2929f)
                    curveTo(12.5197f, 0.1054f, 12.2653f, 0.0f, 12.0001f, 0.0f)
                    curveTo(11.7349f, 0.0f, 11.4806f, 0.1054f, 11.293f, 0.2929f)
                    curveTo(11.1055f, 0.4804f, 11.0001f, 0.7348f, 11.0001f, 1.0f)
                    verticalLineTo(3.0f)
                    curveTo(9.1443f, 3.0021f, 7.365f, 3.7403f, 6.0527f, 5.0526f)
                    curveTo(4.7404f, 6.3649f, 4.0022f, 8.1441f, 4.0001f, 10.0f)
                    verticalLineTo(16.0f)
                    curveTo(4.0001f, 18.1217f, 4.843f, 20.1566f, 6.3433f, 21.6569f)
                    curveTo(7.8436f, 23.1571f, 9.8784f, 24.0f, 12.0001f, 24.0f)
                    curveTo(14.1219f, 24.0f, 16.1567f, 23.1571f, 17.657f, 21.6569f)
                    curveTo(19.1573f, 20.1566f, 20.0001f, 18.1217f, 20.0001f, 16.0f)
                    verticalLineTo(10.0f)
                    curveTo(19.998f, 8.1441f, 19.2598f, 6.3649f, 17.9475f, 5.0526f)
                    curveTo(16.6352f, 3.7403f, 14.856f, 3.0021f, 13.0001f, 3.0f)
                    close()
                    moveTo(13.0001f, 10.0f)
                    curveTo(13.0001f, 10.2652f, 12.8948f, 10.5196f, 12.7072f, 10.7071f)
                    curveTo(12.5197f, 10.8946f, 12.2653f, 11.0f, 12.0001f, 11.0f)
                    curveTo(11.7349f, 11.0f, 11.4806f, 10.8946f, 11.293f, 10.7071f)
                    curveTo(11.1055f, 10.5196f, 11.0001f, 10.2652f, 11.0001f, 10.0f)
                    verticalLineTo(8.0f)
                    curveTo(11.0001f, 7.7348f, 11.1055f, 7.4804f, 11.293f, 7.2929f)
                    curveTo(11.4806f, 7.1054f, 11.7349f, 7.0f, 12.0001f, 7.0f)
                    curveTo(12.2653f, 7.0f, 12.5197f, 7.1054f, 12.7072f, 7.2929f)
                    curveTo(12.8948f, 7.4804f, 13.0001f, 7.7348f, 13.0001f, 8.0f)
                    verticalLineTo(10.0f)
                    close()
                }
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
