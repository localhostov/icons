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

public val Icons.Filled.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.166f)
                lineToRelative(0.267f, -8.0f)
                horizontalLineToRelative(5.799f)
                lineToRelative(0.267f, 8.0f)
                horizontalLineToRelative(-2.166f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(14.566f, 0.0f)
                horizontalLineToRelative(-5.132f)
                lineToRelative(-0.267f, 8.0f)
                horizontalLineToRelative(5.666f)
                lineToRelative(-0.267f, -8.0f)
                close()
                moveTo(22.638f, 8.0f)
                lineToRelative(-0.714f, -5.395f)
                curveToRelative(-0.197f, -1.485f, -1.476f, -2.605f, -2.974f, -2.605f)
                horizontalLineToRelative(-2.382f)
                lineToRelative(0.267f, 8.0f)
                horizontalLineToRelative(5.804f)
                close()
                moveTo(7.433f, 0.0f)
                horizontalLineToRelative(-2.382f)
                curveToRelative(-1.499f, 0.0f, -2.777f, 1.12f, -2.974f, 2.606f)
                lineToRelative(-0.714f, 5.394f)
                horizontalLineToRelative(5.804f)
                lineToRelative(0.267f, -8.0f)
                close()
                moveTo(17.168f, 18.0f)
                horizontalLineToRelative(6.794f)
                lineToRelative(-1.059f, -8.0f)
                horizontalLineToRelative(-6.002f)
                lineToRelative(0.267f, 8.0f)
                close()
                moveTo(7.099f, 10.0f)
                lineTo(1.098f, 10.0f)
                lineTo(0.039f, 18.0f)
                horizontalLineToRelative(6.794f)
                lineToRelative(0.267f, -8.0f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
