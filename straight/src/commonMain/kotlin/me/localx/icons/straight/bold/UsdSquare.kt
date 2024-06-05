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

public val Icons.Bold.UsdSquare: ImageVector
    get() {
        if (_usdSquare != null) {
            return _usdSquare!!
        }
        _usdSquare = Builder(name = "UsdSquare", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                lineTo(21.0f, 21.0f)
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
        return _usdSquare!!
    }

private var _usdSquare: ImageVector? = null
