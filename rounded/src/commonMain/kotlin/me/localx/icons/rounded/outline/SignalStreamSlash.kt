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

public val Icons.Outline.SignalStreamSlash: ImageVector
    get() {
        if (_signalStreamSlash != null) {
            return _signalStreamSlash!!
        }
        _signalStreamSlash = Builder(name = "SignalStreamSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineTo(11.48f, 10.07f)
                curveToRelative(0.67f, -0.18f, 1.41f, 0.0f, 1.93f, 0.52f)
                reflectiveCurveToRelative(0.7f, 1.26f, 0.52f, 1.93f)
                lineToRelative(2.24f, 2.24f)
                curveToRelative(1.28f, -1.94f, 1.07f, -4.59f, -0.64f, -6.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f)
                curveToRelative(2.49f, 2.49f, 2.71f, 6.4f, 0.66f, 9.14f)
                lineToRelative(2.14f, 2.14f)
                curveToRelative(3.21f, -3.92f, 2.99f, -9.74f, -0.67f, -13.4f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f)
                curveToRelative(4.44f, 4.44f, 4.67f, 11.52f, 0.68f, 16.23f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                close()
                moveTo(2.68f, 8.36f)
                curveToRelative(0.2f, -0.51f, -0.05f, -1.09f, -0.57f, -1.29f)
                curveToRelative(-0.52f, -0.2f, -1.09f, 0.05f, -1.29f, 0.57f)
                curveTo(-0.91f, 12.07f, 0.15f, 17.12f, 3.51f, 20.49f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(-2.81f, -2.81f, -3.69f, -7.01f, -2.25f, -10.71f)
                close()
                moveTo(7.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 1.87f, 0.73f, 3.63f, 2.05f, 4.95f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(-0.94f, -0.94f, -1.46f, -2.2f, -1.46f, -3.54f)
                close()
            }
        }
        .build()
        return _signalStreamSlash!!
    }

private var _signalStreamSlash: ImageVector? = null
