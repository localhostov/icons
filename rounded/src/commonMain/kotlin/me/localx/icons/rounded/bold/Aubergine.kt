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

public val Icons.Bold.Aubergine: ImageVector
    get() {
        if (_aubergine != null) {
            return _aubergine!!
        }
        _aubergine = Builder(name = "Aubergine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.733f, 5.078f)
                arcToRelative(6.091f, 6.091f, 0.0f, false, false, 0.6f, -0.33f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, false, 0.418f, -2.061f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, -2.068f, -0.444f)
                arcToRelative(5.684f, 5.684f, 0.0f, false, true, -1.682f, 0.6f)
                verticalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(2.844f)
                arcToRelative(5.733f, 5.733f, 0.0f, false, true, -1.68f, -0.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.652f, 2.5f)
                arcToRelative(5.885f, 5.885f, 0.0f, false, false, 0.607f, 0.333f)
                arcTo(6.471f, 6.471f, 0.0f, false, false, 11.13f, 8.7f)
                curveTo(11.051f, 9.093f, 10.686f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(7.5f)
                curveTo(3.224f, 10.0f, 0.0f, 13.01f, 0.0f, 17.0f)
                reflectiveCurveToRelative(3.224f, 7.0f, 7.5f, 7.0f)
                curveTo(17.832f, 24.0f, 24.0f, 18.767f, 24.0f, 10.0f)
                arcTo(6.483f, 6.483f, 0.0f, false, false, 21.733f, 5.078f)
                close()
                moveTo(7.5f, 21.0f)
                curveTo(4.851f, 21.0f, 3.0f, 19.355f, 3.0f, 17.0f)
                reflectiveCurveToRelative(1.851f, -4.0f, 4.5f, -4.0f)
                horizontalLineTo(9.0f)
                curveToRelative(3.189f, 0.0f, 4.725f, -1.994f, 5.07f, -3.7f)
                arcTo(3.49f, 3.49f, 0.0f, false, true, 16.0f, 6.853f)
                verticalLineTo(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(6.851f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 21.0f, 10.0f)
                curveTo(21.0f, 19.571f, 12.542f, 21.0f, 7.5f, 21.0f)
                close()
            }
        }
        .build()
        return _aubergine!!
    }

private var _aubergine: ImageVector? = null
