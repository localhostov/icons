package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.HeadVr: ImageVector
    get() {
        if (_headVr != null) {
            return _headVr!!
        }
        _headVr = Builder(name = "HeadVr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.757f, 11.0f)
                curveToRelative(0.619f, 1.746f, 2.287f, 3.0f, 4.243f, 3.0f)
                horizontalLineToRelative(10.0f)
                lineTo(24.0f, 5.0f)
                horizontalLineToRelative(-3.703f)
                curveToRelative(-0.146f, -0.216f, -0.285f, -0.404f, -0.415f, -0.563f)
                curveTo(17.396f, 1.117f, 13.299f, -0.521f, 9.182f, 0.153f)
                curveTo(4.952f, 0.852f, 1.5f, 3.97f, 0.389f, 8.099f)
                curveToRelative(-0.938f, 3.486f, -0.114f, 7.118f, 2.262f, 9.962f)
                curveToRelative(0.226f, 0.271f, 0.35f, 0.609f, 0.35f, 0.954f)
                verticalLineToRelative(4.985f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.873f)
                curveToRelative(1.76f, 0.0f, 3.253f, -1.316f, 3.473f, -3.062f)
                lineToRelative(0.245f, -1.938f)
                horizontalLineToRelative(-3.024f)
                lineToRelative(-0.197f, 1.563f)
                curveToRelative(-0.031f, 0.249f, -0.244f, 0.437f, -0.496f, 0.437f)
                horizontalLineToRelative(-3.873f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-1.985f)
                curveToRelative(0.0f, -1.046f, -0.372f, -2.067f, -1.047f, -2.877f)
                curveToRelative(-1.257f, -1.505f, -1.923f, -3.302f, -1.94f, -5.138f)
                horizontalLineToRelative(6.744f)
                close()
                moveTo(21.0f, 11.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(9.67f, 3.114f)
                curveToRelative(2.424f, -0.399f, 4.843f, 0.303f, 6.658f, 1.886f)
                horizontalLineToRelative(-2.328f)
                curveToRelative(-1.956f, 0.0f, -3.624f, 1.254f, -4.243f, 3.0f)
                lineTo(3.581f, 8.0f)
                curveToRelative(1.025f, -2.523f, 3.372f, -4.438f, 6.089f, -4.886f)
                close()
            }
        }
        .build()
        return _headVr!!
    }

private var _headVr: ImageVector? = null
