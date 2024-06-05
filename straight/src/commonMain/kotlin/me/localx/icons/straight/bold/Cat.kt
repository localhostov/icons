package me.localx.icons.straight.bold

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

public val Icons.Bold.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.5f)
                lineTo(24.0f, 0.0f)
                lineToRelative(-3.287f, 2.465f)
                curveToRelative(-0.677f, -0.299f, -1.426f, -0.465f, -2.213f, -0.465f)
                reflectiveCurveToRelative(-1.535f, 0.166f, -2.213f, 0.465f)
                lineToRelative(-3.287f, -2.465f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.487f, 0.064f, 0.959f, 0.183f, 1.408f)
                curveToRelative(-6.609f, 1.986f, -8.798f, 7.414f, -9.143f, 11.111f)
                curveToRelative(-0.616f, -0.527f, -1.04f, -1.227f, -1.04f, -1.996f)
                curveToRelative(0.0f, -1.848f, 0.478f, -2.817f, 0.983f, -3.845f)
                curveToRelative(0.477f, -0.969f, 1.017f, -2.066f, 1.017f, -3.679f)
                curveToRelative(0.0f, -2.649f, -2.056f, -4.5f, -5.0f, -4.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.469f, 0.0f, 2.0f, 0.108f, 2.0f, 1.5f)
                curveToRelative(0.0f, 0.915f, -0.297f, 1.518f, -0.708f, 2.354f)
                curveToRelative(-0.575f, 1.169f, -1.292f, 2.624f, -1.292f, 5.17f)
                curveToRelative(0.0f, 3.522f, 3.456f, 5.977f, 6.558f, 5.977f)
                horizontalLineToRelative(17.442f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.26f)
                curveToRelative(1.221f, -1.01f, 2.0f, -2.535f, 2.0f, -4.24f)
                close()
                moveTo(18.5f, 5.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.122f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-7.002f)
                curveToRelative(0.051f, -1.686f, 0.731f, -7.75f, 7.813f, -9.424f)
                curveToRelative(0.976f, 0.884f, 2.271f, 1.424f, 3.689f, 1.424f)
                curveToRelative(0.169f, 0.0f, 0.335f, -0.008f, 0.5f, -0.023f)
                verticalLineToRelative(8.023f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
