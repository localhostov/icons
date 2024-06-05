package me.localx.icons.rounded.bold

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

public val Icons.Bold.Coffin: ImageVector
    get() {
        if (_coffin != null) {
            return _coffin!!
        }
        _coffin = Builder(name = "Coffin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.385f, 6.43f)
                lineToRelative(-1.205f, -2.978f)
                curveToRelative(-0.848f, -2.097f, -2.868f, -3.452f, -5.146f, -3.452f)
                horizontalLineToRelative(-6.068f)
                curveToRelative(-2.277f, 0.0f, -4.298f, 1.355f, -5.146f, 3.452f)
                lineToRelative(-1.205f, 2.979f)
                curveToRelative(-0.646f, 1.599f, -0.788f, 3.331f, -0.41f, 5.009f)
                lineToRelative(1.855f, 8.258f)
                curveToRelative(0.57f, 2.533f, 2.795f, 4.303f, 5.411f, 4.303f)
                horizontalLineToRelative(5.057f)
                curveToRelative(2.616f, 0.0f, 4.841f, -1.77f, 5.412f, -4.304f)
                lineToRelative(1.854f, -8.256f)
                curveToRelative(0.379f, -1.679f, 0.237f, -3.411f, -0.409f, -5.01f)
                close()
                moveTo(18.867f, 10.782f)
                lineToRelative(-1.854f, 8.256f)
                curveToRelative(-0.261f, 1.155f, -1.282f, 1.962f, -2.485f, 1.962f)
                horizontalLineToRelative(-5.057f)
                curveToRelative(-1.203f, 0.0f, -2.225f, -0.807f, -2.484f, -1.961f)
                lineToRelative(-1.855f, -8.258f)
                curveToRelative(-0.243f, -1.081f, -0.151f, -2.196f, 0.265f, -3.226f)
                lineToRelative(1.205f, -2.978f)
                curveToRelative(0.388f, -0.958f, 1.315f, -1.577f, 2.364f, -1.577f)
                horizontalLineToRelative(6.068f)
                curveToRelative(1.049f, 0.0f, 1.977f, 0.619f, 2.364f, 1.577f)
                lineToRelative(1.205f, 2.978f)
                curveToRelative(0.416f, 1.03f, 0.508f, 2.146f, 0.264f, 3.228f)
                close()
            }
        }
        .build()
        return _coffin!!
    }

private var _coffin: ImageVector? = null
