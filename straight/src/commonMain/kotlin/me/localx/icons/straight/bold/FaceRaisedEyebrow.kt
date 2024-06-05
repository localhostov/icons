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

public val Icons.Bold.FaceRaisedEyebrow: ImageVector
    get() {
        if (_faceRaisedEyebrow != null) {
            return _faceRaisedEyebrow!!
        }
        _faceRaisedEyebrow = Builder(name = "FaceRaisedEyebrow", defaultWidth = 512.0.dp,
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
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                curveToRelative(0.0f, -1.849f, 0.561f, -3.569f, 1.52f, -5.0f)
                horizontalLineToRelative(5.48f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.65f)
                curveToRelative(1.546f, -1.25f, 3.512f, -2.0f, 5.65f, -2.0f)
                curveToRelative(2.377f, 0.0f, 4.541f, 0.927f, 6.152f, 2.437f)
                curveToRelative(-0.676f, -0.288f, -1.405f, -0.437f, -2.152f, -0.437f)
                curveToRelative(-1.668f, 0.0f, -3.227f, 0.744f, -4.278f, 2.043f)
                lineToRelative(1.555f, 1.258f)
                curveToRelative(0.669f, -0.826f, 1.662f, -1.301f, 2.723f, -1.301f)
                curveToRelative(0.696f, 0.0f, 1.368f, 0.203f, 1.944f, 0.589f)
                lineToRelative(0.931f, -1.391f)
                curveToRelative(1.325f, 1.568f, 2.126f, 3.593f, 2.126f, 5.802f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _faceRaisedEyebrow!!
    }

private var _faceRaisedEyebrow: ImageVector? = null
