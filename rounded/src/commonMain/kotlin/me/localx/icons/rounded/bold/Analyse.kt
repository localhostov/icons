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

public val Icons.Bold.Analyse: ImageVector
    get() {
        if (_analyse != null) {
            return _analyse!!
        }
        _analyse = Builder(name = "Analyse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-5.51f, -5.51f)
                curveToRelative(-1.669f, 1.228f, -3.723f, 1.95f, -5.929f, 1.95f)
                curveTo(4.486f, 20.0f, 0.0f, 15.514f, 0.0f, 10.0f)
                reflectiveCurveTo(4.486f, 0.0f, 10.0f, 0.0f)
                curveToRelative(1.435f, 0.0f, 2.82f, 0.298f, 4.118f, 0.885f)
                curveToRelative(0.755f, 0.341f, 1.09f, 1.23f, 0.748f, 1.985f)
                curveToRelative(-0.34f, 0.755f, -1.23f, 1.089f, -1.984f, 0.749f)
                curveToRelative(-0.907f, -0.411f, -1.877f, -0.619f, -2.882f, -0.619f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                curveToRelative(0.0f, 0.258f, 0.016f, 0.511f, 0.043f, 0.762f)
                lineToRelative(2.271f, -2.726f)
                curveToRelative(0.519f, -0.621f, 1.276f, -0.997f, 2.082f, -1.033f)
                curveToRelative(0.814f, -0.042f, 1.594f, 0.27f, 2.164f, 0.84f)
                lineToRelative(1.854f, 1.946f)
                lineTo(19.361f, 0.523f)
                curveToRelative(0.538f, -0.629f, 1.484f, -0.702f, 2.115f, -0.162f)
                curveToRelative(0.629f, 0.54f, 0.701f, 1.486f, 0.162f, 2.115f)
                lineToRelative(-8.037f, 9.372f)
                curveToRelative(-0.524f, 0.607f, -1.279f, 0.97f, -2.076f, 0.999f)
                curveToRelative(-0.791f, 0.03f, -1.577f, -0.277f, -2.141f, -0.84f)
                lineToRelative(-1.881f, -1.974f)
                lineToRelative(-3.251f, 3.953f)
                curveToRelative(1.266f, 1.819f, 3.368f, 3.014f, 5.747f, 3.014f)
                curveToRelative(3.398f, 0.0f, 6.297f, -2.424f, 6.892f, -5.763f)
                curveToRelative(0.146f, -0.816f, 0.934f, -1.356f, 1.739f, -1.213f)
                curveToRelative(0.816f, 0.145f, 1.359f, 0.924f, 1.214f, 1.74f)
                curveToRelative(-0.277f, 1.554f, -0.907f, 2.966f, -1.793f, 4.168f)
                lineToRelative(5.509f, 5.509f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
            }
        }
        .build()
        return _analyse!!
    }

private var _analyse: ImageVector? = null
