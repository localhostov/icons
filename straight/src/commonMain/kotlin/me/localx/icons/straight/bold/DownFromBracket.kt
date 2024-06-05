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

public val Icons.Bold.DownFromBracket: ImageVector
    get() {
        if (_downFromBracket != null) {
            return _downFromBracket!!
        }
        _downFromBracket = Builder(name = "DownFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(20.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(24.026f, 13.0f)
                lineToRelative(-9.688f, 10.016f)
                curveToRelative(-0.638f, 0.641f, -1.466f, 0.984f, -2.348f, 0.984f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.882f, 0.0f, -1.71f, -0.346f, -2.332f, -0.971f)
                lineToRelative(-0.015f, -0.016f)
                lineTo(-0.026f, 13.0f)
                lineTo(7.0f, 13.0f)
                lineTo(7.0f, 6.0f)
                horizontalLineToRelative(9.988f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.038f)
                close()
                moveTo(16.951f, 16.0f)
                horizontalLineToRelative(-2.951f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-4.012f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.948f)
                lineToRelative(4.749f, 4.919f)
                curveToRelative(0.069f, 0.066f, 0.147f, 0.081f, 0.201f, 0.081f)
                curveToRelative(0.056f, 0.0f, 0.136f, -0.015f, 0.207f, -0.086f)
                lineToRelative(4.753f, -4.914f)
                close()
            }
        }
        .build()
        return _downFromBracket!!
    }

private var _downFromBracket: ImageVector? = null
