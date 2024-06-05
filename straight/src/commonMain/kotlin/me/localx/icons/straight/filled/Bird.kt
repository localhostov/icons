package me.localx.icons.straight.filled

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

public val Icons.Filled.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.5f, 17.0f)
                horizontalLineToRelative(-1.71f)
                curveToRelative(-1.131f, -1.726f, -1.79f, -3.786f, -1.79f, -6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.732f, 0.0f, 1.41f, -0.211f, 2.0f, -0.555f)
                verticalLineToRelative(2.055f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(-2.0f, 0.857f)
                verticalLineToRelative(2.143f)
                curveToRelative(0.0f, 5.024f, -3.39f, 9.263f, -8.0f, 10.574f)
                verticalLineToRelative(2.426f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.051f)
                curveToRelative(-0.33f, 0.03f, -0.662f, 0.051f, -1.0f, 0.051f)
                reflectiveCurveToRelative(-0.67f, -0.021f, -1.0f, -0.051f)
                verticalLineToRelative(2.051f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.426f)
                curveToRelative(-1.717f, -0.488f, -3.264f, -1.384f, -4.531f, -2.574f)
                horizontalLineToRelative(0.031f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -3.314f, 2.686f, -6.0f, 6.0f, -6.0f)
                curveToRelative(3.19f, 0.0f, 5.792f, 2.492f, 5.982f, 5.635f)
                lineToRelative(2.018f, 0.865f)
                close()
                moveTo(16.5f, 4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
