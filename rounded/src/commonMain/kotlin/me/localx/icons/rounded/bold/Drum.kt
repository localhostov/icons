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

public val Icons.Bold.Drum: ImageVector
    get() {
        if (_drum != null) {
            return _drum!!
        }
        _drum = Builder(name = "Drum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.271f, 8.174f)
                curveToRelative(-0.456f, -0.692f, -1.386f, -0.881f, -2.078f, -0.426f)
                curveToRelative(-0.691f, 0.456f, -0.882f, 1.387f, -0.426f, 2.078f)
                curveToRelative(0.156f, 0.237f, 0.232f, 0.457f, 0.232f, 0.674f)
                curveToRelative(0.0f, 1.427f, -3.506f, 3.5f, -9.0f, 3.5f)
                reflectiveCurveToRelative(-9.0f, -2.073f, -9.0f, -3.5f)
                curveToRelative(0.0f, -1.199f, 2.707f, -3.119f, 7.602f, -3.453f)
                curveToRelative(0.827f, -0.056f, 1.451f, -0.771f, 1.395f, -1.598f)
                curveToRelative(-0.056f, -0.826f, -0.774f, -1.465f, -1.598f, -1.395f)
                curveTo(4.275f, 4.472f, 0.0f, 7.122f, 0.0f, 10.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.706f, 5.159f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.794f, 12.0f, -6.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.811f, -0.245f, -1.594f, -0.729f, -2.326f)
                close()
                moveTo(10.5f, 20.947f)
                curveToRelative(-0.903f, -0.065f, -1.739f, -0.187f, -2.5f, -0.35f)
                verticalLineToRelative(-3.939f)
                curveToRelative(0.794f, 0.142f, 1.63f, 0.243f, 2.5f, 0.297f)
                verticalLineToRelative(3.993f)
                close()
                moveTo(13.5f, 16.954f)
                curveToRelative(0.87f, -0.054f, 1.706f, -0.154f, 2.5f, -0.297f)
                verticalLineToRelative(3.939f)
                curveToRelative(-0.761f, 0.164f, -1.597f, 0.285f, -2.5f, 0.35f)
                verticalLineToRelative(-3.993f)
                close()
                moveTo(3.0f, 17.5f)
                verticalLineToRelative(-2.61f)
                curveToRelative(0.594f, 0.36f, 1.264f, 0.681f, 2.0f, 0.957f)
                verticalLineToRelative(3.727f)
                curveToRelative(-1.287f, -0.657f, -2.0f, -1.432f, -2.0f, -2.075f)
                close()
                moveTo(19.0f, 19.575f)
                verticalLineToRelative(-3.727f)
                curveToRelative(0.736f, -0.277f, 1.406f, -0.598f, 2.0f, -0.957f)
                verticalLineToRelative(2.61f)
                curveToRelative(0.0f, 0.643f, -0.713f, 1.418f, -2.0f, 2.075f)
                close()
                moveTo(12.379f, 10.496f)
                curveToRelative(-0.551f, -0.619f, -0.494f, -1.566f, 0.125f, -2.117f)
                lineTo(21.504f, 0.379f)
                curveToRelative(0.619f, -0.552f, 1.568f, -0.495f, 2.117f, 0.125f)
                curveToRelative(0.551f, 0.619f, 0.494f, 1.566f, -0.125f, 2.117f)
                lineToRelative(-9.0f, 8.0f)
                curveToRelative(-0.285f, 0.254f, -0.642f, 0.379f, -0.995f, 0.379f)
                curveToRelative(-0.414f, 0.0f, -0.826f, -0.17f, -1.122f, -0.504f)
                close()
            }
        }
        .build()
        return _drum!!
    }

private var _drum: ImageVector? = null
