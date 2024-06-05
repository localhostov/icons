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

public val Icons.Bold.Dreidel: ImageVector
    get() {
        if (_dreidel != null) {
            return _dreidel!!
        }
        _dreidel = Builder(name = "Dreidel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.962f, 2.148f)
                lineTo(21.839f, 0.029f)
                lineTo(15.0f, 6.878f)
                lineTo(10.263f, 2.142f)
                lineTo(0.0f, 12.405f)
                verticalLineToRelative(7.1f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 4.5f, 24.0f)
                horizontalLineToRelative(7.1f)
                lineTo(21.858f, 13.737f)
                lineTo(17.12f, 9.0f)
                close()
                moveTo(3.0f, 19.5f)
                lineTo(3.0f, 16.226f)
                arcTo(6.592f, 6.592f, 0.0f, false, false, 5.942f, 17.0f)
                arcToRelative(8.97f, 8.97f, 0.0f, false, false, 1.122f, -0.07f)
                arcTo(8.794f, 8.794f, 0.0f, false, false, 7.0f, 18.0f)
                arcToRelative(6.737f, 6.737f, 0.0f, false, false, 0.783f, 3.0f)
                lineTo(4.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 19.5f)
                close()
                moveTo(10.942f, 20.411f)
                arcTo(4.409f, 4.409f, 0.0f, false, true, 10.0f, 18.0f)
                arcToRelative(3.939f, 3.939f, 0.0f, false, true, 0.981f, -2.86f)
                lineToRelative(2.08f, -2.079f)
                lineToRelative(-2.122f, -2.122f)
                lineTo(8.86f, 13.019f)
                arcTo(4.052f, 4.052f, 0.0f, false, true, 5.942f, 14.0f)
                arcToRelative(4.234f, 4.234f, 0.0f, false, true, -2.36f, -0.935f)
                lineToRelative(6.681f, -6.681f)
                lineToRelative(7.353f, 7.353f)
                close()
            }
        }
        .build()
        return _dreidel!!
    }

private var _dreidel: ImageVector? = null
