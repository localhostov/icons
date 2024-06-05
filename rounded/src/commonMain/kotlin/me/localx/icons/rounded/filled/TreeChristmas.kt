package me.localx.icons.rounded.filled

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
                moveTo(20.44f, 16.855f)
                lineToRelative(-1.481f, -2.221f)
                arcToRelative(2.214f, 2.214f, 0.0f, false, false, 0.619f, -3.072f)
                lineTo(17.487f, 8.427f)
                arcToRelative(2.234f, 2.234f, 0.0f, false, false, 0.456f, -0.58f)
                arcToRelative(2.21f, 2.21f, 0.0f, false, false, -0.084f, -2.256f)
                curveTo(17.834f, 5.553f, 13.678f, 0.7f, 13.678f, 0.7f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, false, -3.4f, 0.051f)
                reflectiveCurveToRelative(-4.126f, 4.8f, -4.15f, 4.832f)
                arcToRelative(2.212f, 2.212f, 0.0f, false, false, 0.38f, 2.853f)
                lineTo(4.422f, 11.562f)
                arcToRelative(2.214f, 2.214f, 0.0f, false, false, 0.619f, 3.072f)
                lineTo(3.56f, 16.855f)
                arcTo(3.309f, 3.309f, 0.0f, false, false, 6.312f, 22.0f)
                lineTo(11.0f, 22.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 22.0f)
                horizontalLineToRelative(4.687f)
                arcToRelative(3.309f, 3.309f, 0.0f, false, false, 2.753f, -5.145f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(8.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 19.0f)
                close()
                moveTo(8.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 14.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 18.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _treeChristmas!!
    }

private var _treeChristmas: ImageVector? = null
