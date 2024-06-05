package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.367f, 14.727f)
                arcToRelative(4.149f, 4.149f, 0.0f, false, false, 2.633f, -3.727f)
                curveToRelative(0.0f, -2.622f, -2.5f, -4.354f, -6.8f, -4.849f)
                arcToRelative(3.267f, 3.267f, 0.0f, false, false, 0.8f, -2.151f)
                curveToRelative(0.0f, -2.43f, -2.355f, -4.0f, -6.0f, -4.0f)
                reflectiveCurveToRelative(-6.0f, 1.57f, -6.0f, 4.0f)
                arcToRelative(3.464f, 3.464f, 0.0f, false, false, 1.9f, 3.051f)
                curveToRelative(-2.276f, 1.001f, -2.9f, 2.555f, -2.9f, 3.949f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.229f, 3.614f)
                curveToRelative(-3.436f, 0.766f, -5.229f, 2.243f, -5.229f, 4.386f)
                curveToRelative(0.0f, 3.271f, 4.149f, 5.0f, 12.0f, 5.0f)
                curveToRelative(7.963f, 0.0f, 12.0f, -1.682f, 12.0f, -5.0f)
                curveToRelative(0.0f, -2.057f, -1.555f, -3.484f, -4.633f, -4.273f)
                close()
                moveTo(10.0f, 2.0f)
                curveToRelative(1.991f, 0.0f, 4.0f, 0.619f, 4.0f, 2.0f)
                reflectiveCurveToRelative(-2.009f, 2.0f, -4.0f, 2.0f)
                reflectiveCurveToRelative(-4.0f, -0.619f, -4.0f, -2.0f)
                reflectiveCurveToRelative(2.009f, -2.0f, 4.0f, -2.0f)
                close()
                moveTo(12.5f, 8.0f)
                curveToRelative(3.46f, 0.0f, 7.5f, 0.786f, 7.5f, 3.0f)
                reflectiveCurveToRelative(-4.04f, 3.0f, -7.5f, 3.0f)
                curveToRelative(-2.255f, 0.0f, -7.5f, -0.292f, -7.5f, -3.0f)
                reflectiveCurveToRelative(5.245f, -3.0f, 7.5f, -3.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-6.075f, 0.0f, -10.0f, -1.178f, -10.0f, -3.0f)
                reflectiveCurveToRelative(3.925f, -3.0f, 10.0f, -3.0f)
                curveToRelative(6.262f, 0.0f, 10.0f, 1.122f, 10.0f, 3.0f)
                reflectiveCurveToRelative(-3.738f, 3.0f, -10.0f, 3.0f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
