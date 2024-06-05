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

public val Icons.Bold.CodeFork: ImageVector
    get() {
        if (_codeFork != null) {
            return _codeFork!!
        }
        _codeFork = Builder(name = "CodeFork", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.663f)
                verticalLineToRelative(1.837f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(1.837f)
                curveToRelative(1.182f, 0.562f, 2.0f, 1.767f, 2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, 0.818f, -2.601f, 2.0f, -3.163f)
                verticalLineToRelative(-1.837f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-1.837f)
                curveTo(0.818f, 6.101f, 0.0f, 4.896f, 0.0f, 3.5f)
                curveTo(0.0f, 1.567f, 1.567f, 0.0f, 3.5f, 0.0f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.396f, -0.818f, 2.601f, -2.0f, 3.163f)
                verticalLineToRelative(1.837f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.151f, 0.0f, 2.203f, 0.435f, 3.0f, 1.148f)
                curveToRelative(0.797f, -0.714f, 1.849f, -1.148f, 3.0f, -1.148f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-1.837f)
                curveToRelative(-1.182f, -0.562f, -2.0f, -1.767f, -2.0f, -3.163f)
                curveToRelative(0.0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.396f, -0.818f, 2.601f, -2.0f, 3.163f)
                close()
            }
        }
        .build()
        return _codeFork!!
    }

private var _codeFork: ImageVector? = null
