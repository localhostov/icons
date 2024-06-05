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

public val Icons.Filled.TachometerAltFastest: ImageVector
    get() {
        if (_tachometerAltFastest != null) {
            return _tachometerAltFastest!!
        }
        _tachometerAltFastest = Builder(name = "TachometerAltFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.525f, 1.009f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 5.112f, 22.818f)
                lineTo(5.371f, 23.0f)
                horizontalLineTo(18.629f)
                lineToRelative(0.259f, -0.182f)
                curveTo(28.6f, 16.026f, 23.412f, 0.546f, 11.525f, 1.009f)
                close()
                moveTo(6.051f, 19.753f)
                quadToRelative(-0.213f, -0.186f, -0.415f, -0.389f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 15.338f, -5.877f)
                lineToRelative(-1.992f, -0.834f)
                curveToRelative(-0.148f, -5.932f, -7.81f, -8.9f, -11.932f, -4.6f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, false, 0.0f, 9.9f)
                curveToRelative(0.1f, 0.1f, 0.209f, 0.2f, 0.317f, 0.3f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 1.972f, -2.275f)
                lineToRelative(6.246f, 2.613f)
                lineToRelative(-0.769f, 1.847f)
                lineToRelative(-6.232f, -2.608f)
                arcTo(1.982f, 1.982f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _tachometerAltFastest!!
    }

private var _tachometerAltFastest: ImageVector? = null
