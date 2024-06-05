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

public val Icons.Bold.BarsProgress: ImageVector
    get() {
        if (_barsProgress != null) {
            return _barsProgress!!
        }
        _barsProgress = Builder(name = "BarsProgress", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 11.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(5.935f, -0.156f, 5.931f, -8.846f, 0.0f, -9.0f)
                lineTo(4.5f, 2.0f)
                curveToRelative(-5.935f, 0.156f, -5.931f, 8.846f, 0.0f, 9.0f)
                close()
                moveTo(21.0f, 6.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                close()
                moveTo(4.5f, 5.0f)
                lineTo(14.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.5f, 8.0f)
                curveToRelative(-1.972f, -0.035f, -1.97f, -2.965f, 0.0f, -3.0f)
                close()
                moveTo(19.5f, 13.0f)
                lineTo(4.5f, 13.0f)
                curveToRelative(-5.935f, 0.156f, -5.931f, 8.846f, 0.0f, 9.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(5.935f, -0.156f, 5.931f, -8.846f, 0.0f, -9.0f)
                close()
                moveTo(3.0f, 17.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 19.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.972f, 0.035f, 1.97f, 2.965f, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _barsProgress!!
    }

private var _barsProgress: ImageVector? = null
