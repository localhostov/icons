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

public val Icons.Filled.Booking: ImageVector
    get() {
        if (_booking != null) {
            return _booking!!
        }
        _booking = Builder(name = "Booking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                curveTo(0.0f, 4.243f, 2.243f, 2.0f, 5.0f, 2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(20.838f, 18.82f)
                lineToRelative(-5.829f, -2.292f)
                verticalLineToRelative(-5.462f)
                curveToRelative(0.0f, -0.996f, -0.681f, -1.92f, -1.664f, -2.08f)
                curveToRelative(-1.253f, -0.204f, -2.336f, 0.758f, -2.336f, 1.973f)
                verticalLineToRelative(9.924f)
                curveToRelative(-1.076f, -0.886f, -2.111f, -1.752f, -2.145f, -1.784f)
                curveToRelative(-0.922f, -0.861f, -2.373f, -0.813f, -3.235f, 0.109f)
                curveToRelative(-0.863f, 0.923f, -0.819f, 2.372f, 0.098f, 3.23f)
                lineToRelative(1.821f, 1.628f)
                horizontalLineToRelative(16.462f)
                verticalLineToRelative(-0.593f)
                curveToRelative(0.0f, -2.055f, -1.258f, -3.901f, -3.171f, -4.653f)
                close()
                moveTo(9.008f, 16.838f)
                verticalLineToRelative(-5.878f)
                curveToRelative(0.0f, -0.7f, 0.201f, -1.366f, 0.538f, -1.96f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.114f, 1.324f, 3.916f, 3.183f, 4.646f)
                curveToRelative(0.177f, -0.653f, 0.492f, -1.276f, 0.985f, -1.803f)
                curveToRelative(1.269f, -1.359f, 3.224f, -1.707f, 4.841f, -1.005f)
                close()
                moveTo(20.707f, 16.62f)
                curveToRelative(0.177f, -0.511f, 0.293f, -1.05f, 0.293f, -1.62f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.54f)
                curveToRelative(0.349f, 0.613f, 0.549f, 1.322f, 0.549f, 2.067f)
                verticalLineToRelative(4.099f)
                lineToRelative(3.699f, 1.454f)
                close()
            }
        }
        .build()
        return _booking!!
    }

private var _booking: ImageVector? = null
