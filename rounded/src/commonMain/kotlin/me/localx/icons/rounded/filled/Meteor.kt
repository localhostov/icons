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

public val Icons.Filled.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 15.0f)
                close()
                moveTo(23.672f, 3.191f)
                lineTo(20.771f, 8.0f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, true, 1.871f, 3.449f)
                curveToRelative(-1.748f, 2.734f, -5.019f, 7.655f, -7.278f, 9.915f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 2.636f, 8.636f)
                curveTo(4.892f, 6.38f, 9.816f, 3.108f, 12.55f, 1.358f)
                arcTo(2.242f, 2.242f, 0.0f, false, true, 16.0f, 3.24f)
                lineToRelative(4.86f, -2.9f)
                arcToRelative(2.023f, 2.023f, 0.0f, false, true, 2.533f, 0.283f)
                arcTo(2.034f, 2.034f, 0.0f, false, true, 23.672f, 3.191f)
                close()
                moveTo(13.0f, 15.0f)
                curveToRelative(-0.138f, -5.275f, -7.863f, -5.274f, -8.0f, 0.0f)
                curveTo(5.138f, 20.275f, 12.863f, 20.274f, 13.0f, 15.0f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
