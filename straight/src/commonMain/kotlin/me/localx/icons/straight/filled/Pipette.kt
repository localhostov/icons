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

public val Icons.Filled.Pipette: ImageVector
    get() {
        if (_pipette != null) {
            return _pipette!!
        }
        _pipette = Builder(name = "Pipette", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.023f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.886f, 2.138f)
                lineToRelative(-3.407f, 3.407f)
                arcToRelative(3.455f, 3.455f, 0.0f, false, false, -0.071f, 4.837f)
                lineToRelative(-1.436f, 1.395f)
                lineToRelative(-9.0f, -9.0f)
                lineToRelative(1.4f, -1.436f)
                arcToRelative(3.456f, 3.456f, 0.0f, false, false, 4.837f, -0.071f)
                lineToRelative(3.402f, -3.407f)
                arcToRelative(3.094f, 3.094f, 0.0f, false, true, 4.276f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.885f, 2.137f)
                close()
                moveTo(1.913f, 17.681f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, false, -0.582f, 3.574f)
                lineToRelative(-1.331f, 1.331f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.331f, -1.331f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, false, 3.574f, -0.582f)
                lineToRelative(8.049f, -8.049f)
                lineToRelative(-4.406f, -4.406f)
                close()
            }
        }
        .build()
        return _pipette!!
    }

private var _pipette: ImageVector? = null
