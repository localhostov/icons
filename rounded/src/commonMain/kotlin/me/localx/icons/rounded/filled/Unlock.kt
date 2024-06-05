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

public val Icons.Filled.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.077f, viewportHeight = 512.077f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.705f, 170.744f)
                horizontalLineTo(149.372f)
                verticalLineToRelative(-21.333f)
                curveToRelative(-0.016f, -58.91f, 47.727f, -106.68f, 106.637f, -106.696f)
                curveToRelative(38.815f, -0.011f, 74.572f, 21.064f, 93.363f, 55.027f)
                curveToRelative(5.72f, 10.303f, 18.71f, 14.019f, 29.013f, 8.299f)
                curveToRelative(10.303f, -5.72f, 14.019f, -18.71f, 8.299f, -29.013f)
                curveToRelative(-39.949f, -72.153f, -130.826f, -98.26f, -202.98f, -58.311f)
                curveToRelative(-47.529f, 26.315f, -77.017f, 76.367f, -76.999f, 130.695f)
                verticalLineToRelative(30.379f)
                curveToRelative(-38.826f, 16.945f, -63.944f, 55.259f, -64.0f, 97.621f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.071f, 58.881f, 47.786f, 106.596f, 106.667f, 106.667f)
                horizontalLineToRelative(213.333f)
                curveToRelative(58.881f, -0.07f, 106.596f, -47.786f, 106.667f, -106.667f)
                verticalLineToRelative(-128.0f)
                curveTo(469.301f, 218.529f, 421.586f, 170.814f, 362.705f, 170.744f)
                close()
                moveTo(277.372f, 362.744f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                reflectiveCurveToRelative(-21.333f, -9.551f, -21.333f, -21.333f)
                verticalLineToRelative(-42.667f)
                curveToRelative(0.0f, -11.782f, 9.551f, -21.333f, 21.333f, -21.333f)
                reflectiveCurveToRelative(21.333f, 9.551f, 21.333f, 21.333f)
                verticalLineTo(362.744f)
                close()
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null
