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

public val Icons.Filled.BagSeedling: ImageVector
    get() {
        if (_bagSeedling != null) {
            return _bagSeedling!!
        }
        _bagSeedling = Builder(name = "BagSeedling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 21.0f)
                lineToRelative(2.013f, 3.024f)
                lineTo(-0.013f, 24.024f)
                lineToRelative(2.013f, -3.024f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(22.0f, 3.0f)
                lineToRelative(2.017f, -3.0f)
                lineTo(-0.017f, 0.0f)
                lineToRelative(2.017f, 3.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(14.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(18.0f, 8.0f)
                curveToRelative(-4.5f, 0.0f, -5.639f, 3.318f, -6.0f, 5.0f)
                curveToRelative(-0.357f, -1.685f, -1.5f, -5.0f, -5.969f, -5.0f)
                curveToRelative(-0.023f, 4.819f, 3.265f, 5.784f, 4.969f, 5.961f)
                verticalLineToRelative(2.039f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.043f)
                curveToRelative(1.705f, -0.176f, 5.0f, -1.136f, 5.0f, -5.957f)
                close()
            }
        }
        .build()
        return _bagSeedling!!
    }

private var _bagSeedling: ImageVector? = null
