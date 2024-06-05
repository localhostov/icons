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

public val Icons.Filled.TruckRamp: ImageVector
    get() {
        if (_truckRamp != null) {
            return _truckRamp!!
        }
        _truckRamp = Builder(name = "TruckRamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 17.0f)
                arcToRelative(3.539f, 3.539f, 0.0f, false, false, -0.508f, 0.051f)
                curveToRelative(0.0f, -0.017f, 0.008f, -0.033f, 0.008f, -0.051f)
                verticalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineTo(16.279f)
                lineTo(0.684f, 22.051f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.632f, 1.9f)
                lineToRelative(16.306f, -5.436f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 17.0f)
                close()
            }
        }
        .build()
        return _truckRamp!!
    }

private var _truckRamp: ImageVector? = null
