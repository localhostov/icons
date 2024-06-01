package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0001f, 8.0f)
                    verticalLineTo(7.0f)
                    curveTo(19.0001f, 5.1435f, 18.2626f, 3.363f, 16.9499f, 2.0503f)
                    curveTo(15.6371f, 0.7375f, 13.8566f, 0.0f, 12.0001f, 0.0f)
                    curveTo(10.1436f, 0.0f, 8.3631f, 0.7375f, 7.0504f, 2.0503f)
                    curveTo(5.7376f, 3.363f, 5.0001f, 5.1435f, 5.0001f, 7.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(21.0f)
                    curveTo(2.0001f, 21.7956f, 2.3162f, 22.5587f, 2.8788f, 23.1213f)
                    curveTo(3.4414f, 23.6839f, 4.2045f, 24.0f, 5.0001f, 24.0f)
                    horizontalLineTo(19.0001f)
                    curveTo(19.7958f, 24.0f, 20.5588f, 23.6839f, 21.1214f, 23.1213f)
                    curveTo(21.6841f, 22.5587f, 22.0001f, 21.7956f, 22.0001f, 21.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(19.0001f)
                    close()
                    moveTo(7.0001f, 7.0f)
                    curveTo(7.0001f, 5.6739f, 7.5269f, 4.4022f, 8.4646f, 3.4645f)
                    curveTo(9.4023f, 2.5268f, 10.674f, 2.0f, 12.0001f, 2.0f)
                    curveTo(13.3262f, 2.0f, 14.598f, 2.5268f, 15.5357f, 3.4645f)
                    curveTo(16.4733f, 4.4022f, 17.0001f, 5.6739f, 17.0001f, 7.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(7.0f)
                    close()
                    moveTo(20.0001f, 21.0f)
                    curveTo(20.0001f, 21.2652f, 19.8948f, 21.5196f, 19.7072f, 21.7071f)
                    curveTo(19.5197f, 21.8946f, 19.2653f, 22.0f, 19.0001f, 22.0f)
                    horizontalLineTo(5.0001f)
                    curveTo(4.7349f, 22.0f, 4.4805f, 21.8946f, 4.293f, 21.7071f)
                    curveTo(4.1055f, 21.5196f, 4.0001f, 21.2652f, 4.0001f, 21.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(20.0001f)
                    verticalLineTo(21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0001f, 13.9996f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(17.9996f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(13.9996f)
                    close()
                }
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
