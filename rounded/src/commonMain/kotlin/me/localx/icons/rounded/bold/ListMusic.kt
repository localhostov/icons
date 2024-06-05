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

public val Icons.Bold.ListMusic: ImageVector
    get() {
        if (_listMusic != null) {
            return _listMusic!!
        }
        _listMusic = Builder(name = "ListMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 0.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(8.602f)
                curveToRelative(-0.751f, -0.385f, -1.6f, -0.602f, -2.5f, -0.602f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(19.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(0.0f, 1.5f)
                curveTo(0.0f, 0.671f, 0.672f, 0.0f, 1.5f, 0.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(0.0f, 7.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(8.0f, 13.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 15.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _listMusic!!
    }

private var _listMusic: ImageVector? = null
