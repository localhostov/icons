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

public val Icons.Filled.TachometerAltAverage: ImageVector
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
                curveTo(0.373f, 0.981f, -4.414f, 16.17f, 5.112f, 22.818f)
                lineTo(5.371f, 23.0f)
                lineTo(18.629f, 23.0f)
                lineToRelative(0.259f, -0.182f)
                curveTo(28.418f, 16.167f, 23.621f, 0.98f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, -3.723f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.277f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(17.94f, 19.751f)
                lineTo(16.618f, 18.251f)
                curveToRelative(3.8f, -3.106f, 2.776f, -9.68f, -1.618f, -11.564f)
                lineTo(15.0f, 4.525f)
                curveTo(21.315f, 6.607f, 23.131f, 15.358f, 17.94f, 19.751f)
                close()
                moveTo(3.0f, 13.0f)
                arcTo(9.006f, 9.006f, 0.0f, false, true, 9.0f, 4.525f)
                verticalLineToRelative(2.16f)
                curveTo(4.605f, 8.569f, 3.587f, 15.143f, 7.382f, 18.249f)
                lineToRelative(-1.322f, 1.5f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltAverage!!
    }

private var _tachometerAltAverage: ImageVector? = null
