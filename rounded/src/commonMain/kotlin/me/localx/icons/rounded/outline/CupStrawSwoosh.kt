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

public val Icons.Outline.CupStrawSwoosh: ImageVector
    get() {
        if (_cupStrawSwoosh != null) {
            return _cupStrawSwoosh!!
        }
        _cupStrawSwoosh = Builder(name = "CupStrawSwoosh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.0f)
                horizontalLineToRelative(-7.494f)
                lineToRelative(0.266f, -2.124f)
                curveToRelative(0.062f, -0.5f, 0.489f, -0.876f, 0.993f, -0.876f)
                horizontalLineToRelative(3.235f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.235f)
                curveToRelative(-1.509f, 0.0f, -2.79f, 1.129f, -2.977f, 2.627f)
                lineToRelative(-0.297f, 2.373f)
                lineTo(2.0f, 5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.611f)
                lineToRelative(1.486f, 12.586f)
                curveToRelative(0.297f, 2.517f, 2.432f, 4.414f, 4.966f, 4.414f)
                horizontalLineToRelative(5.875f)
                curveToRelative(2.534f, 0.0f, 4.669f, -1.898f, 4.965f, -4.414f)
                lineToRelative(1.486f, -12.586f)
                horizontalLineToRelative(0.611f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(14.938f, 22.0f)
                horizontalLineToRelative(-5.875f)
                curveToRelative(-1.521f, 0.0f, -2.801f, -1.139f, -2.979f, -2.648f)
                lineToRelative(-0.464f, -3.932f)
                curveToRelative(0.838f, -0.574f, 2.303f, -1.419f, 3.381f, -1.419f)
                curveToRelative(0.764f, 0.0f, 1.633f, 0.435f, 2.553f, 0.895f)
                curveToRelative(1.087f, 0.543f, 2.211f, 1.105f, 3.447f, 1.105f)
                curveToRelative(1.194f, 0.0f, 2.462f, -0.544f, 3.442f, -1.096f)
                lineToRelative(-0.525f, 4.448f)
                curveToRelative(-0.178f, 1.51f, -1.458f, 2.648f, -2.979f, 2.648f)
                close()
                moveTo(18.747f, 12.319f)
                curveToRelative(-0.699f, 0.527f, -2.488f, 1.681f, -3.747f, 1.681f)
                curveToRelative(-0.764f, 0.0f, -1.633f, -0.435f, -2.553f, -0.895f)
                curveToRelative(-1.087f, -0.543f, -2.211f, -1.105f, -3.447f, -1.105f)
                curveToRelative(-1.277f, 0.0f, -2.639f, 0.623f, -3.642f, 1.211f)
                lineToRelative(-0.733f, -6.211f)
                horizontalLineToRelative(14.75f)
                lineToRelative(-0.628f, 5.319f)
                close()
            }
        }
        .build()
        return _cupStrawSwoosh!!
    }

private var _cupStrawSwoosh: ImageVector? = null
