package me.localx.icons.rounded.bold

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

public val Icons.Bold.Productivity: ImageVector
    get() {
        if (_productivity != null) {
            return _productivity!!
        }
        _productivity = Builder(name = "Productivity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.373f, 9.512f)
                curveToRelative(0.549f, 0.549f, 0.16f, 1.488f, -0.616f, 1.488f)
                horizontalLineToRelative(-1.257f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1.257f)
                curveToRelative(-0.776f, 0.0f, -1.165f, -0.939f, -0.616f, -1.488f)
                lineToRelative(2.757f, -2.757f)
                curveToRelative(0.34f, -0.34f, 0.892f, -0.34f, 1.233f, 0.0f)
                lineToRelative(2.757f, 2.757f)
                close()
                moveTo(22.392f, 18.0f)
                curveToRelative(-0.277f, 0.481f, -0.782f, 0.75f, -1.3f, 0.75f)
                curveToRelative(-0.255f, 0.0f, -0.513f, -0.064f, -0.749f, -0.201f)
                lineToRelative(-0.54f, -0.312f)
                curveToRelative(-1.537f, 1.919f, -3.765f, 3.253f, -6.303f, 3.638f)
                verticalLineToRelative(0.625f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-0.625f)
                curveToRelative(-2.539f, -0.385f, -4.766f, -1.719f, -6.303f, -3.638f)
                lineToRelative(-0.54f, 0.312f)
                curveToRelative(-0.236f, 0.137f, -0.494f, 0.201f, -0.749f, 0.201f)
                curveToRelative(-0.519f, 0.0f, -1.022f, -0.269f, -1.3f, -0.75f)
                curveToRelative(-0.415f, -0.718f, -0.168f, -1.635f, 0.549f, -2.049f)
                lineToRelative(0.539f, -0.311f)
                curveToRelative(-0.444f, -1.13f, -0.696f, -2.355f, -0.696f, -3.64f)
                reflectiveCurveToRelative(0.252f, -2.51f, 0.696f, -3.64f)
                lineToRelative(-0.539f, -0.311f)
                curveToRelative(-0.717f, -0.414f, -0.963f, -1.331f, -0.549f, -2.049f)
                curveToRelative(0.415f, -0.717f, 1.331f, -0.964f, 2.049f, -0.549f)
                lineToRelative(0.54f, 0.312f)
                curveToRelative(1.537f, -1.919f, 3.765f, -3.253f, 6.303f, -3.638f)
                verticalLineToRelative(-0.625f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(0.625f)
                curveToRelative(2.539f, 0.385f, 4.766f, 1.719f, 6.303f, 3.638f)
                lineToRelative(0.54f, -0.312f)
                curveToRelative(0.717f, -0.414f, 1.635f, -0.169f, 2.049f, 0.549f)
                reflectiveCurveToRelative(0.169f, 1.635f, -0.549f, 2.049f)
                lineToRelative(-0.54f, 0.311f)
                curveToRelative(0.444f, 1.13f, 0.696f, 2.355f, 0.696f, 3.64f)
                reflectiveCurveToRelative(-0.252f, 2.51f, -0.696f, 3.64f)
                lineToRelative(0.54f, 0.311f)
                curveToRelative(0.718f, 0.414f, 0.963f, 1.331f, 0.549f, 2.049f)
                close()
                moveTo(18.999f, 12.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _productivity!!
    }

private var _productivity: ImageVector? = null
