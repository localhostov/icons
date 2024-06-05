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

public val Icons.Filled.PlateUtensils: ImageVector
    get() {
        if (_plateUtensils != null) {
            return _plateUtensils!!
        }
        _plateUtensils = Builder(name = "PlateUtensils", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.414f, -1.721f, 4.434f, -4.0f, 4.899f)
                verticalLineToRelative(11.101f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-11.101f)
                curveToRelative(-2.279f, -0.465f, -4.0f, -2.484f, -4.0f, -4.899f)
                lineTo(14.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.302f, 0.839f, 2.402f, 2.0f, 2.816f)
                lineTo(18.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.816f)
                curveToRelative(1.161f, -0.414f, 2.0f, -1.514f, 2.0f, -2.816f)
                lineTo(22.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(16.0f, 18.918f)
                curveToRelative(-1.178f, 0.684f, -2.542f, 1.082f, -4.0f, 1.082f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(7.589f, 4.0f, 12.0f, 4.0f)
                lineTo(12.0f, 1.0f)
                curveToRelative(0.0f, -0.349f, 0.071f, -0.679f, 0.181f, -0.991f)
                curveToRelative(-0.061f, 0.0f, -0.12f, -0.009f, -0.181f, -0.009f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.416f, 0.0f, 2.768f, -0.258f, 4.029f, -0.708f)
                curveToRelative(-0.01f, -0.097f, -0.029f, -0.192f, -0.029f, -0.292f)
                verticalLineToRelative(-4.082f)
                close()
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.538f, 0.0f, 2.937f, -0.586f, 4.0f, -1.54f)
                verticalLineToRelative(-3.145f)
                curveToRelative(-2.361f, -1.126f, -4.0f, -3.53f, -4.0f, -6.315f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _plateUtensils!!
    }

private var _plateUtensils: ImageVector? = null
