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

public val Icons.Bold.CodeMerge: ImageVector
    get() {
        if (_codeMerge != null) {
            return _codeMerge!!
        }
        _codeMerge = Builder(name = "CodeMerge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.5f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.396f, 0.0f, -2.601f, -0.818f, -3.163f, -2.0f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.525f, 0.0f, -1.03f, -0.091f, -1.5f, -0.257f)
                verticalLineToRelative(4.594f)
                curveToRelative(1.182f, 0.562f, 2.0f, 1.767f, 2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, 0.818f, -2.601f, 2.0f, -3.163f)
                verticalLineTo(6.663f)
                curveTo(0.818f, 6.101f, 0.0f, 4.896f, 0.0f, 3.5f)
                curveTo(0.0f, 1.567f, 1.567f, 0.0f, 3.5f, 0.0f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.396f, -0.818f, 2.601f, -2.0f, 3.163f)
                verticalLineToRelative(1.837f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(10.837f)
                curveToRelative(0.562f, -1.182f, 1.767f, -2.0f, 3.163f, -2.0f)
                curveToRelative(1.933f, 0.0f, 3.5f, 1.567f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _codeMerge!!
    }

private var _codeMerge: ImageVector? = null
