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

public val Icons.Bold.FaceWeary: ImageVector
    get() {
        if (_faceWeary != null) {
            return _faceWeary!!
        }
        _faceWeary = Builder(name = "FaceWeary", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.56f, 9.576f)
                curveToRelative(-0.949f, 0.922f, -2.228f, 1.424f, -3.584f, 1.424f)
                curveToRelative(-0.216f, 0.0f, -0.433f, -0.013f, -0.651f, -0.039f)
                curveToRelative(-0.823f, -0.097f, -1.411f, -0.842f, -1.314f, -1.665f)
                curveToRelative(0.097f, -0.823f, 0.841f, -1.406f, 1.665f, -1.314f)
                curveToRelative(0.41f, 0.048f, 1.181f, 0.039f, 1.794f, -0.558f)
                curveToRelative(0.595f, -0.576f, 1.544f, -0.563f, 2.121f, 0.03f)
                curveToRelative(0.578f, 0.594f, 0.564f, 1.544f, -0.03f, 2.121f)
                close()
                moveTo(17.676f, 10.962f)
                curveToRelative(-0.218f, 0.026f, -0.436f, 0.039f, -0.651f, 0.039f)
                curveToRelative(-1.346f, 0.0f, -2.618f, -0.496f, -3.563f, -1.404f)
                curveToRelative(-0.598f, -0.574f, -0.617f, -1.523f, -0.042f, -2.121f)
                curveToRelative(0.574f, -0.598f, 1.524f, -0.616f, 2.121f, -0.042f)
                curveToRelative(0.613f, 0.589f, 1.382f, 0.597f, 1.785f, 0.549f)
                curveToRelative(0.823f, -0.093f, 1.568f, 0.491f, 1.666f, 1.314f)
                curveToRelative(0.097f, 0.823f, -0.491f, 1.568f, -1.314f, 1.666f)
                close()
                moveTo(16.705f, 15.615f)
                curveToRelative(0.801f, 0.958f, -0.15f, 2.366f, -1.335f, 1.974f)
                curveToRelative(-0.817f, -0.271f, -1.832f, -0.587f, -3.369f, -0.588f)
                curveToRelative(-1.537f, 0.0f, -2.552f, 0.317f, -3.368f, 0.588f)
                curveToRelative(-1.185f, 0.393f, -2.137f, -1.017f, -1.335f, -1.974f)
                curveToRelative(0.995f, -1.188f, 2.503f, -2.613f, 4.703f, -2.613f)
                reflectiveCurveToRelative(3.711f, 1.426f, 4.704f, 2.614f)
                close()
            }
        }
        .build()
        return _faceWeary!!
    }

private var _faceWeary: ImageVector? = null
