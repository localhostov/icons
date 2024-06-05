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

public val Icons.Bold.Unicorn: ImageVector
    get() {
        if (_unicorn != null) {
            return _unicorn!!
        }
        _unicorn = Builder(name = "Unicorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.288f, 6.206f)
                curveToRelative(-1.068f, -0.513f, -2.022f, -0.976f, -2.617f, -1.972f)
                lineToRelative(4.33f, -3.569f)
                curveToRelative(-0.201f, -0.336f, -0.166f, -0.277f, -0.367f, -0.613f)
                lineToRelative(-5.632f, 1.948f)
                horizontalLineToRelative(0.0f)
                lineTo(18.002f, 0.0f)
                curveTo(16.51f, 0.0f, 15.283f, 1.089f, 15.049f, 2.512f)
                curveToRelative(-2.917f, 1.197f, -4.049f, 4.266f, -4.049f, 6.487f)
                horizontalLineToRelative(-2.506f)
                curveToRelative(-1.343f, 0.0f, -2.537f, 0.604f, -3.362f, 1.541f)
                curveTo(1.753f, 11.676f, 0.0f, 14.468f, 0.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -2.199f, 0.448f, -3.509f, 1.094f, -4.328f)
                curveToRelative(0.182f, 1.085f, 0.585f, 1.993f, 0.952f, 2.818f)
                curveToRelative(0.176f, 0.396f, 0.345f, 0.774f, 0.475f, 1.144f)
                lineToRelative(-0.742f, 5.366f)
                horizontalLineToRelative(4.828f)
                lineToRelative(0.5f, -4.0f)
                horizontalLineToRelative(3.894f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.79f)
                lineToRelative(0.365f, -1.278f)
                curveToRelative(0.421f, -1.475f, 0.635f, -2.999f, 0.635f, -4.533f)
                verticalLineToRelative(-1.075f)
                lineToRelative(4.0f, -0.5f)
                verticalLineToRelative(-1.909f)
                curveToRelative(0.0f, -1.146f, -0.666f, -2.207f, -1.712f, -2.709f)
                close()
                moveTo(17.0f, 8.676f)
                verticalLineToRelative(3.724f)
                curveToRelative(0.0f, 1.254f, -0.175f, 2.502f, -0.52f, 3.708f)
                lineToRelative(-0.255f, 0.893f)
                horizontalLineToRelative(-8.121f)
                curveToRelative(-0.104f, -0.249f, -0.212f, -0.491f, -0.318f, -0.73f)
                curveToRelative(-0.425f, -0.954f, -0.792f, -1.778f, -0.792f, -2.773f)
                curveToRelative(0.001f, -0.825f, 0.674f, -1.497f, 1.5f, -1.497f)
                horizontalLineToRelative(5.506f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.367f, 0.085f, -3.289f, 2.739f, -3.892f)
                curveToRelative(0.739f, 1.658f, 1.942f, 2.575f, 3.089f, 3.214f)
                lineToRelative(-2.829f, 0.354f)
                close()
            }
        }
        .build()
        return _unicorn!!
    }

private var _unicorn: ImageVector? = null
