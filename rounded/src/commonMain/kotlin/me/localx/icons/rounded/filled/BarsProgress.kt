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

public val Icons.Filled.BarsProgress: ImageVector
    get() {
        if (_barsProgress != null) {
            return _barsProgress!!
        }
        _barsProgress = Builder(name = "BarsProgress", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                curveToRelative(5.276f, -0.138f, 5.272f, -7.863f, 0.0f, -8.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(-5.276f, 0.138f, -5.272f, 7.863f, 0.0f, 8.0f)
                close()
                moveTo(22.0f, 7.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                curveToRelative(-5.276f, 0.138f, -5.272f, 7.863f, 0.0f, 8.0f)
                lineTo(20.0f, 21.0f)
                curveToRelative(5.276f, -0.138f, 5.272f, -7.863f, 0.0f, -8.0f)
                close()
                moveTo(20.0f, 19.0f)
                lineTo(10.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.629f, 0.048f, 2.627f, 3.953f, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _barsProgress!!
    }

private var _barsProgress: ImageVector? = null
