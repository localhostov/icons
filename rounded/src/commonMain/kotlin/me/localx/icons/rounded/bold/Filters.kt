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

public val Icons.Bold.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 20.0f)
                curveToRelative(-0.318f, 0.0f, -0.636f, -0.102f, -0.9f, -0.3f)
                lineToRelative(-5.0f, -3.75f)
                curveToRelative(-0.377f, -0.284f, -0.6f, -0.728f, -0.6f, -1.2f)
                verticalLineToRelative(-2.851f)
                lineTo(5.222f, 7.121f)
                curveToRelative(-0.788f, -0.788f, -1.222f, -1.835f, -1.222f, -2.949f)
                curveTo(4.0f, 1.871f, 5.871f, 0.0f, 8.171f, 0.0f)
                horizontalLineToRelative(11.658f)
                curveToRelative(2.3f, 0.0f, 4.171f, 1.871f, 4.171f, 4.171f)
                curveToRelative(0.0f, 1.114f, -0.434f, 2.162f, -1.222f, 2.949f)
                lineToRelative(-4.778f, 4.778f)
                verticalLineToRelative(6.601f)
                curveToRelative(0.0f, 0.568f, -0.321f, 1.087f, -0.829f, 1.342f)
                curveToRelative(-0.212f, 0.106f, -0.442f, 0.158f, -0.671f, 0.158f)
                close()
                moveTo(13.0f, 14.0f)
                lineToRelative(2.0f, 1.5f)
                verticalLineToRelative(-4.222f)
                curveToRelative(0.0f, -0.398f, 0.158f, -0.779f, 0.439f, -1.061f)
                lineToRelative(5.218f, -5.218f)
                curveToRelative(0.221f, -0.221f, 0.343f, -0.515f, 0.343f, -0.828f)
                curveToRelative(0.0f, -0.646f, -0.525f, -1.171f, -1.171f, -1.171f)
                lineTo(8.171f, 3.0f)
                curveToRelative(-0.646f, 0.0f, -1.171f, 0.525f, -1.171f, 1.171f)
                curveToRelative(0.0f, 0.313f, 0.122f, 0.607f, 0.343f, 0.828f)
                lineToRelative(5.218f, 5.218f)
                curveToRelative(0.281f, 0.281f, 0.439f, 0.663f, 0.439f, 1.061f)
                verticalLineToRelative(2.722f)
                close()
                moveTo(13.7f, 23.4f)
                curveToRelative(0.497f, -0.663f, 0.362f, -1.603f, -0.3f, -2.1f)
                lineToRelative(-4.4f, -3.3f)
                verticalLineToRelative(-2.722f)
                curveToRelative(0.0f, -0.398f, -0.158f, -0.779f, -0.439f, -1.061f)
                lineTo(3.343f, 9.0f)
                curveToRelative(-0.221f, -0.221f, -0.343f, -0.515f, -0.343f, -0.828f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                curveToRelative(0.0f, 1.114f, 0.434f, 2.162f, 1.222f, 2.949f)
                lineToRelative(4.778f, 4.778f)
                verticalLineToRelative(2.851f)
                curveToRelative(0.0f, 0.472f, 0.223f, 0.917f, 0.6f, 1.2f)
                lineToRelative(5.0f, 3.75f)
                curveToRelative(0.271f, 0.202f, 0.586f, 0.3f, 0.899f, 0.3f)
                curveToRelative(0.456f, 0.0f, 0.906f, -0.207f, 1.201f, -0.6f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
