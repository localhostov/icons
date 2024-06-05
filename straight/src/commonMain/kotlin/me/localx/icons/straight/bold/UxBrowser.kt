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

public val Icons.Bold.UxBrowser: ImageVector
    get() {
        if (_uxBrowser != null) {
            return _uxBrowser!!
        }
        _uxBrowser = Builder(name = "UxBrowser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 1.0f)
                lineTo(3.5f, 1.0f)
                curveTo(1.57f, 1.0f, 0.0f, 2.57f, 0.0f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 3.0f)
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
                moveTo(21.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(4.5f, 14.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4.333f)
                curveToRelative(0.0f, 0.643f, 0.357f, 1.167f, 1.0f, 1.167f)
                reflectiveCurveToRelative(1.0f, -0.523f, 1.0f, -1.167f)
                verticalLineToRelative(-4.333f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(12.5f, 18.0f)
                lineToRelative(2.214f, -4.0f)
                lineToRelative(-0.005f, -0.01f)
                lineToRelative(-2.209f, -3.99f)
                horizontalLineToRelative(2.572f)
                lineToRelative(0.922f, 1.667f)
                lineToRelative(0.005f, 0.009f)
                lineToRelative(0.005f, -0.009f)
                lineToRelative(0.922f, -1.667f)
                horizontalLineToRelative(2.572f)
                lineToRelative(-2.209f, 3.99f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(2.214f, 4.0f)
                horizontalLineToRelative(-2.572f)
                lineToRelative(-0.928f, -1.676f)
                lineToRelative(-0.928f, 1.676f)
                horizontalLineToRelative(-2.572f)
                close()
            }
        }
        .build()
        return _uxBrowser!!
    }

private var _uxBrowser: ImageVector? = null
