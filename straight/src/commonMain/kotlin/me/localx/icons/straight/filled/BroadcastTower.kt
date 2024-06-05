package me.localx.icons.straight.filled

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

public val Icons.Filled.BroadcastTower: ImageVector
    get() {
        if (_broadcastTower != null) {
            return _broadcastTower!!
        }
        _broadcastTower = Builder(name = "BroadcastTower", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, 0.836f, 2.415f, 2.0f, 2.828f)
                verticalLineToRelative(12.172f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-12.172f)
                curveToRelative(1.164f, -0.413f, 2.0f, -1.524f, 2.0f, -2.828f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.464f, 5.54f)
                curveToRelative(-0.944f, 0.944f, -1.464f, 2.2f, -1.464f, 3.536f)
                reflectiveCurveToRelative(0.52f, 2.591f, 1.464f, 3.536f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(-1.322f, -1.322f, -2.05f, -3.08f, -2.05f, -4.95f)
                reflectiveCurveToRelative(0.728f, -3.627f, 2.05f, -4.95f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(16.949f, 4.126f)
                curveToRelative(1.322f, 1.322f, 2.05f, 3.08f, 2.05f, 4.95f)
                reflectiveCurveToRelative(-0.728f, 3.628f, -2.05f, 4.95f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(0.944f, -0.944f, 1.464f, -2.2f, 1.464f, -3.536f)
                reflectiveCurveToRelative(-0.52f, -2.591f, -1.464f, -3.536f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(4.929f, 2.004f)
                curveToRelative(-3.898f, 3.899f, -3.898f, 10.243f, 0.0f, 14.142f)
                lineToRelative(-1.414f, 1.414f)
                curveTo(-1.164f, 12.882f, -1.164f, 5.269f, 3.515f, 0.59f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(20.486f, 17.56f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(3.898f, -3.899f, 3.898f, -10.243f, 0.0f, -14.142f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(4.679f, 4.678f, 4.679f, 12.292f, 0.0f, 16.97f)
                close()
            }
        }
        .build()
        return _broadcastTower!!
    }

private var _broadcastTower: ImageVector? = null
