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

public val Icons.Bold.UtensilsSlash: ImageVector
    get() {
        if (_utensilsSlash != null) {
            return _utensilsSlash!!
        }
        _utensilsSlash = Builder(name = "UtensilsSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.05f, 10.0f)
                lineToRelative(2.95f, 2.95f)
                verticalLineToRelative(11.05f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4.55f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(1.55f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.55f)
                close()
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.05f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(3.05f)
                close()
                moveTo(24.011f, 21.89f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(-0.011f, 2.11f)
                lineTo(2.11f, -0.011f)
                lineToRelative(2.89f, 2.89f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.879f)
                lineToRelative(2.0f, 2.0f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.402f, -0.087f, 0.79f, -0.218f, 1.161f)
                lineToRelative(3.218f, 3.218f)
                lineTo(16.0f, 2.501f)
                curveToRelative(0.0f, -1.096f, 0.671f, -2.027f, 1.71f, -2.372f)
                curveToRelative(1.026f, -0.34f, 2.152f, 0.015f, 2.799f, 0.884f)
                curveToRelative(1.592f, 2.138f, 3.49f, 5.392f, 3.49f, 8.753f)
                curveToRelative(0.0f, 3.447f, -1.843f, 6.629f, -3.405f, 8.708f)
                lineToRelative(3.416f, 3.416f)
                close()
                moveTo(19.0f, 15.527f)
                curveToRelative(1.043f, -1.616f, 2.0f, -3.668f, 2.0f, -5.761f)
                curveToRelative(0.0f, -1.977f, -0.954f, -4.019f, -2.0f, -5.664f)
                verticalLineToRelative(11.424f)
                close()
            }
        }
        .build()
        return _utensilsSlash!!
    }

private var _utensilsSlash: ImageVector? = null
