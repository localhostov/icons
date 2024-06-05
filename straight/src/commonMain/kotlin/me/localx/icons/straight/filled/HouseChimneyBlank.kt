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

public val Icons.Filled.HouseChimneyBlank: ImageVector
    get() {
        if (_houseChimneyBlank != null) {
            return _houseChimneyBlank!!
        }
        _houseChimneyBlank = Builder(name = "HouseChimneyBlank", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.849f, 7.681f)
                lineToRelative(-0.886f, -0.693f)
                horizontalLineToRelative(0.037f)
                verticalLineTo(1.987f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.464f)
                lineTo(13.849f, 0.638f)
                curveToRelative(-1.088f, -0.854f, -2.609f, -0.854f, -3.697f, 0.0f)
                lineTo(1.151f, 7.68f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(13.957f)
                horizontalLineTo(24.0f)
                verticalLineTo(10.043f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
            }
        }
        .build()
        return _houseChimneyBlank!!
    }

private var _houseChimneyBlank: ImageVector? = null
