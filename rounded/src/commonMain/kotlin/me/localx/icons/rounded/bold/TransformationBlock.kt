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

public val Icons.Bold.TransformationBlock: ImageVector
    get() {
        if (_transformationBlock != null) {
            return _transformationBlock!!
        }
        _transformationBlock = Builder(name = "TransformationBlock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 19.0f)
                curveToRelative(-0.253f, 0.0f, -0.493f, 0.049f, -0.724f, 0.119f)
                lineToRelative(-2.31f, -1.68f)
                curveToRelative(0.95f, -0.648f, 1.534f, -1.726f, 1.534f, -2.885f)
                verticalLineToRelative(-5.107f)
                curveToRelative(0.0f, -1.159f, -0.584f, -2.237f, -1.533f, -2.886f)
                lineToRelative(2.309f, -1.68f)
                curveToRelative(0.231f, 0.07f, 0.47f, 0.119f, 0.724f, 0.119f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-1.367f, 0.0f, -2.474f, 1.099f, -2.496f, 2.461f)
                lineToRelative(-3.377f, 2.456f)
                lineToRelative(-1.89f, -1.08f)
                curveToRelative(-1.071f, -0.613f, -2.402f, -0.612f, -3.473f, 0.0f)
                lineToRelative(-1.891f, 1.081f)
                lineToRelative(-3.377f, -2.456f)
                curveToRelative(-0.022f, -1.362f, -1.129f, -2.461f, -2.496f, -2.461f)
                curveTo(1.119f, 0.0f, 0.0f, 1.119f, 0.0f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.253f, 0.0f, 0.493f, -0.049f, 0.724f, -0.119f)
                lineToRelative(2.31f, 1.68f)
                curveToRelative(-0.95f, 0.648f, -1.534f, 1.726f, -1.534f, 2.885f)
                verticalLineToRelative(5.107f)
                curveToRelative(0.0f, 1.159f, 0.584f, 2.237f, 1.533f, 2.886f)
                lineToRelative(-2.309f, 1.68f)
                curveToRelative(-0.231f, -0.07f, -0.47f, -0.119f, -0.724f, -0.119f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.367f, 0.0f, 2.474f, -1.099f, 2.496f, -2.461f)
                lineToRelative(3.377f, -2.456f)
                lineToRelative(1.89f, 1.08f)
                curveToRelative(0.536f, 0.307f, 1.136f, 0.46f, 1.737f, 0.46f)
                reflectiveCurveToRelative(1.201f, -0.153f, 1.736f, -0.459f)
                lineToRelative(1.891f, -1.081f)
                lineToRelative(3.377f, 2.456f)
                curveToRelative(0.022f, 1.362f, 1.129f, 2.461f, 2.496f, 2.461f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(11.752f, 6.441f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.076f, -0.044f, 0.162f, -0.066f, 0.248f, -0.066f)
                curveToRelative(0.085f, 0.0f, 0.171f, 0.022f, 0.248f, 0.066f)
                lineToRelative(3.58f, 2.045f)
                lineToRelative(-3.828f, 2.188f)
                lineToRelative(-3.828f, -2.188f)
                lineToRelative(3.58f, -2.046f)
                close()
                moveTo(7.252f, 14.988f)
                curveToRelative(-0.156f, -0.09f, -0.252f, -0.256f, -0.252f, -0.435f)
                verticalLineToRelative(-4.433f)
                lineToRelative(4.0f, 2.286f)
                verticalLineToRelative(4.723f)
                lineToRelative(-3.748f, -2.141f)
                close()
                moveTo(13.0f, 17.129f)
                verticalLineToRelative(-4.723f)
                lineToRelative(4.0f, -2.286f)
                verticalLineToRelative(4.433f)
                curveToRelative(0.0f, 0.179f, -0.097f, 0.345f, -0.252f, 0.434f)
                lineToRelative(-3.748f, 2.142f)
                close()
            }
        }
        .build()
        return _transformationBlock!!
    }

private var _transformationBlock: ImageVector? = null
