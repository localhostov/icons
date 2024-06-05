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

public val Icons.Bold.CoffeeBeans: ImageVector
    get() {
        if (_coffeeBeans != null) {
            return _coffeeBeans!!
        }
        _coffeeBeans = Builder(name = "CoffeeBeans", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 9.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 3.364f, -6.0f, 7.5f)
                reflectiveCurveToRelative(2.691f, 7.5f, 6.0f, 7.5f)
                reflectiveCurveToRelative(6.0f, -3.364f, 6.0f, -7.5f)
                reflectiveCurveToRelative(-2.691f, -7.5f, -6.0f, -7.5f)
                close()
                moveTo(17.1f, 12.216f)
                curveToRelative(0.224f, 0.699f, 0.368f, 1.945f, -0.449f, 3.629f)
                curveToRelative(-0.648f, 1.336f, -0.895f, 2.534f, -0.922f, 3.557f)
                curveToRelative(-0.452f, -0.79f, -0.728f, -1.808f, -0.728f, -2.902f)
                curveToRelative(0.0f, -1.971f, 0.897f, -3.695f, 2.1f, -4.284f)
                close()
                moveTo(18.901f, 20.784f)
                curveToRelative(-0.224f, -0.699f, -0.368f, -1.945f, 0.449f, -3.629f)
                curveToRelative(0.648f, -1.336f, 0.895f, -2.534f, 0.922f, -3.557f)
                curveToRelative(0.452f, 0.79f, 0.728f, 1.808f, 0.728f, 2.902f)
                curveToRelative(0.0f, 1.971f, -0.897f, 3.695f, -2.1f, 4.284f)
                close()
                moveTo(12.461f, 1.54f)
                curveTo(11.255f, 0.334f, 9.472f, -0.198f, 7.565f, 0.07f)
                curveToRelative(-1.773f, 0.254f, -3.522f, 1.166f, -4.926f, 2.569f)
                curveTo(-0.371f, 5.65f, -0.865f, 10.056f, 1.539f, 12.46f)
                curveToRelative(1.0f, 1.0f, 2.397f, 1.539f, 3.931f, 1.539f)
                curveToRelative(0.316f, 0.0f, 0.639f, -0.023f, 0.964f, -0.069f)
                curveToRelative(1.773f, -0.254f, 3.522f, -1.166f, 4.926f, -2.569f)
                curveToRelative(3.011f, -3.011f, 3.504f, -7.416f, 1.101f, -9.82f)
                close()
                moveTo(7.99f, 3.04f)
                curveToRelative(0.153f, -0.021f, 0.342f, -0.039f, 0.551f, -0.039f)
                curveToRelative(0.313f, 0.0f, 0.671f, 0.04f, 1.018f, 0.167f)
                curveToRelative(-0.337f, 0.687f, -1.148f, 1.756f, -3.05f, 2.415f)
                curveToRelative(-1.536f, 0.532f, -2.627f, 1.279f, -3.402f, 2.053f)
                curveToRelative(0.224f, -0.977f, 0.79f, -2.011f, 1.654f, -2.875f)
                curveToRelative(0.934f, -0.934f, 2.11f, -1.561f, 3.229f, -1.721f)
                close()
                moveTo(6.011f, 10.96f)
                curveToRelative(-0.384f, 0.053f, -0.991f, 0.083f, -1.569f, -0.129f)
                curveToRelative(0.337f, -0.687f, 1.148f, -1.755f, 3.05f, -2.414f)
                curveToRelative(1.536f, -0.532f, 2.627f, -1.279f, 3.402f, -2.053f)
                curveToRelative(-0.224f, 0.977f, -0.79f, 2.011f, -1.654f, 2.875f)
                curveToRelative(-0.934f, 0.934f, -2.11f, 1.561f, -3.229f, 1.721f)
                close()
            }
        }
        .build()
        return _coffeeBeans!!
    }

private var _coffeeBeans: ImageVector? = null
