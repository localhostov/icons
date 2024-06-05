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

public val Icons.Filled.MaskFace: ImageVector
    get() {
        if (_maskFace != null) {
            return _maskFace!!
        }
        _maskFace = Builder(name = "MaskFace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.149f, 0.917f)
                curveToRelative(-1.158f, -0.869f, -2.621f, -1.136f, -4.011f, -0.735f)
                lineToRelative(-8.056f, 2.332f)
                curveToRelative(-0.775f, 0.225f, -1.642f, 0.404f, -2.647f, 0.548f)
                curveToRelative(-1.048f, 0.149f, -2.448f, 0.479f, -3.17f, 1.202f)
                curveToRelative(-0.58f, 0.58f, -0.984f, 1.646f, -1.201f, 3.17f)
                curveToRelative(-0.145f, 1.006f, -0.324f, 1.872f, -0.548f, 2.647f)
                lineTo(0.183f, 18.137f)
                curveToRelative(-0.403f, 1.392f, -0.135f, 2.854f, 0.735f, 4.012f)
                curveToRelative(0.87f, 1.158f, 2.2f, 1.822f, 3.649f, 1.822f)
                horizontalLineToRelative(6.404f)
                curveToRelative(0.18f, 0.0f, 4.463f, -0.049f, 8.707f, -4.293f)
                reflectiveCurveToRelative(4.293f, -8.526f, 4.293f, -8.707f)
                verticalLineToRelative(-6.404f)
                curveToRelative(0.0f, -1.448f, -0.664f, -2.778f, -1.822f, -3.649f)
                close()
                moveTo(18.694f, 2.104f)
                curveToRelative(0.238f, -0.069f, 0.48f, -0.104f, 0.72f, -0.104f)
                curveToRelative(0.546f, 0.0f, 1.081f, 0.177f, 1.533f, 0.517f)
                curveToRelative(0.651f, 0.488f, 1.024f, 1.236f, 1.024f, 2.05f)
                verticalLineToRelative(4.99f)
                lineToRelative(-6.515f, -6.516f)
                lineToRelative(3.238f, -0.937f)
                close()
                moveTo(2.517f, 20.948f)
                curveToRelative(-0.489f, -0.651f, -0.639f, -1.473f, -0.413f, -2.254f)
                lineToRelative(0.938f, -3.239f)
                lineToRelative(6.516f, 6.516f)
                horizontalLineToRelative(-4.99f)
                curveToRelative(-0.814f, 0.0f, -1.561f, -0.373f, -2.05f, -1.023f)
                close()
                moveTo(14.805f, 9.235f)
                lineToRelative(-5.434f, 5.434f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(5.434f, -5.434f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(17.633f, 10.649f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-5.434f, 5.435f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(5.434f, -5.435f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _maskFace!!
    }

private var _maskFace: ImageVector? = null
