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

public val Icons.Bold.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.5f)
                curveToRelative(0.0f, -1.209f, -0.859f, -2.218f, -2.0f, -2.45f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 2.117f, -3.635f, 4.0f, -6.5f, 4.0f)
                lineTo(3.5f, 4.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.697f, 1.215f, 3.116f, 2.821f, 3.434f)
                lineToRelative(4.029f, 9.066f)
                horizontalLineToRelative(1.398f)
                curveToRelative(0.935f, 0.0f, 1.797f, -0.468f, 2.306f, -1.252f)
                curveToRelative(0.509f, -0.783f, 0.587f, -1.762f, 0.208f, -2.616f)
                lineToRelative(-2.281f, -5.132f)
                horizontalLineToRelative(4.019f)
                curveToRelative(2.865f, 0.0f, 6.5f, 1.883f, 6.5f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.05f)
                curveToRelative(1.141f, -0.232f, 2.0f, -1.24f, 2.0f, -2.45f)
                close()
                moveTo(3.0f, 7.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(12.5f, 12.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.077f, 0.0f, 4.583f, -0.731f, 6.5f, -2.049f)
                verticalLineToRelative(9.098f)
                curveToRelative(-1.917f, -1.318f, -4.423f, -2.049f, -6.5f, -2.049f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null
