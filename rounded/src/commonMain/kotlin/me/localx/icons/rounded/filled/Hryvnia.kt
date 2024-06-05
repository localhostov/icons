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

public val Icons.Filled.Hryvnia: ImageVector
    get() {
        if (_hryvnia != null) {
            return _hryvnia!!
        }
        _hryvnia = Builder(name = "Hryvnia", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.907f, 15.0f)
                horizontalLineToRelative(14.093f)
                curveToRelative(1.308f, -0.005f, 1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineTo(12.181f)
                lineToRelative(5.333f, -2.0f)
                horizontalLineToRelative(3.486f)
                curveToRelative(1.308f, -0.005f, 1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineToRelative(-0.889f)
                curveToRelative(1.69f, -2.35f, 0.851f, -6.026f, -1.716f, -7.355f)
                curveToRelative(-1.364f, -0.75f, -3.581f, -1.645f, -6.395f, -1.645f)
                curveTo(6.647f, 0.0f, 3.428f, 3.158f, 3.293f, 3.293f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.387f, 0.391f, 1.021f, 0.395f, 1.413f, 0.007f)
                curveTo(6.796f, 2.541f, 12.807f, 0.636f, 17.431f, 3.396f)
                curveToRelative(2.205f, 1.134f, 1.999f, 4.693f, -0.318f, 5.604f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.308f, 0.005f, -1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineTo(11.817f)
                lineToRelative(-5.333f, 2.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.308f, 0.005f, -1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineToRelative(0.93f)
                curveToRelative(-1.831f, 2.52f, -0.806f, 6.437f, 2.023f, 7.746f)
                curveToRelative(5.801f, 2.971f, 13.349f, -0.026f, 15.647f, -1.946f)
                curveToRelative(1.042f, -0.789f, -0.148f, -2.378f, -1.198f, -1.601f)
                curveToRelative(-1.879f, 1.574f, -8.604f, 4.314f, -13.568f, 1.752f)
                curveToRelative(-2.436f, -1.107f, -2.39f, -4.9f, 0.074f, -5.951f)
                close()
            }
        }
        .build()
        return _hryvnia!!
    }

private var _hryvnia: ImageVector? = null
