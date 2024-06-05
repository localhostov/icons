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

public val Icons.Filled.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 85.333f)
                horizontalLineToRelative(-66.133f)
                curveTo(371.66f, 35.703f, 328.002f, 0.064f, 277.333f, 0.0f)
                horizontalLineToRelative(-42.667f)
                curveToRelative(-50.669f, 0.064f, -94.327f, 35.703f, -104.533f, 85.333f)
                horizontalLineTo(64.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                reflectiveCurveTo(52.218f, 128.0f, 64.0f, 128.0f)
                horizontalLineToRelative(21.333f)
                verticalLineToRelative(277.333f)
                curveTo(85.404f, 464.214f, 133.119f, 511.93f, 192.0f, 512.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(58.881f, -0.07f, 106.596f, -47.786f, 106.667f, -106.667f)
                verticalLineTo(128.0f)
                horizontalLineTo(448.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                reflectiveCurveTo(459.782f, 85.333f, 448.0f, 85.333f)
                close()
                moveTo(234.667f, 362.667f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                curveTo(201.551f, 384.0f, 192.0f, 374.449f, 192.0f, 362.667f)
                verticalLineToRelative(-128.0f)
                curveToRelative(0.0f, -11.782f, 9.551f, -21.333f, 21.333f, -21.333f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                verticalLineTo(362.667f)
                close()
                moveTo(320.0f, 362.667f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                verticalLineToRelative(-128.0f)
                curveToRelative(0.0f, -11.782f, 9.551f, -21.333f, 21.333f, -21.333f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                verticalLineTo(362.667f)
                close()
                moveTo(174.315f, 85.333f)
                curveToRelative(9.074f, -25.551f, 33.238f, -42.634f, 60.352f, -42.667f)
                horizontalLineToRelative(42.667f)
                curveToRelative(27.114f, 0.033f, 51.278f, 17.116f, 60.352f, 42.667f)
                horizontalLineTo(174.315f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
