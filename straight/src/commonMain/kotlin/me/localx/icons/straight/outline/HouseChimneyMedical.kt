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

public val Icons.Outline.HouseChimneyMedical: ImageVector
    get() {
        if (_houseChimneyMedical != null) {
            return _houseChimneyMedical!!
        }
        _houseChimneyMedical = Builder(name = "HouseChimneyMedical", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(16.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.849f, 7.681f)
                lineToRelative(-0.849f, -0.664f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.451f)
                lineTo(13.849f, 0.638f)
                curveToRelative(-1.088f, -0.854f, -2.609f, -0.854f, -3.697f, 0.0f)
                lineTo(1.151f, 7.68f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(13.957f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.043f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.043f)
                curveToRelative(0.0f, -0.31f, 0.14f, -0.597f, 0.384f, -0.788f)
                lineTo(11.384f, 2.212f)
                curveToRelative(0.363f, -0.283f, 0.869f, -0.283f, 1.232f, 0.0f)
                lineToRelative(9.0f, 7.044f)
                curveToRelative(0.244f, 0.19f, 0.384f, 0.478f, 0.384f, 0.787f)
                verticalLineToRelative(11.957f)
                close()
            }
        }
        .build()
        return _houseChimneyMedical!!
    }

private var _houseChimneyMedical: ImageVector? = null
