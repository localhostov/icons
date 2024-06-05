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

public val Icons.Filled.BookOpenReader: ImageVector
    get() {
        if (_bookOpenReader != null) {
            return _bookOpenReader!!
        }
        _bookOpenReader = Builder(name = "BookOpenReader", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveTo(9.519f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(22.204f, 11.162f)
                curveToRelative(-1.141f, -0.953f, -2.629f, -1.348f, -4.157f, -1.069f)
                lineToRelative(-1.764f, 0.432f)
                curveToRelative(-1.902f, 0.347f, -3.283f, 2.002f, -3.283f, 3.936f)
                verticalLineToRelative(7.467f)
                curveToRelative(-0.664f, 0.097f, -1.336f, 0.097f, -2.0f, 0.0f)
                verticalLineToRelative(-7.467f)
                curveToRelative(0.0f, -1.934f, -1.381f, -3.589f, -3.226f, -3.923f)
                lineToRelative(-1.88f, -0.457f)
                curveToRelative(-1.464f, -0.263f, -2.956f, 0.128f, -4.099f, 1.081f)
                curveToRelative(-1.142f, 0.953f, -1.796f, 2.352f, -1.796f, 3.838f)
                verticalLineToRelative(2.792f)
                curveToRelative(0.0f, 2.417f, 1.727f, 4.486f, 4.105f, 4.919f)
                lineToRelative(6.285f, 1.143f)
                curveToRelative(0.534f, 0.097f, 1.071f, 0.146f, 1.609f, 0.146f)
                reflectiveCurveToRelative(1.075f, -0.048f, 1.609f, -0.146f)
                lineToRelative(6.285f, -1.143f)
                curveToRelative(2.379f, -0.433f, 4.105f, -2.502f, 4.105f, -4.919f)
                verticalLineToRelative(-2.792f)
                curveToRelative(0.0f, -1.487f, -0.654f, -2.886f, -1.796f, -3.838f)
                close()
            }
        }
        .build()
        return _bookOpenReader!!
    }

private var _bookOpenReader: ImageVector? = null
