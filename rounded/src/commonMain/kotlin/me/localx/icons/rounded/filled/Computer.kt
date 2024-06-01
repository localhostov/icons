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

public val Icons.Filled.Computer: ImageVector
    get() {
        if (_computer != null) {
            return _computer!!
        }
        _computer = Builder(name = "Computer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.0f, 19.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(7.0f)
                    curveTo(6.7348f, 21.0f, 6.4804f, 21.1053f, 6.2929f, 21.2929f)
                    curveTo(6.1053f, 21.4804f, 6.0f, 21.7348f, 6.0f, 22.0f)
                    curveTo(6.0f, 22.2652f, 6.1053f, 22.5196f, 6.2929f, 22.7071f)
                    curveTo(6.4804f, 22.8946f, 6.7348f, 23.0f, 7.0f, 23.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.2652f, 23.0f, 17.5195f, 22.8946f, 17.7071f, 22.7071f)
                    curveTo(17.8946f, 22.5196f, 18.0f, 22.2652f, 18.0f, 22.0f)
                    curveTo(18.0f, 21.7348f, 17.8946f, 21.4804f, 17.7071f, 21.2929f)
                    curveTo(17.5195f, 21.1053f, 17.2652f, 21.0f, 17.0f, 21.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.1522f, 18.9985f, 21.2687f, 18.5999f, 22.1612f, 17.8713f)
                    curveTo(23.0538f, 17.1427f, 23.6679f, 16.1286f, 23.9f, 15.0f)
                    horizontalLineTo(0.1f)
                    curveTo(0.3321f, 16.1286f, 0.9462f, 17.1427f, 1.8387f, 17.8713f)
                    curveTo(2.7313f, 18.5999f, 3.8478f, 18.9985f, 5.0f, 19.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.9999f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 1.0015f, 2.4036f, 1.5288f, 1.4662f, 2.4661f)
                    curveTo(0.5289f, 3.4034f, 0.0016f, 4.6743f, 0.0f, 5.9999f)
                    lineTo(0.0f, 12.9999f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.9999f)
                    curveTo(23.9984f, 4.6743f, 23.4711f, 3.4034f, 22.5338f, 2.4661f)
                    curveTo(21.5964f, 1.5288f, 20.3256f, 1.0015f, 19.0f, 0.9999f)
                    close()
                }
            }
        }
        .build()
        return _computer!!
    }

private var _computer: ImageVector? = null
