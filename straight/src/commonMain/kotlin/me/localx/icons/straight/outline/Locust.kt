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

public val Icons.Outline.Locust: ImageVector
    get() {
        if (_locust != null) {
            return _locust!!
        }
        _locust = Builder(name = "Locust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.432f, 13.081f)
                curveToRelative(1.273f, -0.972f, 2.568f, -2.97f, 2.568f, -7.081f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 5.82f, -2.895f, 5.996f, -3.0f, 6.0f)
                horizontalLineToRelative(-4.723f)
                lineTo(8.603f, 1.063f)
                lineToRelative(-2.329f, 10.937f)
                horizontalLineToRelative(-1.757f)
                lineToRelative(1.761f, -7.99f)
                lineToRelative(-1.603f, -2.748f)
                lineToRelative(-2.286f, 10.739f)
                lineTo(0.0f, 12.001f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.513f, 0.483f, 2.915f, 1.302f, 4.061f)
                lineTo(0.0f, 23.0f)
                horizontalLineToRelative(2.056f)
                lineToRelative(0.964f, -4.244f)
                curveToRelative(0.502f, 0.348f, 1.051f, 0.632f, 1.636f, 0.841f)
                lineToRelative(-0.725f, 3.404f)
                horizontalLineToRelative(2.046f)
                lineToRelative(0.641f, -3.01f)
                curveToRelative(0.126f, 0.007f, 0.253f, 0.01f, 0.381f, 0.01f)
                horizontalLineToRelative(9.174f)
                lineToRelative(1.556f, 3.0f)
                horizontalLineToRelative(2.253f)
                lineToRelative(-1.556f, -3.0f)
                horizontalLineToRelative(5.573f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.033f, -1.017f, -3.833f, -2.568f, -4.919f)
                close()
                moveTo(2.101f, 14.0f)
                horizontalLineToRelative(3.748f)
                lineToRelative(-0.77f, 3.616f)
                curveToRelative(-1.508f, -0.63f, -2.644f, -1.979f, -2.978f, -3.616f)
                close()
                moveTo(7.043f, 18.0f)
                lineToRelative(0.852f, -4.0f)
                horizontalLineToRelative(2.914f)
                lineToRelative(-1.037f, -2.0f)
                horizontalLineToRelative(-1.451f)
                lineToRelative(1.078f, -5.062f)
                lineToRelative(4.701f, 9.062f)
                horizontalLineToRelative(2.253f)
                lineToRelative(-0.579f, -1.116f)
                lineToRelative(-0.459f, -0.884f)
                horizontalLineToRelative(2.686f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                lineTo(7.042f, 18.0f)
                close()
            }
        }
        .build()
        return _locust!!
    }

private var _locust: ImageVector? = null
