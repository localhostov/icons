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

public val Icons.Bold.M: ImageVector
    get() {
        if (_m != null) {
            return _m!!
        }
        _m = Builder(name = "M", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.337f)
                lineToRelative(-9.0f, 13.809f)
                lineTo(3.005f, 3.344f)
                lineToRelative(-0.005f, 20.656f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.92f)
                curveTo(0.0f, 1.602f, 0.77f, 0.507f, 1.962f, 0.132f)
                curveToRelative(1.208f, -0.383f, 2.527f, 0.078f, 3.275f, 1.146f)
                lineToRelative(6.762f, 10.374f)
                lineTo(18.734f, 1.319f)
                curveToRelative(0.774f, -1.108f, 2.09f, -1.573f, 3.304f, -1.187f)
                curveToRelative(1.192f, 0.375f, 1.962f, 1.47f, 1.962f, 2.788f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _m!!
    }

private var _m: ImageVector? = null
