package me.localx.icons.rounded.filled

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

public val Icons.Filled.Coffin: ImageVector
    get() {
        if (_coffin != null) {
            return _coffin!!
        }
        _coffin = Builder(name = "Coffin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 24.0f)
                horizontalLineToRelative(-3.944f)
                curveToRelative(-2.358f, 0.0f, -4.418f, -1.677f, -4.896f, -3.987f)
                lineToRelative(-2.035f, -9.837f)
                curveToRelative(-0.238f, -1.158f, -0.133f, -2.348f, 0.305f, -3.444f)
                lineToRelative(1.436f, -3.589f)
                curveToRelative(0.764f, -1.909f, 2.586f, -3.143f, 4.643f, -3.143f)
                horizontalLineToRelative(5.042f)
                curveToRelative(2.057f, 0.0f, 3.879f, 1.234f, 4.643f, 3.144f)
                lineToRelative(1.436f, 3.588f)
                curveToRelative(0.438f, 1.098f, 0.544f, 2.289f, 0.305f, 3.445f)
                lineToRelative(-2.035f, 9.837f)
                curveToRelative(-0.478f, 2.31f, -2.537f, 3.987f, -4.896f, 3.987f)
                close()
            }
        }
        .build()
        return _coffin!!
    }

private var _coffin: ImageVector? = null
