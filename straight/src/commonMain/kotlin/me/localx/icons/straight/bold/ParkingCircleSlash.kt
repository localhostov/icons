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

public val Icons.Bold.ParkingCircleSlash: ImageVector
    get() {
        if (_parkingCircleSlash != null) {
            return _parkingCircleSlash!!
        }
        _parkingCircleSlash = Builder(name = "ParkingCircleSlash", defaultWidth = 512.0.dp,
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
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 1.941f, -0.618f, 3.74f, -1.667f, 5.212f)
                lineToRelative(-3.268f, -3.268f)
                curveToRelative(1.182f, -0.924f, 1.935f, -2.364f, 1.935f, -3.944f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.934f, 0.0f, -1.784f, 0.368f, -2.412f, 0.967f)
                lineToRelative(-1.3f, -1.3f)
                curveToRelative(1.472f, -1.049f, 3.271f, -1.667f, 5.212f, -1.667f)
                curveToRelative(4.963f, 0.0f, 9.0f, 4.038f, 9.0f, 9.0f)
                close()
                moveTo(13.904f, 11.783f)
                lineToRelative(-3.692f, -3.692f)
                curveToRelative(0.081f, -0.057f, 0.18f, -0.092f, 0.287f, -0.092f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.766f, -0.442f, 1.449f, -1.096f, 1.783f)
                close()
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -1.941f, 0.618f, -3.74f, 1.667f, -5.212f)
                lineToRelative(12.545f, 12.545f)
                curveToRelative(-1.472f, 1.049f, -3.271f, 1.667f, -5.212f, 1.667f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                close()
                moveTo(7.0f, 11.949f)
                lineToRelative(3.051f, 3.051f)
                horizontalLineToRelative(-0.051f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.051f)
                close()
            }
        }
        .build()
        return _parkingCircleSlash!!
    }

private var _parkingCircleSlash: ImageVector? = null
