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

public val Icons.Bold.Radiation: ImageVector
    get() {
        if (_radiation != null) {
            return _radiation!!
        }
        _radiation = Builder(name = "Radiation", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.98f, 10.635f)
                lineToRelative(0.123f, 1.365f)
                horizontalLineToRelative(7.938f)
                lineToRelative(-0.08f, -1.576f)
                curveToRelative(-0.2f, -3.941f, -2.331f, -7.53f, -5.7f, -9.602f)
                lineToRelative(-1.277f, -0.784f)
                lineToRelative(-4.167f, 6.771f)
                lineToRelative(1.274f, 0.787f)
                curveToRelative(1.071f, 0.661f, 1.777f, 1.797f, 1.889f, 3.038f)
                close()
                moveTo(17.902f, 4.271f)
                curveToRelative(1.422f, 1.241f, 2.416f, 2.896f, 2.842f, 4.729f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-0.345f, -1.147f, -0.983f, -2.194f, -1.847f, -3.03f)
                lineToRelative(1.045f, -1.699f)
                close()
                moveTo(14.054f, 14.426f)
                curveToRelative(-1.25f, 0.752f, -2.859f, 0.752f, -4.109f, 0.0f)
                lineToRelative(-1.286f, -0.772f)
                lineToRelative(-4.119f, 6.866f)
                lineToRelative(1.278f, 0.773f)
                curveToRelative(1.88f, 1.138f, 4.018f, 1.739f, 6.182f, 1.739f)
                reflectiveCurveToRelative(4.304f, -0.602f, 6.183f, -1.739f)
                lineToRelative(1.278f, -0.773f)
                lineToRelative(-4.12f, -6.866f)
                lineToRelative(-1.286f, 0.772f)
                close()
                moveTo(8.712f, 19.395f)
                lineToRelative(1.058f, -1.763f)
                curveToRelative(1.434f, 0.486f, 3.024f, 0.486f, 4.46f, 0.0f)
                lineToRelative(1.058f, 1.764f)
                curveToRelative(-2.1f, 0.838f, -4.478f, 0.839f, -6.575f, 0.0f)
                close()
                moveTo(8.019f, 10.635f)
                curveToRelative(0.11f, -1.233f, 0.81f, -2.364f, 1.868f, -3.025f)
                lineToRelative(1.265f, -0.789f)
                lineTo(6.979f, 0.037f)
                lineToRelative(-1.277f, 0.785f)
                curveTo(2.333f, 2.894f, 0.202f, 6.482f, 0.002f, 10.424f)
                lineToRelative(-0.08f, 1.576f)
                horizontalLineToRelative(7.975f)
                lineToRelative(0.123f, -1.365f)
                close()
                moveTo(5.295f, 9.0f)
                horizontalLineToRelative(-2.076f)
                curveToRelative(0.426f, -1.832f, 1.42f, -3.488f, 2.842f, -4.729f)
                lineToRelative(1.059f, 1.721f)
                curveToRelative(-0.852f, 0.832f, -1.482f, 1.871f, -1.824f, 3.009f)
                close()
                moveTo(11.999f, 9.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _radiation!!
    }

private var _radiation: ImageVector? = null
