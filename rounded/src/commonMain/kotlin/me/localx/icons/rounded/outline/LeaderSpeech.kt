package me.localx.icons.rounded.outline

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

public val Icons.Outline.LeaderSpeech: ImageVector
    get() {
        if (_leaderSpeech != null) {
            return _leaderSpeech!!
        }
        _leaderSpeech = Builder(name = "LeaderSpeech", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.672f)
                curveToRelative(0.0f, -0.801f, 0.312f, -1.555f, 0.879f, -2.121f)
                lineToRelative(0.695f, -0.695f)
                curveToRelative(-0.044f, -0.164f, -0.074f, -0.334f, -0.074f, -0.512f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.178f, 0.0f, -0.347f, -0.031f, -0.512f, -0.074f)
                lineToRelative(-0.695f, 0.695f)
                curveToRelative(-0.186f, 0.187f, -0.293f, 0.444f, -0.293f, 0.707f)
                verticalLineToRelative(2.672f)
                horizontalLineToRelative(6.0f)
                lineTo(10.0f, 7.362f)
                lineTo(5.232f, 1.64f)
                curveToRelative(-0.354f, -0.424f, -0.296f, -1.055f, 0.128f, -1.408f)
                curveToRelative(0.423f, -0.355f, 1.055f, -0.296f, 1.408f, 0.128f)
                lineToRelative(4.7f, 5.64f)
                horizontalLineToRelative(6.063f)
                lineTo(22.232f, 0.36f)
                curveToRelative(0.353f, -0.424f, 0.984f, -0.482f, 1.408f, -0.128f)
                curveToRelative(0.424f, 0.354f, 0.481f, 0.984f, 0.128f, 1.408f)
                lineToRelative(-4.768f, 5.722f)
                verticalLineToRelative(8.638f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(12.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _leaderSpeech!!
    }

private var _leaderSpeech: ImageVector? = null
