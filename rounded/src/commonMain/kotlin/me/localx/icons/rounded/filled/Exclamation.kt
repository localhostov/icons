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

public val Icons.Filled.Exclamation: ImageVector
    get() {
        if (_exclamation != null) {
            return _exclamation!!
        }
        _exclamation = Builder(name = "Exclamation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                curveToRelative(141.385f, 0.0f, 256.0f, -114.615f, 256.0f, -256.0f)
                reflectiveCurveTo(397.385f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 114.615f, 0.0f, 256.0f)
                curveTo(0.153f, 397.322f, 114.678f, 511.847f, 256.0f, 512.0f)
                close()
                moveTo(234.667f, 128.0f)
                curveToRelative(0.0f, -11.782f, 9.551f, -21.333f, 21.333f, -21.333f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                verticalLineToRelative(170.667f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                verticalLineTo(128.0f)
                close()
                moveTo(256.0f, 384.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                reflectiveCurveToRelative(-9.551f, 21.333f, -21.333f, 21.333f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                reflectiveCurveTo(244.218f, 384.0f, 256.0f, 384.0f)
                close()
            }
        }
        .build()
        return _exclamation!!
    }

private var _exclamation: ImageVector? = null
