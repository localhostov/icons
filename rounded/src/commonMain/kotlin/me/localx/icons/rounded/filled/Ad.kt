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

public val Icons.Filled.Ad: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.5f)
                curveToRelative(-0.035f, 1.971f, -2.965f, 1.971f, -3.0f, 0.0f)
                curveToRelative(0.035f, -1.971f, 2.965f, -1.971f, 3.0f, 0.0f)
                close()
                moveTo(6.944f, 14.0f)
                horizontalLineToRelative(2.112f)
                lineToRelative(-1.056f, -3.52f)
                lineToRelative(-1.056f, 3.52f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 7.0f)
                curveTo(0.0f, 4.243f, 2.243f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(11.958f, 16.713f)
                lineToRelative(-3.0f, -10.0f)
                curveToRelative(-0.247f, -0.933f, -1.669f, -0.932f, -1.916f, 0.0f)
                lineToRelative(-3.0f, 10.0f)
                curveToRelative(-0.37f, 1.254f, 1.535f, 1.826f, 1.916f, 0.574f)
                lineToRelative(0.386f, -1.287f)
                horizontalLineToRelative(3.312f)
                lineToRelative(0.386f, 1.287f)
                curveToRelative(0.158f, 0.534f, 0.73f, 0.83f, 1.245f, 0.671f)
                curveToRelative(0.529f, -0.159f, 0.83f, -0.716f, 0.671f, -1.245f)
                close()
                moveTo(20.0f, 7.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.307f, -2.0f, 0.0f)
                verticalLineToRelative(4.351f)
                curveToRelative(-2.224f, -1.147f, -5.061f, 0.638f, -5.0f, 3.149f)
                curveToRelative(-0.07f, 2.598f, 2.968f, 4.384f, 5.186f, 3.048f)
                curveToRelative(0.49f, 0.822f, 1.848f, 0.414f, 1.814f, -0.548f)
                lineTo(20.0f, 7.0f)
                close()
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
