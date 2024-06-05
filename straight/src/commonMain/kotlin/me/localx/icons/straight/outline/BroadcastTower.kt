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

public val Icons.Outline.BroadcastTower: ImageVector
    get() {
        if (_broadcastTower != null) {
            return _broadcastTower!!
        }
        _broadcastTower = Builder(name = "BroadcastTower", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.58f, 1.059f, 2.903f, 2.5f, 3.337f)
                verticalLineToRelative(11.663f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.663f)
                curveToRelative(1.441f, -0.434f, 2.5f, -1.757f, 2.5f, -3.337f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.757f, 4.833f)
                curveToRelative(-2.339f, 2.339f, -2.339f, 6.146f, 0.0f, 8.485f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(-3.119f, -3.12f, -3.119f, -8.195f, 0.0f, -11.313f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(20.0f, 9.076f)
                curveToRelative(0.0f, 2.137f, -0.832f, 4.146f, -2.343f, 5.657f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(1.133f, -1.133f, 1.757f, -2.64f, 1.757f, -4.243f)
                reflectiveCurveToRelative(-0.624f, -3.109f, -1.757f, -4.243f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(1.511f, 1.511f, 2.343f, 3.52f, 2.343f, 5.657f)
                close()
                moveTo(4.929f, 16.147f)
                lineToRelative(-1.414f, 1.414f)
                curveTo(-1.164f, 12.882f, -1.164f, 5.269f, 3.515f, 0.59f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(-3.898f, 3.899f, -3.898f, 10.243f, 0.0f, 14.142f)
                close()
                moveTo(24.0f, 9.076f)
                curveToRelative(0.0f, 3.205f, -1.248f, 6.219f, -3.515f, 8.485f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(1.889f, -1.889f, 2.929f, -4.4f, 2.929f, -7.071f)
                reflectiveCurveToRelative(-1.04f, -5.183f, -2.929f, -7.071f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(2.267f, 2.267f, 3.515f, 5.28f, 3.515f, 8.485f)
                close()
            }
        }
        .build()
        return _broadcastTower!!
    }

private var _broadcastTower: ImageVector? = null
