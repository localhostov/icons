package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.FlyingDisc: ImageVector
    get() {
        if (_flyingDisc != null) {
            return _flyingDisc!!
        }
        _flyingDisc = Builder(name = "FlyingDisc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.064f, 17.068f)
                curveToRelative(-0.182f, -3.674f, 1.69f, -8.13f, 5.297f, -11.736f)
                curveTo(7.965f, 2.728f, 11.083f, 0.93f, 14.139f, 0.269f)
                curveTo(15.153f, 0.049f, 16.124f, -0.038f, 17.036f, 0.003f)
                curveToRelative(0.312f, 0.165f, 0.595f, 0.372f, 0.838f, 0.615f)
                curveToRelative(2.535f, 2.536f, 0.732f, 8.622f, -3.936f, 13.291f)
                curveToRelative(-4.668f, 4.667f, -10.753f, 6.472f, -13.291f, 3.936f)
                curveToRelative(-0.228f, -0.228f, -0.424f, -0.489f, -0.583f, -0.776f)
                close()
                moveTo(21.978f, 2.044f)
                curveToRelative(-0.454f, -0.454f, -0.965f, -0.834f, -1.526f, -1.139f)
                curveToRelative(1.668f, 3.737f, -0.293f, 9.61f, -5.1f, 14.418f)
                curveToRelative(-2.611f, 2.612f, -5.672f, 4.484f, -8.616f, 5.272f)
                curveToRelative(-1.013f, 0.271f, -1.977f, 0.405f, -2.874f, 0.405f)
                curveToRelative(-1.076f, 0.0f, -2.056f, -0.193f, -2.914f, -0.572f)
                curveToRelative(0.299f, 0.557f, 0.673f, 1.068f, 1.126f, 1.521f)
                curveToRelative(1.352f, 1.352f, 3.213f, 2.051f, 5.381f, 2.051f)
                curveToRelative(0.782f, 0.0f, 1.605f, -0.091f, 2.458f, -0.276f)
                curveToRelative(3.057f, -0.661f, 6.175f, -2.458f, 8.778f, -5.062f)
                curveToRelative(5.487f, -5.488f, 6.962f, -12.942f, 3.287f, -16.617f)
                close()
            }
        }
        .build()
        return _flyingDisc!!
    }

private var _flyingDisc: ImageVector? = null
