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
                moveTo(24.0f, 20.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -6.378f, -1.987f)
                lineTo(1.316f, 23.949f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.632f, -1.9f)
                lineToRelative(0.79f, -0.263f)
                lineTo(0.15f, 17.718f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.859f, -3.765f)
                lineToRelative(0.6f, 1.839f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.823f, 1.915f)
                lineTo(16.0f, 14.441f)
                verticalLineToRelative(2.505f)
                lineToRelative(2.0f, -0.667f)
                verticalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineTo(17.0f)
                curveToRelative(0.0f, 0.018f, -0.007f, 0.034f, -0.008f, 0.051f)
                arcTo(3.486f, 3.486f, 0.0f, false, true, 24.0f, 20.5f)
                close()
                moveTo(5.787f, 15.8f)
                lineToRelative(8.789f, -2.977f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.628f, -1.262f)
                lineTo(13.761f, 7.205f)
                arcTo(3.029f, 3.029f, 0.0f, false, false, 9.907f, 5.157f)
                lineTo(5.008f, 6.84f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.1f, 10.623f)
                lineToRelative(1.415f, 4.529f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.787f, 15.8f)
                close()
            }
        }
        .build()
        return _truckCouch!!
    }

private var _truckCouch: ImageVector? = null
