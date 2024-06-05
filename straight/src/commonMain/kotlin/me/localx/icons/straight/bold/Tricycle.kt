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

public val Icons.Bold.Tricycle: ImageVector
    get() {
        if (_tricycle != null) {
            return _tricycle!!
        }
        _tricycle = Builder(name = "Tricycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.386f, 12.188f)
                curveToRelative(-0.349f, -3.736f, -0.851f, -7.312f, -1.138f, -9.216f)
                curveToRelative(-0.259f, -1.722f, -1.714f, -2.972f, -3.46f, -2.972f)
                horizontalLineToRelative(-3.789f)
                lineTo(10.999f, 3.0f)
                horizontalLineToRelative(3.789f)
                curveToRelative(0.25f, 0.0f, 0.457f, 0.176f, 0.493f, 0.418f)
                curveToRelative(0.164f, 1.087f, 0.399f, 2.734f, 0.635f, 4.636f)
                curveToRelative(-1.843f, 0.136f, -4.584f, 0.554f, -7.112f, 1.77f)
                lineToRelative(-0.656f, -1.804f)
                horizontalLineToRelative(1.851f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 5.02f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.956f)
                lineToRelative(1.255f, 3.452f)
                curveToRelative(-1.142f, 0.951f, -2.122f, 2.158f, -2.793f, 3.694f)
                curveToRelative(-1.958f, 0.488f, -3.418f, 2.247f, -3.418f, 4.354f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -1.721f, -0.982f, -3.201f, -2.404f, -3.958f)
                curveToRelative(2.161f, -3.507f, 7.07f, -4.331f, 9.663f, -4.515f)
                curveToRelative(0.042f, 0.398f, 0.083f, 0.797f, 0.121f, 1.202f)
                curveToRelative(-2.523f, 0.709f, -4.38f, 3.025f, -4.38f, 5.772f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -2.831f, -1.973f, -5.204f, -4.614f, -5.832f)
                close()
                moveTo(4.5f, 21.02f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.0f, 21.02f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _tricycle!!
    }

private var _tricycle: ImageVector? = null
