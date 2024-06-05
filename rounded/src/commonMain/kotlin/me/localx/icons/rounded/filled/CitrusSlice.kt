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

public val Icons.Filled.CitrusSlice: ImageVector
    get() {
        if (_citrusSlice != null) {
            return _citrusSlice!!
        }
        _citrusSlice = Builder(name = "CitrusSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.932f, 1.788f)
                curveToRelative(-0.584f, -0.977f, -1.571f, -1.619f, -2.71f, -1.759f)
                curveToRelative(-1.157f, -0.141f, -2.288f, 0.246f, -3.108f, 1.066f)
                lineToRelative(-6.905f, 6.905f)
                horizontalLineToRelative(11.792f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-9.586f)
                lineToRelative(6.793f, 6.793f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-6.793f, -6.793f)
                verticalLineToRelative(9.586f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-11.792f)
                lineToRelative(-6.905f, 6.905f)
                curveToRelative(-0.821f, 0.822f, -1.21f, 1.956f, -1.066f, 3.111f)
                curveToRelative(0.142f, 1.138f, 0.783f, 2.125f, 1.76f, 2.708f)
                curveToRelative(2.339f, 1.396f, 4.937f, 2.077f, 7.518f, 2.077f)
                curveToRelative(3.796f, 0.0f, 7.555f, -1.474f, 10.391f, -4.311f)
                curveToRelative(4.765f, -4.766f, 5.685f, -12.13f, 2.234f, -17.91f)
                close()
            }
        }
        .build()
        return _citrusSlice!!
    }

private var _citrusSlice: ImageVector? = null
