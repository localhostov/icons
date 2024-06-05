package me.localx.icons.straight.bold

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

public val Icons.Bold.CodePullRequestClosed: ImageVector
    get() {
        if (_codePullRequestClosed != null) {
            return _codePullRequestClosed!!
        }
        _codePullRequestClosed = Builder(name = "CodePullRequestClosed", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.663f)
                verticalLineToRelative(10.674f)
                curveToRelative(1.182f, 0.562f, 2.0f, 1.767f, 2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, 0.818f, -2.601f, 2.0f, -3.163f)
                lineTo(2.0f, 6.663f)
                curveTo(0.818f, 6.101f, 0.0f, 4.896f, 0.0f, 3.5f)
                curveTo(0.0f, 1.567f, 1.567f, 0.0f, 3.5f, 0.0f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.396f, -0.818f, 2.601f, -2.0f, 3.163f)
                close()
                moveTo(21.0f, 17.337f)
                verticalLineToRelative(-7.337f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.337f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, -0.818f, -2.601f, -2.0f, -3.163f)
                close()
                moveTo(23.811f, 2.311f)
                lineTo(21.689f, 0.189f)
                lineToRelative(-2.189f, 2.189f)
                lineTo(17.311f, 0.189f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.189f, 2.189f)
                lineToRelative(-2.189f, 2.189f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.189f, -2.189f)
                lineToRelative(2.189f, 2.189f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.189f, -2.189f)
                lineToRelative(2.189f, -2.189f)
                close()
            }
        }
        .build()
        return _codePullRequestClosed!!
    }

private var _codePullRequestClosed: ImageVector? = null
