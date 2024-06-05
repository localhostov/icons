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

public val Icons.Outline.HomeLocationAlt: ImageVector
    get() {
        if (_homeLocationAlt != null) {
            return _homeLocationAlt!!
        }
        _homeLocationAlt = Builder(name = "HomeLocationAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.724f)
                lineTo(24.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(18.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(22.0f, 9.724f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.322f, -2.487f)
                lineToRelative(-7.0f, -4.723f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, false, -3.356f, 0.0f)
                lineToRelative(-7.0f, 4.723f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 9.724f)
                lineTo(2.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(5.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(0.0f, 9.724f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 2.2f, 5.579f)
                lineTo(9.2f, 0.855f)
                arcToRelative(4.981f, 4.981f, 0.0f, false, true, 5.594f, 0.0f)
                lineToRelative(7.0f, 4.724f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 24.0f, 9.724f)
                close()
                moveTo(19.0f, 15.007f)
                arcToRelative(6.952f, 6.952f, 0.0f, false, true, -2.05f, 4.949f)
                lineToRelative(-3.515f, 3.438f)
                arcToRelative(2.063f, 2.063f, 0.0f, false, true, -2.87f, 0.0f)
                lineToRelative(-3.507f, -3.43f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 19.0f, 15.007f)
                close()
                moveTo(17.0f, 15.007f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -8.536f, 3.535f)
                lineToRelative(3.5f, 3.422f)
                lineToRelative(3.58f, -3.43f)
                arcTo(4.958f, 4.958f, 0.0f, false, false, 17.0f, 15.007f)
                close()
                moveTo(15.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _homeLocationAlt!!
    }

private var _homeLocationAlt: ImageVector? = null
