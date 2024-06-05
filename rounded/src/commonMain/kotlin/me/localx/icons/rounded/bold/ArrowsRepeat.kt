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

public val Icons.Bold.ArrowsRepeat: ImageVector
    get() {
        if (_arrowsRepeat != null) {
            return _arrowsRepeat!!
        }
        _arrowsRepeat = Builder(name = "ArrowsRepeat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.5f)
                curveTo(0.0f, 6.813f, 3.813f, 3.0f, 8.5f, 3.0f)
                horizontalLineToRelative(10.5f)
                lineTo(19.0f, 1.337f)
                curveTo(19.0f, 0.446f, 20.077f, 0.0f, 20.707f, 0.63f)
                lineToRelative(3.0f, 3.163f)
                curveToRelative(0.391f, 0.391f, 0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-3.0f, 3.163f)
                curveToRelative(-0.63f, 0.63f, -1.707f, 0.184f, -1.707f, -0.707f)
                verticalLineToRelative(-1.663f)
                lineTo(8.5f, 6.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.468f, -5.5f, 5.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 11.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(-1.663f)
                curveToRelative(0.0f, -0.891f, -1.077f, -1.337f, -1.707f, -0.707f)
                lineTo(0.293f, 18.793f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.024f, 0.0f, 1.414f)
                lineToRelative(3.0f, 3.163f)
                curveToRelative(0.63f, 0.63f, 1.707f, 0.184f, 1.707f, -0.707f)
                verticalLineToRelative(-1.663f)
                lineTo(15.5f, 21.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _arrowsRepeat!!
    }

private var _arrowsRepeat: ImageVector? = null
