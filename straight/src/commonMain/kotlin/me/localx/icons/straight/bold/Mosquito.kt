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

public val Icons.Bold.Mosquito: ImageVector
    get() {
        if (_mosquito != null) {
            return _mosquito!!
        }
        _mosquito = Builder(name = "Mosquito", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.894f, 13.849f)
                curveToRelative(-0.429f, 1.564f, -2.046f, 2.484f, -3.61f, 2.055f)
                curveToRelative(-1.013f, -0.278f, -3.771f, -2.674f, -5.588f, -4.326f)
                lineToRelative(4.303f, 6.47f)
                verticalLineToRelative(2.53f)
                lineToRelative(1.4f, 1.05f)
                lineToRelative(-1.801f, 2.4f)
                lineToRelative(-2.6f, -1.95f)
                verticalLineToRelative(-3.124f)
                lineToRelative(-2.5f, -3.759f)
                verticalLineToRelative(4.805f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.805f)
                lineToRelative(-2.5f, 3.759f)
                verticalLineToRelative(3.124f)
                lineToRelative(-2.6f, 1.95f)
                lineToRelative(-1.801f, -2.4f)
                lineToRelative(1.4f, -1.05f)
                verticalLineToRelative(-2.53f)
                lineToRelative(4.303f, -6.47f)
                curveToRelative(-1.817f, 1.653f, -4.574f, 4.048f, -5.588f, 4.326f)
                curveToRelative(-1.564f, 0.429f, -3.18f, -0.49f, -3.61f, -2.055f)
                curveToRelative(-0.429f, -1.564f, 0.49f, -3.18f, 2.055f, -3.61f)
                curveToRelative(0.991f, -0.272f, 4.276f, -0.295f, 6.549f, -0.276f)
                lineToRelative(-4.709f, -3.421f)
                verticalLineToRelative(-2.516f)
                lineToRelative(-1.671f, -2.089f)
                lineTo(4.671f, 0.063f)
                lineToRelative(2.329f, 2.911f)
                verticalLineToRelative(2.04f)
                lineToRelative(3.5f, 2.543f)
                verticalLineToRelative(-0.056f)
                curveToRelative(-0.607f, -0.456f, -1.0f, -1.182f, -1.0f, -2.0f)
                curveToRelative(0.0f, -1.071f, 0.674f, -1.985f, 1.621f, -2.341f)
                lineToRelative(0.879f, -3.159f)
                lineToRelative(0.879f, 3.159f)
                curveToRelative(0.947f, 0.356f, 1.621f, 1.269f, 1.621f, 2.341f)
                curveToRelative(0.0f, 0.818f, -0.393f, 1.544f, -1.0f, 2.0f)
                verticalLineToRelative(0.056f)
                lineToRelative(3.5f, -2.543f)
                verticalLineToRelative(-2.04f)
                lineTo(19.329f, 0.063f)
                lineToRelative(2.342f, 1.874f)
                lineToRelative(-1.671f, 2.089f)
                verticalLineToRelative(2.516f)
                lineToRelative(-4.709f, 3.421f)
                curveToRelative(2.273f, -0.019f, 5.558f, 0.004f, 6.549f, 0.276f)
                curveToRelative(1.564f, 0.429f, 2.484f, 2.046f, 2.055f, 3.61f)
                close()
            }
        }
        .build()
        return _mosquito!!
    }

private var _mosquito: ImageVector? = null
