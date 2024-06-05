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

public val Icons.Outline.Swap: ImageVector
    get() {
        if (_swap != null) {
            return _swap!!
        }
        _swap = Builder(name = "Swap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.955f, 19.609f)
                lineToRelative(-3.388f, 3.695f)
                curveToRelative(-0.394f, 0.438f, -0.967f, 0.695f, -1.567f, 0.695f)
                reflectiveCurveToRelative(-1.174f, -0.257f, -1.575f, -0.704f)
                lineToRelative(-3.416f, -3.727f)
                lineToRelative(1.475f, -1.352f)
                lineToRelative(2.517f, 2.707f)
                verticalLineToRelative(-12.424f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineTo(3.036f)
                lineToRelative(-2.48f, 2.706f)
                lineTo(0.045f, 4.391f)
                lineTo(3.433f, 0.695f)
                curveToRelative(0.787f, -0.877f, 2.34f, -0.886f, 3.143f, 0.009f)
                lineToRelative(3.416f, 3.727f)
                lineToRelative(-1.475f, 1.352f)
                lineToRelative(-2.517f, -2.707f)
                verticalLineToRelative(12.424f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(12.464f)
                lineToRelative(2.48f, -2.706f)
                lineToRelative(1.475f, 1.352f)
                close()
            }
        }
        .build()
        return _swap!!
    }

private var _swap: ImageVector? = null
