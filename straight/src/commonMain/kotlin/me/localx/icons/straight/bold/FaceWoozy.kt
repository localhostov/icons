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

public val Icons.Bold.FaceWoozy: ImageVector
    get() {
        if (_faceWoozy != null) {
            return _faceWoozy!!
        }
        _faceWoozy = Builder(name = "FaceWoozy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.037f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(15.5f, 7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 1.343f, -1.5f, 3.0f)
                reflectiveCurveToRelative(0.672f, 3.0f, 1.5f, 3.0f)
                reflectiveCurveToRelative(1.5f, -1.343f, 1.5f, -3.0f)
                reflectiveCurveToRelative(-0.672f, -3.0f, -1.5f, -3.0f)
                close()
                moveTo(11.671f, 10.842f)
                lineToRelative(-1.342f, -2.684f)
                lineToRelative(-4.0f, 2.0f)
                lineToRelative(1.342f, 2.684f)
                lineToRelative(4.0f, -2.0f)
                close()
                moveTo(19.3f, 15.25f)
                lineToRelative(-2.598f, -1.501f)
                curveToRelative(-0.628f, 1.08f, -1.563f, 2.044f, -2.012f, 2.223f)
                curveToRelative(-0.172f, -0.128f, -0.438f, -0.386f, -0.611f, -0.552f)
                curveToRelative(-0.657f, -0.632f, -1.475f, -1.419f, -2.579f, -1.419f)
                curveToRelative(-0.954f, 0.0f, -1.633f, 0.453f, -2.082f, 0.752f)
                curveToRelative(-0.118f, 0.079f, -0.286f, 0.191f, -0.377f, 0.233f)
                curveToRelative(-0.396f, -0.165f, -1.297f, -0.864f, -1.981f, -1.546f)
                lineToRelative(-2.12f, 2.122f)
                curveToRelative(0.911f, 0.911f, 2.649f, 2.439f, 4.061f, 2.439f)
                curveToRelative(0.954f, 0.0f, 1.633f, -0.453f, 2.082f, -0.752f)
                curveToRelative(0.098f, -0.065f, 0.229f, -0.153f, 0.323f, -0.205f)
                curveToRelative(0.172f, 0.132f, 0.427f, 0.377f, 0.593f, 0.538f)
                curveToRelative(0.657f, 0.632f, 1.475f, 1.419f, 2.579f, 1.419f)
                curveToRelative(2.374f, 0.0f, 4.215f, -2.871f, 4.723f, -3.75f)
                close()
                moveTo(9.832f, 6.055f)
                lineToRelative(-1.664f, -1.109f)
                curveToRelative(-0.772f, 1.158f, -1.852f, 2.057f, -3.04f, 2.531f)
                lineToRelative(0.742f, 1.857f)
                curveToRelative(1.582f, -0.632f, 2.952f, -1.766f, 3.962f, -3.279f)
                close()
            }
        }
        .build()
        return _faceWoozy!!
    }

private var _faceWoozy: ImageVector? = null
