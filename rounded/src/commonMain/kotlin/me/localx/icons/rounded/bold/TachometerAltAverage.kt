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
                moveTo(20.017f, 4.059f)
                arcTo(12.014f, 12.014f, 0.0f, false, false, 0.1f, 11.4f)
                arcTo(11.858f, 11.858f, 0.0f, false, false, 3.614f, 21.487f)
                arcTo(5.309f, 5.309f, 0.0f, false, false, 7.341f, 23.0f)
                horizontalLineToRelative(9.323f)
                arcToRelative(5.175f, 5.175f, 0.0f, false, false, 3.574f, -1.371f)
                arcTo(11.969f, 11.969f, 0.0f, false, false, 20.017f, 4.059f)
                close()
                moveTo(18.183f, 19.444f)
                arcTo(2.225f, 2.225f, 0.0f, false, true, 16.664f, 20.0f)
                lineTo(7.341f, 20.0f)
                arcToRelative(2.328f, 2.328f, 0.0f, false, true, -1.634f, -0.662f)
                arcToRelative(8.889f, 8.889f, 0.0f, false, true, -2.632f, -7.565f)
                arcTo(9.008f, 9.008f, 0.0f, false, true, 10.952f, 4.06f)
                curveTo(19.411f, 3.0f, 24.471f, 13.614f, 18.183f, 19.444f)
                close()
                moveTo(19.0f, 12.786f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -1.844f, 4.729f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.209f, -2.03f)
                arcToRelative(3.917f, 3.917f, 0.0f, false, false, 0.345f, -4.9f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.416f, -1.779f)
                arcTo(6.665f, 6.665f, 0.0f, false, true, 19.0f, 12.786f)
                close()
                moveTo(9.052f, 15.486f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.208f, 2.032f)
                arcToRelative(6.929f, 6.929f, 0.0f, false, true, -0.552f, -8.711f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.416f, 1.779f)
                arcTo(3.915f, 3.915f, 0.0f, false, false, 9.052f, 15.484f)
                close()
                moveTo(13.5f, 11.678f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.0f, 0.0f)
                lineTo(10.5f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tachometerAltAverage!!
    }

private var _tachometerAltAverage: ImageVector? = null
