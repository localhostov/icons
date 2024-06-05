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

public val Icons.Outline.MapMarkerEdit: ImageVector
    get() {
        if (_mapMarkerEdit != null) {
            return _mapMarkerEdit!!
        }
        _mapMarkerEdit = Builder(name = "MapMarkerEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.994f)
                lineToRelative(-7.063f, -6.908f)
                curveToRelative(-3.906f, -3.907f, -3.906f, -10.251f, -0.008f, -14.15f)
                curveTo(6.818f, 1.046f, 9.329f, 0.006f, 12.0f, 0.006f)
                reflectiveCurveToRelative(5.182f, 1.04f, 7.071f, 2.929f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.898f, 3.899f, 3.898f, 10.243f, 0.0f, 14.142f)
                lineToRelative(-7.071f, 6.916f)
                close()
                moveTo(12.0f, 2.007f)
                curveToRelative(-2.137f, 0.0f, -4.146f, 0.832f, -5.657f, 2.343f)
                curveToRelative(-3.119f, 3.119f, -3.119f, 8.194f, 0.0f, 11.314f)
                lineToRelative(5.657f, 5.532f)
                lineToRelative(5.665f, -5.54f)
                curveToRelative(3.111f, -3.111f, 3.11f, -8.187f, -0.008f, -11.306f)
                curveToRelative(-1.512f, -1.511f, -3.521f, -2.343f, -5.657f, -2.343f)
                close()
                moveTo(11.242f, 15.001f)
                lineTo(7.0f, 15.001f)
                verticalLineToRelative(-4.243f)
                lineToRelative(4.879f, -4.878f)
                curveToRelative(1.17f, -1.17f, 3.072f, -1.17f, 4.242f, 0.0f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.32f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.879f, 2.122f)
                lineToRelative(-4.879f, 4.878f)
                close()
                moveTo(9.0f, 13.001f)
                horizontalLineToRelative(1.414f)
                lineToRelative(4.293f, -4.293f)
                curveToRelative(0.189f, -0.189f, 0.293f, -0.44f, 0.293f, -0.707f)
                reflectiveCurveToRelative(-0.104f, -0.518f, -0.293f, -0.707f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.39f, -1.414f, 0.0f)
                lineToRelative(-4.293f, 4.292f)
                verticalLineToRelative(1.415f)
                close()
            }
        }
        .build()
        return _mapMarkerEdit!!
    }

private var _mapMarkerEdit: ImageVector? = null
