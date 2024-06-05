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

public val Icons.Filled.TachometerAltSlowest: ImageVector
    get() {
        if (_tachometerAltSlowest != null) {
            return _tachometerAltSlowest!!
        }
        _tachometerAltSlowest = Builder(name = "TachometerAltSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.0f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, false, 5.112f, 9.818f)
                lineTo(5.371f, 23.0f)
                lineTo(18.629f, 23.0f)
                lineToRelative(0.259f, -0.182f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 23.437f, 9.365f)
                curveTo(19.029f, -3.574f, 0.253f, -0.657f, 0.0f, 13.0f)
                close()
                moveTo(16.633f, 18.247f)
                curveToRelative(0.108f, -0.095f, 0.214f, -0.193f, 0.317f, -0.3f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, false, 0.0f, -9.9f)
                curveToRelative(-4.123f, -4.294f, -11.784f, -1.328f, -11.932f, 4.6f)
                lineToRelative(-1.992f, 0.834f)
                arcToRelative(8.995f, 8.995f, 0.0f, true, true, 15.338f, 5.877f)
                curveToRelative(-0.134f, 0.135f, -0.273f, 0.265f, -0.415f, 0.389f)
                close()
                moveTo(10.783f, 14.577f)
                lineTo(4.551f, 17.185f)
                lineToRelative(-0.769f, -1.847f)
                lineToRelative(6.246f, -2.613f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.755f, 1.852f)
                close()
            }
        }
        .build()
        return _tachometerAltSlowest!!
    }

private var _tachometerAltSlowest: ImageVector? = null
