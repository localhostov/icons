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

public val Icons.Bold.TentArrowLeftRight: ImageVector
    get() {
        if (_tentArrowLeftRight != null) {
            return _tentArrowLeftRight!!
        }
        _tentArrowLeftRight = Builder(name = "TentArrowLeftRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 5.207f)
                lineToRelative(-2.999f, 3.163f)
                curveToRelative(-0.63f, 0.63f, -1.707f, 0.184f, -1.707f, -0.707f)
                verticalLineToRelative(-1.663f)
                lineTo(4.999f, 6.0f)
                verticalLineToRelative(1.663f)
                curveToRelative(0.0f, 0.891f, -1.077f, 1.337f, -1.707f, 0.707f)
                lineTo(0.293f, 5.207f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                lineTo(3.292f, 0.63f)
                curveTo(3.922f, 0.0f, 4.999f, 0.446f, 4.999f, 1.337f)
                verticalLineToRelative(1.663f)
                horizontalLineToRelative(14.002f)
                verticalLineToRelative(-1.663f)
                curveToRelative(0.0f, -0.891f, 1.077f, -1.337f, 1.707f, -0.707f)
                lineToRelative(2.999f, 3.163f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.414f)
                close()
                moveTo(21.571f, 17.445f)
                curveToRelative(0.663f, 1.427f, 0.554f, 3.07f, -0.292f, 4.396f)
                curveToRelative(-0.848f, 1.328f, -2.294f, 2.121f, -3.871f, 2.121f)
                lineTo(6.596f, 23.962f)
                curveToRelative(-1.577f, 0.0f, -3.023f, -0.793f, -3.871f, -2.121f)
                curveToRelative(-0.846f, -1.326f, -0.955f, -2.97f, -0.292f, -4.396f)
                curveToRelative(0.036f, -0.077f, 5.595f, -8.1f, 5.63f, -8.14f)
                curveToRelative(1.166f, -1.35f, 2.131f, -2.306f, 3.938f, -2.306f)
                curveToRelative(1.548f, 0.0f, 2.864f, 0.79f, 4.023f, 2.415f)
                curveToRelative(0.0f, 0.0f, 5.512f, 7.954f, 5.548f, 8.031f)
                close()
                moveTo(18.893f, 18.81f)
                lineToRelative(-5.323f, -7.669f)
                curveToRelative(-0.814f, -1.142f, -1.344f, -1.142f, -1.57f, -1.142f)
                curveToRelative(-0.399f, 0.0f, -0.567f, 0.0f, -1.616f, 1.207f)
                lineToRelative(-5.273f, 7.604f)
                curveToRelative(-0.184f, 0.473f, -0.134f, 0.983f, 0.144f, 1.418f)
                curveToRelative(0.298f, 0.467f, 0.787f, 0.734f, 1.342f, 0.734f)
                horizontalLineToRelative(1.813f)
                lineToRelative(2.211f, -4.083f)
                curveToRelative(0.546f, -1.173f, 2.216f, -1.173f, 2.762f, 0.0f)
                lineToRelative(2.212f, 4.083f)
                horizontalLineToRelative(1.814f)
                curveToRelative(0.555f, 0.0f, 1.044f, -0.268f, 1.342f, -0.734f)
                curveToRelative(0.276f, -0.435f, 0.327f, -0.945f, 0.144f, -1.418f)
                close()
            }
        }
        .build()
        return _tentArrowLeftRight!!
    }

private var _tentArrowLeftRight: ImageVector? = null
