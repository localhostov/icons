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

public val Icons.Filled.UxBrowser: ImageVector
    get() {
        if (_uxBrowser != null) {
            return _uxBrowser!!
        }
        _uxBrowser = Builder(name = "UxBrowser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 1.0f)
                curveTo(2.243f, 1.0f, 0.0f, 3.243f, 0.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(8.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(0.0f, 10.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.857f, 18.485f)
                curveToRelative(0.284f, 0.474f, 0.131f, 1.088f, -0.343f, 1.372f)
                curveToRelative(-0.161f, 0.097f, -0.338f, 0.143f, -0.514f, 0.143f)
                curveToRelative(-0.34f, 0.0f, -0.671f, -0.173f, -0.858f, -0.485f)
                lineToRelative(-0.643f, -1.071f)
                lineToRelative(-0.643f, 1.071f)
                curveToRelative(-0.188f, 0.312f, -0.519f, 0.485f, -0.858f, 0.485f)
                curveToRelative(-0.175f, 0.0f, -0.353f, -0.046f, -0.514f, -0.143f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.898f, -0.343f, -1.372f)
                lineToRelative(1.191f, -1.985f)
                lineToRelative(-1.191f, -1.985f)
                curveToRelative(-0.284f, -0.474f, -0.131f, -1.088f, 0.343f, -1.372f)
                curveToRelative(0.474f, -0.285f, 1.088f, -0.131f, 1.372f, 0.343f)
                lineToRelative(0.643f, 1.071f)
                lineToRelative(0.643f, -1.071f)
                curveToRelative(0.284f, -0.474f, 0.898f, -0.628f, 1.372f, -0.343f)
                curveToRelative(0.474f, 0.284f, 0.627f, 0.898f, 0.343f, 1.372f)
                lineToRelative(-1.191f, 1.985f)
                lineToRelative(1.191f, 1.985f)
                close()
            }
        }
        .build()
        return _uxBrowser!!
    }

private var _uxBrowser: ImageVector? = null
