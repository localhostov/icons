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

public val Icons.Bold.TentArrowDownToLine: ImageVector
    get() {
        if (_tentArrowDownToLine != null) {
            return _tentArrowDownToLine!!
        }
        _tentArrowDownToLine = Builder(name = "TentArrowDownToLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.63f, 5.708f)
                curveTo(0.0f, 5.078f, 0.446f, 4.001f, 1.337f, 4.001f)
                horizontalLineToRelative(1.663f)
                lineTo(3.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.501f)
                horizontalLineToRelative(1.663f)
                curveToRelative(0.891f, 0.0f, 1.337f, 1.077f, 0.707f, 1.707f)
                lineToRelative(-3.163f, 3.163f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineTo(0.63f, 5.708f)
                close()
                moveTo(23.28f, 21.878f)
                curveToRelative(-0.847f, 1.329f, -2.294f, 2.122f, -3.871f, 2.122f)
                lineTo(1.5f, 24.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.787f)
                curveToRelative(-0.42f, -1.133f, -0.377f, -2.393f, 0.146f, -3.518f)
                curveToRelative(0.036f, -0.077f, 5.595f, -8.1f, 5.63f, -8.14f)
                curveToRelative(1.166f, -1.35f, 2.131f, -2.306f, 3.938f, -2.306f)
                curveToRelative(1.548f, 0.0f, 2.864f, 0.79f, 4.023f, 2.415f)
                curveToRelative(0.0f, 0.0f, 5.512f, 7.954f, 5.548f, 8.031f)
                curveToRelative(0.663f, 1.426f, 0.554f, 3.069f, -0.292f, 4.396f)
                close()
                moveTo(20.894f, 18.848f)
                lineToRelative(-5.323f, -7.669f)
                curveToRelative(-0.814f, -1.142f, -1.344f, -1.142f, -1.57f, -1.142f)
                curveToRelative(-0.399f, 0.0f, -0.567f, 0.0f, -1.616f, 1.207f)
                lineToRelative(-5.273f, 7.604f)
                curveToRelative(-0.184f, 0.473f, -0.133f, 0.983f, 0.144f, 1.417f)
                curveToRelative(0.298f, 0.468f, 0.787f, 0.735f, 1.342f, 0.735f)
                horizontalLineToRelative(1.813f)
                lineToRelative(2.211f, -4.083f)
                curveToRelative(0.546f, -1.173f, 2.216f, -1.173f, 2.762f, 0.0f)
                lineToRelative(2.213f, 4.083f)
                horizontalLineToRelative(1.814f)
                curveToRelative(0.555f, 0.0f, 1.044f, -0.268f, 1.342f, -0.735f)
                curveToRelative(0.276f, -0.434f, 0.327f, -0.944f, 0.144f, -1.417f)
                close()
            }
        }
        .build()
        return _tentArrowDownToLine!!
    }

private var _tentArrowDownToLine: ImageVector? = null
