package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.269f, 283.584f)
                lineToRelative(-30.165f, 30.165f)
                lineTo(448.0f, 362.667f)
                horizontalLineToRelative(-8.149f)
                curveToRelative(-72.192f, 0.0f, -118.101f, -32.683f, -158.848f, -74.837f)
                lineToRelative(-6.4f, 7.424f)
                curveToRelative(-6.997f, 8.107f, -14.208f, 16.448f, -21.717f, 24.832f)
                curveToRelative(46.934f, 54.345f, 115.244f, 85.509f, 187.051f, 85.333f)
                horizontalLineTo(448.0f)
                lineToRelative(-48.917f, 48.917f)
                lineToRelative(30.165f, 30.165f)
                lineToRelative(70.251f, -70.251f)
                curveToRelative(16.656f, -16.661f, 16.656f, -43.669f, 0.0f, -60.331f)
                lineTo(429.269f, 283.584f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.872f, 149.333f)
                horizontalLineTo(448.0f)
                lineToRelative(-48.896f, 48.917f)
                lineToRelative(30.165f, 30.165f)
                lineToRelative(70.251f, -70.251f)
                curveToRelative(16.656f, -16.661f, 16.656f, -43.669f, 0.0f, -60.331f)
                lineToRelative(-70.251f, -70.251f)
                lineToRelative(-30.165f, 30.165f)
                lineTo(448.0f, 106.667f)
                horizontalLineToRelative(-8.149f)
                curveToRelative(-105.749f, 0.0f, -163.563f, 56.96f, -216.021f, 116.864f)
                curveTo(172.011f, 165.013f, 109.717f, 106.667f, -0.853f, 106.667f)
                verticalLineToRelative(42.667f)
                curveToRelative(95.232f, 0.0f, 146.624f, 49.835f, 196.459f, 106.667f)
                curveTo(145.771f, 312.832f, 94.379f, 362.667f, -0.853f, 362.667f)
                verticalLineToRelative(42.667f)
                curveToRelative(123.904f, 0.0f, 187.221f, -73.301f, 243.2f, -137.941f)
                curveTo(294.699f, 206.677f, 344.256f, 149.333f, 439.872f, 149.333f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
