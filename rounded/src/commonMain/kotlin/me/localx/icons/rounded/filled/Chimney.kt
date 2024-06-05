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

public val Icons.Filled.Chimney: ImageVector
    get() {
        if (_chimney != null) {
            return _chimney!!
        }
        _chimney = Builder(name = "Chimney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 16.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.791f, 0.0f, 0.0f, 1.791f, 0.0f, 4.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(14.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _chimney!!
    }

private var _chimney: ImageVector? = null
