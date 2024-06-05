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

public val Icons.Bold.HexagonCheck: ImageVector
    get() {
        if (_hexagonCheck != null) {
            return _hexagonCheck!!
        }
        _hexagonCheck = Builder(name = "HexagonCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.448f, 7.931f)
                lineToRelative(2.104f, 2.139f)
                lineToRelative(-5.293f, 5.207f)
                curveToRelative(-0.481f, 0.482f, -1.118f, 0.724f, -1.755f, 0.724f)
                curveToRelative(-0.641f, 0.0f, -1.283f, -0.244f, -1.771f, -0.732f)
                lineToRelative(-2.776f, -2.69f)
                lineToRelative(2.088f, -2.154f)
                lineToRelative(2.454f, 2.378f)
                lineToRelative(4.951f, -4.87f)
                close()
                moveTo(23.587f, 13.641f)
                lineToRelative(-4.059f, 7.564f)
                curveToRelative(-0.594f, 1.107f, -1.745f, 1.795f, -3.005f, 1.795f)
                lineTo(7.496f, 23.0f)
                curveToRelative(-1.257f, 0.0f, -2.407f, -0.686f, -3.002f, -1.79f)
                lineTo(0.416f, 13.65f)
                curveToRelative(-0.555f, -1.03f, -0.556f, -2.26f, 0.0f, -3.291f)
                lineTo(4.494f, 2.791f)
                curveToRelative(0.595f, -1.104f, 1.746f, -1.791f, 3.002f, -1.791f)
                horizontalLineToRelative(9.027f)
                curveToRelative(1.26f, 0.0f, 2.411f, 0.688f, 3.005f, 1.795f)
                lineToRelative(4.06f, 7.565f)
                curveToRelative(0.551f, 1.026f, 0.551f, 2.253f, 0.0f, 3.28f)
                close()
                moveTo(20.944f, 11.78f)
                lineToRelative(-4.06f, -7.566f)
                curveToRelative(-0.07f, -0.132f, -0.209f, -0.214f, -0.361f, -0.214f)
                lineTo(7.496f, 4.0f)
                curveToRelative(-0.152f, 0.0f, -0.291f, 0.082f, -0.362f, 0.214f)
                lineToRelative(-4.079f, 7.568f)
                curveToRelative(-0.075f, 0.139f, -0.075f, 0.305f, 0.0f, 0.444f)
                lineToRelative(4.078f, 7.561f)
                curveToRelative(0.071f, 0.132f, 0.209f, 0.213f, 0.362f, 0.213f)
                horizontalLineToRelative(9.028f)
                curveToRelative(0.152f, 0.0f, 0.291f, -0.082f, 0.362f, -0.214f)
                lineToRelative(4.058f, -7.564f)
                curveToRelative(0.075f, -0.139f, 0.075f, -0.303f, 0.0f, -0.441f)
                close()
            }
        }
        .build()
        return _hexagonCheck!!
    }

private var _hexagonCheck: ImageVector? = null
