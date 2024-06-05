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

public val Icons.Outline.EyeDropperHalf: ImageVector
    get() {
        if (_eyeDropperHalf != null) {
            return _eyeDropperHalf!!
        }
        _eyeDropperHalf = Builder(name = "EyeDropperHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.114f, 0.886f)
                curveToRelative(-1.178f, -1.179f, -3.095f, -1.178f, -4.275f, 0.0f)
                lineToRelative(-3.408f, 3.407f)
                curveToRelative(-1.337f, 1.338f, -3.462f, 1.368f, -4.837f, 0.07f)
                lineToRelative(-1.393f, 1.435f)
                lineToRelative(2.025f, 2.025f)
                lineTo(2.025f, 17.025f)
                curveToRelative(-1.119f, 1.119f, -1.32f, 2.813f, -0.604f, 4.139f)
                lineToRelative(-1.422f, 1.422f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(0.506f, 0.274f, 1.074f, 0.42f, 1.666f, 0.42f)
                curveToRelative(0.935f, 0.0f, 1.814f, -0.364f, 2.475f, -1.025f)
                lineToRelative(9.202f, -9.202f)
                lineToRelative(2.025f, 2.025f)
                lineToRelative(1.435f, -1.394f)
                curveToRelative(-1.297f, -1.375f, -1.266f, -3.499f, 0.071f, -4.836f)
                lineToRelative(3.407f, -3.407f)
                curveToRelative(0.571f, -0.57f, 0.886f, -1.33f, 0.886f, -2.138f)
                reflectiveCurveToRelative(-0.314f, -1.567f, -0.886f, -2.138f)
                close()
                moveTo(5.56f, 20.561f)
                curveToRelative(-0.565f, 0.566f, -1.554f, 0.566f, -2.121f, 0.0f)
                curveToRelative(-0.584f, -0.585f, -0.584f, -1.536f, 0.0f, -2.121f)
                lineToRelative(2.439f, -2.439f)
                horizontalLineToRelative(4.242f)
                lineToRelative(-4.561f, 4.561f)
                close()
                moveTo(12.121f, 14.0f)
                horizontalLineToRelative(-4.242f)
                lineToRelative(4.762f, -4.763f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.642f, 2.641f)
                close()
                moveTo(21.7f, 3.747f)
                lineToRelative(-3.407f, 3.407f)
                curveToRelative(-0.934f, 0.934f, -1.463f, 2.11f, -1.586f, 3.32f)
                lineToRelative(-3.182f, -3.182f)
                curveToRelative(1.21f, -0.123f, 2.387f, -0.652f, 3.321f, -1.586f)
                lineToRelative(3.408f, -3.407f)
                curveToRelative(0.4f, -0.398f, 1.049f, -0.398f, 1.447f, 0.0f)
                curveToRelative(0.193f, 0.193f, 0.3f, 0.45f, 0.3f, 0.724f)
                reflectiveCurveToRelative(-0.106f, 0.53f, -0.3f, 0.724f)
                close()
            }
        }
        .build()
        return _eyeDropperHalf!!
    }

private var _eyeDropperHalf: ImageVector? = null
