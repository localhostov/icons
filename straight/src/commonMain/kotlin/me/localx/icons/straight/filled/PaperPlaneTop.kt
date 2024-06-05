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

public val Icons.Filled.PaperPlaneTop: ImageVector
    get() {
        if (_paperPlaneTop != null) {
            return _paperPlaneTop!!
        }
        _paperPlaneTop = Builder(name = "PaperPlaneTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.173f, 13.0f)
                horizontalLineToRelative(19.829f)
                lineTo(4.201f, 23.676f)
                curveToRelative(-0.438f, 0.211f, -0.891f, 0.312f, -1.332f, 0.312f)
                curveToRelative(-0.696f, 0.0f, -1.362f, -0.255f, -1.887f, -0.734f)
                curveToRelative(-0.84f, -0.77f, -1.115f, -1.905f, -0.719f, -2.966f)
                lineToRelative(0.056f, -0.123f)
                lineToRelative(3.853f, -7.165f)
                close()
                moveTo(4.034f, 0.282f)
                curveTo(2.981f, -0.22f, 1.748f, -0.037f, 0.893f, 0.749f)
                curveTo(0.054f, 1.521f, -0.22f, 2.657f, 0.18f, 3.717f)
                lineToRelative(3.979f, 7.283f)
                horizontalLineToRelative(19.841f)
                lineTo(4.11f, 0.322f)
                lineToRelative(-0.076f, -0.04f)
                close()
            }
        }
        .build()
        return _paperPlaneTop!!
    }

private var _paperPlaneTop: ImageVector? = null
