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

public val Icons.Filled.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.713f, 2.465f)
                curveToRelative(-0.678f, -0.299f, -1.426f, -0.465f, -2.213f, -0.465f)
                reflectiveCurveToRelative(-1.535f, 0.167f, -2.213f, 0.465f)
                lineToRelative(-3.287f, -2.465f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 0.0f)
                lineToRelative(-3.287f, 2.465f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.558f, 24.0f)
                curveToRelative(-3.224f, 0.0f, -6.558f, -2.058f, -6.558f, -5.5f)
                curveToRelative(0.0f, -2.135f, 0.945f, -3.659f, 1.779f, -5.004f)
                curveToRelative(0.655f, -1.056f, 1.221f, -1.969f, 1.221f, -2.996f)
                curveToRelative(0.0f, -1.298f, -0.363f, -2.5f, -3.0f, -2.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(4.351f, 0.0f, 5.0f, 2.819f, 5.0f, 4.5f)
                curveToRelative(0.0f, 1.597f, -0.773f, 2.844f, -1.521f, 4.051f)
                curveToRelative(-0.76f, 1.226f, -1.479f, 2.384f, -1.479f, 3.949f)
                curveToRelative(0.0f, 1.791f, 1.467f, 2.851f, 2.997f, 3.279f)
                curveToRelative(0.007f, -1.299f, 0.364f, -7.986f, 6.719f, -11.077f)
                curveToRelative(1.201f, 2.541f, 3.787f, 4.299f, 6.784f, 4.299f)
                curveToRelative(1.264f, 0.0f, 2.455f, -0.313f, 3.5f, -0.866f)
                verticalLineToRelative(7.866f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
