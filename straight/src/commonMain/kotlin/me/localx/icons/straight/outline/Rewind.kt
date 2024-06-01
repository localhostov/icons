package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9996f, 6.4842f)
                    verticalLineTo(0.1362f)
                    lineTo(1.2846f, 9.2292f)
                    lineTo(1.2556f, 9.2492f)
                    curveTo(0.8669f, 9.5267f, 0.5501f, 9.8931f, 0.3315f, 10.3177f)
                    curveTo(0.1129f, 10.7424f, -0.0011f, 11.2131f, -0.0011f, 11.6907f)
                    curveTo(-0.0011f, 12.1683f, 0.1129f, 12.639f, 0.3315f, 13.0637f)
                    curveTo(0.5501f, 13.4883f, 0.8669f, 13.8547f, 1.2556f, 14.1322f)
                    lineTo(14.9996f, 23.9422f)
                    verticalLineTo(17.5142f)
                    lineTo(23.9996f, 23.9422f)
                    verticalLineTo(0.0562f)
                    lineTo(14.9996f, 6.4842f)
                    close()
                    moveTo(21.9996f, 20.0562f)
                    lineTo(12.9996f, 13.6272f)
                    verticalLineTo(20.0562f)
                    lineTo(2.4186f, 12.5042f)
                    curveTo(2.2901f, 12.4124f, 2.1851f, 12.2915f, 2.1123f, 12.1513f)
                    curveTo(2.0394f, 12.0112f, 2.0009f, 11.8557f, 1.9997f, 11.6978f)
                    curveTo(1.9985f, 11.5398f, 2.0348f, 11.3838f, 2.1055f, 11.2426f)
                    curveTo(2.1762f, 11.1014f, 2.2794f, 10.9789f, 2.4066f, 10.8852f)
                    lineTo(12.9996f, 3.8622f)
                    verticalLineTo(10.3712f)
                    lineTo(21.9996f, 3.9422f)
                    verticalLineTo(20.0562f)
                    close()
                }
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
