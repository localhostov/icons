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

public val Icons.Outline.BoxFragile: ImageVector
    get() {
        if (_boxFragile != null) {
            return _boxFragile!!
        }
        _boxFragile = Builder(name = "BoxFragile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(17.0f, 6.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.414f, -1.721f, 4.435f, -4.0f, 4.899f)
                verticalLineToRelative(3.101f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.101f)
                curveToRelative(-2.338f, -0.484f, -4.0f, -2.683f, -4.0f, -5.122f)
                verticalLineToRelative(-3.777f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.783f)
                reflectiveCurveToRelative(-1.689f, 2.838f, -1.713f, 2.917f)
                curveToRelative(-0.147f, 0.487f, -0.055f, 1.021f, 0.249f, 1.43f)
                reflectiveCurveToRelative(0.788f, 0.653f, 1.297f, 0.653f)
                horizontalLineToRelative(2.068f)
                lineToRelative(-1.533f, 2.473f)
                curveToRelative(-0.291f, 0.469f, -0.146f, 1.086f, 0.323f, 1.377f)
                curveToRelative(0.164f, 0.102f, 0.346f, 0.15f, 0.526f, 0.15f)
                curveToRelative(0.334f, 0.0f, 0.662f, -0.168f, 0.851f, -0.473f)
                lineToRelative(1.881f, -3.037f)
                curveToRelative(0.327f, -0.493f, 0.357f, -1.123f, 0.077f, -1.645f)
                reflectiveCurveToRelative(-0.821f, -0.846f, -1.413f, -0.846f)
                horizontalLineToRelative(-2.079f)
                lineToRelative(1.798f, -3.0f)
                horizontalLineToRelative(1.885f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _boxFragile!!
    }

private var _boxFragile: ImageVector? = null
