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

public val Icons.Filled.GarageOpen: ImageVector
    get() {
        if (_garageOpen != null) {
            return _garageOpen!!
        }
        _garageOpen = Builder(name = "GarageOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                lineTo(7.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                close()
                moveTo(24.0f, 10.043f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, -1.151f, -2.362f)
                lineToRelative(-9.0f, -7.044f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.7f, 0.0f)
                lineToRelative(-9.0f, 7.042f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 0.0f, 10.043f)
                lineTo(0.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(18.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(19.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _garageOpen!!
    }

private var _garageOpen: ImageVector? = null
