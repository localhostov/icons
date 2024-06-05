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

public val Icons.Bold.CodePullRequest: ImageVector
    get() {
        if (_codePullRequest != null) {
            return _codePullRequest!!
        }
        _codePullRequest = Builder(name = "CodePullRequest", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.663f)
                verticalLineToRelative(9.674f)
                curveToRelative(1.182f, 0.562f, 2.0f, 1.767f, 2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, 0.818f, -2.601f, 2.0f, -3.163f)
                lineTo(2.0f, 7.663f)
                curveToRelative(-1.182f, -0.562f, -2.0f, -1.767f, -2.0f, -3.163f)
                curveTo(0.0f, 2.567f, 1.567f, 1.0f, 3.5f, 1.0f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.396f, -0.818f, 2.601f, -2.0f, 3.163f)
                close()
                moveTo(22.0f, 17.337f)
                lineTo(22.0f, 8.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(15.0f, 0.808f)
                curveToRelative(0.0f, -0.716f, -0.863f, -1.077f, -1.373f, -0.574f)
                lineToRelative(-3.132f, 3.091f)
                curveToRelative(-0.249f, 0.246f, -0.494f, 0.675f, -0.494f, 1.175f)
                reflectiveCurveToRelative(0.245f, 0.929f, 0.494f, 1.175f)
                lineToRelative(3.132f, 3.091f)
                curveToRelative(0.51f, 0.503f, 1.373f, 0.142f, 1.373f, -0.574f)
                verticalLineToRelative(-2.192f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(8.837f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, 1.529f, 3.5f, 3.462f, 3.5f)
                reflectiveCurveToRelative(3.538f, -1.567f, 3.538f, -3.5f)
                curveToRelative(0.0f, -1.396f, -0.818f, -2.601f, -2.0f, -3.163f)
                close()
            }
        }
        .build()
        return _codePullRequest!!
    }

private var _codePullRequest: ImageVector? = null
