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

public val Icons.Bold.FaceSmileUpsideDown: ImageVector
    get() {
        if (_faceSmileUpsideDown != null) {
            return _faceSmileUpsideDown!!
        }
        _faceSmileUpsideDown = Builder(name = "FaceSmileUpsideDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(18.0f, 14.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(10.0f, 14.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(15.448f, 9.569f)
                curveToRelative(-0.032f, -0.03f, -1.639f, -1.569f, -3.448f, -1.569f)
                reflectiveCurveToRelative(-3.432f, 1.554f, -3.448f, 1.569f)
                curveToRelative(-0.592f, 0.577f, -1.54f, 0.568f, -2.119f, -0.02f)
                curveToRelative(-0.579f, -0.588f, -0.576f, -1.532f, 0.01f, -2.114f)
                curveToRelative(0.1f, -0.1f, 2.488f, -2.436f, 5.557f, -2.436f)
                reflectiveCurveToRelative(5.457f, 2.336f, 5.557f, 2.436f)
                curveToRelative(0.588f, 0.583f, 0.591f, 1.533f, 0.008f, 2.121f)
                curveToRelative(-0.293f, 0.295f, -0.679f, 0.443f, -1.064f, 0.443f)
                curveToRelative(-0.38f, 0.0f, -0.76f, -0.144f, -1.052f, -0.431f)
                close()
            }
        }
        .build()
        return _faceSmileUpsideDown!!
    }

private var _faceSmileUpsideDown: ImageVector? = null
