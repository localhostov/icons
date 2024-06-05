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

public val Icons.Filled.TruckCouch: ImageVector
    get() {
        if (_truckCouch != null) {
            return _truckCouch!!
        }
        _truckCouch = Builder(name = "TruckCouch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                verticalLineTo(17.051f)
                curveToRelative(4.92f, -0.557f, 5.453f, 6.758f, 0.5f, 6.949f)
                arcToRelative(3.516f, 3.516f, 0.0f, false, true, -2.853f, -5.514f)
                lineTo(0.666f, 23.952f)
                lineToRelative(-0.613f, -1.9f)
                lineToRelative(1.379f, -0.443f)
                lineTo(0.15f, 17.718f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.859f, -3.765f)
                lineToRelative(1.534f, 4.738f)
                lineTo(16.0f, 14.441f)
                verticalLineToRelative(2.474f)
                lineToRelative(2.0f, -0.644f)
                verticalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 3.0f)
                close()
                moveTo(4.817f, 16.13f)
                lineToRelative(10.7f, -3.625f)
                lineToRelative(-1.8f, -5.444f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.806f, -1.9f)
                lineTo(5.008f, 6.84f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.1f, 10.623f)
                close()
            }
        }
        .build()
        return _truckCouch!!
    }

private var _truckCouch: ImageVector? = null
