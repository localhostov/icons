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

public val Icons.Outline.TachometerAltAverage: ImageVector
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
                curveTo(0.374f, 0.982f, -4.414f, 16.17f, 5.112f, 22.818f)
                lineTo(5.371f, 23.0f)
                lineTo(18.629f, 23.0f)
                lineToRelative(0.259f, -0.182f)
                curveTo(28.418f, 16.167f, 23.621f, 0.98f, 12.0f, 1.0f)
                close()
                moveTo(17.988f, 21.0f)
                lineTo(6.012f, 21.0f)
                curveTo(-1.633f, 15.321f, 2.47f, 2.976f, 12.0f, 3.0f)
                curveTo(21.53f, 2.976f, 25.633f, 15.322f, 17.988f, 21.0f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.0f, -1.732f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.268f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(9.0f, 5.545f)
                lineTo(9.0f, 7.78f)
                arcToRelative(6.038f, 6.038f, 0.0f, false, false, -1.144f, 9.443f)
                lineToRelative(-1.4f, 1.429f)
                curveTo(2.313f, 14.821f, 3.858f, 7.493f, 9.0f, 5.545f)
                close()
                moveTo(19.949f, 12.937f)
                arcToRelative(7.939f, 7.939f, 0.0f, false, true, -2.407f, 5.715f)
                lineToRelative(-1.4f, -1.429f)
                arcTo(6.038f, 6.038f, 0.0f, false, false, 15.0f, 7.78f)
                lineTo(15.0f, 5.545f)
                arcTo(8.011f, 8.011f, 0.0f, false, true, 19.949f, 12.937f)
                close()
            }
        }
        .build()
        return _tachometerAltAverage!!
    }

private var _tachometerAltAverage: ImageVector? = null
