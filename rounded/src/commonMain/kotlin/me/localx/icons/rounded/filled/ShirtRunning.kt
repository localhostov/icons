package me.localx.icons.rounded.filled

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

public val Icons.Filled.ShirtRunning: ImageVector
    get() {
        if (_shirtRunning != null) {
            return _shirtRunning!!
        }
        _shirtRunning = Builder(name = "ShirtRunning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.691f, 21.491f)
                curveToRelative(-0.427f, -0.736f, -0.691f, -1.58f, -0.691f, -2.491f)
                verticalLineToRelative(-8.026f)
                curveToRelative(0.0f, -1.023f, 0.518f, -1.981f, 1.35f, -2.502f)
                curveToRelative(1.034f, -0.645f, 1.65f, -1.756f, 1.65f, -2.972f)
                lineTo(6.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(16.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.216f, 0.616f, 2.327f, 1.649f, 2.972f)
                curveToRelative(0.365f, 0.228f, 0.655f, 0.55f, 0.882f, 0.915f)
                lineTo(3.691f, 21.491f)
                close()
                moveTo(5.025f, 22.995f)
                curveToRelative(0.834f, 0.623f, 1.857f, 1.005f, 2.975f, 1.005f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-7.487f)
                lineToRelative(-15.975f, 11.482f)
                close()
            }
        }
        .build()
        return _shirtRunning!!
    }

private var _shirtRunning: ImageVector? = null
