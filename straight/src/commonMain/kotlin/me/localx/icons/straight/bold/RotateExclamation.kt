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

public val Icons.Bold.RotateExclamation: ImageVector
    get() {
        if (_rotateExclamation != null) {
            return _rotateExclamation!!
        }
        _rotateExclamation = Builder(name = "RotateExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(3.207f, 0.0f, 6.253f, 1.285f, 8.485f, 3.515f)
                lineToRelative(2.476f, -2.476f)
                verticalLineToRelative(5.83f)
                curveToRelative(0.0f, 0.633f, -0.513f, 1.146f, -1.146f, 1.146f)
                horizontalLineToRelative(-5.83f)
                lineToRelative(2.378f, -2.378f)
                curveToRelative(-1.674f, -1.672f, -3.959f, -2.636f, -6.363f, -2.636f)
                curveTo(7.038f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                curveToRelative(-2.405f, 0.0f, -4.69f, -0.964f, -6.364f, -2.636f)
                lineToRelative(2.378f, -2.378f)
                lineTo(1.993f, 15.986f)
                curveToRelative(-0.527f, 0.0f, -0.955f, 0.428f, -0.955f, 0.955f)
                verticalLineToRelative(6.021f)
                lineToRelative(2.477f, -2.477f)
                curveToRelative(2.232f, 2.23f, 5.278f, 3.515f, 8.485f, 3.515f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.5f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(10.5f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _rotateExclamation!!
    }

private var _rotateExclamation: ImageVector? = null
