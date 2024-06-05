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

public val Icons.Outline.HouseTurret: ImageVector
    get() {
        if (_houseTurret != null) {
            return _houseTurret!!
        }
        _houseTurret = Builder(name = "HouseTurret", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.849f, 12.747f)
                lineToRelative(-5.448f, -4.264f)
                curveToRelative(-0.824f, -0.646f, -1.977f, -0.646f, -2.801f, 0.0f)
                lineTo(1.151f, 12.746f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(8.891f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 15.109f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
                moveTo(14.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-6.891f)
                curveToRelative(0.0f, -0.31f, 0.14f, -0.597f, 0.384f, -0.788f)
                lineToRelative(5.448f, -4.264f)
                curveToRelative(0.099f, -0.076f, 0.237f, -0.076f, 0.336f, 0.0f)
                lineToRelative(5.448f, 4.265f)
                curveToRelative(0.244f, 0.19f, 0.384f, 0.478f, 0.384f, 0.787f)
                verticalLineToRelative(6.891f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 0.0f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.0f, 5.5f)
                curveToRelative(0.0f, 1.208f, 0.86f, 2.217f, 2.0f, 2.45f)
                verticalLineToRelative(0.028f)
                lineToRelative(2.0f, 1.565f)
                verticalLineToRelative(-1.543f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 7.95f)
                curveToRelative(1.14f, -0.232f, 2.0f, -1.242f, 2.0f, -2.45f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 5.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(12.5f, 6.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _houseTurret!!
    }

private var _houseTurret: ImageVector? = null
