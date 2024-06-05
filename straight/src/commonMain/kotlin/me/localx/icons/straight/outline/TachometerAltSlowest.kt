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

public val Icons.Outline.TachometerAltSlowest: ImageVector
    get() {
        if (_tachometerAltSlowest != null) {
            return _tachometerAltSlowest!!
        }
        _tachometerAltSlowest = Builder(name = "TachometerAltSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(0.374f, 0.982f, -4.414f, 16.17f, 5.112f, 22.818f)
                lineTo(5.371f, 23.0f)
                lineTo(18.629f, 23.0f)
                lineToRelative(0.259f, -0.182f)
                curveTo(28.418f, 16.166f, 23.621f, 0.98f, 12.0f, 1.0f)
                close()
                moveTo(17.988f, 21.0f)
                lineTo(6.012f, 21.0f)
                curveTo(-1.633f, 15.321f, 2.47f, 2.976f, 12.0f, 3.0f)
                curveTo(21.53f, 2.976f, 25.633f, 15.322f, 17.988f, 21.0f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, true, -3.184f, 1.612f)
                lineToRelative(-5.537f, 2.43f)
                lineToRelative(-0.8f, -1.832f)
                lineToRelative(5.536f, -2.43f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(20.0f, 13.0f)
                arcToRelative(7.939f, 7.939f, 0.0f, false, true, -2.406f, 5.715f)
                lineToRelative(-1.4f, -1.43f)
                curveTo(20.038f, 13.682f, 17.268f, 6.9f, 12.0f, 7.0f)
                arcToRelative(6.007f, 6.007f, 0.0f, false, false, -5.962f, 5.34f)
                lineToRelative(-2.027f, 0.89f)
                curveTo(4.1f, 2.482f, 19.584f, 2.258f, 20.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltSlowest!!
    }

private var _tachometerAltSlowest: ImageVector? = null
