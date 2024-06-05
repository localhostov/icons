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

public val Icons.Bold.ExpandArrows: ImageVector
    get() {
        if (_expandArrows != null) {
            return _expandArrows!!
        }
        _expandArrows = Builder(name = "ExpandArrows", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 7.5f)
                verticalLineToRelative(-4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 0.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(2.376f)
                lineTo(12.0f, 9.879f)
                lineTo(5.121f, 3.0f)
                horizontalLineTo(7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 3.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(5.121f)
                lineTo(9.879f, 12.0f)
                lineTo(3.0f, 18.879f)
                verticalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.5f, 24.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(5.121f)
                lineTo(12.0f, 14.121f)
                lineTo(18.879f, 21.0f)
                horizontalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(2.376f)
                lineTo(14.121f, 12.0f)
                lineTo(21.0f, 5.121f)
                verticalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 9.0f)
                close()
            }
        }
        .build()
        return _expandArrows!!
    }

private var _expandArrows: ImageVector? = null
