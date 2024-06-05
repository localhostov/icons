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

public val Icons.Filled.AsseptDocument: ImageVector
    get() {
        if (_asseptDocument != null) {
            return _asseptDocument!!
        }
        _asseptDocument = Builder(name = "AsseptDocument", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 7.0f)
                verticalLineToRelative(-6.54f)
                arcToRelative(6.977f, 6.977f, 0.0f, false, true, 2.465f, 1.59f)
                lineToRelative(3.484f, 3.486f)
                arcToRelative(6.954f, 6.954f, 0.0f, false, true, 1.591f, 2.464f)
                horizontalLineToRelative(-6.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(22.0f, 10.485f)
                verticalLineToRelative(8.515f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.163f, 0.0f, 0.324f, 0.013f, 0.485f, 0.024f)
                verticalLineToRelative(6.976f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(6.976f)
                curveToRelative(0.011f, 0.161f, 0.024f, 0.322f, 0.024f, 0.485f)
                close()
                moveTo(16.724f, 14.311f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.413f, -0.035f)
                lineToRelative(-3.6f, 3.431f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.456f, -0.04f)
                lineToRelative(-1.589f, -1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.332f, 1.494f)
                lineToRelative(1.544f, 1.374f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.226f, 0.017f)
                lineToRelative(3.585f, -3.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.035f, -1.413f)
                close()
            }
        }
        .build()
        return _asseptDocument!!
    }

private var _asseptDocument: ImageVector? = null
