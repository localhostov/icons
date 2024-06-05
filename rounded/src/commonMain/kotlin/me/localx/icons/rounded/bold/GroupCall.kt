package me.localx.icons.rounded.bold

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

public val Icons.Bold.GroupCall: ImageVector
    get() {
        if (_groupCall != null) {
            return _groupCall!!
        }
        _groupCall = Builder(name = "GroupCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(15.0f, 6.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(5.953f, 8.126f)
                curveToRelative(-0.206f, -0.802f, -1.024f, -1.284f, -1.826f, -1.079f)
                curveTo(1.735f, 7.663f, 0.0f, 9.956f, 0.0f, 12.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -1.177f, 0.806f, -2.272f, 1.874f, -2.547f)
                curveToRelative(0.803f, -0.207f, 1.286f, -1.024f, 1.079f, -1.826f)
                close()
                moveTo(8.127f, 15.047f)
                curveToRelative(-2.391f, 0.615f, -4.126f, 2.908f, -4.126f, 5.453f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -1.177f, 0.806f, -2.272f, 1.874f, -2.547f)
                curveToRelative(0.803f, -0.207f, 1.286f, -1.024f, 1.079f, -1.826f)
                reflectiveCurveToRelative(-1.024f, -1.286f, -1.826f, -1.079f)
                close()
                moveTo(12.6f, 9.514f)
                curveToRelative(-0.655f, -1.149f, -2.042f, -1.824f, -3.532f, -1.374f)
                curveToRelative(-0.907f, 0.274f, -1.646f, 1.009f, -1.923f, 1.915f)
                curveToRelative(-0.579f, 1.893f, 0.662f, 3.639f, 2.392f, 3.908f)
                curveToRelative(0.3f, 0.047f, 0.573f, -0.151f, 0.654f, -0.443f)
                curveToRelative(0.218f, -0.783f, 0.627f, -1.497f, 1.21f, -2.08f)
                lineToRelative(0.945f, -0.866f)
                curveToRelative(0.494f, -0.494f, 0.395f, -0.815f, 0.254f, -1.061f)
                close()
                moveTo(23.666f, 20.97f)
                lineToRelative(-1.302f, -1.208f)
                curveToRelative(-0.446f, -0.446f, -1.17f, -0.446f, -1.616f, 0.0f)
                lineToRelative(-1.036f, 1.025f)
                curveToRelative(-2.071f, -0.791f, -3.599f, -2.256f, -4.5f, -4.5f)
                lineToRelative(1.025f, -1.036f)
                curveToRelative(0.446f, -0.446f, 0.446f, -1.17f, 0.0f, -1.616f)
                lineToRelative(-1.208f, -1.302f)
                curveToRelative(-0.446f, -0.446f, -1.17f, -0.446f, -1.616f, 0.0f)
                lineToRelative(-0.6f, 0.522f)
                curveToRelative(-0.552f, 0.551f, -0.813f, 1.277f, -0.813f, 2.0f)
                curveToRelative(0.0f, 4.0f, 5.429f, 9.143f, 9.143f, 9.143f)
                curveToRelative(0.723f, 0.0f, 1.449f, -0.261f, 2.0f, -0.813f)
                lineToRelative(0.522f, -0.6f)
                curveToRelative(0.446f, -0.446f, 0.446f, -1.17f, 0.0f, -1.616f)
                close()
            }
        }
        .build()
        return _groupCall!!
    }

private var _groupCall: ImageVector? = null
