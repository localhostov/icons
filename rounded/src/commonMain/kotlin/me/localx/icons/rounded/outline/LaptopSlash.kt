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

public val Icons.Outline.LaptopSlash: ImageVector
    get() {
        if (_laptopSlash != null) {
            return _laptopSlash!!
        }
        _laptopSlash = Builder(name = "LaptopSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 20.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                verticalLineToRelative(-7.172f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.266f, 0.0f, 0.52f, 0.105f, 0.707f, 0.293f)
                lineToRelative(0.707f, 0.707f)
                horizontalLineToRelative(2.086f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.266f, 0.0f, -0.52f, -0.105f, -0.707f, -0.293f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(3.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(3.177f, 3.177f)
                curveToRelative(0.659f, -0.308f, 1.383f, -0.47f, 2.116f, -0.47f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(7.172f)
                curveToRelative(1.164f, 0.413f, 2.0f, 1.524f, 2.0f, 2.828f)
                curveToRelative(0.0f, 1.238f, -0.753f, 2.302f, -1.826f, 2.76f)
                lineToRelative(1.533f, 1.533f)
                close()
                moveTo(20.418f, 19.004f)
                curveToRelative(0.027f, -0.002f, 0.582f, -0.004f, 0.582f, -0.004f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(2.004f, 2.004f)
                close()
                moveTo(6.463f, 5.049f)
                lineToRelative(9.951f, 9.951f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(7.0f, 5.0f)
                curveToRelative(-0.181f, 0.0f, -0.361f, 0.017f, -0.537f, 0.049f)
                close()
            }
        }
        .build()
        return _laptopSlash!!
    }

private var _laptopSlash: ImageVector? = null
