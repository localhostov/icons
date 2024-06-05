package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.016f, viewportHeight = 512.016f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.008f, 42.675f)
                curveToRelative(57.16f, 0.188f, 111.87f, 23.233f, 151.936f, 64.0f)
                horizontalLineToRelative(-66.603f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                reflectiveCurveToRelative(9.551f, 21.333f, 21.333f, 21.333f)
                horizontalLineToRelative(88.384f)
                curveToRelative(21.874f, -0.012f, 39.604f, -17.742f, 39.616f, -39.616f)
                verticalLineTo(21.341f)
                curveToRelative(0.0f, -11.782f, -9.551f, -21.333f, -21.333f, -21.333f)
                reflectiveCurveToRelative(-21.333f, 9.551f, -21.333f, 21.333f)
                verticalLineToRelative(44.331f)
                curveTo(321.782f, -28.795f, 160.169f, -20.343f, 65.702f, 84.55f)
                curveTo(28.733f, 125.6f, 6.058f, 177.523f, 1.075f, 232.541f)
                curveToRelative(-1.096f, 11.814f, 7.593f, 22.279f, 19.407f, 23.375f)
                curveToRelative(0.64f, 0.059f, 1.283f, 0.09f, 1.927f, 0.092f)
                curveToRelative(10.813f, 0.138f, 19.954f, -7.977f, 21.099f, -18.731f)
                curveTo(53.35f, 127.213f, 145.505f, 42.82f, 256.008f, 42.675f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(489.629f, 256.008f)
                curveToRelative(-10.813f, -0.138f, -19.954f, 7.977f, -21.099f, 18.731f)
                curveTo(458.35f, 391.953f, 355.076f, 478.721f, 237.861f, 468.54f)
                curveToRelative(-50.715f, -4.405f, -98.176f, -26.825f, -133.789f, -63.199f)
                horizontalLineToRelative(66.603f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveToRelative(0.0f, -11.782f, -9.551f, -21.333f, -21.333f, -21.333f)
                horizontalLineTo(82.291f)
                curveToRelative(-21.868f, -0.012f, -39.604f, 17.706f, -39.616f, 39.573f)
                curveToRelative(0.0f, 0.014f, 0.0f, 0.028f, 0.0f, 0.043f)
                verticalLineToRelative(88.384f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                reflectiveCurveToRelative(21.333f, -9.551f, 21.333f, -21.333f)
                verticalLineToRelative(-44.331f)
                curveToRelative(104.893f, 94.467f, 266.505f, 86.015f, 360.972f, -18.878f)
                curveToRelative(36.97f, -41.05f, 59.645f, -92.973f, 64.628f, -147.992f)
                curveToRelative(1.096f, -11.814f, -7.593f, -22.279f, -19.407f, -23.375f)
                curveTo(490.901f, 256.041f, 490.265f, 256.01f, 489.629f, 256.008f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
