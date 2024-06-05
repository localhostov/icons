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

public val Icons.Outline.CatHead: ImageVector
    get() {
        if (_catHead != null) {
            return _catHead!!
        }
        _catHead = Builder(name = "CatHead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.102f, 14.794f)
                curveToRelative(0.908f, -0.362f, 1.398f, -1.12f, 1.398f, -1.606f)
                curveToRelative(0.0f, -0.656f, -0.889f, -1.188f, -2.5f, -1.188f)
                reflectiveCurveToRelative(-2.5f, 0.532f, -2.5f, 1.188f)
                curveToRelative(0.0f, 0.486f, 0.49f, 1.244f, 1.398f, 1.606f)
                curveToRelative(-0.212f, 0.914f, -0.869f, 2.206f, -2.898f, 2.206f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.994f, 0.0f, 3.246f, -0.831f, 4.0f, -1.877f)
                curveToRelative(0.754f, 1.046f, 2.006f, 1.877f, 4.0f, 1.877f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-2.03f, 0.0f, -2.686f, -1.292f, -2.898f, -2.206f)
                close()
                moveTo(24.0f, 13.5f)
                curveToRelative(0.0f, 5.79f, -4.71f, 10.5f, -10.5f, 10.5f)
                horizontalLineToRelative(-3.0f)
                curveTo(4.71f, 24.0f, 0.0f, 19.29f, 0.0f, 13.5f)
                curveTo(0.0f, 6.663f, 1.026f, 1.79f, 1.07f, 1.586f)
                lineTo(1.399f, 0.048f)
                lineToRelative(4.053f, 3.074f)
                curveToRelative(1.913f, -1.314f, 4.251f, -2.08f, 6.529f, -2.122f)
                curveToRelative(2.325f, -0.023f, 4.459f, 0.659f, 6.538f, 2.143f)
                lineTo(22.653f, 0.009f)
                lineToRelative(0.284f, 1.612f)
                curveToRelative(0.043f, 0.246f, 1.063f, 6.097f, 1.063f, 11.879f)
                close()
                moveTo(22.0f, 13.5f)
                curveToRelative(0.0f, -3.817f, -0.474f, -7.753f, -0.779f, -9.896f)
                lineToRelative(-2.714f, 2.057f)
                lineToRelative(-0.607f, -0.482f)
                curveToRelative(-1.894f, -1.503f, -3.803f, -2.218f, -5.881f, -2.179f)
                curveToRelative(-2.104f, 0.038f, -4.274f, 0.824f, -5.953f, 2.154f)
                lineToRelative(-0.607f, 0.482f)
                lineToRelative(-2.709f, -2.056f)
                curveToRelative(-0.304f, 1.948f, -0.748f, 5.545f, -0.748f, 9.919f)
                curveToRelative(0.0f, 4.687f, 3.813f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                close()
                moveTo(16.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _catHead!!
    }

private var _catHead: ImageVector? = null
