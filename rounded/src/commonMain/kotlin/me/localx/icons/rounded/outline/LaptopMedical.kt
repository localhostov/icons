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

public val Icons.Outline.LaptopMedical: ImageVector
    get() {
        if (_laptopMedical != null) {
            return _laptopMedical!!
        }
        _laptopMedical = Builder(name = "LaptopMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 15.172f)
                verticalLineToRelative(-7.172f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(7.0f, 3.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(7.172f)
                curveToRelative(-1.164f, 0.413f, -2.0f, 1.524f, -2.0f, 2.828f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, -0.836f, -2.415f, -2.0f, -2.828f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.265f, 0.0f, -0.52f, 0.105f, -0.707f, 0.293f)
                lineToRelative(-0.707f, 0.707f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(-0.707f, -0.707f)
                curveToRelative(-0.188f, -0.188f, -0.442f, -0.293f, -0.707f, -0.293f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.086f)
                lineToRelative(0.707f, 0.707f)
                curveToRelative(0.188f, 0.188f, 0.442f, 0.293f, 0.707f, 0.293f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.265f, 0.0f, 0.52f, -0.105f, 0.707f, -0.293f)
                lineToRelative(0.707f, -0.707f)
                horizontalLineToRelative(5.086f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _laptopMedical!!
    }

private var _laptopMedical: ImageVector? = null
