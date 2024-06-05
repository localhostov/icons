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

public val Icons.Filled.Square7: ImageVector
    get() {
        if (_square7 != null) {
            return _square7!!
        }
        _square7 = Builder(name = "Square7", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(15.789f, 8.894f)
                lineToRelative(-4.921f, 8.603f)
                curveToRelative(-0.185f, 0.322f, -0.522f, 0.503f, -0.869f, 0.503f)
                curveToRelative(-0.168f, 0.0f, -0.339f, -0.042f, -0.496f, -0.132f)
                curveToRelative(-0.479f, -0.274f, -0.646f, -0.886f, -0.372f, -1.365f)
                lineTo(14.026f, 7.951f)
                lineToRelative(-5.026f, 0.049f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.698f, 0.0f, 1.334f, 0.354f, 1.701f, 0.948f)
                reflectiveCurveToRelative(0.4f, 1.321f, 0.088f, 1.946f)
                close()
            }
        }
        .build()
        return _square7!!
    }

private var _square7: ImageVector? = null
