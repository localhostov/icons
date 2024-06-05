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

public val Icons.Filled.Ban: ImageVector
    get() {
        if (_ban != null) {
            return _ban!!
        }
        _ban = Builder(name = "Ban", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(469.333f, 256.0f)
                curveToRelative(0.1f, 117.726f, -95.256f, 213.243f, -212.982f, 213.343f)
                curveToRelative(-49.313f, 0.042f, -97.116f, -17.016f, -135.263f, -48.266f)
                lineToRelative(299.989f, -299.989f)
                curveTo(452.315f, 159.106f, 469.373f, 206.795f, 469.333f, 256.0f)
                close()
                moveTo(256.0f, 42.667f)
                curveToRelative(49.205f, -0.039f, 96.894f, 17.019f, 134.912f, 48.256f)
                lineTo(90.923f, 390.912f)
                curveToRelative(-74.604f, -91.07f, -61.256f, -225.375f, 29.814f, -299.98f)
                curveTo(158.884f, 59.682f, 206.687f, 42.625f, 256.0f, 42.667f)
                close()
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
