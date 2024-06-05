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

public val Icons.Filled.Rv: ImageVector
    get() {
        if (_rv != null) {
            return _rv!!
        }
        _rv = Builder(name = "Rv", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                lineTo(8.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(16.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.5f)
                arcToRelative(6.866f, 6.866f, 0.0f, false, false, -0.419f, -0.879f)
                lineTo(21.3f, 8.0f)
                lineTo(18.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(24.0f, 14.593f)
                curveToRelative(0.0f, -0.2f, -0.022f, -0.4f, -0.039f, -0.593f)
                close()
                moveTo(14.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.707f, -0.293f)
                lineTo(2.05f, 17.464f)
                arcTo(6.954f, 6.954f, 0.0f, false, true, 0.0f, 12.515f)
                lineTo(0.0f, 6.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 1.0f)
                lineTo(21.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(24.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(18.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(10.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                lineTo(2.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(8.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 9.0f)
                close()
                moveTo(4.058f, 21.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(16.058f, 21.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
            }
        }
        .build()
        return _rv!!
    }

private var _rv: ImageVector? = null
