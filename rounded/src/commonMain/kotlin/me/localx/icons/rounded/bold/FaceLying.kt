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

public val Icons.Bold.FaceLying: ImageVector
    get() {
        if (_faceLying != null) {
            return _faceLying!!
        }
        _faceLying = Builder(name = "FaceLying", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.424f, 19.43f)
                curveToRelative(-2.292f, 2.904f, -5.728f, 4.57f, -9.424f, 4.57f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(4.622f, 0.0f, 8.883f, 2.701f, 10.856f, 6.882f)
                curveToRelative(0.354f, 0.749f, 0.033f, 1.644f, -0.716f, 1.997f)
                curveToRelative(-0.75f, 0.353f, -1.644f, 0.032f, -1.997f, -0.716f)
                curveToRelative(-1.48f, -3.137f, -4.677f, -5.163f, -8.144f, -5.163f)
                curveTo(7.038f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                curveToRelative(2.772f, 0.0f, 5.349f, -1.25f, 7.069f, -3.43f)
                curveToRelative(0.513f, -0.65f, 1.456f, -0.761f, 2.107f, -0.248f)
                curveToRelative(0.65f, 0.514f, 0.762f, 1.457f, 0.249f, 2.107f)
                close()
                moveTo(22.0f, 11.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.001f, 17.947f)
                curveToRelative(0.252f, 0.0f, 0.508f, -0.063f, 0.743f, -0.197f)
                curveToRelative(0.695f, -0.397f, 1.375f, -0.658f, 2.021f, -0.773f)
                curveToRelative(0.815f, -0.146f, 1.358f, -0.926f, 1.212f, -1.741f)
                curveToRelative(-0.146f, -0.815f, -0.93f, -1.355f, -1.741f, -1.212f)
                curveToRelative(-0.983f, 0.177f, -1.986f, 0.554f, -2.979f, 1.121f)
                curveToRelative(-0.719f, 0.411f, -0.969f, 1.328f, -0.558f, 2.047f)
                curveToRelative(0.277f, 0.484f, 0.783f, 0.756f, 1.304f, 0.756f)
                close()
                moveTo(14.0f, 8.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(10.0f, 8.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _faceLying!!
    }

private var _faceLying: ImageVector? = null
