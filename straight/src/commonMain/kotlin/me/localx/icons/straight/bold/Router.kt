package me.localx.icons.straight.bold

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

public val Icons.Bold.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = Builder(name = "Router", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 15.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.5f, 15.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(20.182f, 6.939f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(-1.412f, -1.411f, -3.709f, -1.411f, -5.121f, 0.0f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(2.581f, -2.582f, 6.781f, -2.582f, 9.363f, 0.0f)
                close()
                moveTo(9.318f, 5.56f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(4.578f, -4.578f, 12.028f, -4.578f, 16.606f, 0.0f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(-3.408f, -3.409f, -8.955f, -3.407f, -12.364f, 0.0f)
                close()
            }
        }
        .build()
        return _router!!
    }

private var _router: ImageVector? = null
