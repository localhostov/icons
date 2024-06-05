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
                moveToRelative(22.016f, 6.822f)
                lineToRelative(-2.266f, 2.041f)
                curveToRelative(0.81f, 0.546f, 1.25f, 1.132f, 1.25f, 1.637f)
                curveToRelative(0.0f, 1.427f, -3.506f, 3.5f, -9.0f, 3.5f)
                reflectiveCurveToRelative(-9.0f, -2.073f, -9.0f, -3.5f)
                curveToRelative(0.0f, -1.37f, 3.231f, -3.335f, 8.35f, -3.49f)
                lineToRelative(3.192f, -2.876f)
                curveToRelative(-0.815f, -0.088f, -1.665f, -0.134f, -2.543f, -0.134f)
                curveTo(5.159f, 4.0f, 0.0f, 6.794f, 0.0f, 10.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.706f, 5.159f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.794f, 12.0f, -6.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.386f, -0.722f, -2.645f, -1.984f, -3.678f)
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
                moveTo(11.188f, 9.847f)
                lineTo(22.033f, 0.078f)
                lineToRelative(2.008f, 2.229f)
                lineToRelative(-10.845f, 9.77f)
                lineToRelative(-2.008f, -2.229f)
                close()
            }
        }
        .build()
        return _drum!!
    }

private var _drum: ImageVector? = null
