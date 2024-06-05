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

public val Icons.Bold.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(5.159f, 2.0f, 0.0f, 4.794f, 0.0f, 8.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.706f, 5.159f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.794f, 12.0f, -6.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -3.706f, -5.159f, -6.5f, -12.0f, -6.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(5.494f, 0.0f, 9.0f, 2.073f, 9.0f, 3.5f)
                reflectiveCurveToRelative(-3.506f, 3.5f, -9.0f, 3.5f)
                reflectiveCurveTo(3.0f, 9.927f, 3.0f, 8.5f)
                reflectiveCurveToRelative(3.506f, -3.5f, 9.0f, -3.5f)
                close()
                moveTo(10.5f, 14.954f)
                verticalLineToRelative(3.993f)
                curveToRelative(-0.903f, -0.065f, -1.739f, -0.187f, -2.5f, -0.35f)
                verticalLineToRelative(-3.939f)
                curveToRelative(0.794f, 0.142f, 1.63f, 0.243f, 2.5f, 0.297f)
                close()
                moveTo(13.5f, 14.954f)
                curveToRelative(0.87f, -0.054f, 1.706f, -0.154f, 2.5f, -0.297f)
                verticalLineToRelative(3.939f)
                curveToRelative(-0.761f, 0.163f, -1.597f, 0.285f, -2.5f, 0.35f)
                verticalLineToRelative(-3.993f)
                close()
                moveTo(3.0f, 15.5f)
                verticalLineToRelative(-2.61f)
                curveToRelative(0.594f, 0.36f, 1.264f, 0.681f, 2.0f, 0.957f)
                verticalLineToRelative(3.728f)
                curveToRelative(-1.287f, -0.657f, -2.0f, -1.432f, -2.0f, -2.075f)
                close()
                moveTo(19.0f, 17.575f)
                verticalLineToRelative(-3.728f)
                curveToRelative(0.736f, -0.277f, 1.406f, -0.598f, 2.0f, -0.957f)
                verticalLineToRelative(2.61f)
                curveToRelative(0.0f, 0.644f, -0.713f, 1.418f, -2.0f, 2.075f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
