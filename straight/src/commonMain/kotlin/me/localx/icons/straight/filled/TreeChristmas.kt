package me.localx.icons.straight.filled

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

public val Icons.Filled.TreeChristmas: ImageVector
    get() {
        if (_treeChristmas != null) {
            return _treeChristmas!!
        }
        _treeChristmas = Builder(name = "TreeChristmas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.907f, 22.0f)
                lineTo(18.24f, 15.0f)
                horizontalLineToRelative(2.667f)
                lineToRelative(-4.0f, -6.0f)
                lineTo(19.1f, 9.0f)
                lineTo(13.716f, 0.7f)
                arcToRelative(2.414f, 2.414f, 0.0f, false, false, -3.355f, 0.0f)
                lineTo(4.946f, 9.0f)
                lineTo(7.17f, 9.0f)
                lineToRelative(-4.0f, 6.0f)
                lineTo(5.836f, 15.0f)
                lineTo(1.17f, 22.0f)
                horizontalLineToRelative(9.869f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.039f, 22.0f)
                close()
                moveTo(13.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 18.0f)
                close()
                moveTo(16.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 18.0f)
                close()
                moveTo(15.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 11.0f)
                close()
                moveTo(13.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 5.0f)
                close()
                moveTo(8.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 20.0f)
                close()
                moveTo(9.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 15.0f)
                close()
                moveTo(10.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _treeChristmas!!
    }

private var _treeChristmas: ImageVector? = null
