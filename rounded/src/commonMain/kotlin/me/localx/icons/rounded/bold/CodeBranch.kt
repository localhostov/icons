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

public val Icons.Bold.CodeBranch: ImageVector
    get() {
        if (_codeBranch != null) {
            return _codeBranch!!
        }
        _codeBranch = Builder(name = "CodeBranch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.396f, 0.818f, 2.601f, 2.0f, 3.163f)
                verticalLineToRelative(1.837f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-0.899f, 0.0f, -1.75f, 0.217f, -2.5f, 0.602f)
                verticalLineTo(6.663f)
                curveToRelative(1.182f, -0.562f, 2.0f, -1.767f, 2.0f, -3.163f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveTo(0.0f, 1.567f, 0.0f, 3.5f)
                curveToRelative(0.0f, 1.396f, 0.818f, 2.601f, 2.0f, 3.163f)
                verticalLineToRelative(10.674f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, -0.818f, -2.601f, -2.0f, -3.163f)
                verticalLineToRelative(-0.837f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-1.837f)
                curveToRelative(1.182f, -0.562f, 2.0f, -1.767f, 2.0f, -3.163f)
                close()
            }
        }
        .build()
        return _codeBranch!!
    }

private var _codeBranch: ImageVector? = null
