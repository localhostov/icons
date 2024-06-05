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

public val Icons.Outline.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.115f, 0.886f)
                arcToRelative(3.094f, 3.094f, 0.0f, false, false, -4.276f, 0.0f)
                lineToRelative(-3.407f, 3.407f)
                arcToRelative(3.456f, 3.456f, 0.0f, false, true, -4.837f, 0.071f)
                lineToRelative(-1.395f, 1.436f)
                lineToRelative(2.025f, 2.025f)
                lineToRelative(-9.2f, 9.2f)
                arcToRelative(3.455f, 3.455f, 0.0f, false, false, -0.593f, 4.129f)
                lineToRelative(-1.432f, 1.432f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.432f, -1.432f)
                arcToRelative(3.455f, 3.455f, 0.0f, false, false, 4.129f, -0.593f)
                lineToRelative(9.2f, -9.2f)
                lineToRelative(2.025f, 2.025f)
                lineToRelative(1.434f, -1.393f)
                arcToRelative(3.455f, 3.455f, 0.0f, false, true, 0.071f, -4.837f)
                lineToRelative(3.407f, -3.407f)
                arcToRelative(3.023f, 3.023f, 0.0f, false, false, 0.0f, -4.275f)
                close()
                moveTo(5.56f, 20.561f)
                arcToRelative(1.536f, 1.536f, 0.0f, false, true, -2.121f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -2.121f)
                lineToRelative(9.2f, -9.2f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(21.7f, 3.747f)
                lineTo(18.293f, 7.154f)
                arcToRelative(5.462f, 5.462f, 0.0f, false, false, -1.586f, 3.322f)
                lineToRelative(-3.183f, -3.183f)
                arcToRelative(5.462f, 5.462f, 0.0f, false, false, 3.322f, -1.586f)
                lineToRelative(3.408f, -3.407f)
                arcToRelative(1.045f, 1.045f, 0.0f, false, true, 1.446f, 0.0f)
                arcToRelative(1.022f, 1.022f, 0.0f, false, true, 0.0f, 1.447f)
                close()
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
