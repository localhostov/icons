package me.localx.icons.straight.outline

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

public val Icons.Outline.Hr: ImageVector
    get() {
        if (_hr != null) {
            return _hr!!
        }
        _hr = Builder(name = "Hr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(4.5f, 14.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(19.5f, 17.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.496f, 0.0f, 0.9f, 0.404f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.404f, 0.9f, -0.9f, 0.9f)
                close()
                moveTo(21.0f, 12.0f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(16.0f, 22.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-3.205f)
                horizontalLineToRelative(-1.8f)
                verticalLineToRelative(3.205f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(3.195f)
                horizontalLineToRelative(1.8f)
                verticalLineToRelative(-3.195f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(20.988f, 18.509f)
                curveToRelative(-0.018f, 0.012f, -0.018f, 0.012f, -0.042f, 0.029f)
                lineToRelative(1.054f, 3.462f)
                horizontalLineToRelative(-1.744f)
                lineToRelative(-0.872f, -3.0f)
                horizontalLineToRelative(-0.784f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.846f, -0.423f, 1.592f, -1.067f, 2.044f)
                curveToRelative(0.024f, -0.014f, 0.036f, -0.023f, 0.055f, -0.035f)
                close()
            }
        }
        .build()
        return _hr!!
    }

private var _hr: ImageVector? = null
