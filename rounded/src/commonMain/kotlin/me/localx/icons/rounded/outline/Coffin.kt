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

public val Icons.Outline.Coffin: ImageVector
    get() {
        if (_coffin != null) {
            return _coffin!!
        }
        _coffin = Builder(name = "Coffin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.627f, 6.731f)
                lineToRelative(-1.436f, -3.588f)
                curveToRelative(-0.764f, -1.91f, -2.586f, -3.144f, -4.643f, -3.144f)
                horizontalLineToRelative(-5.042f)
                curveToRelative(-2.057f, 0.0f, -3.879f, 1.234f, -4.643f, 3.143f)
                lineToRelative(-1.436f, 3.589f)
                curveToRelative(-0.438f, 1.096f, -0.543f, 2.286f, -0.305f, 3.444f)
                lineToRelative(2.035f, 9.837f)
                curveToRelative(0.479f, 2.31f, 2.538f, 3.987f, 4.896f, 3.987f)
                horizontalLineToRelative(3.944f)
                curveToRelative(2.359f, 0.0f, 4.419f, -1.677f, 4.896f, -3.987f)
                lineToRelative(2.035f, -9.837f)
                curveToRelative(0.239f, -1.156f, 0.134f, -2.347f, -0.305f, -3.445f)
                close()
                moveTo(18.973f, 9.77f)
                lineToRelative(-2.035f, 9.838f)
                curveToRelative(-0.286f, 1.386f, -1.521f, 2.392f, -2.937f, 2.392f)
                horizontalLineToRelative(-3.944f)
                curveToRelative(-1.415f, 0.0f, -2.65f, -1.006f, -2.938f, -2.392f)
                lineToRelative(-2.035f, -9.837f)
                curveToRelative(-0.159f, -0.772f, -0.089f, -1.566f, 0.203f, -2.296f)
                lineToRelative(1.436f, -3.589f)
                curveToRelative(0.458f, -1.146f, 1.551f, -1.886f, 2.785f, -1.886f)
                horizontalLineToRelative(5.042f)
                curveToRelative(1.234f, 0.0f, 2.327f, 0.74f, 2.785f, 1.886f)
                lineToRelative(1.436f, 3.588f)
                curveToRelative(0.293f, 0.732f, 0.363f, 1.526f, 0.203f, 2.296f)
                close()
            }
        }
        .build()
        return _coffin!!
    }

private var _coffin: ImageVector? = null
