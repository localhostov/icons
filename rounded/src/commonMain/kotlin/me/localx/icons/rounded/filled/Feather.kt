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

public val Icons.Filled.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.82f, 19.306f)
                curveToRelative(0.054f, 0.044f, 0.116f, 0.074f, 0.171f, 0.117f)
                lineToRelative(-4.284f, 4.284f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(4.285f, -4.285f)
                arcToRelative(7.841f, 7.841f, 0.0f, false, false, 1.242f, 1.298f)
                close()
                moveTo(10.0f, 12.586f)
                lineTo(16.293f, 6.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                lineToRelative(-3.293f, 3.293f)
                horizontalLineToRelative(7.186f)
                arcToRelative(30.726f, 30.726f, 0.0f, false, false, 2.28f, -6.075f)
                arcToRelative(3.992f, 3.992f, 0.0f, false, false, -4.84f, -4.806f)
                arcToRelative(31.838f, 31.838f, 0.0f, false, false, -9.04f, 3.988f)
                close()
                moveTo(12.5f, 13.0f)
                curveToRelative(-0.025f, 0.0f, -0.047f, -0.013f, -0.072f, -0.014f)
                lineToRelative(-6.437f, 6.437f)
                arcToRelative(7.446f, 7.446f, 0.0f, false, false, 4.598f, 1.577f)
                arcToRelative(8.184f, 8.184f, 0.0f, false, false, 5.9f, -2.545f)
                arcToRelative(28.716f, 28.716f, 0.0f, false, false, 4.044f, -5.455f)
                close()
                moveTo(8.0f, 14.5f)
                verticalLineToRelative(-8.993f)
                arcToRelative(26.454f, 26.454f, 0.0f, false, false, -2.744f, 2.362f)
                arcToRelative(7.757f, 7.757f, 0.0f, false, false, -2.247f, 5.831f)
                arcToRelative(7.646f, 7.646f, 0.0f, false, false, 1.569f, 4.3f)
                lineToRelative(3.436f, -3.437f)
                curveToRelative(-0.001f, -0.016f, -0.014f, -0.038f, -0.014f, -0.063f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
