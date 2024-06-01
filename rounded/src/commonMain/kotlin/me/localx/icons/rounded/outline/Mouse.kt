package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Mouse: ImageVector
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
                    moveTo(18.0001f, 16.0f)
                    curveTo(18.0001f, 17.5913f, 17.368f, 19.1174f, 16.2428f, 20.2426f)
                    curveTo(15.1175f, 21.3679f, 13.5914f, 22.0f, 12.0001f, 22.0f)
                    curveTo(10.4088f, 22.0f, 8.8827f, 21.3679f, 7.7575f, 20.2426f)
                    curveTo(6.6323f, 19.1174f, 6.0001f, 17.5913f, 6.0001f, 16.0f)
                    verticalLineTo(10.0f)
                    curveTo(6.0017f, 8.6744f, 6.529f, 7.4036f, 7.4663f, 6.4662f)
                    curveTo(8.4037f, 5.5289f, 9.6745f, 5.0016f, 11.0001f, 5.0f)
                    horizontalLineTo(13.0001f)
                    curveTo(14.3257f, 5.0016f, 15.5966f, 5.5289f, 16.5339f, 6.4662f)
                    curveTo(17.4712f, 7.4036f, 17.9985f, 8.6744f, 18.0001f, 10.0f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 7.0003f)
                    curveTo(11.7349f, 7.0003f, 11.4806f, 7.1057f, 11.293f, 7.2932f)
                    curveTo(11.1055f, 7.4807f, 11.0001f, 7.7351f, 11.0001f, 8.0003f)
                    verticalLineTo(10.0003f)
                    curveTo(11.0001f, 10.2655f, 11.1055f, 10.5199f, 11.293f, 10.7074f)
                    curveTo(11.4806f, 10.8949f, 11.7349f, 11.0003f, 12.0001f, 11.0003f)
                    curveTo(12.2653f, 11.0003f, 12.5197f, 10.8949f, 12.7072f, 10.7074f)
                    curveTo(12.8948f, 10.5199f, 13.0001f, 10.2655f, 13.0001f, 10.0003f)
                    verticalLineTo(8.0003f)
                    curveTo(13.0001f, 7.7351f, 12.8948f, 7.4807f, 12.7072f, 7.2932f)
                    curveTo(12.5197f, 7.1057f, 12.2653f, 7.0003f, 12.0001f, 7.0003f)
                    close()
                }
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
