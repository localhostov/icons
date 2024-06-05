package me.localx.icons.rounded.filled

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

public val Icons.Filled.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                curveToRelative(141.385f, 0.0f, 256.0f, -114.615f, 256.0f, -256.0f)
                reflectiveCurveTo(397.385f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 114.615f, 0.0f, 256.0f)
                curveTo(0.153f, 397.322f, 114.678f, 511.847f, 256.0f, 512.0f)
                close()
                moveTo(150.4f, 150.4f)
                curveToRelative(58.363f, -58.22f, 152.837f, -58.22f, 211.2f, 0.0f)
                curveToRelative(8.185f, 8.475f, 7.95f, 21.98f, -0.524f, 30.165f)
                curveToRelative(-8.267f, 7.985f, -21.374f, 7.985f, -29.641f, 0.0f)
                curveToRelative(-41.661f, -41.65f, -109.199f, -41.642f, -150.849f, 0.02f)
                reflectiveCurveToRelative(-41.642f, 109.199f, 0.02f, 150.849f)
                curveToRelative(41.654f, 41.643f, 109.176f, 41.643f, 150.83f, 0.0f)
                curveToRelative(8.475f, -8.185f, 21.98f, -7.95f, 30.165f, 0.525f)
                curveToRelative(7.984f, 8.267f, 7.984f, 21.373f, 0.0f, 29.641f)
                curveToRelative(-58.321f, 58.321f, -152.879f, 58.321f, -211.2f, 0.0f)
                curveTo(92.079f, 303.279f, 92.079f, 208.721f, 150.4f, 150.4f)
                lineTo(150.4f, 150.4f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
