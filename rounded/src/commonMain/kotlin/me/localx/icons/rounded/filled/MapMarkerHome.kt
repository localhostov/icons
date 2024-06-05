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

public val Icons.Filled.MapMarkerHome: ImageVector
    get() {
        if (_mapMarkerHome != null) {
            return _mapMarkerHome!!
        }
        _mapMarkerHome = Builder(name = "MapMarkerHome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.049f, 69.426f)
                curveToRelative(-91.066f, -91.918f, -239.404f, -92.609f, -331.322f, -1.542f)
                reflectiveCurveToRelative(-92.609f, 239.404f, -1.542f, 331.322f)
                curveToRelative(0.71f, 0.716f, 1.424f, 1.428f, 2.143f, 2.135f)
                lineToRelative(83.98f, 77.548f)
                curveToRelative(44.886f, 43.938f, 116.602f, 44.127f, 161.719f, 0.426f)
                lineToRelative(85.023f, -78.57f)
                curveTo(513.538f, 309.253f, 513.538f, 160.919f, 422.049f, 69.426f)
                lineTo(422.049f, 69.426f)
                close()
                moveTo(384.181f, 288.332f)
                curveToRelative(0.0f, 29.407f, -23.839f, 53.246f, -53.246f, 53.246f)
                horizontalLineTo(181.846f)
                curveToRelative(-29.407f, 0.0f, -53.246f, -23.839f, -53.246f, -53.246f)
                verticalLineToRelative(-71.818f)
                curveToRelative(0.0f, -20.946f, 10.265f, -40.562f, 27.475f, -52.501f)
                lineToRelative(63.895f, -44.322f)
                curveToRelative(21.918f, -15.146f, 50.922f, -15.146f, 72.841f, 0.0f)
                lineToRelative(63.895f, 44.322f)
                curveToRelative(17.21f, 11.939f, 27.475f, 31.555f, 27.475f, 52.501f)
                verticalLineTo(288.332f)
                close()
                moveTo(341.584f, 216.513f)
                verticalLineToRelative(71.818f)
                curveToRelative(0.0f, 5.881f, -4.768f, 10.649f, -10.649f, 10.649f)
                horizontalLineToRelative(-31.948f)
                verticalLineToRelative(-42.597f)
                curveToRelative(0.0f, -11.763f, -9.536f, -21.298f, -21.298f, -21.298f)
                horizontalLineToRelative(-42.597f)
                curveToRelative(-11.763f, 0.0f, -21.298f, 9.536f, -21.298f, 21.298f)
                verticalLineToRelative(42.597f)
                horizontalLineToRelative(-31.948f)
                curveToRelative(-5.881f, 0.0f, -10.649f, -4.768f, -10.649f, -10.649f)
                verticalLineToRelative(-71.818f)
                curveToRelative(-0.002f, -6.984f, 3.42f, -13.526f, 9.158f, -17.507f)
                lineToRelative(63.895f, -44.322f)
                curveToRelative(7.312f, -5.028f, 16.968f, -5.028f, 24.28f, 0.0f)
                lineToRelative(63.895f, 44.322f)
                curveTo(338.164f, 202.987f, 341.586f, 209.529f, 341.584f, 216.513f)
                close()
            }
        }
        .build()
        return _mapMarkerHome!!
    }

private var _mapMarkerHome: ImageVector? = null
