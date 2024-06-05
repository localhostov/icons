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
                moveToRelative(19.979f, 0.793f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-8.914f, 8.914f)
                horizontalLineToRelative(11.544f)
                curveToRelative(0.059f, 0.475f, 0.098f, 0.954f, 0.098f, 1.44f)
                curveToRelative(0.0f, 0.188f, -0.018f, 0.373f, -0.027f, 0.56f)
                horizontalLineToRelative(-9.559f)
                lineToRelative(6.874f, 6.874f)
                curveToRelative(-0.215f, 0.255f, -0.437f, 0.506f, -0.676f, 0.745f)
                curveToRelative(-0.236f, 0.237f, -0.485f, 0.456f, -0.738f, 0.669f)
                lineToRelative(-6.874f, -6.874f)
                verticalLineToRelative(9.558f)
                curveToRelative(-0.189f, 0.009f, -0.376f, 0.028f, -0.566f, 0.028f)
                curveToRelative(-0.484f, 0.0f, -0.961f, -0.04f, -1.434f, -0.099f)
                verticalLineToRelative(-11.544f)
                lineTo(0.086f, 19.272f)
                lineToRelative(0.707f, 0.707f)
                curveToRelative(1.241f, 1.24f, 4.207f, 4.021f, 9.641f, 4.021f)
                curveToRelative(3.475f, 0.0f, 6.948f, -1.322f, 9.593f, -3.967f)
                curveToRelative(2.562f, -2.562f, 3.974f, -5.969f, 3.974f, -9.593f)
                curveToRelative(0.0f, -5.44f, -2.909f, -8.534f, -4.021f, -9.647f)
                close()
            }
        }
        .build()
        return _citrusSlice!!
    }

private var _citrusSlice: ImageVector? = null
