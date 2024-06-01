package me.localx.icons.rounded.filled

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

public val Icons.Filled.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0001f, 0.0f)
                    horizontalLineTo(7.0001f)
                    curveTo(5.674f, 0.0f, 4.4023f, 0.5268f, 3.4646f, 1.4645f)
                    curveTo(2.5269f, 2.4021f, 2.0001f, 3.6739f, 2.0001f, 5.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(22.0001f)
                    verticalLineTo(5.0f)
                    curveTo(22.0001f, 3.6739f, 21.4733f, 2.4021f, 20.5357f, 1.4645f)
                    curveTo(19.598f, 0.5268f, 18.3262f, 0.0f, 17.0001f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(13.0001f, 7.0f)
                    horizontalLineTo(11.0001f)
                    curveTo(10.7349f, 7.0f, 10.4806f, 6.8946f, 10.293f, 6.7071f)
                    curveTo(10.1055f, 6.5196f, 10.0001f, 6.2652f, 10.0001f, 6.0f)
                    curveTo(10.0001f, 5.7348f, 10.1055f, 5.4804f, 10.293f, 5.2929f)
                    curveTo(10.4806f, 5.1054f, 10.7349f, 5.0f, 11.0001f, 5.0f)
                    horizontalLineTo(13.0001f)
                    curveTo(13.2653f, 5.0f, 13.5197f, 5.1054f, 13.7072f, 5.2929f)
                    curveTo(13.8948f, 5.4804f, 14.0001f, 5.7348f, 14.0001f, 6.0f)
                    curveTo(14.0001f, 6.2652f, 13.8948f, 6.5196f, 13.7072f, 6.7071f)
                    curveTo(13.5197f, 6.8946f, 13.2653f, 7.0f, 13.0001f, 7.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0001f, 19.0f)
                    curveTo(2.0001f, 19.6566f, 2.1295f, 20.3068f, 2.3807f, 20.9134f)
                    curveTo(2.632f, 21.5201f, 3.0003f, 22.0713f, 3.4646f, 22.5355f)
                    curveTo(4.4023f, 23.4732f, 5.674f, 24.0f, 7.0001f, 24.0f)
                    horizontalLineTo(17.0001f)
                    curveTo(17.6567f, 24.0f, 18.3069f, 23.8707f, 18.9135f, 23.6194f)
                    curveTo(19.5202f, 23.3681f, 20.0714f, 22.9998f, 20.5357f, 22.5355f)
                    curveTo(20.9999f, 22.0713f, 21.3682f, 21.5201f, 21.6195f, 20.9134f)
                    curveTo(21.8708f, 20.3068f, 22.0001f, 19.6566f, 22.0001f, 19.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(11.0001f, 17.0f)
                    horizontalLineTo(13.0001f)
                    curveTo(13.2653f, 17.0f, 13.5197f, 17.1054f, 13.7072f, 17.2929f)
                    curveTo(13.8948f, 17.4804f, 14.0001f, 17.7348f, 14.0001f, 18.0f)
                    curveTo(14.0001f, 18.2652f, 13.8948f, 18.5196f, 13.7072f, 18.7071f)
                    curveTo(13.5197f, 18.8947f, 13.2653f, 19.0f, 13.0001f, 19.0f)
                    horizontalLineTo(11.0001f)
                    curveTo(10.7349f, 19.0f, 10.4806f, 18.8947f, 10.293f, 18.7071f)
                    curveTo(10.1055f, 18.5196f, 10.0001f, 18.2652f, 10.0001f, 18.0f)
                    curveTo(10.0001f, 17.7348f, 10.1055f, 17.4804f, 10.293f, 17.2929f)
                    curveTo(10.4806f, 17.1054f, 10.7349f, 17.0f, 11.0001f, 17.0f)
                    close()
                }
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
