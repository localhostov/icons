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

public val Icons.Filled.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6739f, 0.0f, 2.4021f, 0.5268f, 1.4645f, 1.4645f)
                    curveTo(0.5268f, 2.4021f, 0.0f, 3.6739f, 0.0f, 5.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 5.7957f, 0.3161f, 6.5587f, 0.8787f, 7.1213f)
                    curveTo(1.4413f, 7.6839f, 2.2043f, 8.0f, 3.0f, 8.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7605f, 8.0093f, 22.4956f, 7.7264f, 23.0538f, 7.2098f)
                    curveTo(23.612f, 6.6931f, 23.9506f, 5.982f, 24.0f, 5.223f)
                    curveTo(24.0294f, 4.548f, 23.9219f, 3.8741f, 23.6839f, 3.2418f)
                    curveTo(23.4459f, 2.6095f, 23.0823f, 2.032f, 22.6152f, 1.5439f)
                    curveTo(22.148f, 1.0559f, 21.5868f, 0.6675f, 20.9655f, 0.4022f)
                    curveTo(20.3442f, 0.1368f, 19.6756f, 0.0f, 19.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9998f, 10.0f)
                    horizontalLineTo(1.9998f)
                    curveTo(1.7346f, 10.0f, 1.4803f, 10.1054f, 1.2927f, 10.2929f)
                    curveTo(1.1052f, 10.4804f, 0.9998f, 10.7348f, 0.9998f, 11.0f)
                    verticalLineTo(19.0f)
                    curveTo(1.0014f, 20.3256f, 1.5287f, 21.5964f, 2.466f, 22.5338f)
                    curveTo(3.4034f, 23.4711f, 4.6742f, 23.9984f, 5.9998f, 24.0f)
                    horizontalLineTo(17.9998f)
                    curveTo(19.3254f, 23.9984f, 20.5963f, 23.4711f, 21.5336f, 22.5338f)
                    curveTo(22.471f, 21.5964f, 22.9982f, 20.3256f, 22.9998f, 19.0f)
                    verticalLineTo(11.0f)
                    curveTo(22.9998f, 10.7348f, 22.8945f, 10.4804f, 22.7069f, 10.2929f)
                    curveTo(22.5194f, 10.1054f, 22.265f, 10.0f, 21.9998f, 10.0f)
                    close()
                    moveTo(14.9998f, 15.0f)
                    horizontalLineTo(8.9998f)
                    curveTo(8.7346f, 15.0f, 8.4803f, 14.8946f, 8.2927f, 14.7071f)
                    curveTo(8.1052f, 14.5196f, 7.9998f, 14.2652f, 7.9998f, 14.0f)
                    curveTo(7.9998f, 13.7348f, 8.1052f, 13.4804f, 8.2927f, 13.2929f)
                    curveTo(8.4803f, 13.1054f, 8.7346f, 13.0f, 8.9998f, 13.0f)
                    horizontalLineTo(14.9998f)
                    curveTo(15.265f, 13.0f, 15.5194f, 13.1054f, 15.7069f, 13.2929f)
                    curveTo(15.8945f, 13.4804f, 15.9998f, 13.7348f, 15.9998f, 14.0f)
                    curveTo(15.9998f, 14.2652f, 15.8945f, 14.5196f, 15.7069f, 14.7071f)
                    curveTo(15.5194f, 14.8946f, 15.265f, 15.0f, 14.9998f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
