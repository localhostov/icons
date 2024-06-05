package me.localx.icons.straight.filled

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
                moveToRelative(21.0f, 1.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(0.0f, 10.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(11.6f, 17.2f)
                curveToRelative(0.0f, 1.544f, -1.256f, 2.8f, -2.8f, 2.8f)
                reflectiveCurveToRelative(-2.8f, -1.256f, -2.8f, -2.8f)
                verticalLineToRelative(-4.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(4.2f)
                curveToRelative(0.0f, 0.662f, 0.539f, 1.2f, 1.2f, 1.2f)
                reflectiveCurveToRelative(1.2f, -0.538f, 1.2f, -1.2f)
                verticalLineToRelative(-4.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(4.2f)
                close()
                moveTo(18.3f, 20.0f)
                horizontalLineToRelative(-1.829f)
                lineToRelative(-1.012f, -1.848f)
                lineToRelative(-1.029f, 1.848f)
                horizontalLineToRelative(-1.829f)
                lineToRelative(1.944f, -3.5f)
                lineToRelative(-1.944f, -3.5f)
                horizontalLineToRelative(1.829f)
                lineToRelative(1.029f, 1.848f)
                lineToRelative(1.012f, -1.848f)
                horizontalLineToRelative(1.829f)
                lineToRelative(-1.927f, 3.5f)
                lineToRelative(1.927f, 3.5f)
                close()
            }
        }
        .build()
        return _uxBrowser!!
    }

private var _uxBrowser: ImageVector? = null
