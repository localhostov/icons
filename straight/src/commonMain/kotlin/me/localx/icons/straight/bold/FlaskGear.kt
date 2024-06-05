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

public val Icons.Bold.FlaskGear: ImageVector
    get() {
        if (_flaskGear != null) {
            return _flaskGear!!
        }
        _flaskGear = Builder(name = "FlaskGear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 18.0f)
                curveToRelative(0.0f, -0.28f, -0.034f, -0.552f, -0.083f, -0.818f)
                lineToRelative(1.529f, -0.883f)
                lineToRelative(-1.5f, -2.599f)
                lineToRelative(-1.542f, 0.89f)
                curveToRelative(-0.412f, -0.352f, -0.883f, -0.629f, -1.404f, -0.815f)
                verticalLineToRelative(-1.776f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.776f)
                curveToRelative(-0.52f, 0.186f, -0.991f, 0.463f, -1.404f, 0.815f)
                lineToRelative(-1.542f, -0.89f)
                lineToRelative(-1.5f, 2.599f)
                lineToRelative(1.529f, 0.883f)
                curveToRelative(-0.049f, 0.266f, -0.083f, 0.538f, -0.083f, 0.818f)
                reflectiveCurveToRelative(0.034f, 0.552f, 0.083f, 0.818f)
                lineToRelative(-1.529f, 0.883f)
                lineToRelative(1.5f, 2.599f)
                lineToRelative(1.542f, -0.89f)
                curveToRelative(0.412f, 0.352f, 0.883f, 0.629f, 1.404f, 0.815f)
                verticalLineToRelative(1.776f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.776f)
                curveToRelative(0.521f, -0.186f, 0.992f, -0.463f, 1.404f, -0.815f)
                lineToRelative(1.542f, 0.89f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(-1.529f, -0.883f)
                curveToRelative(0.049f, -0.266f, 0.083f, -0.538f, 0.083f, -0.818f)
                close()
                moveTo(18.0f, 19.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.721f, 24.0f)
                lineTo(3.357f, 24.0f)
                curveToRelative(-1.157f, -0.408f, -3.357f, -1.882f, -3.357f, -4.5f)
                curveToRelative(0.0f, -4.302f, 5.173f, -9.13f, 7.0f, -10.701f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(13.0f)
                lineTo(18.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.799f)
                curveToRelative(0.349f, 0.3f, 0.822f, 0.721f, 1.356f, 1.233f)
                curveToRelative(-1.204f, 0.096f, -2.331f, 0.458f, -3.326f, 1.028f)
                curveToRelative(-0.162f, -0.139f, -0.32f, -0.27f, -0.473f, -0.394f)
                lineToRelative(-0.557f, -0.45f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.216f)
                lineToRelative(-0.558f, 0.451f)
                curveToRelative(-1.026f, 0.829f, -2.297f, 2.028f, -3.441f, 3.333f)
                horizontalLineToRelative(5.077f)
                curveToRelative(-0.523f, 0.904f, -0.875f, 1.917f, -1.01f, 3.0f)
                lineTo(3.818f, 17.0f)
                curveToRelative(-0.501f, 0.899f, -0.818f, 1.761f, -0.818f, 2.5f)
                curveToRelative(0.0f, 0.871f, 0.595f, 1.316f, 0.935f, 1.5f)
                horizontalLineToRelative(6.652f)
                curveToRelative(0.471f, 1.162f, 1.208f, 2.185f, 2.134f, 3.0f)
                close()
            }
        }
        .build()
        return _flaskGear!!
    }

private var _flaskGear: ImageVector? = null
