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

public val Icons.Bold.CodeCompare: ImageVector
    get() {
        if (_codeCompare != null) {
            return _codeCompare!!
        }
        _codeCompare = Builder(name = "CodeCompare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.663f)
                verticalLineToRelative(7.837f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-1.501f)
                verticalLineToRelative(2.192f)
                curveToRelative(0.0f, 0.716f, -0.863f, 1.077f, -1.373f, 0.574f)
                lineToRelative(-3.132f, -3.091f)
                curveToRelative(-0.655f, -0.646f, -0.655f, -1.703f, 0.0f, -2.35f)
                lineToRelative(3.132f, -3.091f)
                curveToRelative(0.51f, -0.503f, 1.373f, -0.142f, 1.373f, 0.574f)
                verticalLineToRelative(2.192f)
                horizontalLineToRelative(1.501f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(19.0f, 7.663f)
                curveToRelative(-1.182f, -0.562f, -2.0f, -1.767f, -2.0f, -3.163f)
                curveToRelative(0.0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.396f, -0.818f, 2.601f, -2.0f, 3.163f)
                close()
                moveTo(13.525f, 5.655f)
                curveToRelative(0.644f, -0.635f, 0.644f, -1.675f, 0.0f, -2.31f)
                lineTo(10.373f, 0.234f)
                curveToRelative(-0.51f, -0.503f, -1.373f, -0.142f, -1.373f, 0.574f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(7.837f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, -0.818f, -2.601f, -2.0f, -3.163f)
                verticalLineToRelative(-7.837f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.192f)
                curveToRelative(0.0f, 0.716f, 0.863f, 1.077f, 1.373f, 0.574f)
                lineToRelative(3.152f, -3.111f)
                close()
            }
        }
        .build()
        return _codeCompare!!
    }

private var _codeCompare: ImageVector? = null
