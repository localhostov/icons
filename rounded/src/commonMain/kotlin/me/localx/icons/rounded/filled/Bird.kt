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
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.732f, 0.0f, 1.41f, -0.211f, 2.0f, -0.555f)
                verticalLineToRelative(2.055f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(24.0f, 7.25f)
                curveToRelative(0.0f, 0.455f, -0.271f, 0.866f, -0.689f, 1.045f)
                lineToRelative(-1.311f, 0.562f)
                verticalLineToRelative(2.143f)
                curveToRelative(0.0f, 5.024f, -3.39f, 9.263f, -8.0f, 10.574f)
                verticalLineToRelative(1.426f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.051f)
                curveToRelative(-0.33f, 0.03f, -0.662f, 0.051f, -1.0f, 0.051f)
                reflectiveCurveToRelative(-0.67f, -0.021f, -1.0f, -0.051f)
                verticalLineToRelative(1.051f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.426f)
                curveToRelative(-1.717f, -0.488f, -3.264f, -1.384f, -4.531f, -2.574f)
                horizontalLineToRelative(0.031f)
                curveToRelative(3.59f, 0.0f, 6.5f, -2.91f, 6.5f, -6.5f)
                verticalLineToRelative(-6.263f)
                curveTo(10.0f, 3.003f, 12.456f, 0.173f, 15.686f, 0.008f)
                curveToRelative(3.332f, -0.17f, 6.1f, 2.381f, 6.296f, 5.627f)
                lineToRelative(1.329f, 0.57f)
                curveToRelative(0.418f, 0.179f, 0.689f, 0.59f, 0.689f, 1.045f)
                close()
                moveTo(18.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
