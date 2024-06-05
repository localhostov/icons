package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Lettuce: ImageVector
    get() {
        if (_lettuce != null) {
            return _lettuce!!
        }
        _lettuce = Builder(name = "Lettuce", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.769f, 11.514f)
                arcToRelative(5.191f, 5.191f, 0.0f, false, true, -1.778f, 5.548f)
                curveToRelative(0.0f, 3.0f, -2.187f, 6.5f, -2.187f, 6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.8f, -0.595f)
                lineTo(13.004f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.004f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.8f, 0.6f)
                reflectiveCurveTo(7.0f, 19.983f, 7.0f, 17.0f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, -2.0f, -4.0f)
                curveToRelative(-0.1f, -0.9f, 0.666f, -1.883f, 0.013f, -2.672f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.816f, -7.26f)
                arcToRelative(0.668f, 0.668f, 0.0f, false, false, 0.4f, -0.405f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.542f, 0.0f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, 0.421f, 0.409f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.795f, 7.256f)
                arcTo(1.273f, 1.273f, 0.0f, false, false, 18.769f, 11.514f)
                close()
                moveTo(23.569f, 9.797f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, false, -2.513f, -5.648f)
                arcToRelative(6.448f, 6.448f, 0.0f, false, true, -0.272f, 7.126f)
                arcToRelative(6.972f, 6.972f, 0.0f, false, true, -1.834f, 6.658f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -1.075f, 3.981f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 22.0f, 17.0f)
                curveToRelative(0.019f, -0.029f, 0.295f, -0.252f, 0.295f, -0.252f)
                arcTo(4.977f, 4.977f, 0.0f, false, false, 23.6f, 11.061f)
                arcTo(1.53f, 1.53f, 0.0f, false, true, 23.566f, 9.8f)
                close()
                moveTo(0.4f, 11.061f)
                arcTo(4.977f, 4.977f, 0.0f, false, false, 1.71f, 16.745f)
                reflectiveCurveToRelative(0.276f, 0.223f, 0.3f, 0.252f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, false, 4.122f, 4.917f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -1.075f, -3.981f)
                arcToRelative(6.971f, 6.971f, 0.0f, false, true, -1.834f, -6.658f)
                arcToRelative(6.448f, 6.448f, 0.0f, false, true, -0.272f, -7.126f)
                arcTo(4.013f, 4.013f, 0.0f, false, false, 0.434f, 9.8f)
                arcTo(1.53f, 1.53f, 0.0f, false, true, 0.4f, 11.061f)
                close()
            }
        }
        .build()
        return _lettuce!!
    }

private var _lettuce: ImageVector? = null
