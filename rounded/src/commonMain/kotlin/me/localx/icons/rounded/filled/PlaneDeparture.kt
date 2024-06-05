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

public val Icons.Filled.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.202f, 18.0f)
                curveToRelative(-1.153f, 0.0f, -2.304f, -0.353f, -3.278f, -1.046f)
                lineToRelative(-2.075f, -1.476f)
                curveToRelative(-0.448f, -0.318f, -0.75f, -0.812f, -0.828f, -1.353f)
                curveToRelative(-0.074f, -0.509f, 0.054f, -1.004f, 0.361f, -1.396f)
                curveToRelative(0.518f, -0.662f, 1.389f, -0.915f, 2.169f, -0.63f)
                lineToRelative(3.247f, 1.192f)
                lineToRelative(14.655f, -7.061f)
                curveToRelative(1.252f, -0.579f, 2.737f, -0.03f, 3.315f, 1.22f)
                curveToRelative(0.578f, 1.248f, 0.038f, 2.745f, -1.203f, 3.338f)
                lineToRelative(-13.949f, 6.667f)
                curveToRelative(-0.765f, 0.365f, -1.59f, 0.545f, -2.415f, 0.545f)
                close()
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(1.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                lineTo(23.0f, 24.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(8.614f, 9.715f)
                lineToRelative(5.419f, -2.611f)
                lineToRelative(-5.849f, -3.612f)
                curveToRelative(-0.734f, -0.545f, -1.707f, -0.645f, -2.542f, -0.26f)
                lineToRelative(-0.781f, 0.367f)
                curveToRelative(-0.458f, 0.215f, -0.774f, 0.643f, -0.846f, 1.144f)
                curveToRelative(-0.072f, 0.502f, 0.111f, 1.001f, 0.49f, 1.337f)
                lineToRelative(4.108f, 3.636f)
                close()
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
