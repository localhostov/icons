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

public val Icons.Outline.LaptopArrowDown: ImageVector
    get() {
        if (_laptopArrowDown != null) {
            return _laptopArrowDown!!
        }
        _laptopArrowDown = Builder(name = "LaptopArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 15.172f)
                verticalLineToRelative(-7.172f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.266f, 0.0f, -0.52f, 0.105f, -0.707f, 0.293f)
                lineToRelative(-0.707f, 0.707f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(-0.707f, -0.707f)
                curveToRelative(-0.188f, -0.188f, -0.442f, -0.293f, -0.707f, -0.293f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(7.172f)
                curveToRelative(-1.164f, 0.413f, -2.0f, 1.524f, -2.0f, 2.828f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, -0.836f, -2.415f, -2.0f, -2.828f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.086f)
                lineToRelative(0.707f, 0.707f)
                curveToRelative(0.188f, 0.188f, 0.442f, 0.293f, 0.707f, 0.293f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.266f, 0.0f, 0.52f, -0.105f, 0.707f, -0.293f)
                lineToRelative(0.707f, -0.707f)
                horizontalLineToRelative(5.086f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(11.0f, 9.42f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.421f)
                lineToRelative(2.319f, -2.154f)
                curveToRelative(0.403f, -0.376f, 1.038f, -0.353f, 1.413f, 0.053f)
                curveToRelative(0.376f, 0.405f, 0.353f, 1.037f, -0.052f, 1.413f)
                lineToRelative(-2.613f, 2.426f)
                curveToRelative(-0.562f, 0.561f, -1.308f, 0.843f, -2.058f, 0.843f)
                curveToRelative(-0.759f, 0.0f, -1.522f, -0.288f, -2.103f, -0.869f)
                lineToRelative(-2.587f, -2.4f)
                curveToRelative(-0.405f, -0.375f, -0.429f, -1.008f, -0.053f, -1.413f)
                curveToRelative(0.375f, -0.405f, 1.009f, -0.428f, 1.413f, -0.053f)
                lineToRelative(2.32f, 2.153f)
                close()
            }
        }
        .build()
        return _laptopArrowDown!!
    }

private var _laptopArrowDown: ImageVector? = null
