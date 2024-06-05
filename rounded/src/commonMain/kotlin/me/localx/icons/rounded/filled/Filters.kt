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

public val Icons.Filled.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.0f)
                curveToRelative(-0.212f, 0.0f, -0.424f, -0.068f, -0.6f, -0.2f)
                lineToRelative(-4.0f, -3.0f)
                curveToRelative(-0.252f, -0.188f, -0.4f, -0.485f, -0.4f, -0.8f)
                verticalLineToRelative(-3.586f)
                lineTo(5.121f, 6.536f)
                curveToRelative(-0.723f, -0.724f, -1.121f, -1.685f, -1.121f, -2.707f)
                curveToRelative(0.0f, -2.111f, 1.718f, -3.829f, 3.828f, -3.829f)
                horizontalLineToRelative(12.344f)
                curveToRelative(2.11f, 0.0f, 3.828f, 1.717f, 3.828f, 3.829f)
                curveToRelative(0.0f, 1.022f, -0.398f, 1.983f, -1.121f, 2.707f)
                lineToRelative(-5.879f, 5.879f)
                verticalLineToRelative(6.586f)
                curveToRelative(0.0f, 0.379f, -0.214f, 0.725f, -0.553f, 0.895f)
                curveToRelative(-0.142f, 0.071f, -0.295f, 0.105f, -0.447f, 0.105f)
                close()
                moveTo(10.2f, 18.4f)
                curveToRelative(-0.751f, -0.562f, -1.2f, -1.459f, -1.2f, -2.4f)
                verticalLineToRelative(-2.757f)
                lineTo(3.707f, 7.95f)
                curveToRelative(-0.951f, -0.952f, -1.505f, -2.179f, -1.646f, -3.497f)
                curveToRelative(-1.219f, 0.641f, -2.061f, 1.905f, -2.061f, 3.376f)
                curveToRelative(0.0f, 1.022f, 0.398f, 1.983f, 1.121f, 2.707f)
                lineToRelative(5.879f, 5.878f)
                verticalLineToRelative(3.586f)
                curveToRelative(0.0f, 0.315f, 0.148f, 0.611f, 0.4f, 0.8f)
                lineToRelative(4.0f, 3.0f)
                curveToRelative(0.176f, 0.132f, 0.388f, 0.2f, 0.6f, 0.2f)
                curveToRelative(0.152f, 0.0f, 0.306f, -0.035f, 0.447f, -0.105f)
                curveToRelative(0.339f, -0.169f, 0.553f, -0.516f, 0.553f, -0.895f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-2.8f, -2.1f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
