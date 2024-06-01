package me.localx.icons.straight.filled

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

public val Icons.Filled.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.8781f, 12.5462f)
                    curveTo(10.4417f, 13.1076f, 11.2047f, 13.4227f, 12.0001f, 13.4227f)
                    curveTo(12.7955f, 13.4227f, 13.5585f, 13.1076f, 14.1221f, 12.5462f)
                    lineTo(23.7811f, 2.8862f)
                    curveTo(23.5587f, 2.3302f, 23.1751f, 1.8535f, 22.6794f, 1.5173f)
                    curveTo(22.1838f, 1.1812f, 21.599f, 1.0011f, 21.0001f, 1.0002f)
                    horizontalLineTo(3.0001f)
                    curveTo(2.4013f, 1.0011f, 1.8164f, 1.1812f, 1.3208f, 1.5173f)
                    curveTo(0.8252f, 1.8535f, 0.4415f, 2.3302f, 0.2191f, 2.8862f)
                    lineTo(9.8781f, 12.5462f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.536f, 13.9602f)
                    curveTo(14.5974f, 14.8965f, 13.3257f, 15.4223f, 12.0f, 15.4223f)
                    curveTo(10.6743f, 15.4223f, 9.4026f, 14.8965f, 8.464f, 13.9602f)
                    lineTo(0.0f, 5.5002f)
                    verticalLineTo(23.0002f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.5002f)
                    lineTo(15.536f, 13.9602f)
                    close()
                }
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
