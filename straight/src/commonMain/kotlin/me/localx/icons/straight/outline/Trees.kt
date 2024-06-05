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

public val Icons.Outline.Trees: ImageVector
    get() {
        if (_trees != null) {
            return _trees!!
        }
        _trees = Builder(name = "Trees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.005f, 21.0f)
                lineToRelative(-3.478f, -6.0f)
                horizontalLineToRelative(2.384f)
                lineToRelative(-3.958f, -6.0f)
                horizontalLineToRelative(2.154f)
                lineTo(16.377f, 0.991f)
                curveToRelative(-0.497f, -0.63f, -1.266f, -0.991f, -2.107f, -0.991f)
                reflectiveCurveToRelative(-1.612f, 0.362f, -2.108f, 0.992f)
                lineToRelative(-0.137f, 0.232f)
                lineToRelative(-0.147f, -0.232f)
                curveToRelative(-0.496f, -0.631f, -1.265f, -0.993f, -2.108f, -0.993f)
                reflectiveCurveToRelative(-1.611f, 0.362f, -2.108f, 0.992f)
                lineTo(2.93f, 9.0f)
                horizontalLineToRelative(2.155f)
                lineToRelative(-3.958f, 6.0f)
                horizontalLineToRelative(2.383f)
                lineTo(0.034f, 21.0f)
                horizontalLineToRelative(8.466f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.505f)
                close()
                moveTo(9.265f, 2.192f)
                curveToRelative(0.233f, -0.242f, 0.775f, -0.242f, 1.009f, 0.0f)
                lineToRelative(0.589f, 0.999f)
                lineToRelative(-2.25f, 3.809f)
                horizontalLineToRelative(-2.181f)
                lineToRelative(2.833f, -4.808f)
                close()
                moveTo(7.481f, 9.0f)
                horizontalLineToRelative(2.104f)
                lineToRelative(-2.638f, 4.0f)
                horizontalLineToRelative(-2.104f)
                lineToRelative(2.638f, -4.0f)
                close()
                moveTo(3.505f, 19.0f)
                lineToRelative(2.318f, -4.0f)
                horizontalLineToRelative(2.188f)
                lineToRelative(-2.318f, 4.0f)
                horizontalLineToRelative(-2.188f)
                close()
                moveTo(11.482f, 13.0f)
                horizontalLineToRelative(-2.139f)
                lineToRelative(3.958f, -6.0f)
                horizontalLineToRelative(-2.369f)
                lineToRelative(2.833f, -4.808f)
                curveToRelative(0.234f, -0.242f, 0.775f, -0.243f, 1.01f, 0.0f)
                lineToRelative(2.833f, 4.807f)
                horizontalLineToRelative(-2.369f)
                lineToRelative(3.958f, 6.0f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(3.478f, 6.0f)
                horizontalLineToRelative(-12.53f)
                lineToRelative(3.477f, -6.0f)
                close()
            }
        }
        .build()
        return _trees!!
    }

private var _trees: ImageVector? = null
