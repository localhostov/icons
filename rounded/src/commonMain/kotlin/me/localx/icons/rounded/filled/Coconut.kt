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

public val Icons.Filled.Coconut: ImageVector
    get() {
        if (_coconut != null) {
            return _coconut!!
        }
        _coconut = Builder(name = "Coconut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.686f, 16.333f)
                curveToRelative(-0.724f, -0.724f, -0.864f, -2.161f, -0.374f, -3.845f)
                curveToRelative(0.505f, -1.735f, 1.62f, -3.527f, 3.14f, -5.045f)
                curveToRelative(1.675f, -1.674f, 3.707f, -2.871f, 5.575f, -3.283f)
                curveToRelative(1.442f, -0.315f, 2.672f, -0.129f, 3.32f, 0.519f)
                curveToRelative(0.725f, 0.725f, 0.865f, 2.162f, 0.375f, 3.846f)
                curveToRelative(-0.504f, 1.735f, -1.619f, 3.527f, -3.139f, 5.045f)
                curveToRelative(-1.676f, 1.674f, -3.708f, 2.871f, -5.575f, 3.283f)
                curveToRelative(-0.466f, 0.102f, -0.906f, 0.152f, -1.311f, 0.152f)
                curveToRelative(-0.865f, 0.0f, -1.567f, -0.229f, -2.012f, -0.672f)
                close()
                moveTo(24.012f, 11.648f)
                curveToRelative(0.0f, 3.301f, -1.285f, 6.404f, -3.62f, 8.738f)
                curveToRelative(-2.409f, 2.409f, -5.574f, 3.614f, -8.738f, 3.614f)
                reflectiveCurveToRelative(-6.329f, -1.204f, -8.738f, -3.614f)
                lineToRelative(-1.266f, -1.34f)
                curveTo(-1.41f, 15.737f, -0.11f, 9.492f, 4.694f, 4.688f)
                curveTo(9.513f, -0.131f, 15.782f, -1.426f, 19.085f, 1.671f)
                lineToRelative(1.307f, 1.239f)
                curveToRelative(2.335f, 2.334f, 3.62f, 5.438f, 3.62f, 8.738f)
                close()
                moveTo(3.213f, 17.805f)
                curveToRelative(2.39f, 2.388f, 7.747f, 1.061f, 11.704f, -2.895f)
                curveToRelative(3.956f, -3.957f, 5.282f, -9.316f, 2.896f, -11.704f)
                curveToRelative(-0.808f, -0.807f, -1.955f, -1.19f, -3.272f, -1.19f)
                curveToRelative(-2.579f, 0.0f, -5.812f, 1.466f, -8.432f, 4.085f)
                curveToRelative(-3.956f, 3.957f, -5.282f, 9.316f, -2.896f, 11.704f)
                close()
            }
        }
        .build()
        return _coconut!!
    }

private var _coconut: ImageVector? = null
