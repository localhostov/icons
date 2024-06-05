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

public val Icons.Filled.Analyse: ImageVector
    get() {
        if (_analyse != null) {
            return _analyse!!
        }
        _analyse = Builder(name = "Analyse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-5.969f, -5.969f)
                curveToRelative(-1.725f, 1.412f, -3.927f, 2.262f, -6.324f, 2.262f)
                curveTo(4.486f, 20.0f, 0.0f, 15.514f, 0.0f, 10.0f)
                reflectiveCurveTo(4.486f, 0.0f, 10.0f, 0.0f)
                curveToRelative(3.009f, 0.0f, 5.705f, 1.342f, 7.54f, 3.452f)
                lineToRelative(-6.118f, 7.056f)
                lineToRelative(-1.928f, -1.928f)
                curveToRelative(-0.402f, -0.402f, -0.963f, -0.616f, -1.524f, -0.591f)
                curveToRelative(-0.566f, 0.026f, -1.1f, 0.291f, -1.462f, 0.726f)
                lineToRelative(-3.276f, 3.931f)
                curveToRelative(-0.354f, 0.424f, -0.296f, 1.055f, 0.128f, 1.408f)
                curveToRelative(0.188f, 0.156f, 0.414f, 0.232f, 0.64f, 0.232f)
                curveToRelative(0.287f, 0.0f, 0.571f, -0.123f, 0.77f, -0.36f)
                lineToRelative(3.312f, -3.933f)
                lineToRelative(1.928f, 1.928f)
                curveToRelative(0.396f, 0.396f, 0.948f, 0.606f, 1.505f, 0.592f)
                curveToRelative(0.561f, -0.021f, 1.092f, -0.276f, 1.458f, -0.7f)
                lineToRelative(5.763f, -6.672f)
                curveToRelative(0.804f, 1.44f, 1.267f, 3.095f, 1.267f, 4.858f)
                curveToRelative(0.0f, 2.398f, -0.85f, 4.6f, -2.262f, 6.324f)
                lineToRelative(5.969f, 5.969f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(21.751f, 1.648f)
                curveToRelative(0.361f, -0.418f, 0.314f, -1.05f, -0.104f, -1.411f)
                curveToRelative(-0.416f, -0.359f, -1.048f, -0.316f, -1.41f, 0.103f)
                lineToRelative(-2.698f, 3.111f)
                curveToRelative(0.453f, 0.52f, 0.855f, 1.084f, 1.193f, 1.69f)
                lineToRelative(3.018f, -3.494f)
                close()
            }
        }
        .build()
        return _analyse!!
    }

private var _analyse: ImageVector? = null
