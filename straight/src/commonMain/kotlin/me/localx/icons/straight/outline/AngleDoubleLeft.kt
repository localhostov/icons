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

public val Icons.Outline.AngleDoubleLeft: ImageVector
    get() {
        if (_angleDoubleLeft != null) {
            return _angleDoubleLeft!!
        }
        _angleDoubleLeft = Builder(name = "AngleDoubleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.1209f, 11.2931f)
                    lineTo(13.0129f, 1.4001f)
                    lineTo(11.5999f, -0.0129f)
                    lineTo(1.7069f, 9.8791f)
                    curveTo(1.1445f, 10.4416f, 0.8286f, 11.2046f, 0.8286f, 12.0001f)
                    curveTo(0.8286f, 12.7956f, 1.1445f, 13.5585f, 1.7069f, 14.1211f)
                    lineTo(11.5919f, 24.0061f)
                    lineTo(13.0059f, 22.5921f)
                    lineTo(3.1219f, 12.7071f)
                    curveTo(2.9343f, 12.5197f, 2.8288f, 12.2654f, 2.8286f, 12.0003f)
                    curveTo(2.8284f, 11.7351f, 2.9336f, 11.4807f, 3.1209f, 11.2931f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 1.4171f)
                    lineTo(21.583f, 1.0E-4f)
                    lineTo(10.293f, 11.2901f)
                    curveTo(10.1055f, 11.4776f, 10.0002f, 11.7319f, 10.0002f, 11.9971f)
                    curveTo(10.0002f, 12.2623f, 10.1055f, 12.5166f, 10.293f, 12.7041f)
                    lineTo(21.584f, 24.0001f)
                    lineTo(23.0f, 22.5841f)
                    lineTo(12.414f, 12.0001f)
                    lineTo(23.0f, 1.4171f)
                    close()
                }
            }
        }
        .build()
        return _angleDoubleLeft!!
    }

private var _angleDoubleLeft: ImageVector? = null
