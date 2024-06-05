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

public val Icons.Filled.HouseWindow: ImageVector
    get() {
        if (_houseWindow != null) {
            return _houseWindow!!
        }
        _houseWindow = Builder(name = "HouseWindow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 10.043f)
                verticalLineToRelative(13.957f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.043f)
                curveToRelative(0.0f, -0.929f, 0.42f, -1.79f, 1.151f, -2.363f)
                lineTo(10.151f, 0.638f)
                curveToRelative(1.088f, -0.854f, 2.609f, -0.854f, 3.697f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                curveToRelative(0.731f, 0.572f, 1.151f, 1.434f, 1.151f, 2.362f)
                close()
                moveTo(16.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _houseWindow!!
    }

private var _houseWindow: ImageVector? = null
