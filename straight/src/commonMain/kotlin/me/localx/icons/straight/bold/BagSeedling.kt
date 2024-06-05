package me.localx.icons.straight.bold

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

public val Icons.Bold.BagSeedling: ImageVector
    get() {
        if (_bagSeedling != null) {
            return _bagSeedling!!
        }
        _bagSeedling = Builder(name = "BagSeedling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 13.758f)
                verticalLineToRelative(3.242f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.288f)
                curveToRelative(-2.102f, -0.555f, -4.728f, -2.156f, -4.467f, -6.712f)
                curveToRelative(3.319f, 0.052f, 5.06f, 1.78f, 5.971f, 3.505f)
                curveToRelative(0.917f, -1.724f, 2.665f, -3.452f, 5.993f, -3.505f)
                curveToRelative(0.262f, 4.67f, -2.384f, 6.242f, -4.497f, 6.758f)
                close()
                moveTo(22.0f, 19.711f)
                lineToRelative(1.716f, 4.289f)
                lineTo(0.284f, 24.0f)
                lineToRelative(1.716f, -4.289f)
                lineTo(2.0f, 4.289f)
                lineTo(0.284f, 0.0f)
                horizontalLineToRelative(23.432f)
                lineToRelative(-1.716f, 4.289f)
                verticalLineToRelative(15.422f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _bagSeedling!!
    }

private var _bagSeedling: ImageVector? = null
