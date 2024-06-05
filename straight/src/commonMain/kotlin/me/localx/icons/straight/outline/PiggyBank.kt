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

public val Icons.Outline.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(7.0f, 1.794f, 8.794f, 0.0f, 11.0f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.587f)
                curveToRelative(-0.665f, 1.634f, -1.868f, 3.013f, -3.413f, 3.908f)
                verticalLineToRelative(3.092f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-3.08f)
                curveToRelative(-2.449f, -1.42f, -4.0f, -4.07f, -4.0f, -6.92f)
                curveToRelative(0.0f, -1.173f, 0.254f, -2.288f, 0.709f, -3.292f)
                curveToRelative(-1.01f, -0.483f, -1.709f, -1.515f, -1.709f, -2.708f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.476f, 0.334f, 0.875f, 0.78f, 0.975f)
                curveToRelative(1.468f, -1.814f, 3.711f, -2.975f, 6.22f, -2.975f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.112f, 0.0f, 0.224f, 0.003f, 0.336f, 0.007f)
                curveToRelative(1.113f, -3.001f, 4.664f, -3.007f, 4.664f, -3.007f)
                lineTo(20.0f, 7.773f)
                curveToRelative(1.05f, 0.842f, 1.893f, 1.946f, 2.414f, 3.227f)
                horizontalLineToRelative(1.586f)
                close()
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(-1.04f)
                lineToRelative(-0.213f, -0.715f)
                curveToRelative(-0.751f, -2.522f, -3.115f, -4.285f, -5.748f, -4.285f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                curveToRelative(0.0f, 2.298f, 1.346f, 4.423f, 3.43f, 5.414f)
                lineToRelative(0.57f, 0.271f)
                verticalLineToRelative(2.314f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.325f)
                lineToRelative(0.569f, -0.271f)
                curveToRelative(1.542f, -0.736f, 2.7f, -2.081f, 3.179f, -3.688f)
                lineToRelative(0.213f, -0.715f)
                horizontalLineToRelative(1.04f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
