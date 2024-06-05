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

public val Icons.Outline.HouseTree: ImageVector
    get() {
        if (_houseTree != null) {
            return _houseTree!!
        }
        _houseTree = Builder(name = "HouseTree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.849f, 12.747f)
                lineToRelative(-5.448f, -4.264f)
                curveToRelative(-0.824f, -0.646f, -1.977f, -0.646f, -2.801f, 0.0f)
                lineTo(1.151f, 12.746f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(8.891f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 15.109f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
                moveTo(14.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-6.891f)
                curveToRelative(0.0f, -0.31f, 0.14f, -0.597f, 0.384f, -0.788f)
                lineToRelative(5.448f, -4.264f)
                curveToRelative(0.099f, -0.076f, 0.237f, -0.076f, 0.336f, 0.0f)
                lineToRelative(5.448f, 4.265f)
                curveToRelative(0.244f, 0.19f, 0.384f, 0.478f, 0.384f, 0.787f)
                verticalLineToRelative(6.891f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(2.665f)
                lineToRelative(-3.711f, -7.0f)
                horizontalLineToRelative(2.043f)
                lineToRelative(-3.673f, -6.0f)
                horizontalLineToRelative(2.746f)
                lineToRelative(-3.625f, -6.821f)
                curveToRelative(-0.127f, -0.154f, -0.292f, -0.179f, -0.383f, -0.179f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.088f, 0.0f, -0.247f, 0.024f, -0.372f, 0.166f)
                lineToRelative(-2.466f, 5.204f)
                lineToRelative(-0.588f, -0.46f)
                curveToRelative(-0.344f, -0.27f, -0.722f, -0.47f, -1.114f, -0.621f)
                curveToRelative(0.0f, 0.0f, 2.506f, -5.243f, 2.512f, -5.251f)
                curveToRelative(0.469f, -0.651f, 1.224f, -1.038f, 2.028f, -1.038f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.817f, 0.0f, 1.584f, 0.4f, 2.051f, 1.071f)
                lineToRelative(5.285f, 9.929f)
                horizontalLineToRelative(-2.504f)
                lineToRelative(3.673f, 6.0f)
                horizontalLineToRelative(-2.288f)
                lineToRelative(3.71f, 7.0f)
                horizontalLineToRelative(-5.988f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _houseTree!!
    }

private var _houseTree: ImageVector? = null
