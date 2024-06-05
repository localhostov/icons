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

public val Icons.Bold.InfoGuide: ImageVector
    get() {
        if (_infoGuide != null) {
            return _infoGuide!!
        }
        _infoGuide = Builder(name = "InfoGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.146f)
                verticalLineToRelative(10.147f)
                curveToRelative(0.0f, 2.659f, -1.899f, 4.935f, -4.516f, 5.411f)
                lineToRelative(-5.762f, 1.139f)
                curveToRelative(-0.578f, 0.105f, -1.154f, 0.157f, -1.728f, 0.157f)
                curveToRelative(-0.568f, 0.0f, -1.132f, -0.051f, -1.693f, -0.153f)
                lineToRelative(-5.807f, -1.147f)
                curveToRelative(-2.595f, -0.472f, -4.494f, -2.748f, -4.494f, -5.407f)
                lineTo(0.0f, 7.146f)
                curveToRelative(0.0f, -1.344f, 0.489f, -2.636f, 1.376f, -3.64f)
                curveToRelative(0.548f, -0.62f, 1.496f, -0.679f, 2.117f, -0.13f)
                curveToRelative(0.621f, 0.548f, 0.679f, 1.497f, 0.13f, 2.117f)
                curveToRelative(-0.284f, 0.321f, -0.623f, 0.869f, -0.623f, 1.652f)
                verticalLineToRelative(10.147f)
                curveToRelative(0.0f, 1.209f, 0.863f, 2.243f, 2.053f, 2.46f)
                lineToRelative(5.447f, 1.076f)
                verticalLineToRelative(-3.328f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(3.328f)
                lineToRelative(5.425f, -1.072f)
                curveToRelative(1.212f, -0.221f, 2.075f, -1.255f, 2.075f, -2.464f)
                lineTo(21.0f, 7.146f)
                curveToRelative(0.0f, -0.783f, -0.339f, -1.331f, -0.624f, -1.652f)
                curveToRelative(-0.549f, -0.621f, -0.491f, -1.568f, 0.129f, -2.118f)
                curveToRelative(0.621f, -0.549f, 1.568f, -0.491f, 2.118f, 0.129f)
                curveToRelative(0.888f, 1.003f, 1.376f, 2.296f, 1.376f, 3.64f)
                close()
                moveTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(0.071f)
                lineToRelative(1.939f, 1.939f)
                curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.121f, 0.0f)
                lineToRelative(1.939f, -1.939f)
                lineToRelative(-0.017f, -0.005f)
                curveToRelative(1.631f, -0.03f, 2.946f, -1.356f, 2.946f, -2.995f)
                lineTo(17.999f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _infoGuide!!
    }

private var _infoGuide: ImageVector? = null
