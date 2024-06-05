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

public val Icons.Filled.Tamale: ImageVector
    get() {
        if (_tamale != null) {
            return _tamale!!
        }
        _tamale = Builder(name = "Tamale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.183f, 14.0f)
                horizontalLineToRelative(2.817f)
                verticalLineToRelative(9.988f)
                curveToRelative(-1.211f, -0.028f, -2.329f, -0.106f, -3.332f, -0.207f)
                lineToRelative(0.515f, -9.781f)
                close()
                moveTo(17.82f, 14.0f)
                lineToRelative(0.501f, 9.53f)
                curveToRelative(2.0f, -0.302f, 3.214f, -0.644f, 3.304f, -0.669f)
                lineToRelative(0.812f, -0.232f)
                lineToRelative(-0.959f, -8.629f)
                horizontalLineToRelative(-3.659f)
                close()
                moveTo(1.562f, 22.629f)
                lineToRelative(0.812f, 0.232f)
                curveToRelative(0.09f, 0.026f, 1.303f, 0.367f, 3.304f, 0.669f)
                lineToRelative(0.501f, -9.53f)
                horizontalLineToRelative(-3.659f)
                lineToRelative(-0.959f, 8.629f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineToRelative(9.988f)
                curveToRelative(1.211f, -0.028f, 2.329f, -0.106f, 3.332f, -0.207f)
                lineToRelative(-0.515f, -9.781f)
                horizontalLineToRelative(-2.817f)
                close()
                moveTo(21.256f, 12.0f)
                lineToRelative(1.181f, -10.629f)
                lineToRelative(-0.812f, -0.232f)
                curveToRelative(-0.09f, -0.026f, -1.303f, -0.367f, -3.304f, -0.669f)
                lineToRelative(-0.501f, 9.53f)
                horizontalLineToRelative(-2.003f)
                lineTo(16.332f, 0.219f)
                curveToRelative(-1.003f, -0.102f, -2.121f, -0.179f, -3.332f, -0.207f)
                verticalLineToRelative(9.988f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 0.012f)
                curveToRelative(-1.211f, 0.028f, -2.329f, 0.106f, -3.332f, 0.207f)
                lineToRelative(0.515f, 9.781f)
                horizontalLineToRelative(-2.003f)
                lineTo(5.679f, 0.47f)
                curveToRelative(-2.0f, 0.302f, -3.214f, 0.644f, -3.304f, 0.669f)
                lineToRelative(-0.812f, 0.232f)
                lineToRelative(1.181f, 10.629f)
                horizontalLineToRelative(18.512f)
                close()
            }
        }
        .build()
        return _tamale!!
    }

private var _tamale: ImageVector? = null
