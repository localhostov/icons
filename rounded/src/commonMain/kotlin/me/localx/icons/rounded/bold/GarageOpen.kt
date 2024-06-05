package me.localx.icons.rounded.bold

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

public val Icons.Bold.GarageOpen: ImageVector
    get() {
        if (_garageOpen != null) {
            return _garageOpen!!
        }
        _garageOpen = Builder(name = "GarageOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.576f, 5.364f)
                lineTo(14.975f, 0.91f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, false, -5.95f, 0.0f)
                lineToRelative(-6.6f, 4.454f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 0.0f, 9.924f)
                verticalLineTo(18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 22.5f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 24.0f)
                horizontalLineToRelative(1.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 18.5f)
                verticalLineTo(9.924f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 21.576f, 5.364f)
                close()
                moveTo(21.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, 2.45f)
                verticalLineTo(12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.5f, 9.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.0f, 12.5f)
                verticalLineToRelative(8.45f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineTo(9.924f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.1f, 7.851f)
                lineTo(10.7f, 3.4f)
                arcToRelative(2.308f, 2.308f, 0.0f, false, true, 2.593f, 0.0f)
                lineToRelative(6.6f, 4.455f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 9.924f)
                close()
            }
        }
        .build()
        return _garageOpen!!
    }

private var _garageOpen: ImageVector? = null
