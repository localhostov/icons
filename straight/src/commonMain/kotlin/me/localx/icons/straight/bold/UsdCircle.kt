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

public val Icons.Bold.UsdCircle: ImageVector
    get() {
        if (_usdCircle != null) {
            return _usdCircle!!
        }
        _usdCircle = Builder(name = "UsdCircle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.0f, 9.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.294f, 0.177f, 0.555f, 0.45f, 0.665f)
                lineToRelative(2.214f, 0.886f)
                curveToRelative(1.419f, 0.567f, 2.336f, 1.922f, 2.336f, 3.45f)
                curveToRelative(0.0f, 1.582f, -1.056f, 2.923f, -2.5f, 3.354f)
                verticalLineToRelative(1.146f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.146f)
                curveToRelative(-1.444f, -0.431f, -2.5f, -1.772f, -2.5f, -3.354f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                curveToRelative(0.0f, -0.294f, -0.177f, -0.555f, -0.45f, -0.664f)
                lineToRelative(-2.214f, -0.886f)
                curveToRelative(-1.419f, -0.567f, -2.336f, -1.922f, -2.336f, -3.45f)
                curveToRelative(0.0f, -1.582f, 1.056f, -2.923f, 2.5f, -3.354f)
                verticalLineToRelative(-1.146f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.146f)
                curveToRelative(1.444f, 0.431f, 2.5f, 1.772f, 2.5f, 3.354f)
                close()
            }
        }
        .build()
        return _usdCircle!!
    }

private var _usdCircle: ImageVector? = null
