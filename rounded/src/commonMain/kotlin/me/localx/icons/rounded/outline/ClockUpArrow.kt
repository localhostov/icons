package me.localx.icons.rounded.outline

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

public val Icons.Outline.ClockUpArrow: ImageVector
    get() {
        if (_clockUpArrow != null) {
            return _clockUpArrow!!
        }
        _clockUpArrow = Builder(name = "ClockUpArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(5.876f)
                curveToRelative(0.0f, 0.349f, -0.181f, 0.671f, -0.479f, 0.854f)
                lineToRelative(-4.408f, 2.696f)
                curveToRelative(-0.162f, 0.1f, -0.343f, 0.146f, -0.521f, 0.146f)
                curveToRelative(-0.337f, 0.0f, -0.665f, -0.17f, -0.854f, -0.479f)
                curveToRelative(-0.288f, -0.471f, -0.14f, -1.086f, 0.332f, -1.375f)
                lineToRelative(3.93f, -2.403f)
                verticalLineToRelative(-5.315f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.568f)
                lineToRelative(-4.329f, 4.328f)
                curveToRelative(-0.193f, 0.193f, -0.534f, 0.194f, -0.729f, 0.0f)
                lineToRelative(-1.104f, -1.104f)
                curveToRelative(-0.951f, -0.953f, -2.608f, -0.953f, -3.562f, 0.0f)
                lineToRelative(-4.053f, 4.07f)
                curveToRelative(-0.39f, 0.392f, -0.388f, 1.025f, 0.003f, 1.415f)
                curveToRelative(0.195f, 0.194f, 0.451f, 0.291f, 0.706f, 0.291f)
                curveToRelative(0.257f, 0.0f, 0.514f, -0.099f, 0.709f, -0.294f)
                lineToRelative(4.052f, -4.07f)
                curveToRelative(0.193f, -0.193f, 0.534f, -0.194f, 0.729f, 0.0f)
                lineToRelative(1.104f, 1.104f)
                curveToRelative(0.951f, 0.953f, 2.61f, 0.952f, 3.56f, 0.0f)
                lineToRelative(4.346f, -4.345f)
                verticalLineToRelative(2.604f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(4.828f, 0.0f, 8.964f, 3.44f, 9.835f, 8.181f)
                curveToRelative(0.101f, 0.543f, 0.616f, 0.909f, 1.164f, 0.803f)
                curveToRelative(0.543f, -0.1f, 0.902f, -0.621f, 0.803f, -1.164f)
                curveTo(22.757f, 4.13f, 17.793f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.316f, 1.392f, 6.516f, 3.818f, 8.778f)
                curveToRelative(0.192f, 0.18f, 0.438f, 0.269f, 0.682f, 0.269f)
                curveToRelative(0.268f, 0.0f, 0.534f, -0.106f, 0.731f, -0.318f)
                curveToRelative(0.377f, -0.403f, 0.354f, -1.036f, -0.05f, -1.413f)
                curveToRelative(-2.021f, -1.886f, -3.182f, -4.552f, -3.182f, -7.315f)
                close()
            }
        }
        .build()
        return _clockUpArrow!!
    }

private var _clockUpArrow: ImageVector? = null
