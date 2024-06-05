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
                moveTo(20.5f, 9.0f)
                curveToRelative(-1.396f, 0.0f, -2.601f, 0.818f, -3.163f, 2.0f)
                horizontalLineTo(7.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-1.837f)
                curveToRelative(1.182f, -0.562f, 2.0f, -1.767f, 2.0f, -3.163f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveTo(0.0f, 1.567f, 0.0f, 3.5f)
                curveToRelative(0.0f, 1.396f, 0.818f, 2.601f, 2.0f, 3.163f)
                verticalLineToRelative(10.674f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, -0.818f, -2.601f, -2.0f, -3.163f)
                verticalLineToRelative(-3.939f)
                curveToRelative(0.75f, 0.384f, 1.601f, 0.602f, 2.5f, 0.602f)
                horizontalLineToRelative(9.837f)
                curveToRelative(0.562f, 1.182f, 1.767f, 2.0f, 3.163f, 2.0f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.567f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _codeMerge!!
    }

private var _codeMerge: ImageVector? = null
