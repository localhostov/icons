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

public val Icons.Filled.Brand: ImageVector
    get() {
        if (_brand != null) {
            return _brand!!
        }
        _brand = Builder(name = "Brand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.411f, 4.825f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(3.118f, 3.118f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(14.561f, 17.853f)
                lineToRelative(1.086f, 1.086f)
                lineToRelative(3.232f, -3.232f)
                lineToRelative(-1.086f, -1.086f)
                lineToRelative(-3.232f, 3.232f)
                close()
                moveTo(22.602f, 19.351f)
                lineToRelative(-3.21f, 3.242f)
                curveToRelative(-0.908f, 0.918f, -2.118f, 1.426f, -3.408f, 1.431f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.282f, 0.0f, -2.49f, -0.498f, -3.4f, -1.404f)
                lineTo(3.851f, 13.976f)
                curveToRelative(-0.812f, -0.805f, -1.227f, -1.921f, -1.136f, -3.062f)
                lineToRelative(0.696f, -6.088f)
                lineToRelative(3.663f, 3.663f)
                curveToRelative(-0.044f, 0.164f, -0.074f, 0.334f, -0.074f, 0.512f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.178f, 0.0f, -0.347f, 0.031f, -0.512f, 0.074f)
                lineToRelative(-3.663f, -3.663f)
                lineToRelative(5.803f, -0.651f)
                curveToRelative(1.175f, -0.153f, 2.379f, 0.255f, 3.221f, 1.09f)
                lineToRelative(8.728f, 8.67f)
                curveToRelative(1.885f, 1.877f, 1.896f, 4.942f, 0.025f, 6.832f)
                close()
                moveTo(21.0f, 14.999f)
                lineToRelative(-2.5f, -2.5f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-4.646f, 4.646f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(4.646f, -4.646f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _brand!!
    }

private var _brand: ImageVector? = null
