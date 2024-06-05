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

public val Icons.Filled.CarBump: ImageVector
    get() {
        if (_carBump != null) {
            return _carBump!!
        }
        _carBump = Builder(name = "CarBump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                curveTo(14.211f, 17.391f, 23.791f, 17.4f, 24.0f, 24.0f)
                close()
                moveTo(22.55f, 12.85f)
                lineToRelative(-1.859f, 0.738f)
                lineToRelative(0.739f, 1.859f)
                lineToRelative(-4.647f, 1.846f)
                lineToRelative(-0.739f, -1.859f)
                lineTo(8.609f, 18.388f)
                lineToRelative(0.739f, 1.859f)
                lineTo(4.7f, 22.092f)
                lineToRelative(-0.739f, -1.858f)
                lineTo(2.1f, 20.972f)
                lineTo(0.848f, 17.81f)
                arcToRelative(12.012f, 12.012f, 0.0f, false, true, -0.685f, -2.523f)
                lineToRelative(19.9f, -7.905f)
                arcToRelative(11.932f, 11.932f, 0.0f, false, true, 1.232f, 2.3f)
                close()
                moveTo(6.587f, 15.943f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.859f, 0.738f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.587f, 15.943f)
                close()
                moveTo(17.739f, 11.513f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.859f, 0.738f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.739f, 11.513f)
                close()
                moveTo(18.726f, 5.761f)
                curveToRelative(-0.2f, -0.2f, -0.383f, -0.408f, -0.591f, -0.594f)
                lineToRelative(-3.813f, -3.4f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, -3.1f, -0.55f)
                lineTo(2.362f, 4.729f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 0.48f, 7.261f)
                lineTo(0.043f, 12.354f)
                curveToRelative(-0.023f, 0.279f, -0.018f, 0.558f, -0.022f, 0.838f)
                close()
            }
        }
        .build()
        return _carBump!!
    }

private var _carBump: ImageVector? = null
