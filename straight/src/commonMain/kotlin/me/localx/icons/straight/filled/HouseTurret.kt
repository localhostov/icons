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

public val Icons.Filled.HouseTurret: ImageVector
    get() {
        if (_houseTurret != null) {
            return _houseTurret!!
        }
        _houseTurret = Builder(name = "HouseTurret", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                lineTo(10.0f, 4.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                close()
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
                moveTo(10.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(18.0f, 15.109f)
                curveToRelative(0.0f, -1.548f, -0.699f, -2.983f, -1.919f, -3.938f)
                lineToRelative(-2.776f, -2.172f)
                horizontalLineToRelative(8.695f)
                close()
            }
        }
        .build()
        return _houseTurret!!
    }

private var _houseTurret: ImageVector? = null
