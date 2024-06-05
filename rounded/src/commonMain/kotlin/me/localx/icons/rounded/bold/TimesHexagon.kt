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

public val Icons.Bold.TimesHexagon: ImageVector
    get() {
        if (_timesHexagon != null) {
            return _timesHexagon!!
        }
        _timesHexagon = Builder(name = "TimesHexagon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.229f, 9.219f)
                lineToRelative(-3.224f, -5.5f)
                curveToRelative(-0.982f, -1.677f, -2.801f, -2.719f, -4.745f, -2.719f)
                horizontalLineToRelative(-6.551f)
                curveToRelative(-1.943f, 0.0f, -3.761f, 1.042f, -4.745f, 2.719f)
                lineTo(0.742f, 9.219f)
                curveToRelative(-1.006f, 1.715f, -1.006f, 3.847f, 0.0f, 5.562f)
                lineToRelative(3.223f, 5.501f)
                curveToRelative(0.984f, 1.677f, 2.802f, 2.718f, 4.745f, 2.718f)
                horizontalLineToRelative(6.551f)
                curveToRelative(1.944f, 0.0f, 3.763f, -1.042f, 4.745f, -2.719f)
                lineToRelative(3.224f, -5.5f)
                curveToRelative(1.005f, -1.715f, 1.005f, -3.846f, 0.0f, -5.561f)
                close()
                moveTo(20.641f, 13.264f)
                lineToRelative(-3.224f, 5.5f)
                curveToRelative(-0.447f, 0.762f, -1.273f, 1.236f, -2.157f, 1.236f)
                horizontalLineToRelative(-6.551f)
                curveToRelative(-0.883f, 0.0f, -1.71f, -0.474f, -2.157f, -1.236f)
                lineToRelative(-3.223f, -5.5f)
                curveToRelative(-0.457f, -0.779f, -0.457f, -1.748f, 0.0f, -2.528f)
                lineToRelative(3.223f, -5.499f)
                curveToRelative(0.447f, -0.763f, 1.274f, -1.237f, 2.157f, -1.237f)
                horizontalLineToRelative(6.551f)
                curveToRelative(0.884f, 0.0f, 1.71f, 0.474f, 2.157f, 1.236f)
                lineToRelative(3.224f, 5.5f)
                curveToRelative(0.456f, 0.78f, 0.456f, 1.749f, 0.0f, 2.529f)
                close()
                moveTo(15.81f, 10.31f)
                lineToRelative(-1.689f, 1.689f)
                lineToRelative(1.689f, 1.689f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-1.689f, -1.689f)
                lineToRelative(-1.689f, 1.689f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(1.689f, -1.689f)
                lineToRelative(-1.689f, -1.689f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(1.689f, 1.689f)
                lineToRelative(1.689f, -1.689f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
            }
        }
        .build()
        return _timesHexagon!!
    }

private var _timesHexagon: ImageVector? = null
