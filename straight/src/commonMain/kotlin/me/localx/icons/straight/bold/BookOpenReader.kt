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

public val Icons.Bold.BookOpenReader: ImageVector
    get() {
        if (_bookOpenReader != null) {
            return _bookOpenReader!!
        }
        _bookOpenReader = Builder(name = "BookOpenReader", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.775f, 9.792f)
                curveToRelative(-0.778f, -0.649f, -1.8f, -0.917f, -2.795f, -0.737f)
                lineToRelative(-5.897f, 1.072f)
                curveToRelative(-0.795f, 0.145f, -1.507f, 0.499f, -2.083f, 1.0f)
                curveToRelative(-0.576f, -0.501f, -1.288f, -0.855f, -2.083f, -1.0f)
                lineToRelative(-5.898f, -1.073f)
                curveToRelative(-0.997f, -0.179f, -2.015f, 0.087f, -2.794f, 0.737f)
                curveToRelative(-0.778f, 0.649f, -1.225f, 1.604f, -1.225f, 2.617f)
                verticalLineToRelative(9.433f)
                lineToRelative(12.0f, 2.182f)
                lineToRelative(12.0f, -2.182f)
                lineTo(24.0f, 12.41f)
                curveToRelative(0.0f, -1.014f, -0.446f, -1.967f, -1.225f, -2.617f)
                close()
                moveTo(10.5f, 20.702f)
                lineToRelative(-7.5f, -1.364f)
                verticalLineToRelative(-6.929f)
                curveToRelative(0.0f, -0.167f, 0.092f, -0.268f, 0.147f, -0.314f)
                curveToRelative(0.055f, -0.046f, 0.169f, -0.117f, 0.335f, -0.089f)
                lineToRelative(5.898f, 1.072f)
                curveToRelative(0.648f, 0.118f, 1.12f, 0.683f, 1.12f, 1.342f)
                verticalLineToRelative(6.281f)
                close()
                moveTo(21.0f, 19.338f)
                lineToRelative(-7.5f, 1.364f)
                verticalLineToRelative(-6.281f)
                curveToRelative(0.0f, -0.66f, 0.471f, -1.224f, 1.12f, -1.342f)
                lineToRelative(5.897f, -1.072f)
                curveToRelative(0.166f, -0.033f, 0.28f, 0.042f, 0.335f, 0.088f)
                curveToRelative(0.056f, 0.046f, 0.147f, 0.147f, 0.147f, 0.314f)
                verticalLineToRelative(6.929f)
                close()
                moveTo(7.5f, 4.5f)
                curveTo(7.5f, 2.015f, 9.515f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.015f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.015f, -4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _bookOpenReader!!
    }

private var _bookOpenReader: ImageVector? = null
