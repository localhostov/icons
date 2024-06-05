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

public val Icons.Filled.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) {
            return _steeringWheel!!
        }
        _steeringWheel = Builder(name = "SteeringWheel", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.008f, 10.008f, 0.0f, false, true, 9.3f, 6.338f)
                lineTo(14.024f, 9.793f)
                arcToRelative(10.705f, 10.705f, 0.0f, false, true, -4.19f, 0.0f)
                lineTo(2.694f, 8.365f)
                arcTo(10.009f, 10.009f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(2.0f, 12.107f)
                lineTo(6.155f, 12.938f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.733f, 2.018f)
                lineToRelative(0.625f, 1.153f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, 0.482f, 1.9f)
                lineTo(9.995f, 21.8f)
                arcTo(10.014f, 10.014f, 0.0f, false, true, 2.005f, 12.107f)
                close()
                moveTo(14.0f, 21.8f)
                lineTo(14.0f, 18.013f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, 0.482f, -1.9f)
                lineToRelative(0.625f, -1.153f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.733f, -2.018f)
                lineTo(22.0f, 12.107f)
                arcTo(10.014f, 10.014f, 0.0f, false, true, 14.0f, 21.8f)
                close()
            }
        }
        .build()
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
