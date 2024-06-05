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

public val Icons.Filled.MapMarkerEdit: ImageVector
    get() {
        if (_mapMarkerEdit != null) {
            return _mapMarkerEdit!!
        }
        _mapMarkerEdit = Builder(name = "MapMarkerEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.707f, 7.293f)
                curveToRelative(0.189f, 0.188f, 0.293f, 0.439f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.293f, 0.707f)
                lineToRelative(-4.293f, 4.293f)
                horizontalLineToRelative(-1.414f)
                verticalLineToRelative(-1.415f)
                lineToRelative(4.293f, -4.292f)
                curveToRelative(0.391f, -0.39f, 1.023f, -0.39f, 1.414f, 0.0f)
                close()
                moveTo(19.071f, 17.077f)
                lineToRelative(-7.071f, 6.916f)
                lineToRelative(-7.063f, -6.908f)
                curveToRelative(-3.906f, -3.907f, -3.906f, -10.251f, -0.008f, -14.15f)
                curveTo(6.818f, 1.046f, 9.329f, 0.006f, 12.0f, 0.006f)
                reflectiveCurveToRelative(5.182f, 1.04f, 7.071f, 2.929f)
                curveToRelative(3.898f, 3.899f, 3.898f, 10.243f, 0.0f, 14.142f)
                close()
                moveTo(17.0f, 7.999f)
                curveToRelative(0.0f, -0.801f, -0.313f, -1.555f, -0.879f, -2.121f)
                curveToRelative(-1.17f, -1.17f, -3.072f, -1.17f, -4.242f, 0.0f)
                lineToRelative(-4.879f, 4.878f)
                verticalLineToRelative(4.243f)
                horizontalLineToRelative(4.242f)
                lineToRelative(4.879f, -4.878f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                close()
            }
        }
        .build()
        return _mapMarkerEdit!!
    }

private var _mapMarkerEdit: ImageVector? = null
