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

public val Icons.Outline.HouseDay: ImageVector
    get() {
        if (_houseDay != null) {
            return _houseDay!!
        }
        _houseDay = Builder(name = "HouseDay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.785f, 13.064f)
                lineToRelative(-4.334f, -3.391f)
                curveToRelative(-1.148f, -0.899f, -2.754f, -0.899f, -3.902f, 0.0f)
                lineToRelative(-4.333f, 3.391f)
                curveToRelative(-0.772f, 0.604f, -1.215f, 1.513f, -1.215f, 2.494f)
                verticalLineToRelative(8.442f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-8.442f)
                curveToRelative(0.0f, -0.98f, -0.442f, -1.889f, -1.215f, -2.494f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-6.442f)
                curveToRelative(0.0f, -0.361f, 0.163f, -0.696f, 0.448f, -0.918f)
                lineToRelative(4.333f, -3.391f)
                curveToRelative(0.424f, -0.331f, 1.014f, -0.331f, 1.438f, 0.0f)
                lineToRelative(4.334f, 3.391f)
                curveToRelative(0.284f, 0.223f, 0.447f, 0.558f, 0.447f, 0.919f)
                verticalLineToRelative(6.442f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.427f, 13.493f)
                curveToRelative(-0.271f, 0.624f, -0.419f, 1.303f, -0.426f, 2.007f)
                curveToRelative(-0.477f, -0.2f, -0.926f, -0.454f, -1.338f, -0.757f)
                lineToRelative(-2.167f, 2.167f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.168f, -2.168f)
                curveToRelative(-0.6f, -0.82f, -1.012f, -1.785f, -1.174f, -2.832f)
                lineTo(0.0f, 10.496f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.078f)
                curveToRelative(0.163f, -1.046f, 0.576f, -2.01f, 1.176f, -2.829f)
                lineToRelative(-2.179f, -2.179f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.179f, 2.179f)
                curveToRelative(0.819f, -0.6f, 1.783f, -1.013f, 2.829f, -1.176f)
                lineTo(8.497f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.076f)
                curveToRelative(1.047f, 0.162f, 2.012f, 0.574f, 2.832f, 1.174f)
                lineToRelative(2.176f, -2.176f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.175f, 2.175f)
                curveToRelative(0.32f, 0.437f, 0.588f, 0.914f, 0.792f, 1.424f)
                curveToRelative(-0.649f, 0.124f, -1.28f, 0.373f, -1.854f, 0.749f)
                curveToRelative(-0.663f, -1.66f, -2.287f, -2.836f, -4.181f, -2.836f)
                curveToRelative(-2.314f, 0.0f, -4.225f, 1.756f, -4.473f, 4.005f)
                verticalLineToRelative(0.991f)
                curveToRelative(0.168f, 1.523f, 1.098f, 2.819f, 2.4f, 3.498f)
                close()
            }
        }
        .build()
        return _houseDay!!
    }

private var _houseDay: ImageVector? = null
