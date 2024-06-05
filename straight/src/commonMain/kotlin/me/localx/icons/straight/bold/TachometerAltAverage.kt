package me.localx.icons.straight.bold

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

public val Icons.Bold.TachometerAltAverage: ImageVector
    get() {
        if (_tachometerAltAverage != null) {
            return _tachometerAltAverage!!
        }
        _tachometerAltAverage = Builder(name = "TachometerAltAverage", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcTo(11.994f, 11.994f, 0.0f, false, false, 4.967f, 22.714f)
                lineTo(5.36f, 23.0f)
                lineTo(18.64f, 23.0f)
                lineToRelative(0.394f, -0.286f)
                arcTo(11.995f, 11.995f, 0.0f, false, false, 12.0f, 1.0f)
                close()
                moveTo(17.646f, 20.0f)
                lineTo(6.354f, 20.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 11.292f, 0.0f)
                close()
                moveTo(13.5f, 11.678f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.0f, 0.0f)
                lineTo(10.5f, 6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(9.172f, 15.828f)
                arcToRelative(3.964f, 3.964f, 0.0f, false, false, 0.529f, 0.446f)
                lineTo(7.973f, 18.726f)
                arcToRelative(7.064f, 7.064f, 0.0f, false, true, -0.924f, -0.779f)
                arcTo(7.01f, 7.01f, 0.0f, false, true, 9.0f, 6.672f)
                verticalLineToRelative(3.683f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.172f, 5.473f)
                close()
                moveTo(19.0f, 13.0f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, true, -2.049f, 4.947f)
                arcToRelative(7.064f, 7.064f, 0.0f, false, true, -0.924f, 0.779f)
                lineTo(14.3f, 16.274f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.7f, -5.919f)
                lineTo(15.0f, 6.672f)
                arcTo(7.023f, 7.023f, 0.0f, false, true, 19.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltAverage!!
    }

private var _tachometerAltAverage: ImageVector? = null
