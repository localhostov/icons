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

public val Icons.Filled.CodePullRequest: ImageVector
    get() {
        if (_codePullRequest != null) {
            return _codePullRequest!!
        }
        _codePullRequest = Builder(name = "CodePullRequest", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(0.0f, 2.794f, 0.0f, 5.0f)
                curveToRelative(0.0f, 1.86f, 1.277f, 3.428f, 3.0f, 3.873f)
                verticalLineToRelative(7.253f)
                curveToRelative(-1.723f, 0.445f, -3.0f, 2.013f, -3.0f, 3.873f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.86f, -1.277f, -3.428f, -3.0f, -3.873f)
                verticalLineToRelative(-7.253f)
                curveToRelative(1.723f, -0.445f, 3.0f, -2.013f, 3.0f, -3.873f)
                close()
                moveTo(21.0f, 16.127f)
                verticalLineToRelative(-7.127f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-3.471f)
                lineToRelative(2.196f, -2.311f)
                curveToRelative(0.381f, -0.4f, 0.364f, -1.034f, -0.036f, -1.414f)
                curveToRelative(-0.399f, -0.379f, -1.033f, -0.364f, -1.413f, 0.036f)
                lineToRelative(-2.396f, 2.522f)
                curveToRelative(-1.17f, 1.169f, -1.17f, 3.073f, -0.03f, 4.212f)
                lineToRelative(2.415f, 2.631f)
                curveToRelative(0.196f, 0.215f, 0.466f, 0.324f, 0.736f, 0.324f)
                curveToRelative(0.242f, 0.0f, 0.484f, -0.087f, 0.676f, -0.263f)
                curveToRelative(0.407f, -0.374f, 0.435f, -1.006f, 0.061f, -1.413f)
                lineToRelative(-2.133f, -2.324f)
                horizontalLineToRelative(3.397f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.127f)
                curveToRelative(-1.724f, 0.445f, -3.0f, 2.013f, -3.0f, 3.873f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.86f, -1.276f, -3.428f, -3.0f, -3.873f)
                close()
            }
        }
        .build()
        return _codePullRequest!!
    }

private var _codePullRequest: ImageVector? = null
