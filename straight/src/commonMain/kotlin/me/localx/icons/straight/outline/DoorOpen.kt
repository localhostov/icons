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

public val Icons.Outline.DoorOpen: ImageVector
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
                horizontalLineToRelative(-1.171f)
                curveToRelative(-0.18f, -0.51f, -0.497f, -0.967f, -0.927f, -1.319f)
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
                moveTo(18.0f, 5.0f)
                lineTo(18.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(6.0f, 4.2f)
                curveToRelative(0.0f, -0.475f, 0.338f, -0.887f, 0.804f, -0.98f)
                lineToRelative(6.0f, -1.2f)
                curveToRelative(0.293f, -0.057f, 0.598f, 0.018f, 0.83f, 0.208f)
                curveToRelative(0.233f, 0.19f, 0.366f, 0.473f, 0.366f, 0.773f)
                lineTo(14.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 4.2f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
