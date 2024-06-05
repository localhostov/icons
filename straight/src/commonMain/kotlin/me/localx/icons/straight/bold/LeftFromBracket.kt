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

public val Icons.Bold.LeftFromBracket: ImageVector
    get() {
        if (_leftFromBracket != null) {
            return _leftFromBracket!!
        }
        _leftFromBracket = Builder(name = "LeftFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.012f)
                horizontalLineToRelative(-7.0f)
                lineTo(11.0f, -0.026f)
                lineTo(0.969f, 9.677f)
                curveTo(0.344f, 10.3f, 0.0f, 11.129f, 0.0f, 12.011f)
                curveToRelative(0.0f, 0.882f, 0.346f, 1.71f, 0.971f, 2.332f)
                lineToRelative(10.029f, 9.683f)
                verticalLineToRelative(-7.026f)
                horizontalLineToRelative(7.0f)
                lineTo(18.0f, 7.012f)
                close()
                moveTo(15.0f, 14.012f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.948f)
                lineTo(3.081f, 12.21f)
                curveToRelative(-0.066f, -0.069f, -0.081f, -0.147f, -0.081f, -0.201f)
                curveToRelative(0.0f, -0.055f, 0.015f, -0.136f, 0.07f, -0.191f)
                lineToRelative(4.93f, -4.769f)
                verticalLineToRelative(2.951f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.012f)
                close()
                moveTo(24.0f, 3.5f)
                lineTo(24.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.5f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _leftFromBracket!!
    }

private var _leftFromBracket: ImageVector? = null
