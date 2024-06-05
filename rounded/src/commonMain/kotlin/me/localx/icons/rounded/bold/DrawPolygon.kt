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

public val Icons.Bold.DrawPolygon: ImageVector
    get() {
        if (_drawPolygon != null) {
            return _drawPolygon!!
        }
        _drawPolygon = Builder(name = "DrawPolygon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.0f)
                curveToRelative(-0.221f, 0.0f, -0.434f, 0.027f, -0.642f, 0.072f)
                lineToRelative(-4.525f, -5.128f)
                curveToRelative(0.1f, -0.299f, 0.167f, -0.612f, 0.167f, -0.945f)
                reflectiveCurveToRelative(-0.067f, -0.646f, -0.167f, -0.945f)
                lineToRelative(4.525f, -5.128f)
                curveToRelative(0.207f, 0.045f, 0.421f, 0.072f, 0.642f, 0.072f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.304f, 0.0f, -2.403f, 0.837f, -2.816f, 2.0f)
                lineTo(5.816f, 1.998f)
                curveToRelative(-0.413f, -1.163f, -1.512f, -2.0f, -2.816f, -2.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, 0.837f, 2.403f, 2.0f, 2.816f)
                verticalLineToRelative(12.367f)
                curveToRelative(-1.163f, 0.413f, -2.0f, 1.512f, -2.0f, 2.816f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.304f, 0.0f, 2.403f, -0.837f, 2.816f, -2.0f)
                horizontalLineToRelative(12.367f)
                curveToRelative(0.413f, 1.163f, 1.512f, 2.0f, 2.816f, 2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(5.0f, 18.779f)
                lineTo(5.0f, 5.221f)
                curveToRelative(0.078f, -0.07f, 0.151f, -0.143f, 0.221f, -0.221f)
                horizontalLineToRelative(11.955f)
                lineToRelative(-3.582f, 4.06f)
                curveToRelative(-0.192f, -0.039f, -0.39f, -0.06f, -0.594f, -0.06f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.203f, 0.0f, 0.402f, -0.021f, 0.594f, -0.06f)
                lineToRelative(3.582f, 4.06f)
                lineTo(5.221f, 19.0f)
                curveToRelative(-0.07f, -0.078f, -0.143f, -0.151f, -0.221f, -0.221f)
                close()
            }
        }
        .build()
        return _drawPolygon!!
    }

private var _drawPolygon: ImageVector? = null
