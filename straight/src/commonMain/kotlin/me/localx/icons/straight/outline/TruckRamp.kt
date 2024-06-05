package me.localx.icons.straight.outline

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

public val Icons.Outline.TruckRamp: ImageVector
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
                lineTo(24.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                lineTo(18.0f, 16.271f)
                lineTo(0.053f, 22.048f)
                lineToRelative(0.613f, 1.9f)
                lineToRelative(15.468f, -4.979f)
                arcTo(4.018f, 4.018f, 0.0f, false, false, 20.0f, 24.0f)
                curveToRelative(5.274f, -0.138f, 5.274f, -7.863f, 0.0f, -8.0f)
                lineTo(20.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 2.0f)
                close()
                moveTo(22.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 20.0f)
                close()
            }
        }
        .build()
        return _truckRamp!!
    }

private var _truckRamp: ImageVector? = null
