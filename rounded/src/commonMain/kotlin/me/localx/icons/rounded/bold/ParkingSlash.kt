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

public val Icons.Bold.ParkingSlash: ImageVector
    get() {
        if (_parkingSlash != null) {
            return _parkingSlash!!
        }
        _parkingSlash = Builder(name = "ParkingSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 14.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.468f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(5.5f, 3.0f)
                curveToRelative(-0.12f, 0.0f, -0.238f, 0.009f, -0.353f, 0.025f)
                lineToRelative(3.234f, 3.234f)
                curveToRelative(0.821f, -0.789f, 1.932f, -1.259f, 3.12f, -1.259f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.58f, -0.753f, 3.02f, -1.935f, 3.944f)
                lineToRelative(4.91f, 4.91f)
                curveToRelative(0.016f, -0.116f, 0.025f, -0.233f, 0.025f, -0.353f)
                lineTo(21.001f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                close()
                moveTo(15.0f, 10.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.376f, 0.0f, -0.729f, 0.141f, -0.998f, 0.381f)
                lineToRelative(3.403f, 3.403f)
                curveToRelative(0.653f, -0.334f, 1.096f, -1.017f, 1.096f, -1.783f)
                close()
                moveTo(18.5f, 21.0f)
                curveToRelative(0.12f, 0.0f, 0.238f, -0.009f, 0.353f, -0.025f)
                lineTo(3.025f, 5.147f)
                curveToRelative(-0.016f, 0.116f, -0.025f, 0.233f, -0.025f, 0.353f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _parkingSlash!!
    }

private var _parkingSlash: ImageVector? = null
