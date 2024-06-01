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

public val Icons.Filled.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 4.0f)
                    horizontalLineTo(17.9f)
                    curveTo(17.6679f, 2.8714f, 17.0538f, 1.8573f, 16.1613f, 1.1287f)
                    curveTo(15.2687f, 0.4001f, 14.1522f, 0.0015f, 13.0f, 0.0f)
                    lineTo(11.0f, 0.0f)
                    curveTo(9.8478f, 0.0015f, 8.7313f, 0.4001f, 7.8387f, 1.1287f)
                    curveTo(6.9462f, 1.8573f, 6.3321f, 2.8714f, 6.1f, 4.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 4.0016f, 2.4036f, 4.5289f, 1.4662f, 5.4662f)
                    curveTo(0.5289f, 6.4036f, 0.0016f, 7.6744f, 0.0f, 9.0f)
                    lineTo(0.0f, 12.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.0f)
                    curveTo(23.9984f, 7.6744f, 23.4711f, 6.4036f, 22.5338f, 5.4662f)
                    curveTo(21.5964f, 4.5289f, 20.3256f, 4.0016f, 19.0f, 4.0f)
                    close()
                    moveTo(8.184f, 4.0f)
                    curveTo(8.3901f, 3.4171f, 8.7712f, 2.9121f, 9.2753f, 2.5541f)
                    curveTo(9.7794f, 2.1961f, 10.3817f, 2.0026f, 11.0f, 2.0f)
                    horizontalLineTo(13.0f)
                    curveTo(13.6183f, 2.0026f, 14.2206f, 2.1961f, 14.7247f, 2.5541f)
                    curveTo(15.2288f, 2.9121f, 15.6099f, 3.4171f, 15.816f, 4.0f)
                    horizontalLineTo(8.184f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0f, 14.9999f)
                    curveTo(13.0f, 15.2651f, 12.8946f, 15.5194f, 12.7071f, 15.707f)
                    curveTo(12.5196f, 15.8945f, 12.2652f, 15.9999f, 12.0f, 15.9999f)
                    curveTo(11.7348f, 15.9999f, 11.4804f, 15.8945f, 11.2929f, 15.707f)
                    curveTo(11.1054f, 15.5194f, 11.0f, 15.2651f, 11.0f, 14.9999f)
                    verticalLineTo(13.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(18.9999f)
                    curveTo(0.0016f, 20.3255f, 0.5289f, 21.5963f, 1.4662f, 22.5336f)
                    curveTo(2.4036f, 23.471f, 3.6744f, 23.9983f, 5.0f, 23.9998f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9983f, 21.5964f, 23.471f, 22.5338f, 22.5336f)
                    curveTo(23.4711f, 21.5963f, 23.9984f, 20.3255f, 24.0f, 18.9999f)
                    verticalLineTo(13.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(14.9999f)
                    close()
                }
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
