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

public val Icons.Filled.EyeDropperHalf: ImageVector
    get() {
        if (_eyeDropperHalf != null) {
            return _eyeDropperHalf!!
        }
        _eyeDropperHalf = Builder(name = "EyeDropperHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.023f)
                curveToRelative(0.0f, 0.807f, -0.314f, 1.566f, -0.886f, 2.138f)
                lineToRelative(-3.407f, 3.407f)
                curveToRelative(-1.337f, 1.336f, -1.368f, 3.461f, -0.071f, 4.837f)
                lineToRelative(-1.435f, 1.393f)
                lineTo(9.202f, 5.798f)
                lineToRelative(1.393f, -1.435f)
                curveToRelative(1.375f, 1.296f, 3.501f, 1.266f, 4.837f, -0.071f)
                lineToRelative(3.408f, -3.407f)
                curveToRelative(1.141f, -1.144f, 3.133f, -1.143f, 4.275f, 0.0f)
                curveToRelative(0.571f, 0.571f, 0.885f, 1.33f, 0.885f, 2.138f)
                close()
                moveTo(3.593f, 16.0f)
                lineToRelative(-1.681f, 1.681f)
                curveToRelative(-0.589f, 0.589f, -0.913f, 1.371f, -0.913f, 2.203f)
                curveToRelative(0.0f, 0.485f, 0.122f, 0.948f, 0.331f, 1.371f)
                lineToRelative(-1.331f, 1.331f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.331f, -1.331f)
                curveToRelative(0.423f, 0.209f, 0.886f, 0.331f, 1.371f, 0.331f)
                curveToRelative(0.832f, 0.0f, 1.615f, -0.324f, 2.203f, -0.913f)
                lineToRelative(6.087f, -6.087f)
                lineTo(3.593f, 16.0f)
                close()
                moveTo(5.593f, 14.0f)
                horizontalLineToRelative(8.737f)
                lineToRelative(-4.368f, -4.368f)
                lineToRelative(-4.368f, 4.368f)
                close()
            }
        }
        .build()
        return _eyeDropperHalf!!
    }

private var _eyeDropperHalf: ImageVector? = null
