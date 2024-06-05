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

public val Icons.Outline.FaceParty: ImageVector
    get() {
        if (_faceParty != null) {
            return _faceParty!!
        }
        _faceParty = Builder(name = "FaceParty", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 0.0f)
                curveToRelative(6.273f, 0.0f, 11.428f, 4.839f, 11.948f, 10.98f)
                curveToRelative(-0.62f, -0.456f, -1.345f, -0.768f, -2.137f, -0.898f)
                curveToRelative(-0.898f, -4.599f, -4.954f, -8.082f, -9.811f, -8.082f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(3.546f, 0.0f, 6.727f, -1.555f, 8.926f, -4.007f)
                curveToRelative(-0.81f, -0.012f, -1.562f, -0.229f, -2.235f, -0.582f)
                curveToRelative(-1.774f, 1.604f, -4.117f, 2.59f, -6.691f, 2.59f)
                close()
                moveTo(6.28f, 9.334f)
                lineToRelative(-1.406f, 1.422f)
                curveToRelative(0.792f, 0.784f, 1.913f, 1.265f, 3.073f, 1.265f)
                curveToRelative(1.044f, 0.0f, 2.12f, -0.39f, 3.019f, -1.297f)
                lineToRelative(-1.422f, -1.406f)
                curveToRelative(-1.19f, 1.202f, -2.604f, 0.67f, -3.264f, 0.017f)
                close()
                moveTo(16.273f, 10.004f)
                curveToRelative(-0.646f, 0.038f, -1.228f, -0.196f, -1.731f, -0.707f)
                lineToRelative(-1.424f, 1.406f)
                curveToRelative(0.838f, 0.848f, 1.9f, 1.306f, 3.017f, 1.306f)
                curveToRelative(0.09f, 0.0f, 0.181f, -0.003f, 0.271f, -0.009f)
                curveToRelative(1.036f, -0.069f, 2.056f, -0.528f, 2.798f, -1.262f)
                lineToRelative(-1.406f, -1.422f)
                curveToRelative(-0.398f, 0.394f, -0.968f, 0.65f, -1.523f, 0.688f)
                close()
                moveTo(1.104f, 10.0f)
                lineTo(-0.004f, -0.004f)
                lineTo(10.0f, 1.104f)
                verticalLineToRelative(0.896f)
                curveToRelative(0.0f, 3.589f, -4.411f, 8.0f, -8.0f, 8.0f)
                horizontalLineToRelative(-0.896f)
                close()
                moveTo(2.26f, 2.26f)
                lineToRelative(0.621f, 5.608f)
                curveToRelative(2.045f, -0.576f, 4.411f, -2.942f, 4.987f, -4.987f)
                lineToRelative(-5.608f, -0.621f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(-0.811f, 0.0f, -1.598f, 0.335f, -2.16f, 0.918f)
                lineToRelative(1.439f, 1.389f)
                curveToRelative(0.19f, -0.198f, 0.446f, -0.307f, 0.721f, -0.307f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.086f)
                curveToRelative(0.055f, -0.156f, 0.086f, -0.325f, 0.086f, -0.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.175f, -0.03f, -0.344f, -0.086f, -0.5f)
                horizontalLineToRelative(6.086f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _faceParty!!
    }

private var _faceParty: ImageVector? = null
