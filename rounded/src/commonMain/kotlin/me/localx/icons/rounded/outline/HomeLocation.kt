package me.localx.icons.rounded.outline

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

public val Icons.Outline.HomeLocation: ImageVector
    get() {
        if (_homeLocation != null) {
            return _homeLocation!!
        }
        _homeLocation = Builder(name = "HomeLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 5.579f)
                lineTo(14.8f, 0.855f)
                arcTo(4.979f, 4.979f, 0.0f, false, false, 9.2f, 0.855f)
                lineToRelative(-7.0f, 4.724f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.0f, 9.724f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 9.724f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.8f, 5.579f)
                close()
                moveTo(22.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 9.724f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.322f, 7.237f)
                lineToRelative(7.0f, -4.724f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, true, 3.356f, 0.0f)
                lineToRelative(7.0f, 4.724f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 9.724f)
                close()
                moveTo(12.0f, 7.006f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.765f, 17.257f)
                lineToRelative(1.824f, 1.784f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, 4.821f, 0.0f)
                lineToRelative(1.833f, -1.792f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 7.006f)
                close()
                moveTo(14.836f, 15.827f)
                lineTo(13.011f, 17.612f)
                arcToRelative(1.454f, 1.454f, 0.0f, false, true, -2.023f, 0.0f)
                lineTo(9.171f, 15.835f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.665f, -0.008f)
                close()
                moveTo(13.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 13.0f)
                close()
            }
        }
        .build()
        return _homeLocation!!
    }

private var _homeLocation: ImageVector? = null
