package me.localx.icons.rounded.outline

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

public val Icons.Outline.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.367f, 14.727f)
                    curveTo(20.1221f, 14.4311f, 20.7739f, 13.9204f, 21.2419f, 13.258f)
                    curveTo(21.7099f, 12.5956f, 21.9734f, 11.8106f, 22.0f, 11.0f)
                    curveTo(22.0f, 8.378f, 19.5f, 6.646f, 15.2f, 6.151f)
                    curveTo(15.718f, 5.5543f, 16.0022f, 4.7902f, 16.0f, 4.0f)
                    curveTo(16.0f, 1.57f, 13.645f, 0.0f, 10.0f, 0.0f)
                    curveTo(6.355f, 0.0f, 4.0f, 1.57f, 4.0f, 4.0f)
                    curveTo(4.0073f, 4.6337f, 4.1883f, 5.2533f, 4.5233f, 5.7912f)
                    curveTo(4.8583f, 6.3292f, 5.3345f, 6.7649f, 5.9f, 7.051f)
                    curveTo(3.624f, 8.052f, 3.0f, 9.606f, 3.0f, 11.0f)
                    curveTo(2.9949f, 11.7509f, 3.2012f, 12.4881f, 3.5954f, 13.1272f)
                    curveTo(3.9896f, 13.7663f, 4.5557f, 14.2816f, 5.229f, 14.614f)
                    curveTo(1.793f, 15.38f, 0.0f, 16.857f, 0.0f, 19.0f)
                    curveTo(0.0f, 22.271f, 4.149f, 24.0f, 12.0f, 24.0f)
                    curveTo(19.963f, 24.0f, 24.0f, 22.318f, 24.0f, 19.0f)
                    curveTo(24.0f, 16.943f, 22.445f, 15.516f, 19.367f, 14.727f)
                    close()
                    moveTo(10.0f, 2.0f)
                    curveTo(11.991f, 2.0f, 14.0f, 2.619f, 14.0f, 4.0f)
                    curveTo(14.0f, 5.381f, 11.991f, 6.0f, 10.0f, 6.0f)
                    curveTo(8.009f, 6.0f, 6.0f, 5.381f, 6.0f, 4.0f)
                    curveTo(6.0f, 2.619f, 8.009f, 2.0f, 10.0f, 2.0f)
                    close()
                    moveTo(12.5f, 8.0f)
                    curveTo(15.96f, 8.0f, 20.0f, 8.786f, 20.0f, 11.0f)
                    curveTo(20.0f, 13.214f, 15.96f, 14.0f, 12.5f, 14.0f)
                    curveTo(10.245f, 14.0f, 5.0f, 13.708f, 5.0f, 11.0f)
                    curveTo(5.0f, 8.292f, 10.245f, 8.0f, 12.5f, 8.0f)
                    close()
                    moveTo(12.0f, 22.0f)
                    curveTo(5.925f, 22.0f, 2.0f, 20.822f, 2.0f, 19.0f)
                    curveTo(2.0f, 17.178f, 5.925f, 16.0f, 12.0f, 16.0f)
                    curveTo(18.262f, 16.0f, 22.0f, 17.122f, 22.0f, 19.0f)
                    curveTo(22.0f, 20.878f, 18.262f, 22.0f, 12.0f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
