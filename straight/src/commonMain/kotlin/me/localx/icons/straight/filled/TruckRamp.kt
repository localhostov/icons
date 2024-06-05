package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineTo(16.271f)
                lineTo(0.053f, 22.048f)
                lineToRelative(0.613f, 1.9f)
                lineToRelative(16.981f, -5.466f)
                arcTo(3.516f, 3.516f, 0.0f, false, false, 20.5f, 24.0f)
                curveToRelative(4.954f, -0.192f, 4.419f, -7.506f, -0.5f, -6.949f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 2.0f)
                close()
            }
        }
        .build()
        return _truckRamp!!
    }

private var _truckRamp: ImageVector? = null
