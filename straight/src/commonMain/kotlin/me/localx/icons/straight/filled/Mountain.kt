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

public val Icons.Filled.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.101f, 9.02f)
                lineTo(12.0f, 0.01f)
                lineToRelative(4.857f, 8.931f)
                lineToRelative(-1.922f, 3.568f)
                lineToRelative(-1.906f, -2.872f)
                lineToRelative(-2.578f, 4.072f)
                lineToRelative(-3.349f, -4.689f)
                close()
                moveTo(17.998f, 11.04f)
                lineToRelative(-2.886f, 5.355f)
                lineToRelative(-2.044f, -3.081f)
                lineToRelative(-2.518f, 3.976f)
                lineToRelative(-4.512f, -6.316f)
                lineTo(0.0f, 22.079f)
                verticalLineToRelative(1.921f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.921f)
                lineToRelative(-6.002f, -11.039f)
                close()
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
