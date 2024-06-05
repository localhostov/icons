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

public val Icons.Bold.WindWarning: ImageVector
    get() {
        if (_windWarning != null) {
            return _windWarning!!
        }
        _windWarning = Builder(name = "WindWarning", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.542f, 20.0f)
                arcToRelative(5.022f, 5.022f, 0.0f, false, true, -3.607f, -1.562f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.213f, -2.024f)
                curveToRelative(0.92f, 1.027f, 2.9f, 0.632f, 2.893f, -0.914f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(14.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(5.042f)
                curveTo(25.477f, 11.156f, 25.473f, 19.846f, 19.542f, 20.0f)
                close()
                moveTo(24.042f, 4.5f)
                curveToRelative(0.015f, -4.265f, -5.366f, -5.982f, -8.107f, -2.938f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.213f, 2.024f)
                curveToRelative(0.92f, -1.027f, 2.9f, -0.632f, 2.893f, 0.914f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(16.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(3.042f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 24.042f, 4.5f)
                close()
                moveTo(14.0f, 19.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 9.5f, 15.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcToRelative(1.851f, 1.851f, 0.0f, false, true, -1.383f, -0.649f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.323f, 1.9f)
                arcTo(4.827f, 4.827f, 0.0f, false, false, 9.5f, 24.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 14.0f, 19.5f)
                close()
                moveTo(13.0f, 6.5f)
                curveToRelative(-0.273f, 8.59f, -12.728f, 8.588f, -13.0f, 0.0f)
                curveTo(0.273f, -2.09f, 12.728f, -2.088f, 13.0f, 6.5f)
                close()
                moveTo(8.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 9.5f)
                close()
                moveTo(8.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _windWarning!!
    }

private var _windWarning: ImageVector? = null
