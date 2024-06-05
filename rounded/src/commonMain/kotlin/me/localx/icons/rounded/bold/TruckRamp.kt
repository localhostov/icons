package me.localx.icons.rounded.bold

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

public val Icons.Bold.TruckRamp: ImageVector
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
                arcToRelative(3.432f, 3.432f, 0.0f, false, false, -0.5f, 0.036f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 17.0f, 5.5f)
                verticalLineTo(16.377f)
                lineTo(1.077f, 21.061f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.846f, 2.878f)
                lineToRelative(15.235f, -4.481f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 17.0f)
                close()
            }
        }
        .build()
        return _truckRamp!!
    }

private var _truckRamp: ImageVector? = null
