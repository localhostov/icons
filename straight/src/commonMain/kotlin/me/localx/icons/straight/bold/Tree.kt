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

public val Icons.Bold.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.907f, 22.0f)
                lineToRelative(-4.075f, -6.0f)
                horizontalLineTo(22.0f)
                lineToRelative(-4.5f, -6.0f)
                horizontalLineToRelative(2.829f)
                lineTo(14.4f, 1.254f)
                arcToRelative(2.942f, 2.942f, 0.0f, false, false, -4.81f, 0.015f)
                lineTo(3.671f, 10.0f)
                horizontalLineTo(6.5f)
                lineTo(2.0f, 16.0f)
                horizontalLineTo(5.168f)
                lineTo(1.093f, 22.0f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(8.794f, 16.0f)
                horizontalLineToRelative(3.993f)
                lineToRelative(-2.0f, -2.94f)
                lineToRelative(0.041f, -0.06f)
                horizontalLineTo(8.0f)
                lineToRelative(2.25f, -3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(9.173f, 7.231f)
                lineTo(12.0f, 3.06f)
                lineTo(14.671f, 7.0f)
                horizontalLineTo(11.5f)
                lineTo(16.0f, 13.0f)
                horizontalLineTo(13.168f)
                lineToRelative(4.075f, 6.0f)
                horizontalLineTo(6.757f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
