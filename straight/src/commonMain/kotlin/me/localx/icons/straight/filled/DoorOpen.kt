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

public val Icons.Filled.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) {
            return _doorOpen!!
        }
        _doorOpen = Builder(name = "DoorOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.19f)
                curveToRelative(-0.18f, -0.507f, -0.48f, -0.968f, -0.908f, -1.319f)
                curveTo(14.205f, 0.109f, 13.298f, -0.115f, 12.412f, 0.059f)
                lineTo(6.411f, 1.259f)
                curveToRelative(-1.397f, 0.28f, -2.411f, 1.518f, -2.411f, 2.941f)
                lineTo(4.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(12.5f, 13.25f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                lineTo(18.0f, 22.0f)
                close()
            }
        }
        .build()
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
