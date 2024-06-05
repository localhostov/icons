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

public val Icons.Filled.InfoGuide: ImageVector
    get() {
        if (_infoGuide != null) {
            return _infoGuide!!
        }
        _infoGuide = Builder(name = "InfoGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.0f)
                verticalLineToRelative(10.792f)
                curveToRelative(0.0f, 2.417f, -1.727f, 4.486f, -4.105f, 4.919f)
                lineToRelative(-6.285f, 1.143f)
                curveToRelative(-0.534f, 0.097f, -1.071f, 0.146f, -1.609f, 0.146f)
                reflectiveCurveToRelative(-1.075f, -0.048f, -1.609f, -0.146f)
                lineToRelative(-6.285f, -1.143f)
                curveToRelative(-2.379f, -0.433f, -4.105f, -2.502f, -4.105f, -4.919f)
                lineTo(0.002f, 7.0f)
                curveToRelative(0.0f, -1.487f, 0.654f, -2.886f, 1.796f, -3.838f)
                curveToRelative(0.752f, -0.628f, 1.657f, -1.006f, 2.605f, -1.12f)
                curveToRelative(-0.257f, 0.602f, -0.401f, 1.263f, -0.401f, 1.957f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.468f, 1.802f, 4.511f, 4.157f, 4.915f)
                lineToRelative(1.439f, 1.44f)
                curveToRelative(0.406f, 0.405f, 0.891f, 0.675f, 1.403f, 0.839f)
                verticalLineToRelative(5.734f)
                curveToRelative(0.664f, 0.097f, 1.336f, 0.097f, 2.0f, 0.0f)
                verticalLineToRelative(-5.692f)
                curveToRelative(0.565f, -0.155f, 1.103f, -0.439f, 1.546f, -0.882f)
                lineToRelative(1.455f, -1.455f)
                curveToRelative(2.279f, -0.465f, 3.999f, -2.485f, 3.999f, -4.899f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.693f, -0.143f, -1.353f, -0.399f, -1.954f)
                curveToRelative(0.959f, 0.113f, 1.856f, 0.492f, 2.603f, 1.116f)
                curveToRelative(1.142f, 0.953f, 1.796f, 2.352f, 1.796f, 3.838f)
                close()
                moveTo(6.0f, 9.0f)
                lineTo(6.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(0.071f)
                lineToRelative(-1.939f, 1.939f)
                curveToRelative(-0.586f, 0.586f, -1.536f, 0.586f, -2.121f, 0.0f)
                lineToRelative(-1.939f, -1.939f)
                horizontalLineToRelative(-0.071f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(10.5f, 3.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _infoGuide!!
    }

private var _infoGuide: ImageVector? = null
