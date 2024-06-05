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

public val Icons.Filled.Pollution: ImageVector
    get() {
        if (_pollution != null) {
            return _pollution!!
        }
        _pollution = Builder(name = "Pollution", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 8.75f)
                curveTo(0.0f, 5.689f, 2.404f, 3.179f, 5.424f, 3.009f)
                curveToRelative(1.125f, -1.847f, 3.15f, -3.009f, 5.326f, -3.009f)
                curveToRelative(1.444f, 0.0f, 2.81f, 0.488f, 3.919f, 1.39f)
                curveToRelative(0.573f, -0.256f, 1.194f, -0.39f, 1.831f, -0.39f)
                curveToRelative(1.942f, 0.0f, 3.647f, 1.274f, 4.252f, 3.071f)
                curveToRelative(1.847f, 0.353f, 3.248f, 1.98f, 3.248f, 3.929f)
                curveToRelative(0.0f, 0.976f, -0.365f, 1.859f, -0.947f, 2.554f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.264f, -0.97f, -2.84f, -1.554f, -4.553f, -1.554f)
                curveToRelative(-0.436f, 0.0f, -0.87f, 0.039f, -1.298f, 0.115f)
                curveToRelative(-1.278f, -0.732f, -2.713f, -1.115f, -4.202f, -1.115f)
                curveToRelative(-1.93f, 0.0f, -3.952f, 0.794f, -5.471f, 2.0f)
                horizontalLineToRelative(-1.529f)
                lineToRelative(-2.505f, 4.038f)
                curveToRelative(-2.053f, -0.879f, -3.495f, -2.918f, -3.495f, -5.288f)
                close()
                moveTo(18.5f, 11.0f)
                curveToRelative(-0.564f, 0.0f, -1.12f, 0.088f, -1.66f, 0.263f)
                curveToRelative(-1.113f, -0.818f, -2.455f, -1.263f, -3.84f, -1.263f)
                curveToRelative(-1.522f, 0.0f, -2.92f, 0.53f, -4.029f, 1.409f)
                lineToRelative(6.469f, 11.091f)
                curveToRelative(0.491f, -0.201f, 0.966f, -0.444f, 1.399f, -0.763f)
                curveToRelative(0.54f, 0.175f, 1.096f, 0.263f, 1.66f, 0.263f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(7.0f, 12.0f)
                lineToRelative(7.0f, 12.0f)
                lineTo(0.0f, 24.0f)
                lineToRelative(7.0f, -12.0f)
                close()
                moveTo(8.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _pollution!!
    }

private var _pollution: ImageVector? = null
