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

public val Icons.Outline.HouseBlank: ImageVector
    get() {
        if (_houseBlank != null) {
            return _houseBlank!!
        }
        _houseBlank = Builder(name = "HouseBlank", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(10.043f)
                curveToRelative(0.0f, -0.929f, 0.42f, -1.79f, 1.151f, -2.363f)
                lineTo(10.151f, 0.638f)
                curveToRelative(1.088f, -0.854f, 2.609f, -0.854f, 3.697f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                curveToRelative(0.731f, 0.572f, 1.151f, 1.434f, 1.151f, 2.362f)
                verticalLineToRelative(13.957f)
                close()
                moveTo(2.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.043f)
                curveToRelative(0.0f, -0.31f, -0.14f, -0.597f, -0.384f, -0.787f)
                lineTo(12.616f, 2.212f)
                curveToRelative(-0.363f, -0.283f, -0.869f, -0.283f, -1.232f, 0.0f)
                lineTo(2.384f, 9.255f)
                curveToRelative(-0.244f, 0.191f, -0.384f, 0.479f, -0.384f, 0.788f)
                verticalLineToRelative(11.957f)
                close()
            }
        }
        .build()
        return _houseBlank!!
    }

private var _houseBlank: ImageVector? = null
