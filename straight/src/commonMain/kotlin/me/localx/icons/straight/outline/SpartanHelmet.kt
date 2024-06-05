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

public val Icons.Outline.SpartanHelmet: ImageVector
    get() {
        if (_spartanHelmet != null) {
            return _spartanHelmet!!
        }
        _spartanHelmet = Builder(name = "SpartanHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.429f, 14.475f)
                lineToRelative(-0.432f, 0.299f)
                verticalLineToRelative(9.285f)
                lineToRelative(9.829f, -2.384f)
                lineToRelative(-1.832f, -4.932f)
                curveToRelative(0.301f, -0.869f, 0.989f, -3.135f, 0.989f, -5.713f)
                curveTo(21.984f, 3.308f, 12.392f, 0.194f, 11.997f, 0.063f)
                curveToRelative(-0.395f, 0.13f, -9.972f, 3.225f, -9.972f, 10.967f)
                curveToRelative(0.0f, 2.577f, 0.688f, 4.841f, 0.989f, 5.712f)
                lineToRelative(-1.85f, 4.932f)
                lineToRelative(9.833f, 2.385f)
                lineTo(10.997f, 14.771f)
                lineToRelative(-0.431f, -0.298f)
                curveToRelative(-1.607f, -1.11f, -2.566f, -2.222f, -2.566f, -2.973f)
                curveToRelative(0.0f, -0.953f, 0.547f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.25f, 0.0f, 0.54f, 0.121f, 0.8f, 0.334f)
                lineToRelative(1.7f, 1.911f)
                lineToRelative(1.7f, -1.911f)
                curveToRelative(0.258f, -0.21f, 0.554f, -0.334f, 0.8f, -0.334f)
                curveToRelative(0.953f, 0.0f, 1.5f, 0.547f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.751f, -0.961f, 1.863f, -2.571f, 2.975f)
                close()
                moveTo(14.997f, 15.813f)
                curveToRelative(1.993f, -1.468f, 3.003f, -2.918f, 3.003f, -4.312f)
                curveToRelative(0.0f, -2.061f, -1.439f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.75f, 0.0f, -1.516f, 0.306f, -2.156f, 0.861f)
                lineToRelative(-0.344f, 0.374f)
                lineToRelative(-0.345f, -0.375f)
                curveToRelative(-0.64f, -0.555f, -1.405f, -0.86f, -2.155f, -0.86f)
                curveToRelative(-2.061f, 0.0f, -3.5f, 1.439f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.395f, 1.008f, 2.843f, 2.997f, 4.31f)
                verticalLineToRelative(5.706f)
                lineToRelative(-5.167f, -1.254f)
                lineToRelative(1.322f, -3.527f)
                lineToRelative(-0.143f, -0.358f)
                curveToRelative(-0.01f, -0.024f, -0.984f, -2.513f, -0.984f, -5.346f)
                curveToRelative(0.0f, -5.445f, 6.458f, -8.264f, 7.973f, -8.849f)
                curveToRelative(1.516f, 0.585f, 7.986f, 3.403f, 7.986f, 8.849f)
                curveToRelative(0.0f, 2.834f, -0.974f, 5.321f, -0.984f, 5.346f)
                lineToRelative(-0.142f, 0.358f)
                lineToRelative(1.311f, 3.526f)
                lineToRelative(-5.171f, 1.255f)
                verticalLineToRelative(-5.703f)
                close()
            }
        }
        .build()
        return _spartanHelmet!!
    }

private var _spartanHelmet: ImageVector? = null
