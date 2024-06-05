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

public val Icons.Bold.RemoveFolder: ImageVector
    get() {
        if (_removeFolder != null) {
            return _removeFolder!!
        }
        _removeFolder = Builder(name = "RemoveFolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.62f, 19.5f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.44f, 2.44f)
                close()
                moveTo(3.0f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(6.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(12.35f)
                lineTo(8.35f, 1.0f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 1.0f, 0.0f, 2.57f, 0.0f, 4.5f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _removeFolder!!
    }

private var _removeFolder: ImageVector? = null
