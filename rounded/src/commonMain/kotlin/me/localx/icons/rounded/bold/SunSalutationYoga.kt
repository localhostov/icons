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

public val Icons.Bold.SunSalutationYoga: ImageVector
    get() {
        if (_sunSalutationYoga != null) {
            return _sunSalutationYoga!!
        }
        _sunSalutationYoga = Builder(name = "SunSalutationYoga", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 12.0f)
                curveToRelative(0.102f, 0.0f, -0.102f, 0.013f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(11.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(18.322f, 6.246f)
                curveToRelative(-0.692f, -0.454f, -1.622f, -0.261f, -2.077f, 0.432f)
                lineToRelative(-1.229f, 1.878f)
                reflectiveCurveToRelative(-1.282f, -1.484f, -1.321f, -1.52f)
                curveToRelative(-0.614f, -0.578f, -1.842f, -1.036f, -2.695f, -1.036f)
                curveToRelative(-1.577f, -0.008f, -3.0f, 1.549f, -3.0f, 3.148f)
                verticalLineToRelative(4.852f)
                curveToRelative(0.0f, 1.41f, 0.873f, 2.906f, 2.0f, 3.75f)
                verticalLineToRelative(4.75f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-11.689f)
                reflectiveCurveToRelative(0.409f, 0.472f, 0.433f, 0.496f)
                curveToRelative(0.443f, 0.449f, 0.949f, 0.692f, 1.567f, 0.692f)
                curveToRelative(0.729f, -0.094f, 1.742f, -0.534f, 2.062f, -1.094f)
                lineToRelative(1.693f, -2.583f)
                curveToRelative(0.454f, -0.693f, 0.261f, -1.623f, -0.433f, -2.077f)
                close()
            }
        }
        .build()
        return _sunSalutationYoga!!
    }

private var _sunSalutationYoga: ImageVector? = null
