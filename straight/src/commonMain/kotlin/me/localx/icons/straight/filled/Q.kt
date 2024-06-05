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

public val Icons.Filled.Q: ImageVector
    get() {
        if (_q != null) {
            return _q!!
        }
        _q = Builder(name = "Q", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.963f, 22.549f)
                lineToRelative(-2.797f, -2.797f)
                curveToRelative(1.151f, -1.629f, 1.834f, -3.611f, 1.834f, -5.752f)
                verticalLineToRelative(-4.0f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.0f, 4.486f, 2.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.652f, 0.0f, 5.059f, -1.045f, 6.851f, -2.735f)
                lineToRelative(2.698f, 2.698f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                verticalLineToRelative(-4.0f)
                curveTo(4.0f, 5.589f, 7.589f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.589f, -0.471f, 3.067f, -1.273f, 4.313f)
                lineToRelative(-2.276f, -2.276f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.4f, 2.4f)
                curveToRelative(-1.429f, 1.329f, -3.337f, 2.149f, -5.437f, 2.149f)
                close()
            }
        }
        .build()
        return _q!!
    }

private var _q: ImageVector? = null
