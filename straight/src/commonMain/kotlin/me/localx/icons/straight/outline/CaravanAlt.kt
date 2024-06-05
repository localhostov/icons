package me.localx.icons.straight.outline

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

public val Icons.Outline.CaravanAlt: ImageVector
    get() {
        if (_caravanAlt != null) {
            return _caravanAlt!!
        }
        _caravanAlt = Builder(name = "CaravanAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.0f)
                lineTo(22.0f, 19.0f)
                lineTo(22.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 21.0f)
                lineTo(4.142f, 21.0f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, 7.716f, 0.0f)
                lineTo(24.0f, 21.0f)
                close()
                moveTo(2.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 11.0f)
                close()
                moveTo(8.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 22.0f)
                close()
                moveTo(8.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.858f, 3.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                lineTo(9.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                lineTo(19.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(20.0f, 19.0f)
                lineTo(11.858f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 16.0f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(11.0f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(16.0f, 11.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _caravanAlt!!
    }

private var _caravanAlt: ImageVector? = null
