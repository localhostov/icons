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

public val Icons.Bold.BoxFragile: ImageVector
    get() {
        if (_boxFragile != null) {
            return _boxFragile!!
        }
        _boxFragile = Builder(name = "BoxFragile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(17.0f, 7.0f)
                verticalLineToRelative(2.769f)
                curveToRelative(0.0f, 2.234f, -1.474f, 4.131f, -3.5f, 4.77f)
                verticalLineToRelative(1.461f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.464f)
                curveToRelative(-2.071f, -0.673f, -3.5f, -2.728f, -3.5f, -4.99f)
                verticalLineToRelative(-2.546f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.783f)
                reflectiveCurveToRelative(-1.689f, 2.838f, -1.713f, 2.917f)
                curveToRelative(-0.147f, 0.487f, -0.055f, 1.021f, 0.249f, 1.43f)
                reflectiveCurveToRelative(0.788f, 0.653f, 1.297f, 0.653f)
                horizontalLineToRelative(2.068f)
                lineToRelative(-1.032f, 1.473f)
                curveToRelative(-0.291f, 0.469f, -0.146f, 1.086f, 0.323f, 1.377f)
                curveToRelative(0.164f, 0.102f, 0.346f, 0.15f, 0.526f, 0.15f)
                curveToRelative(0.334f, 0.0f, 0.662f, -0.168f, 0.851f, -0.473f)
                lineToRelative(1.38f, -2.037f)
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
