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

public val Icons.Outline.SurveillanceCamera: ImageVector
    get() {
        if (_surveillanceCamera != null) {
            return _surveillanceCamera!!
        }
        _surveillanceCamera = Builder(name = "SurveillanceCamera", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 3.0f)
                horizontalLineToRelative(-1.382f)
                lineToRelative(1.5f, -3.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(2.0f, 7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.057f)
                lineToRelative(-2.006f, 5.351f)
                curveToRelative(-0.146f, 0.389f, -0.522f, 0.649f, -0.937f, 0.649f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(10.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                lineTo(7.114f, 18.0f)
                curveToRelative(1.243f, 0.0f, 2.372f, -0.782f, 2.81f, -1.946f)
                lineToRelative(2.27f, -6.054f)
                horizontalLineToRelative(8.807f)
                close()
                moveTo(4.0f, 7.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.882f)
                lineToRelative(-0.882f, 1.764f)
                verticalLineToRelative(4.236f)
                lineTo(5.0f, 8.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(23.803f, 19.044f)
                curveToRelative(-0.486f, -0.948f, -2.379f, -4.044f, -6.329f, -4.044f)
                reflectiveCurveToRelative(-5.842f, 3.095f, -6.328f, 4.044f)
                lineToRelative(-0.234f, 0.456f)
                lineToRelative(0.234f, 0.456f)
                curveToRelative(0.486f, 0.949f, 2.381f, 4.044f, 6.328f, 4.044f)
                reflectiveCurveToRelative(5.842f, -3.095f, 6.329f, -4.044f)
                lineToRelative(0.234f, -0.456f)
                lineToRelative(-0.233f, -0.456f)
                close()
                moveTo(17.474f, 22.0f)
                curveToRelative(-2.336f, 0.0f, -3.666f, -1.506f, -4.289f, -2.5f)
                curveToRelative(0.623f, -0.994f, 1.953f, -2.5f, 4.289f, -2.5f)
                reflectiveCurveToRelative(3.667f, 1.506f, 4.29f, 2.5f)
                curveToRelative(-0.623f, 0.994f, -1.953f, 2.5f, -4.29f, 2.5f)
                close()
                moveTo(18.974f, 19.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _surveillanceCamera!!
    }

private var _surveillanceCamera: ImageVector? = null
