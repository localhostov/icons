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

public val Icons.Bold.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.542f, 7.0f)
                arcTo(2.461f, 2.461f, 0.0f, false, false, 24.0f, 4.542f)
                verticalLineTo(0.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.626f)
                arcTo(6.675f, 6.675f, 0.0f, false, false, 6.374f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.542f)
                arcTo(2.461f, 2.461f, 0.0f, false, false, 2.458f, 7.0f)
                horizontalLineToRelative(2.8f)
                lineTo(4.24f, 11.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(3.572f)
                curveToRelative(-0.016f, 0.2f, -0.042f, 0.4f, -0.042f, 0.614f)
                arcTo(8.435f, 8.435f, 0.0f, false, false, 3.878f, 17.0f)
                horizontalLineTo(2.458f)
                arcTo(2.461f, 2.461f, 0.0f, false, false, 0.0f, 19.458f)
                verticalLineTo(24.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.468f)
                arcToRelative(8.461f, 8.461f, 0.0f, false, false, 13.064f, 0.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(19.458f)
                arcTo(2.461f, 2.461f, 0.0f, false, false, 21.542f, 17.0f)
                horizontalLineToRelative(-1.42f)
                arcToRelative(8.435f, 8.435f, 0.0f, false, false, 0.348f, -2.386f)
                curveToRelative(0.0f, -0.209f, -0.026f, -0.41f, -0.042f, -0.614f)
                horizontalLineTo(24.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.754f)
                lineTo(18.747f, 7.0f)
                close()
                moveTo(12.0f, 20.083f)
                arcToRelative(5.476f, 5.476f, 0.0f, false, true, -5.47f, -5.469f)
                arcToRelative(5.326f, 5.326f, 0.0f, false, true, 0.038f, -0.6f)
                lineTo(8.512f, 6.343f)
                arcToRelative(3.72f, 3.72f, 0.0f, false, true, 6.976f, 0.0f)
                lineToRelative(1.944f, 7.675f)
                arcToRelative(5.326f, 5.326f, 0.0f, false, true, 0.038f, 0.6f)
                arcTo(5.476f, 5.476f, 0.0f, false, true, 12.0f, 20.083f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
