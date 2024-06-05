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

public val Icons.Filled.LeafOak: ImageVector
    get() {
        if (_leafOak != null) {
            return _leafOak!!
        }
        _leafOak = Builder(name = "LeafOak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.336f, 20.087f)
                lineToRelative(-3.903f, 3.903f)
                lineTo(0.019f, 22.576f)
                lineToRelative(3.901f, -3.901f)
                lineToRelative(1.416f, 1.412f)
                close()
                moveTo(22.784f, 7.084f)
                curveToRelative(0.784f, -0.783f, 1.216f, -1.825f, 1.216f, -2.934f)
                reflectiveCurveToRelative(-0.432f, -2.151f, -1.216f, -2.935f)
                curveToRelative(-0.783f, -0.784f, -1.825f, -1.216f, -2.935f, -1.216f)
                reflectiveCurveToRelative(-2.15f, 0.432f, -2.929f, 1.21f)
                lineToRelative(-0.164f, 0.162f)
                curveToRelative(-0.787f, -0.759f, -1.792f, -1.372f, -3.207f, -1.372f)
                curveToRelative(-2.288f, 0.0f, -4.149f, 1.862f, -4.149f, 4.15f)
                verticalLineToRelative(0.095f)
                curveToRelative(-0.3f, -0.025f, -0.611f, -0.045f, -0.869f, -0.045f)
                curveToRelative(-2.396f, 0.0f, -4.349f, 1.934f, -4.381f, 4.322f)
                curveToRelative(-1.807f, 0.448f, -3.15f, 2.084f, -3.15f, 4.027f)
                curveToRelative(0.0f, 1.617f, 1.925f, 4.661f, 2.92f, 6.125f)
                lineToRelative(9.88f, -9.879f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-9.878f, 9.877f)
                curveToRelative(1.469f, 0.997f, 4.501f, 2.913f, 6.115f, 2.913f)
                curveToRelative(1.943f, 0.0f, 3.579f, -1.344f, 4.027f, -3.15f)
                curveToRelative(2.389f, -0.032f, 4.322f, -1.985f, 4.322f, -4.381f)
                curveToRelative(0.0f, -0.258f, -0.02f, -0.569f, -0.045f, -0.869f)
                horizontalLineToRelative(0.095f)
                curveToRelative(2.288f, 0.0f, 4.15f, -1.861f, 4.15f, -4.149f)
                curveToRelative(0.0f, -1.415f, -0.613f, -2.42f, -1.372f, -3.207f)
                lineToRelative(0.156f, -0.159f)
                close()
            }
        }
        .build()
        return _leafOak!!
    }

private var _leafOak: ImageVector? = null
