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

public val Icons.Outline.CupStraw: ImageVector
    get() {
        if (_cupStraw != null) {
            return _cupStraw!!
        }
        _cupStraw = Builder(name = "CupStraw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.0f)
                horizontalLineToRelative(-7.494f)
                lineToRelative(0.266f, -2.124f)
                curveToRelative(0.062f, -0.5f, 0.489f, -0.876f, 0.992f, -0.876f)
                horizontalLineToRelative(3.235f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.235f)
                curveToRelative(-1.509f, 0.0f, -2.788f, 1.129f, -2.977f, 2.627f)
                lineToRelative(-0.297f, 2.373f)
                lineTo(2.0f, 5.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.611f)
                lineToRelative(1.486f, 12.586f)
                curveToRelative(0.298f, 2.516f, 2.433f, 4.414f, 4.966f, 4.414f)
                horizontalLineToRelative(5.875f)
                curveToRelative(2.533f, 0.0f, 4.668f, -1.897f, 4.966f, -4.414f)
                lineToRelative(1.486f, -12.586f)
                horizontalLineToRelative(0.611f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(17.917f, 19.351f)
                curveToRelative(-0.179f, 1.51f, -1.46f, 2.649f, -2.979f, 2.649f)
                horizontalLineToRelative(-5.875f)
                curveToRelative(-1.52f, 0.0f, -2.801f, -1.139f, -2.979f, -2.648f)
                lineToRelative(-1.458f, -12.352f)
                horizontalLineToRelative(14.75f)
                lineToRelative(-1.458f, 12.351f)
                close()
            }
        }
        .build()
        return _cupStraw!!
    }

private var _cupStraw: ImageVector? = null
