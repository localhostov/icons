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

public val Icons.Outline.TachometerAltFastest: ImageVector
    get() {
        if (_tachometerAltFastest != null) {
            return _tachometerAltFastest!!
        }
        _tachometerAltFastest = Builder(name = "TachometerAltFastest", defaultWidth = 512.0.dp,
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
                moveTo(17.988f, 21.0f)
                lineTo(6.012f, 21.0f)
                curveTo(-1.633f, 15.32f, 2.47f, 2.976f, 12.0f, 3.0f)
                curveTo(21.53f, 2.976f, 25.633f, 15.322f, 17.988f, 21.0f)
                close()
                moveTo(13.988f, 12.78f)
                lineTo(19.524f, 15.21f)
                lineTo(18.724f, 17.042f)
                lineTo(13.187f, 14.612f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.8f, -1.832f)
                close()
                moveTo(20.0f, 13.0f)
                curveToRelative(0.0f, 0.077f, -0.009f, 0.153f, -0.011f, 0.23f)
                lineToRelative(-2.027f, -0.89f)
                arcTo(6.007f, 6.007f, 0.0f, false, false, 12.0f, 7.0f)
                curveToRelative(-5.268f, -0.1f, -8.038f, 6.683f, -4.195f, 10.285f)
                lineToRelative(-1.4f, 1.43f)
                curveTo(1.289f, 13.845f, 4.939f, 4.916f, 12.0f, 5.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, true, 20.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltFastest!!
    }

private var _tachometerAltFastest: ImageVector? = null
