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

public val Icons.Outline.GarageOpen: ImageVector
    get() {
        if (_garageOpen != null) {
            return _garageOpen!!
        }
        _garageOpen = Builder(name = "GarageOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 5.579f)
                lineTo(14.8f, 0.855f)
                arcTo(4.981f, 4.981f, 0.0f, false, false, 9.2f, 0.855f)
                lineToRelative(-7.0f, 4.724f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 0.0f, 9.724f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(6.0f, 15.0f)
                lineTo(18.0f, 15.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 9.724f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.8f, 5.579f)
                close()
                moveTo(6.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(22.0f, 19.0f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, true, -2.0f, 2.829f)
                lineTo(20.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(8.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(8.829f)
                arcTo(3.006f, 3.006f, 0.0f, false, true, 2.0f, 19.0f)
                lineTo(2.0f, 9.724f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.322f, 7.237f)
                lineToRelative(7.0f, -4.723f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, true, 3.356f, 0.0f)
                lineToRelative(7.0f, 4.723f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 9.724f)
                close()
            }
        }
        .build()
        return _garageOpen!!
    }

private var _garageOpen: ImageVector? = null
